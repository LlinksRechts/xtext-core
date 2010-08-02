/*******************************************************************************
 * Copyright (c) 2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.xtext;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

import org.eclipse.emf.codegen.util.CodeGenUtil;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreValidator;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.AbstractMetamodelDeclaration;
import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.EnumLiteralDeclaration;
import org.eclipse.xtext.EnumRule;
import org.eclipse.xtext.GeneratedMetamodel;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.ReferencedMetamodel;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.TypeRef;
import org.eclipse.xtext.UnorderedGroup;
import org.eclipse.xtext.XtextPackage;
import org.eclipse.xtext.conversion.IValueConverterService;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.parsetree.AbstractNode;
import org.eclipse.xtext.parsetree.NodeUtil;
import org.eclipse.xtext.util.Strings;
import org.eclipse.xtext.util.Triple;
import org.eclipse.xtext.util.Tuples;
import org.eclipse.xtext.util.XtextSwitch;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.CheckType;
import org.eclipse.xtext.validation.ValidationMessageAcceptor;
import org.eclipse.xtext.xtext.ecoreInference.SourceAdapter;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.common.collect.Multimap;
import com.google.common.collect.Multimaps;
import com.google.common.collect.Sets;
import com.google.inject.Inject;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 * @author Michael Clay
 */
public class XtextValidator extends AbstractDeclarativeValidator {

	@Inject
	private IValueConverterService valueConverter;
	
	private KeywordInspector keywordHidesTerminalInspector;
	
	@Override
	protected List<EPackage> getEPackages() {
		return Collections.<EPackage>singletonList(XtextPackage.eINSTANCE);
	}

	@Check(CheckType.FAST)
	public void checkGrammarUsesMaxOneOther(Grammar grammar) {
		assertTrue("You may not use more than one other grammar.", XtextPackage.GRAMMAR__USED_GRAMMARS, grammar
				.getUsedGrammars().size() <= 1);
	}
	
	@Check(CheckType.FAST)
	public void checkGrammarRecursiveReference(Grammar grammar) {
		Set<Grammar> visitedGrammars = Sets.newHashSet(grammar);
		for(Grammar usedGrammar: grammar.getUsedGrammars()) {
			if(!doCheckGrammarRecursiveReference(grammar, usedGrammar, visitedGrammars))
				return;
		}
	}
	
	private boolean doCheckGrammarRecursiveReference(Grammar grammarToCheck, Grammar currentGrammar, Set<Grammar> visitedGrammars) {
		if (Strings.equal(grammarToCheck.getName(), currentGrammar.getName())) {
			error("Invalid recursive reference of grammar.", XtextPackage.GRAMMAR__USED_GRAMMARS);
			return false;
		}
		if (!visitedGrammars.add(currentGrammar))
			return true;
		for(Grammar usedGrammar: currentGrammar.getUsedGrammars()) {
			if (!doCheckGrammarRecursiveReference(grammarToCheck, usedGrammar, visitedGrammars))
				return false;
		}
		return true;
	}
	
	@Check
	public void checkGrammarName(Grammar g) {
		String[] split = g.getName().split("\\.");
		if (split.length == 1)
			warning("You should use a namespace.", XtextPackage.GRAMMAR__NAME);
		for (int i = 0; i < split.length - 1; i++) {
			String nsEle = split[i];
			if (Character.isUpperCase(nsEle.charAt(0)))
				warning("Namespace elements should start with a lower case letter.", XtextPackage.GRAMMAR__NAME);
		}
		String ele = split[split.length - 1];
		if (!Character.isUpperCase(ele.charAt(0)))
			error("The last element should start with an upper case letter.", XtextPackage.GRAMMAR__NAME);
	}

	@Check
	public void checkFirstRule(Grammar g) {
		if (g.getRules().isEmpty())
			return;
		AbstractRule firstRule = g.getRules().get(0);
		if (!(firstRule instanceof ParserRule)) {
			if (!containsAnyParserRule(g, new HashSet<Grammar>()))
				return;
			error("The first rule must be a parser rule.", firstRule, XtextPackage.ABSTRACT_RULE__NAME);
		}
		else if (GrammarUtil.isDatatypeRule((ParserRule) firstRule)) {
			if (!containsAnyParserRule(g, new HashSet<Grammar>()))
				return;
			error("The first rule must be a parser rule, but is a data type rule.", firstRule,
					XtextPackage.ABSTRACT_RULE__NAME);
		}
	}

	private boolean containsAnyParserRule(Grammar g, Set<Grammar> visited) {
		if (!visited.add(g))
			return false;
		for (AbstractRule rule : g.getRules()) {
			if (rule instanceof ParserRule && !GrammarUtil.isDatatypeRule((ParserRule) rule))
				return true;
		}
		for (Grammar used : g.getUsedGrammars()) {
			if (containsAnyParserRule(used, visited))
				return true;
		}
		return false;
	}

	@Check
	public void checkGeneratedMetamodel(GeneratedMetamodel metamodel) {
		if (metamodel.getName() != null && metamodel.getName().length() != 0)
			if (Character.isUpperCase(metamodel.getName().charAt(0)))
				warning("Metamodel names should start with a lower case letter.",
						XtextPackage.GENERATED_METAMODEL__NAME);
	}
	
	@Check
	public void checkGeneratedPackage(GeneratedMetamodel metamodel) {
		Diagnostician diagnostician = (Diagnostician) getContext().get(EValidator.class);
		checkGeneratedPackage(metamodel, diagnostician, getContext());
	}

	public void checkGeneratedPackage(GeneratedMetamodel metamodel, Diagnostician diagnostician, Map<?,?> params) {
		EPackage pack = metamodel.getEPackage();
		if (pack != null) {
			Diagnostic packageValidationResult = diagnostician.validate(pack, params);
			
			ValidationMessageAcceptor filter = new ValidationMessageAcceptor() {
				Set<Triple<EObject, Integer, String>> accepted = Sets.newHashSet();
				public void acceptWarning(String message, EObject object, Integer feature, String code, String... issueData) {
					if (accepted.add(Tuples.create(object, feature, message))) {
						XtextValidator.this.getMessageAcceptor().acceptWarning(message, object, feature, code, issueData);
					}
				}
				
				public void acceptError(String message, EObject object, Integer feature, String code, String... issueData) {
					if (accepted.add(Tuples.create(object, feature, message))) {
						XtextValidator.this.getMessageAcceptor().acceptError(message, object, feature, code, issueData);
					}
				}
			};
			propageValidationResult(packageValidationResult, metamodel, filter);
		}
	}
	
	@Check
	public void checkGeneratedPackageForNameClashes(GeneratedMetamodel metamodel) {
		EPackage pack = metamodel.getEPackage();
		Multimap<String, ENamedElement> constantNameToElement = Multimaps.newHashMultimap();
		Multimap<String, ENamedElement> accessorNameToElement = Multimaps.newHashMultimap();
		if (pack != null) {
			for(EClassifier classifier: pack.getEClassifiers()) {
				String accessorName = classifier.getName();
				if ("Class".equals(accessorName) || "Name".equals(accessorName))
					accessorName += "_";
				accessorNameToElement.put("get" + accessorName, classifier);
				String classifierConstantName = CodeGenUtil.format(classifier.getName(), '_', null, true, true).toUpperCase();
				constantNameToElement.put(classifierConstantName, classifier);
				if (classifier instanceof EClass) {
					for(EStructuralFeature feature: ((EClass) classifier).getEAllStructuralFeatures()) {
						String featureConstantPart = CodeGenUtil.format(feature.getName(), '_', null, false, false).toUpperCase();
						String featureConstantName = classifierConstantName + "__" + featureConstantPart;
						constantNameToElement.put(featureConstantName, feature);
						String featureAccessorName = "get" + classifier.getName() + "_" + Strings.toFirstUpper(feature.getName());
						accessorNameToElement.put(featureAccessorName, feature);
					}
				}
			}
		}
		createMessageForNameClashes(constantNameToElement);
		createMessageForNameClashes(accessorNameToElement);
	}

	public void createMessageForNameClashes(Multimap<String, ENamedElement> nameToElement) {
		for(Entry<String, Collection<ENamedElement>> entry: nameToElement.asMap().entrySet()) {
			if (entry.getValue().size() > 1) {
				if (!Iterables.isEmpty(Iterables.filter(entry.getValue(), EStructuralFeature.class))
						&&!Iterables.isEmpty(Iterables.filter(entry.getValue(), EClassifier.class))) {
					String constantName = entry.getKey();
					String message = "Name clash in generated code: '" + constantName + "'.";
					for(ENamedElement element: entry.getValue()) {
						String myMessage = message;
						if (element.getName().indexOf('_') >= 0) {
							myMessage = myMessage + " Try to avoid underscores in names to prevent conflicts.";
						}
						createMessageForSource(myMessage, null, Diagnostic.ERROR, element, getMessageAcceptor());
					}
				}
			}
		}
	}
	
	private void propageValidationResult(Diagnostic diagnostic, GeneratedMetamodel metamodel, ValidationMessageAcceptor acceptor) {
		if (diagnostic.getSeverity() != Diagnostic.OK && diagnostic.getSeverity() != Diagnostic.INFO) {
			if (diagnostic.getCode() != 0) {
				List<?> data = diagnostic.getData();
				if (!data.isEmpty() && data.get(0) instanceof EObject) {
					doPropagateValidationResult(diagnostic, metamodel, acceptor);
				}
			}
			for(Diagnostic child: diagnostic.getChildren())
				propageValidationResult(child, metamodel, acceptor);
		}
	}
	
	private void doPropagateValidationResult(Diagnostic diagnostic,
			GeneratedMetamodel metamodel, ValidationMessageAcceptor acceptor) {
		boolean foundEObject = false;
		Object firstData = null;
		for(Object data: diagnostic.getData()) {
			if (firstData == null) {
				firstData = diagnostic.getData().get(0);
			}
			if (data instanceof EObject) {
				if (createMessageForSource(diagnostic, (EObject) data, acceptor)) {
					foundEObject = true;
				} 
				if (data instanceof EStructuralFeature && ((EStructuralFeature) data).getEContainingClass() != firstData) {
					EClass containingClass = ((EStructuralFeature) data).getEContainingClass();
					createMessageForSource(diagnostic, containingClass, acceptor);
				}
			}
		}
		if (!foundEObject) {
			doCreateMessage(diagnostic, metamodel, XtextPackage.GENERATED_METAMODEL__EPACKAGE, acceptor);
		}
	}

	public boolean createMessageForSource(Diagnostic diagnostic, EObject object, ValidationMessageAcceptor acceptor) {
		String code = XtextValidator.class.getName() + ".PackageValidation." + diagnostic.getCode();
		int severity = diagnostic.getSeverity();
		if (diagnostic.getCode() == EcoreValidator.UNIQUE_CLASSIFIER_NAMES || diagnostic.getCode() == EcoreValidator.UNIQUE_FEATURE_NAMES)
			severity = Diagnostic.ERROR;
		String message = diagnostic.getMessage();
		return createMessageForSource(message, code, severity, object, acceptor);
	}
	
	public void doCreateMessage(Diagnostic diagnostic, EObject object, Integer feature, ValidationMessageAcceptor acceptor) {
		String code = XtextValidator.class.getName() + ".PackageValidation." + diagnostic.getCode();
		int severity = diagnostic.getSeverity();
		if (diagnostic.getCode() == EcoreValidator.UNIQUE_CLASSIFIER_NAMES || diagnostic.getCode() == EcoreValidator.UNIQUE_FEATURE_NAMES)
			severity = Diagnostic.ERROR;
		String message = diagnostic.getMessage();
		doCreateMessage(message, code, severity, object, feature, acceptor);
	}

	public boolean createMessageForSource(String message, String code, int severity, EObject object, ValidationMessageAcceptor acceptor) {
		SourceAdapter sourceAdapter = SourceAdapter.find(object);
		boolean result = false;
		if (sourceAdapter != null) {
			for(EObject source: sourceAdapter.getSources()) {
				doCreateMessage(message, code, severity, source, null, acceptor);
				result = true;
			}
		}
		return result;
	}
	
	public void doCreateMessage(String message, String code, int severity, EObject context, Integer feature, ValidationMessageAcceptor acceptor) {
		if (severity == Diagnostic.WARNING) {
			acceptor.acceptWarning(message, context, feature, code);
		} else if (severity == Diagnostic.ERROR) {
			acceptor.acceptError(message, context, feature, code);
		}
	}
	
	@Check
	public void checkReferencedMetamodel(ReferencedMetamodel metamodel) throws ValueConverterException {
		if (metamodel.getEPackage() == null)
			return;
		String nsURI = metamodel.getEPackage().getNsURI();
		List<GeneratedMetamodel> allGeneratedMetamodels = new ArrayList<GeneratedMetamodel>();
		Grammar grammar = GrammarUtil.getGrammar(metamodel);
		Set<Grammar> visited = Sets.newHashSet();
		for (Grammar usedGrammar : grammar.getUsedGrammars())
			Iterables.addAll(allGeneratedMetamodels, getAllGeneratedMetamodels(usedGrammar, visited));
		if (allGeneratedMetamodels.isEmpty())
			return;
		List<AbstractNode> nodes = NodeUtil.findNodesForFeature(metamodel,
				XtextPackage.Literals.ABSTRACT_METAMODEL_DECLARATION__EPACKAGE);
		if (nodes.size() != 1)
			throw new IllegalArgumentException();
		String text = nodes.get(0).serialize();
		text = (String) valueConverter.toValue(text, "STRING", nodes.get(0));
		for (GeneratedMetamodel generatedMetamodel : allGeneratedMetamodels) {
			EPackage generatedPackage = generatedMetamodel.getEPackage();
			if (generatedPackage != null && nsURI.equals((generatedPackage.getNsURI()))) {
				assertEquals("Metamodels that have been generated by a super grammar must be referenced by nsURI: "
						+ nsURI, XtextPackage.ABSTRACT_METAMODEL_DECLARATION__EPACKAGE, text, nsURI);
			}
		}
	}

	private Iterable<GeneratedMetamodel> getAllGeneratedMetamodels(Grammar grammar, Set<Grammar> visited) {
		Iterable<GeneratedMetamodel> result = Iterables.filter(grammar.getMetamodelDeclarations(),
				GeneratedMetamodel.class);
		for (Grammar gr : grammar.getUsedGrammars()) {
			if (visited.add(gr))
				result = Iterables.concat(result, getAllGeneratedMetamodels(gr, visited));
		}
		return result;
	}

	@Check
	public void checkMetamodelUris(final AbstractMetamodelDeclaration declaration) {
		guard(declaration.getEPackage().getNsURI() != null);

		Grammar grammar = GrammarUtil.getGrammar(declaration);
		Iterable<String> nsUris = Iterables.transform(grammar.getMetamodelDeclarations(),
				new Function<AbstractMetamodelDeclaration, String>() {
					public String apply(AbstractMetamodelDeclaration param) {
						if (param.getEPackage() != null)
							return param.getEPackage().getNsURI();
						return null;
					}
				});
		int count = Iterables.size(Iterables.filter(nsUris, new Predicate<String>() {
			public boolean apply(String param) {
				return declaration.getEPackage().getNsURI().equals(param);
			}
		}));
		assertTrue("EPackage with ns-uri '" + declaration.getEPackage().getNsURI() + "' is used twice.",
				XtextPackage.ABSTRACT_METAMODEL_DECLARATION__EPACKAGE, count == 1);
	}

	@Check
	public void checkCrossReferenceTerminal(CrossReference reference) {
		if (reference.getTerminal() != null) {
			if (reference.getTerminal() instanceof RuleCall) {
				RuleCall call = (RuleCall) reference.getTerminal();
				checkCrossReferenceTerminal(call);
			} 
		}
		
	}

	public boolean checkCrossReferenceTerminal(RuleCall call) {
		if (call.getRule() != null && call.getRule().getType() != null) {
			EClassifier type = call.getRule().getType().getClassifier();
			if (type != null && EcorePackage.Literals.ESTRING != type) {
				error("The rule '" + call.getRule().getName() + "' is not valid for a cross reference since it does not return "+
						"an EString. You'll have to wrap it in a data type rule.", call, null);
				return true;
			}
		}
		return false;
	}

	@Check
	public void checkRuleName(AbstractRule rule) {
		final Grammar grammar = GrammarUtil.getGrammar(rule);
		Multimap<String, AbstractRule> rules = getAllRules(grammar, rule.getName());
		rules.remove(rule.getName(), rule);
		if (!rules.isEmpty()) {
			TreeSet<String> names = Sets.newTreeSet(rules.keySet());
			if (names.size() == 1) {
				String name = names.first();
				if (name.equals(rule.getName())) {
					final String message = "A rule's name has to be unique.";
					error(message, XtextPackage.ABSTRACT_RULE__NAME);
					return;
				}
				else {
					String message = "A rule's name has to be unique even case insensitive.";
					boolean superGrammar = false;
					for (AbstractRule otherRule : rules.get(name)) {
						if (GrammarUtil.getGrammar(otherRule) != grammar) {
							message = message + " A used grammar contains another rule '" + name + "'.";
							superGrammar = true;
							break;
						}
					}
					if (!superGrammar)
						message = message + " This grammar contains another rule '" + name + "'.";
					error(message, XtextPackage.ABSTRACT_RULE__NAME);
				}
			}
			else {
				String message = "A rule's name has to be unique even case insensitive.";
				final StringBuilder builder = new StringBuilder((rule.getName().length() + 4) * names.size() - 2);
				int i = 0;
				for (String name : names) {
					if (builder.length() != 0) {
						if (i < names.size() - 1)
							builder.append(", ");
						else
							builder.append(" and ");
					}
					i++;
					builder.append("'").append(name).append("'");
				}
				error(message + " The conflicting rules are " + builder + ".", XtextPackage.ABSTRACT_RULE__NAME);
			}
		}
	}

	private Multimap<String, AbstractRule> getAllRules(Grammar grammar, String name) {
		final Multimap<String, AbstractRule> result = Multimaps.newArrayListMultimap();
		final Set<Grammar> grammars = new HashSet<Grammar>();
		final Set<String> validNames = new HashSet<String>();
		collectRules(grammar, result, grammars, name, validNames);
		return result;
	}

	private void collectRules(Grammar grammar, Multimap<String, AbstractRule> result, Set<Grammar> visited,
			String name, Set<String> validNames) {
		if (!visited.add(grammar))
			return;

		List<String> allNames = new ArrayList<String>();
		for (AbstractRule rule : grammar.getRules()) {
			if (!validNames.contains(rule.getName())) {
				allNames.add(rule.getName());
				if (rule.getName().equalsIgnoreCase(name))
					result.put(rule.getName(), rule);
			}
		}
		validNames.addAll(allNames);
		for (Grammar usedGrammar : grammar.getUsedGrammars()) {
			collectRules(usedGrammar, result, visited, name, validNames);
		}
	}

	@Check
	public void checkUnassignedActionAfterAssignment(final Action action) {
		if (action.getFeature() == null) {
			checkCurrentMustBeUnassigned(action);
		}
	}

	@Check
	public void checkUnassignedRuleCallAllowed(final RuleCall call) {
		if (call.getRule() != null && GrammarUtil.containingAssignment(call) == null) {
			AbstractRule container = EcoreUtil2.getContainerOfType(call, AbstractRule.class);
			if (call.getRule() instanceof ParserRule) {
				if (container instanceof TerminalRule) {
					error("Cannot call parser rule from terminal rule.", null);
				}
				else if (!GrammarUtil.isDatatypeRule((ParserRule) call.getRule()))
					checkCurrentMustBeUnassigned(call);
			}
		}
	}

	private void checkCurrentMustBeUnassigned(final AbstractElement element) {
		ParserRule rule = GrammarUtil.containingParserRule(element);
		if (GrammarUtil.isDatatypeRule(rule))
			return;
		
		XtextSwitch<Boolean> visitor = new XtextSwitch<Boolean>() {
			private boolean isNull = true;

			@Override
			public Boolean caseAbstractElement(AbstractElement object) {
				return isNull;
			}

			@Override
			public Boolean caseAlternatives(Alternatives object) {
				final boolean wasIsNull = isNull;
				boolean localIsNull = wasIsNull;
				for (AbstractElement element : object.getElements()) {
					isNull = wasIsNull;
					localIsNull &= doSwitch(element);
				}
				isNull = localIsNull;
				return isNull;
			}
			
			@Override
			public Boolean caseUnorderedGroup(UnorderedGroup object) {
				final boolean wasIsNull = isNull;
				boolean localIsNull = wasIsNull;
				for (AbstractElement element : object.getElements()) {
					isNull = wasIsNull;
					localIsNull |= doSwitch(element);
				}
				isNull = localIsNull;
				return isNull;
			}

			@Override
			public Boolean caseAssignment(Assignment object) {
				isNull = false;
				return isNull;
			}

			@Override
			public Boolean caseGroup(Group object) {
				for (AbstractElement element : object.getElements())
					doSwitch(element);
				return isNull;
			}

			@Override
			public Boolean caseAction(Action object) {
				if (object == element) {
					assertTrue("An unassigned action is not allowed, when the 'current' was already created.", null,
							isNull && !isMany(object));
					checkDone();
				}
				isNull = false;
				return isNull;
			}

			@Override
			public Boolean caseRuleCall(RuleCall object) {
				if (object == element) {
					assertTrue("An unassigned rule call is not allowed, when the 'current' was already created.", null,
							isNull && !isMany(object));
					checkDone();
				}
				return doSwitch(object.getRule());
			}

			@Override
			public Boolean caseParserRule(ParserRule object) {
				isNull = GrammarUtil.isDatatypeRule(object);
				return isNull;
			}

			@Override
			public Boolean caseTerminalRule(TerminalRule object) {
				isNull = true;
				return isNull;
			}

			public boolean isMany(AbstractElement element) {
				return GrammarUtil.isMultipleCardinality(element)
						|| ((element.eContainer() instanceof AbstractElement) && isMany((AbstractElement) element
								.eContainer()));
			}

		};
		visitor.doSwitch(rule.getAlternatives());
	}

	@Check
	public void checkAssignedActionAfterAssignment(final Action action) {
		if (action.getFeature() != null) {
			ParserRule rule = GrammarUtil.containingParserRule(action);
			XtextSwitch<Boolean> visitor = new XtextSwitch<Boolean>() {
				private boolean assignedActionAllowed = false;

				@Override
				public Boolean caseAbstractElement(AbstractElement object) {
					return assignedActionAllowed;
				}

				@Override
				public Boolean caseAlternatives(Alternatives object) {
					boolean wasActionAllowed = assignedActionAllowed;
					boolean localActionAllowed = true;
					for (AbstractElement element : object.getElements()) {
						assignedActionAllowed = wasActionAllowed;
						localActionAllowed &= doSwitch(element);
					}
					assignedActionAllowed = wasActionAllowed
							|| (localActionAllowed && !GrammarUtil.isOptionalCardinality(object));
					return assignedActionAllowed;
				}
				
				@Override
				public Boolean caseUnorderedGroup(UnorderedGroup object) {
					boolean wasActionAllowed = assignedActionAllowed;
					boolean localActionAllowed = false;
					for (AbstractElement element : object.getElements()) {
						assignedActionAllowed = wasActionAllowed;
						localActionAllowed |= doSwitch(element);
					}
					assignedActionAllowed = wasActionAllowed
							|| (localActionAllowed && !GrammarUtil.isOptionalCardinality(object));
					return assignedActionAllowed;
				}

				@Override
				public Boolean caseAssignment(Assignment object) {
					assignedActionAllowed = assignedActionAllowed || !GrammarUtil.isOptionalCardinality(object);
					return assignedActionAllowed;
				}

				@Override
				public Boolean caseGroup(Group object) {
					boolean wasAssignedActionAllowed = assignedActionAllowed;
					for (AbstractElement element : object.getElements())
						doSwitch(element);
					assignedActionAllowed = wasAssignedActionAllowed
							|| (assignedActionAllowed && !GrammarUtil.isOptionalCardinality(object));
					return assignedActionAllowed;
				}

				@Override
				public Boolean caseAction(Action object) {
					if (object == action) {
						assertTrue("An action is not allowed, when the current may still be unassigned.", null,
								assignedActionAllowed);
						checkDone();
					}
					assignedActionAllowed = true;
					return assignedActionAllowed;
				}

				@Override
				public Boolean caseRuleCall(RuleCall object) {
					assignedActionAllowed = assignedActionAllowed || doSwitch(object.getRule())
							&& !GrammarUtil.isOptionalCardinality(object);
					return assignedActionAllowed;
				}

				@Override
				public Boolean caseParserRule(ParserRule object) {
					assignedActionAllowed = !GrammarUtil.isDatatypeRule(object);
					return assignedActionAllowed;
				}

				@Override
				public Boolean caseTerminalRule(TerminalRule object) {
					return assignedActionAllowed;
				}

			};
			visitor.doSwitch(rule.getAlternatives());
		}
	}

	@Check
	public void checkEnumLiteralIsUnique(EnumLiteralDeclaration decl) {
		EnumRule rule = GrammarUtil.containingEnumRule(decl);
		List<EnumLiteralDeclaration> declarations = EcoreUtil2.getAllContentsOfType(rule, EnumLiteralDeclaration.class);
		String literal = decl.getLiteral().getValue();
		for (EnumLiteralDeclaration otherDecl : declarations) {
			if (otherDecl != decl && literal.equals(otherDecl.getLiteral().getValue())) {
				error("Enum literal '" + literal + "' is used multiple times in enum rule '" + rule.getName() + "'.",
						XtextPackage.ENUM_LITERAL_DECLARATION__LITERAL);
			}
		}
	}

	@Check
	public void checkGeneratedEnumIsValid(EnumLiteralDeclaration decl) {
		EnumRule rule = GrammarUtil.containingEnumRule(decl);
		guard(rule.getType().getMetamodel() instanceof GeneratedMetamodel);
		List<EnumLiteralDeclaration> declarations = EcoreUtil2.getAllContentsOfType(rule, EnumLiteralDeclaration.class);
		EEnum eEnum = (EEnum) rule.getType().getClassifier();
		guard(declarations.size() != eEnum.getELiterals().size());
		for (EnumLiteralDeclaration otherDecl : declarations) {
			if (decl == otherDecl) {
				return;
			}
			if (otherDecl.getEnumLiteral() == decl.getEnumLiteral()) {
				if (!decl.getEnumLiteral().getLiteral().equals(decl.getLiteral().getValue()))
					warning("Enum literal '" + decl.getEnumLiteral().getName()
							+ "' has already been defined with literal '" + decl.getEnumLiteral().getLiteral() + "'.",
							XtextPackage.ENUM_LITERAL_DECLARATION__ENUM_LITERAL);
				return;
			}
		}
	}

	@Check
	public void checkEnumLiteralIsValid(EnumLiteralDeclaration decl) {
		if ("".equals(decl.getLiteral().getValue()))
			error("Enum literal must not be an empty string.", XtextPackage.ENUM_LITERAL_DECLARATION__LITERAL);
	}

	@Check
	public void checkForOverriddenValue(final ParserRule rule) {
		OverriddenValueInspector inspector = new OverriddenValueInspector(this);
		inspector.inspect(rule);
	}
	
	@Check
	public void checkInstanceCreated(final ParserRule rule) {
		RuleWithoutInstantiationInspector inspector = new RuleWithoutInstantiationInspector(this);
		inspector.inspect(rule);
	}
	
	@Check
	public void checkInstanceCreatedForEntryRule(final ParserRule rule) {
		ValidEntryRuleInspector inspector = new ValidEntryRuleInspector(this);
		inspector.inspect(rule);
	}
	
	@Check
	public void checkKeywordHidesTerminalRule(final Keyword keyword) {
		if (keywordHidesTerminalInspector == null)
			keywordHidesTerminalInspector = new KeywordInspector(this);
		keywordHidesTerminalInspector.inspectKeywordHidesTerminalRule(keyword);
	}

	@Check
	public void checkForLeftRecursion(final Grammar grammar) {
		GrammarWithoutLeftRecursionInspector inspector = new GrammarWithoutLeftRecursionInspector(this);
		inspector.inspect(grammar);
	}
	
	@Check
	public void checkActionInUnorderedGroup(final Action action) {
		if (EcoreUtil2.getContainerOfType(action, UnorderedGroup.class) != null)
			error("Actions may not be used in unordered groups.", action, null);
	}
	
	@Check
	public void checkRuleCallInUnorderedGroup(final RuleCall call) {
		if (call.getRule() == null || call.getRule().eIsProxy() || !(call.getRule() instanceof ParserRule))
			return;
		if (GrammarUtil.isDatatypeRule((ParserRule) call.getRule()))
			return;
		if (GrammarUtil.isAssigned(call))
			return;
		if (EcoreUtil2.getContainerOfType(call, UnorderedGroup.class) != null)
			error("Unassigned rule calls may not be used in unordered groups.", call, null);
	}

	@Check
	public void checkCrossReferenceType(CrossReference reference) {
		checkTypeIsEClass(reference.getType());
	}

	private void checkTypeIsEClass(TypeRef type) {
		if (type != null) {
			EClassifier classifier = type.getClassifier();
			if (classifier != null && !classifier.eIsProxy()) {
				if (!(classifier instanceof EClass)) {
					error("Type of cross reference must be an EClass.", type, null);
				}
			}
		}
	}

	@Check
	public void checkInstantiatedType(Action action) {
		checkTypeIsEClass(action.getType());
	}
	
}
