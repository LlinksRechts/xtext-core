/*
 * Copyright (c) 2016, 2017 TypeFox GmbH (http://www.typefox.io) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
grammar InternalPartialContentAssistTestLanguage;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.eclipse.xtext.ide.tests.testlanguage.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.eclipse.xtext.ide.tests.testlanguage.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.eclipse.xtext.ide.tests.testlanguage.services.PartialContentAssistTestLanguageGrammarAccess;

}
@parser::members {
	private PartialContentAssistTestLanguageGrammarAccess grammarAccess;

	public void setGrammarAccess(PartialContentAssistTestLanguageGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleTypeDeclaration
entryRuleTypeDeclaration
:
{ before(grammarAccess.getTypeDeclarationRule()); }
	 ruleTypeDeclaration
{ after(grammarAccess.getTypeDeclarationRule()); } 
	 EOF 
;

// Rule TypeDeclaration
ruleTypeDeclaration 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTypeDeclarationAccess().getGroup()); }
		(rule__TypeDeclaration__Group__0)
		{ after(grammarAccess.getTypeDeclarationAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleProperty
entryRuleProperty
:
{ before(grammarAccess.getPropertyRule()); }
	 ruleProperty
{ after(grammarAccess.getPropertyRule()); } 
	 EOF 
;

// Rule Property
ruleProperty 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPropertyAccess().getGroup()); }
		(rule__Property__Group__0)
		{ after(grammarAccess.getPropertyAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Property__TypeAlternatives_0_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPropertyAccess().getTypeIntKeyword_0_0_0()); }
		'int'
		{ after(grammarAccess.getPropertyAccess().getTypeIntKeyword_0_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getPropertyAccess().getTypeBoolKeyword_0_0_1()); }
		'bool'
		{ after(grammarAccess.getPropertyAccess().getTypeBoolKeyword_0_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeDeclaration__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypeDeclaration__Group__0__Impl
	rule__TypeDeclaration__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeDeclaration__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeDeclarationAccess().getTypeKeyword_0()); }
	'type'
	{ after(grammarAccess.getTypeDeclarationAccess().getTypeKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeDeclaration__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypeDeclaration__Group__1__Impl
	rule__TypeDeclaration__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeDeclaration__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeDeclarationAccess().getNameAssignment_1()); }
	(rule__TypeDeclaration__NameAssignment_1)
	{ after(grammarAccess.getTypeDeclarationAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeDeclaration__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypeDeclaration__Group__2__Impl
	rule__TypeDeclaration__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeDeclaration__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeDeclarationAccess().getGroup_2()); }
	(rule__TypeDeclaration__Group_2__0)?
	{ after(grammarAccess.getTypeDeclarationAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeDeclaration__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypeDeclaration__Group__3__Impl
	rule__TypeDeclaration__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeDeclaration__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeDeclarationAccess().getLeftCurlyBracketKeyword_3()); }
	'{'
	{ after(grammarAccess.getTypeDeclarationAccess().getLeftCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeDeclaration__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypeDeclaration__Group__4__Impl
	rule__TypeDeclaration__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeDeclaration__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeDeclarationAccess().getPropertiesAssignment_4()); }
	(rule__TypeDeclaration__PropertiesAssignment_4)*
	{ after(grammarAccess.getTypeDeclarationAccess().getPropertiesAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeDeclaration__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypeDeclaration__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeDeclaration__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeDeclarationAccess().getRightCurlyBracketKeyword_5()); }
	'}'
	{ after(grammarAccess.getTypeDeclarationAccess().getRightCurlyBracketKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TypeDeclaration__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypeDeclaration__Group_2__0__Impl
	rule__TypeDeclaration__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeDeclaration__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeDeclarationAccess().getExtendsKeyword_2_0()); }
	'extends'
	{ after(grammarAccess.getTypeDeclarationAccess().getExtendsKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeDeclaration__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypeDeclaration__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeDeclaration__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeDeclarationAccess().getSuperTypeAssignment_2_1()); }
	(rule__TypeDeclaration__SuperTypeAssignment_2_1)
	{ after(grammarAccess.getTypeDeclarationAccess().getSuperTypeAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Property__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Property__Group__0__Impl
	rule__Property__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Property__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPropertyAccess().getTypeAssignment_0()); }
	(rule__Property__TypeAssignment_0)
	{ after(grammarAccess.getPropertyAccess().getTypeAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Property__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Property__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Property__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPropertyAccess().getNameAssignment_1()); }
	(rule__Property__NameAssignment_1)
	{ after(grammarAccess.getPropertyAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TypeDeclaration__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypeDeclarationAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getTypeDeclarationAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeDeclaration__SuperTypeAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypeDeclarationAccess().getSuperTypeTypeDeclarationCrossReference_2_1_0()); }
		(
			{ before(grammarAccess.getTypeDeclarationAccess().getSuperTypeTypeDeclarationIDTerminalRuleCall_2_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getTypeDeclarationAccess().getSuperTypeTypeDeclarationIDTerminalRuleCall_2_1_0_1()); }
		)
		{ after(grammarAccess.getTypeDeclarationAccess().getSuperTypeTypeDeclarationCrossReference_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeDeclaration__PropertiesAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypeDeclarationAccess().getPropertiesPropertyParserRuleCall_4_0()); }
		ruleProperty
		{ after(grammarAccess.getTypeDeclarationAccess().getPropertiesPropertyParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Property__TypeAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPropertyAccess().getTypeAlternatives_0_0()); }
		(rule__Property__TypeAlternatives_0_0)
		{ after(grammarAccess.getPropertyAccess().getTypeAlternatives_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Property__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
