package org.eclipse.xtext.parsetree.formatter.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.parsetree.formatter.services.FormatterTestLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFormatterTestLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'test'", "'post'", "';'", "'='", "'+='", "'['", "','", "']'", "'void'", "'('", "')'", "':'", "'space'", "'linewrap'", "'wrapminmax'", "'indentation'", "'{'", "'}'", "'fqn'", "'.'", "'fqnref'", "'enum'", "'`'", "'%'", "'<'", "'>'", "'datatypes'", "'kw1'", "'kw3'", "'wrappingdt'", "'lit1'", "'lit2'", "'lit3'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalFormatterTestLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalFormatterTestLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalFormatterTestLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "InternalFormatterTestLanguage.g"; }



     	private FormatterTestLanguageGrammarAccess grammarAccess;

        public InternalFormatterTestLanguageParser(TokenStream input, FormatterTestLanguageGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Root";
       	}

       	@Override
       	protected FormatterTestLanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleRoot"
    // InternalFormatterTestLanguage.g:65:1: entryRuleRoot returns [EObject current=null] : iv_ruleRoot= ruleRoot EOF ;
    public final EObject entryRuleRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoot = null;


        try {
            // InternalFormatterTestLanguage.g:65:45: (iv_ruleRoot= ruleRoot EOF )
            // InternalFormatterTestLanguage.g:66:2: iv_ruleRoot= ruleRoot EOF
            {
             newCompositeNode(grammarAccess.getRootRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRoot=ruleRoot();

            state._fsp--;

             current =iv_ruleRoot; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRoot"


    // $ANTLR start "ruleRoot"
    // InternalFormatterTestLanguage.g:72:1: ruleRoot returns [EObject current=null] : (otherlv_0= 'test' (this_TestLinewrap_1= ruleTestLinewrap | this_TestIndentation_2= ruleTestIndentation | this_TestLinewrapMinMax_3= ruleTestLinewrapMinMax | this_WrappingDataTypeTest_4= ruleWrappingDataTypeTest ) ) ;
    public final EObject ruleRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_TestLinewrap_1 = null;

        EObject this_TestIndentation_2 = null;

        EObject this_TestLinewrapMinMax_3 = null;

        EObject this_WrappingDataTypeTest_4 = null;


        try {
            // InternalFormatterTestLanguage.g:73:1: ( (otherlv_0= 'test' (this_TestLinewrap_1= ruleTestLinewrap | this_TestIndentation_2= ruleTestIndentation | this_TestLinewrapMinMax_3= ruleTestLinewrapMinMax | this_WrappingDataTypeTest_4= ruleWrappingDataTypeTest ) ) )
            // InternalFormatterTestLanguage.g:74:2: (otherlv_0= 'test' (this_TestLinewrap_1= ruleTestLinewrap | this_TestIndentation_2= ruleTestIndentation | this_TestLinewrapMinMax_3= ruleTestLinewrapMinMax | this_WrappingDataTypeTest_4= ruleWrappingDataTypeTest ) )
            {
            // InternalFormatterTestLanguage.g:74:2: (otherlv_0= 'test' (this_TestLinewrap_1= ruleTestLinewrap | this_TestIndentation_2= ruleTestIndentation | this_TestLinewrapMinMax_3= ruleTestLinewrapMinMax | this_WrappingDataTypeTest_4= ruleWrappingDataTypeTest ) )
            // InternalFormatterTestLanguage.g:75:3: otherlv_0= 'test' (this_TestLinewrap_1= ruleTestLinewrap | this_TestIndentation_2= ruleTestIndentation | this_TestLinewrapMinMax_3= ruleTestLinewrapMinMax | this_WrappingDataTypeTest_4= ruleWrappingDataTypeTest )
            {
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRootAccess().getTestKeyword_0());
            		
            // InternalFormatterTestLanguage.g:79:3: (this_TestLinewrap_1= ruleTestLinewrap | this_TestIndentation_2= ruleTestIndentation | this_TestLinewrapMinMax_3= ruleTestLinewrapMinMax | this_WrappingDataTypeTest_4= ruleWrappingDataTypeTest )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt1=1;
                }
                break;
            case 26:
                {
                alt1=2;
                }
                break;
            case 25:
                {
                alt1=3;
                }
                break;
            case 40:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalFormatterTestLanguage.g:80:4: this_TestLinewrap_1= ruleTestLinewrap
                    {

                    				newCompositeNode(grammarAccess.getRootAccess().getTestLinewrapParserRuleCall_1_0());
                    			
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TestLinewrap_1=ruleTestLinewrap();

                    state._fsp--;


                    				current = this_TestLinewrap_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalFormatterTestLanguage.g:89:4: this_TestIndentation_2= ruleTestIndentation
                    {

                    				newCompositeNode(grammarAccess.getRootAccess().getTestIndentationParserRuleCall_1_1());
                    			
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TestIndentation_2=ruleTestIndentation();

                    state._fsp--;


                    				current = this_TestIndentation_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 3 :
                    // InternalFormatterTestLanguage.g:98:4: this_TestLinewrapMinMax_3= ruleTestLinewrapMinMax
                    {

                    				newCompositeNode(grammarAccess.getRootAccess().getTestLinewrapMinMaxParserRuleCall_1_2());
                    			
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TestLinewrapMinMax_3=ruleTestLinewrapMinMax();

                    state._fsp--;


                    				current = this_TestLinewrapMinMax_3;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 4 :
                    // InternalFormatterTestLanguage.g:107:4: this_WrappingDataTypeTest_4= ruleWrappingDataTypeTest
                    {

                    				newCompositeNode(grammarAccess.getRootAccess().getWrappingDataTypeTestParserRuleCall_1_3());
                    			
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_WrappingDataTypeTest_4=ruleWrappingDataTypeTest();

                    state._fsp--;


                    				current = this_WrappingDataTypeTest_4;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }


            }


            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRoot"


    // $ANTLR start "entryRuleLine"
    // InternalFormatterTestLanguage.g:120:1: entryRuleLine returns [EObject current=null] : iv_ruleLine= ruleLine EOF ;
    public final EObject entryRuleLine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLine = null;


        try {
            // InternalFormatterTestLanguage.g:120:45: (iv_ruleLine= ruleLine EOF )
            // InternalFormatterTestLanguage.g:121:2: iv_ruleLine= ruleLine EOF
            {
             newCompositeNode(grammarAccess.getLineRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleLine=ruleLine();

            state._fsp--;

             current =iv_ruleLine; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLine"


    // $ANTLR start "ruleLine"
    // InternalFormatterTestLanguage.g:127:1: ruleLine returns [EObject current=null] : ( (this_Decl_0= ruleDecl | this_Assign_1= ruleAssign | this_Meth_2= ruleMeth | this_FqnObj_3= ruleFqnObj | this_FqnRef_4= ruleFqnRef | this_Enumeration_5= ruleEnumeration | (this_SuppressedHidden_6= ruleSuppressedHidden otherlv_7= 'post' ) | this_Space_8= ruleSpace | this_Datatypes_9= ruleDatatypes ) otherlv_10= ';' ) ;
    public final EObject ruleLine() throws RecognitionException {
        EObject current = null;

        Token otherlv_7=null;
        Token otherlv_10=null;
        EObject this_Decl_0 = null;

        EObject this_Assign_1 = null;

        EObject this_Meth_2 = null;

        EObject this_FqnObj_3 = null;

        EObject this_FqnRef_4 = null;

        EObject this_Enumeration_5 = null;

        EObject this_SuppressedHidden_6 = null;

        EObject this_Space_8 = null;

        EObject this_Datatypes_9 = null;


        try {
            // InternalFormatterTestLanguage.g:128:1: ( ( (this_Decl_0= ruleDecl | this_Assign_1= ruleAssign | this_Meth_2= ruleMeth | this_FqnObj_3= ruleFqnObj | this_FqnRef_4= ruleFqnRef | this_Enumeration_5= ruleEnumeration | (this_SuppressedHidden_6= ruleSuppressedHidden otherlv_7= 'post' ) | this_Space_8= ruleSpace | this_Datatypes_9= ruleDatatypes ) otherlv_10= ';' ) )
            // InternalFormatterTestLanguage.g:129:2: ( (this_Decl_0= ruleDecl | this_Assign_1= ruleAssign | this_Meth_2= ruleMeth | this_FqnObj_3= ruleFqnObj | this_FqnRef_4= ruleFqnRef | this_Enumeration_5= ruleEnumeration | (this_SuppressedHidden_6= ruleSuppressedHidden otherlv_7= 'post' ) | this_Space_8= ruleSpace | this_Datatypes_9= ruleDatatypes ) otherlv_10= ';' )
            {
            // InternalFormatterTestLanguage.g:129:2: ( (this_Decl_0= ruleDecl | this_Assign_1= ruleAssign | this_Meth_2= ruleMeth | this_FqnObj_3= ruleFqnObj | this_FqnRef_4= ruleFqnRef | this_Enumeration_5= ruleEnumeration | (this_SuppressedHidden_6= ruleSuppressedHidden otherlv_7= 'post' ) | this_Space_8= ruleSpace | this_Datatypes_9= ruleDatatypes ) otherlv_10= ';' )
            // InternalFormatterTestLanguage.g:130:3: (this_Decl_0= ruleDecl | this_Assign_1= ruleAssign | this_Meth_2= ruleMeth | this_FqnObj_3= ruleFqnObj | this_FqnRef_4= ruleFqnRef | this_Enumeration_5= ruleEnumeration | (this_SuppressedHidden_6= ruleSuppressedHidden otherlv_7= 'post' ) | this_Space_8= ruleSpace | this_Datatypes_9= ruleDatatypes ) otherlv_10= ';'
            {
            // InternalFormatterTestLanguage.g:130:3: (this_Decl_0= ruleDecl | this_Assign_1= ruleAssign | this_Meth_2= ruleMeth | this_FqnObj_3= ruleFqnObj | this_FqnRef_4= ruleFqnRef | this_Enumeration_5= ruleEnumeration | (this_SuppressedHidden_6= ruleSuppressedHidden otherlv_7= 'post' ) | this_Space_8= ruleSpace | this_Datatypes_9= ruleDatatypes )
            int alt2=9;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalFormatterTestLanguage.g:131:4: this_Decl_0= ruleDecl
                    {

                    				newCompositeNode(grammarAccess.getLineAccess().getDeclParserRuleCall_0_0());
                    			
                    pushFollow(FollowSets000.FOLLOW_4);
                    this_Decl_0=ruleDecl();

                    state._fsp--;


                    				current = this_Decl_0;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalFormatterTestLanguage.g:140:4: this_Assign_1= ruleAssign
                    {

                    				newCompositeNode(grammarAccess.getLineAccess().getAssignParserRuleCall_0_1());
                    			
                    pushFollow(FollowSets000.FOLLOW_4);
                    this_Assign_1=ruleAssign();

                    state._fsp--;


                    				current = this_Assign_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 3 :
                    // InternalFormatterTestLanguage.g:149:4: this_Meth_2= ruleMeth
                    {

                    				newCompositeNode(grammarAccess.getLineAccess().getMethParserRuleCall_0_2());
                    			
                    pushFollow(FollowSets000.FOLLOW_4);
                    this_Meth_2=ruleMeth();

                    state._fsp--;


                    				current = this_Meth_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 4 :
                    // InternalFormatterTestLanguage.g:158:4: this_FqnObj_3= ruleFqnObj
                    {

                    				newCompositeNode(grammarAccess.getLineAccess().getFqnObjParserRuleCall_0_3());
                    			
                    pushFollow(FollowSets000.FOLLOW_4);
                    this_FqnObj_3=ruleFqnObj();

                    state._fsp--;


                    				current = this_FqnObj_3;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 5 :
                    // InternalFormatterTestLanguage.g:167:4: this_FqnRef_4= ruleFqnRef
                    {

                    				newCompositeNode(grammarAccess.getLineAccess().getFqnRefParserRuleCall_0_4());
                    			
                    pushFollow(FollowSets000.FOLLOW_4);
                    this_FqnRef_4=ruleFqnRef();

                    state._fsp--;


                    				current = this_FqnRef_4;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 6 :
                    // InternalFormatterTestLanguage.g:176:4: this_Enumeration_5= ruleEnumeration
                    {

                    				newCompositeNode(grammarAccess.getLineAccess().getEnumerationParserRuleCall_0_5());
                    			
                    pushFollow(FollowSets000.FOLLOW_4);
                    this_Enumeration_5=ruleEnumeration();

                    state._fsp--;


                    				current = this_Enumeration_5;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 7 :
                    // InternalFormatterTestLanguage.g:185:4: (this_SuppressedHidden_6= ruleSuppressedHidden otherlv_7= 'post' )
                    {
                    // InternalFormatterTestLanguage.g:185:4: (this_SuppressedHidden_6= ruleSuppressedHidden otherlv_7= 'post' )
                    // InternalFormatterTestLanguage.g:186:5: this_SuppressedHidden_6= ruleSuppressedHidden otherlv_7= 'post'
                    {

                    					newCompositeNode(grammarAccess.getLineAccess().getSuppressedHiddenParserRuleCall_0_6_0());
                    				
                    pushFollow(FollowSets000.FOLLOW_5);
                    this_SuppressedHidden_6=ruleSuppressedHidden();

                    state._fsp--;


                    					current = this_SuppressedHidden_6;
                    					afterParserOrEnumRuleCall();
                    				
                    otherlv_7=(Token)match(input,12,FollowSets000.FOLLOW_4); 

                    					newLeafNode(otherlv_7, grammarAccess.getLineAccess().getPostKeyword_0_6_1());
                    				

                    }


                    }
                    break;
                case 8 :
                    // InternalFormatterTestLanguage.g:200:4: this_Space_8= ruleSpace
                    {

                    				newCompositeNode(grammarAccess.getLineAccess().getSpaceParserRuleCall_0_7());
                    			
                    pushFollow(FollowSets000.FOLLOW_4);
                    this_Space_8=ruleSpace();

                    state._fsp--;


                    				current = this_Space_8;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 9 :
                    // InternalFormatterTestLanguage.g:209:4: this_Datatypes_9= ruleDatatypes
                    {

                    				newCompositeNode(grammarAccess.getLineAccess().getDatatypesParserRuleCall_0_8());
                    			
                    pushFollow(FollowSets000.FOLLOW_4);
                    this_Datatypes_9=ruleDatatypes();

                    state._fsp--;


                    				current = this_Datatypes_9;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,13,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getLineAccess().getSemicolonKeyword_1());
            		

            }


            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLine"


    // $ANTLR start "entryRuleDecl"
    // InternalFormatterTestLanguage.g:226:1: entryRuleDecl returns [EObject current=null] : iv_ruleDecl= ruleDecl EOF ;
    public final EObject entryRuleDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecl = null;


        try {
            // InternalFormatterTestLanguage.g:226:45: (iv_ruleDecl= ruleDecl EOF )
            // InternalFormatterTestLanguage.g:227:2: iv_ruleDecl= ruleDecl EOF
            {
             newCompositeNode(grammarAccess.getDeclRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDecl=ruleDecl();

            state._fsp--;

             current =iv_ruleDecl; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDecl"


    // $ANTLR start "ruleDecl"
    // InternalFormatterTestLanguage.g:233:1: ruleDecl returns [EObject current=null] : ( ( (lv_type_0_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDecl() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token lv_name_1_0=null;

        try {
            // InternalFormatterTestLanguage.g:234:1: ( ( ( (lv_type_0_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalFormatterTestLanguage.g:235:2: ( ( (lv_type_0_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalFormatterTestLanguage.g:235:2: ( ( (lv_type_0_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalFormatterTestLanguage.g:236:3: ( (lv_type_0_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalFormatterTestLanguage.g:236:3: ( (lv_type_0_0= RULE_ID ) )
            // InternalFormatterTestLanguage.g:237:4: (lv_type_0_0= RULE_ID )
            {
            // InternalFormatterTestLanguage.g:237:4: (lv_type_0_0= RULE_ID )
            // InternalFormatterTestLanguage.g:238:5: lv_type_0_0= RULE_ID
            {
            lv_type_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); 

            					newLeafNode(lv_type_0_0, grammarAccess.getDeclAccess().getTypeIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDeclRule());
            					}
            					addWithLastConsumed(
            						current,
            						"type",
            						lv_type_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalFormatterTestLanguage.g:254:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalFormatterTestLanguage.g:255:4: (lv_name_1_0= RULE_ID )
            {
            // InternalFormatterTestLanguage.g:255:4: (lv_name_1_0= RULE_ID )
            // InternalFormatterTestLanguage.g:256:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDeclAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDeclRule());
            					}
            					addWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDecl"


    // $ANTLR start "entryRuleAssign"
    // InternalFormatterTestLanguage.g:276:1: entryRuleAssign returns [EObject current=null] : iv_ruleAssign= ruleAssign EOF ;
    public final EObject entryRuleAssign() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssign = null;


        try {
            // InternalFormatterTestLanguage.g:276:47: (iv_ruleAssign= ruleAssign EOF )
            // InternalFormatterTestLanguage.g:277:2: iv_ruleAssign= ruleAssign EOF
            {
             newCompositeNode(grammarAccess.getAssignRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAssign=ruleAssign();

            state._fsp--;

             current =iv_ruleAssign; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssign"


    // $ANTLR start "ruleAssign"
    // InternalFormatterTestLanguage.g:283:1: ruleAssign returns [EObject current=null] : ( ( (lv_var_0_0= RULE_ID ) ) ( ( (lv_op_1_1= '=' | lv_op_1_2= '+=' ) ) ) otherlv_2= '[' ( ( (lv_val_3_0= RULE_INT ) ) (otherlv_4= ',' ( (lv_val_5_0= RULE_INT ) ) )* )? otherlv_6= ']' ) ;
    public final EObject ruleAssign() throws RecognitionException {
        EObject current = null;

        Token lv_var_0_0=null;
        Token lv_op_1_1=null;
        Token lv_op_1_2=null;
        Token otherlv_2=null;
        Token lv_val_3_0=null;
        Token otherlv_4=null;
        Token lv_val_5_0=null;
        Token otherlv_6=null;

        try {
            // InternalFormatterTestLanguage.g:284:1: ( ( ( (lv_var_0_0= RULE_ID ) ) ( ( (lv_op_1_1= '=' | lv_op_1_2= '+=' ) ) ) otherlv_2= '[' ( ( (lv_val_3_0= RULE_INT ) ) (otherlv_4= ',' ( (lv_val_5_0= RULE_INT ) ) )* )? otherlv_6= ']' ) )
            // InternalFormatterTestLanguage.g:285:2: ( ( (lv_var_0_0= RULE_ID ) ) ( ( (lv_op_1_1= '=' | lv_op_1_2= '+=' ) ) ) otherlv_2= '[' ( ( (lv_val_3_0= RULE_INT ) ) (otherlv_4= ',' ( (lv_val_5_0= RULE_INT ) ) )* )? otherlv_6= ']' )
            {
            // InternalFormatterTestLanguage.g:285:2: ( ( (lv_var_0_0= RULE_ID ) ) ( ( (lv_op_1_1= '=' | lv_op_1_2= '+=' ) ) ) otherlv_2= '[' ( ( (lv_val_3_0= RULE_INT ) ) (otherlv_4= ',' ( (lv_val_5_0= RULE_INT ) ) )* )? otherlv_6= ']' )
            // InternalFormatterTestLanguage.g:286:3: ( (lv_var_0_0= RULE_ID ) ) ( ( (lv_op_1_1= '=' | lv_op_1_2= '+=' ) ) ) otherlv_2= '[' ( ( (lv_val_3_0= RULE_INT ) ) (otherlv_4= ',' ( (lv_val_5_0= RULE_INT ) ) )* )? otherlv_6= ']'
            {
            // InternalFormatterTestLanguage.g:286:3: ( (lv_var_0_0= RULE_ID ) )
            // InternalFormatterTestLanguage.g:287:4: (lv_var_0_0= RULE_ID )
            {
            // InternalFormatterTestLanguage.g:287:4: (lv_var_0_0= RULE_ID )
            // InternalFormatterTestLanguage.g:288:5: lv_var_0_0= RULE_ID
            {
            lv_var_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_7); 

            					newLeafNode(lv_var_0_0, grammarAccess.getAssignAccess().getVarIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssignRule());
            					}
            					setWithLastConsumed(
            						current,
            						"var",
            						lv_var_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalFormatterTestLanguage.g:304:3: ( ( (lv_op_1_1= '=' | lv_op_1_2= '+=' ) ) )
            // InternalFormatterTestLanguage.g:305:4: ( (lv_op_1_1= '=' | lv_op_1_2= '+=' ) )
            {
            // InternalFormatterTestLanguage.g:305:4: ( (lv_op_1_1= '=' | lv_op_1_2= '+=' ) )
            // InternalFormatterTestLanguage.g:306:5: (lv_op_1_1= '=' | lv_op_1_2= '+=' )
            {
            // InternalFormatterTestLanguage.g:306:5: (lv_op_1_1= '=' | lv_op_1_2= '+=' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            else if ( (LA3_0==15) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalFormatterTestLanguage.g:307:6: lv_op_1_1= '='
                    {
                    lv_op_1_1=(Token)match(input,14,FollowSets000.FOLLOW_8); 

                    						newLeafNode(lv_op_1_1, grammarAccess.getAssignAccess().getOpEqualsSignKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAssignRule());
                    						}
                    						setWithLastConsumed(current, "op", lv_op_1_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalFormatterTestLanguage.g:318:6: lv_op_1_2= '+='
                    {
                    lv_op_1_2=(Token)match(input,15,FollowSets000.FOLLOW_8); 

                    						newLeafNode(lv_op_1_2, grammarAccess.getAssignAccess().getOpPlusSignEqualsSignKeyword_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAssignRule());
                    						}
                    						setWithLastConsumed(current, "op", lv_op_1_2, null);
                    					

                    }
                    break;

            }


            }


            }

            otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getAssignAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalFormatterTestLanguage.g:335:3: ( ( (lv_val_3_0= RULE_INT ) ) (otherlv_4= ',' ( (lv_val_5_0= RULE_INT ) ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_INT) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalFormatterTestLanguage.g:336:4: ( (lv_val_3_0= RULE_INT ) ) (otherlv_4= ',' ( (lv_val_5_0= RULE_INT ) ) )*
                    {
                    // InternalFormatterTestLanguage.g:336:4: ( (lv_val_3_0= RULE_INT ) )
                    // InternalFormatterTestLanguage.g:337:5: (lv_val_3_0= RULE_INT )
                    {
                    // InternalFormatterTestLanguage.g:337:5: (lv_val_3_0= RULE_INT )
                    // InternalFormatterTestLanguage.g:338:6: lv_val_3_0= RULE_INT
                    {
                    lv_val_3_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_10); 

                    						newLeafNode(lv_val_3_0, grammarAccess.getAssignAccess().getValINTTerminalRuleCall_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAssignRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"val",
                    							lv_val_3_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    // InternalFormatterTestLanguage.g:354:4: (otherlv_4= ',' ( (lv_val_5_0= RULE_INT ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==17) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalFormatterTestLanguage.g:355:5: otherlv_4= ',' ( (lv_val_5_0= RULE_INT ) )
                    	    {
                    	    otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_11); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getAssignAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalFormatterTestLanguage.g:359:5: ( (lv_val_5_0= RULE_INT ) )
                    	    // InternalFormatterTestLanguage.g:360:6: (lv_val_5_0= RULE_INT )
                    	    {
                    	    // InternalFormatterTestLanguage.g:360:6: (lv_val_5_0= RULE_INT )
                    	    // InternalFormatterTestLanguage.g:361:7: lv_val_5_0= RULE_INT
                    	    {
                    	    lv_val_5_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_10); 

                    	    							newLeafNode(lv_val_5_0, grammarAccess.getAssignAccess().getValINTTerminalRuleCall_3_1_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getAssignRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"val",
                    	    								lv_val_5_0,
                    	    								"org.eclipse.xtext.common.Terminals.INT");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,18,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getAssignAccess().getRightSquareBracketKeyword_4());
            		

            }


            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssign"


    // $ANTLR start "entryRuleMeth"
    // InternalFormatterTestLanguage.g:387:1: entryRuleMeth returns [EObject current=null] : iv_ruleMeth= ruleMeth EOF ;
    public final EObject entryRuleMeth() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeth = null;


        try {
            // InternalFormatterTestLanguage.g:387:45: (iv_ruleMeth= ruleMeth EOF )
            // InternalFormatterTestLanguage.g:388:2: iv_ruleMeth= ruleMeth EOF
            {
             newCompositeNode(grammarAccess.getMethRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMeth=ruleMeth();

            state._fsp--;

             current =iv_ruleMeth; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMeth"


    // $ANTLR start "ruleMeth"
    // InternalFormatterTestLanguage.g:394:1: ruleMeth returns [EObject current=null] : (otherlv_0= 'void' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_param_3_0= ruleParam ) ) (otherlv_4= ',' ( (lv_param_5_0= ruleParam ) ) )* )? otherlv_6= ')' ) ;
    public final EObject ruleMeth() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_param_3_0 = null;

        EObject lv_param_5_0 = null;


        try {
            // InternalFormatterTestLanguage.g:395:1: ( (otherlv_0= 'void' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_param_3_0= ruleParam ) ) (otherlv_4= ',' ( (lv_param_5_0= ruleParam ) ) )* )? otherlv_6= ')' ) )
            // InternalFormatterTestLanguage.g:396:2: (otherlv_0= 'void' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_param_3_0= ruleParam ) ) (otherlv_4= ',' ( (lv_param_5_0= ruleParam ) ) )* )? otherlv_6= ')' )
            {
            // InternalFormatterTestLanguage.g:396:2: (otherlv_0= 'void' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_param_3_0= ruleParam ) ) (otherlv_4= ',' ( (lv_param_5_0= ruleParam ) ) )* )? otherlv_6= ')' )
            // InternalFormatterTestLanguage.g:397:3: otherlv_0= 'void' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_param_3_0= ruleParam ) ) (otherlv_4= ',' ( (lv_param_5_0= ruleParam ) ) )* )? otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,19,FollowSets000.FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getMethAccess().getVoidKeyword_0());
            		
            // InternalFormatterTestLanguage.g:401:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalFormatterTestLanguage.g:402:4: (lv_name_1_0= RULE_ID )
            {
            // InternalFormatterTestLanguage.g:402:4: (lv_name_1_0= RULE_ID )
            // InternalFormatterTestLanguage.g:403:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_12); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMethAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMethRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,20,FollowSets000.FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getMethAccess().getLeftParenthesisKeyword_2());
            		
            // InternalFormatterTestLanguage.g:423:3: ( ( (lv_param_3_0= ruleParam ) ) (otherlv_4= ',' ( (lv_param_5_0= ruleParam ) ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalFormatterTestLanguage.g:424:4: ( (lv_param_3_0= ruleParam ) ) (otherlv_4= ',' ( (lv_param_5_0= ruleParam ) ) )*
                    {
                    // InternalFormatterTestLanguage.g:424:4: ( (lv_param_3_0= ruleParam ) )
                    // InternalFormatterTestLanguage.g:425:5: (lv_param_3_0= ruleParam )
                    {
                    // InternalFormatterTestLanguage.g:425:5: (lv_param_3_0= ruleParam )
                    // InternalFormatterTestLanguage.g:426:6: lv_param_3_0= ruleParam
                    {

                    						newCompositeNode(grammarAccess.getMethAccess().getParamParamParserRuleCall_3_0_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_14);
                    lv_param_3_0=ruleParam();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMethRule());
                    						}
                    						add(
                    							current,
                    							"param",
                    							lv_param_3_0,
                    							"org.eclipse.xtext.parsetree.formatter.FormatterTestLanguage.Param");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalFormatterTestLanguage.g:443:4: (otherlv_4= ',' ( (lv_param_5_0= ruleParam ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==17) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalFormatterTestLanguage.g:444:5: otherlv_4= ',' ( (lv_param_5_0= ruleParam ) )
                    	    {
                    	    otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_6); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getMethAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalFormatterTestLanguage.g:448:5: ( (lv_param_5_0= ruleParam ) )
                    	    // InternalFormatterTestLanguage.g:449:6: (lv_param_5_0= ruleParam )
                    	    {
                    	    // InternalFormatterTestLanguage.g:449:6: (lv_param_5_0= ruleParam )
                    	    // InternalFormatterTestLanguage.g:450:7: lv_param_5_0= ruleParam
                    	    {

                    	    							newCompositeNode(grammarAccess.getMethAccess().getParamParamParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FollowSets000.FOLLOW_14);
                    	    lv_param_5_0=ruleParam();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMethRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"param",
                    	    								lv_param_5_0,
                    	    								"org.eclipse.xtext.parsetree.formatter.FormatterTestLanguage.Param");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,21,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getMethAccess().getRightParenthesisKeyword_4());
            		

            }


            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMeth"


    // $ANTLR start "entryRuleParam"
    // InternalFormatterTestLanguage.g:477:1: entryRuleParam returns [EObject current=null] : iv_ruleParam= ruleParam EOF ;
    public final EObject entryRuleParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParam = null;


        try {
            // InternalFormatterTestLanguage.g:477:46: (iv_ruleParam= ruleParam EOF )
            // InternalFormatterTestLanguage.g:478:2: iv_ruleParam= ruleParam EOF
            {
             newCompositeNode(grammarAccess.getParamRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleParam=ruleParam();

            state._fsp--;

             current =iv_ruleParam; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParam"


    // $ANTLR start "ruleParam"
    // InternalFormatterTestLanguage.g:484:1: ruleParam returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_ID ) ) ) ;
    public final EObject ruleParam() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_type_2_0=null;

        try {
            // InternalFormatterTestLanguage.g:485:1: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_ID ) ) ) )
            // InternalFormatterTestLanguage.g:486:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_ID ) ) )
            {
            // InternalFormatterTestLanguage.g:486:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_ID ) ) )
            // InternalFormatterTestLanguage.g:487:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_ID ) )
            {
            // InternalFormatterTestLanguage.g:487:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalFormatterTestLanguage.g:488:4: (lv_name_0_0= RULE_ID )
            {
            // InternalFormatterTestLanguage.g:488:4: (lv_name_0_0= RULE_ID )
            // InternalFormatterTestLanguage.g:489:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_15); 

            					newLeafNode(lv_name_0_0, grammarAccess.getParamAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParamRule());
            					}
            					addWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,22,FollowSets000.FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getParamAccess().getColonKeyword_1());
            		
            // InternalFormatterTestLanguage.g:509:3: ( (lv_type_2_0= RULE_ID ) )
            // InternalFormatterTestLanguage.g:510:4: (lv_type_2_0= RULE_ID )
            {
            // InternalFormatterTestLanguage.g:510:4: (lv_type_2_0= RULE_ID )
            // InternalFormatterTestLanguage.g:511:5: lv_type_2_0= RULE_ID
            {
            lv_type_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

            					newLeafNode(lv_type_2_0, grammarAccess.getParamAccess().getTypeIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParamRule());
            					}
            					addWithLastConsumed(
            						current,
            						"type",
            						lv_type_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParam"


    // $ANTLR start "entryRuleSpace"
    // InternalFormatterTestLanguage.g:531:1: entryRuleSpace returns [EObject current=null] : iv_ruleSpace= ruleSpace EOF ;
    public final EObject entryRuleSpace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpace = null;


        try {
            // InternalFormatterTestLanguage.g:531:46: (iv_ruleSpace= ruleSpace EOF )
            // InternalFormatterTestLanguage.g:532:2: iv_ruleSpace= ruleSpace EOF
            {
             newCompositeNode(grammarAccess.getSpaceRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSpace=ruleSpace();

            state._fsp--;

             current =iv_ruleSpace; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSpace"


    // $ANTLR start "ruleSpace"
    // InternalFormatterTestLanguage.g:538:1: ruleSpace returns [EObject current=null] : (otherlv_0= 'space' ( (lv_val_1_0= RULE_ID ) ) ) ;
    public final EObject ruleSpace() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_val_1_0=null;

        try {
            // InternalFormatterTestLanguage.g:539:1: ( (otherlv_0= 'space' ( (lv_val_1_0= RULE_ID ) ) ) )
            // InternalFormatterTestLanguage.g:540:2: (otherlv_0= 'space' ( (lv_val_1_0= RULE_ID ) ) )
            {
            // InternalFormatterTestLanguage.g:540:2: (otherlv_0= 'space' ( (lv_val_1_0= RULE_ID ) ) )
            // InternalFormatterTestLanguage.g:541:3: otherlv_0= 'space' ( (lv_val_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,23,FollowSets000.FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getSpaceAccess().getSpaceKeyword_0());
            		
            // InternalFormatterTestLanguage.g:545:3: ( (lv_val_1_0= RULE_ID ) )
            // InternalFormatterTestLanguage.g:546:4: (lv_val_1_0= RULE_ID )
            {
            // InternalFormatterTestLanguage.g:546:4: (lv_val_1_0= RULE_ID )
            // InternalFormatterTestLanguage.g:547:5: lv_val_1_0= RULE_ID
            {
            lv_val_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

            					newLeafNode(lv_val_1_0, grammarAccess.getSpaceAccess().getValIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSpaceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"val",
            						lv_val_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSpace"


    // $ANTLR start "entryRuleTestLinewrap"
    // InternalFormatterTestLanguage.g:567:1: entryRuleTestLinewrap returns [EObject current=null] : iv_ruleTestLinewrap= ruleTestLinewrap EOF ;
    public final EObject entryRuleTestLinewrap() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTestLinewrap = null;


        try {
            // InternalFormatterTestLanguage.g:567:53: (iv_ruleTestLinewrap= ruleTestLinewrap EOF )
            // InternalFormatterTestLanguage.g:568:2: iv_ruleTestLinewrap= ruleTestLinewrap EOF
            {
             newCompositeNode(grammarAccess.getTestLinewrapRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTestLinewrap=ruleTestLinewrap();

            state._fsp--;

             current =iv_ruleTestLinewrap; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTestLinewrap"


    // $ANTLR start "ruleTestLinewrap"
    // InternalFormatterTestLanguage.g:574:1: ruleTestLinewrap returns [EObject current=null] : ( () otherlv_1= 'linewrap' ( (lv_items_2_0= ruleLine ) )* ) ;
    public final EObject ruleTestLinewrap() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_items_2_0 = null;


        try {
            // InternalFormatterTestLanguage.g:575:1: ( ( () otherlv_1= 'linewrap' ( (lv_items_2_0= ruleLine ) )* ) )
            // InternalFormatterTestLanguage.g:576:2: ( () otherlv_1= 'linewrap' ( (lv_items_2_0= ruleLine ) )* )
            {
            // InternalFormatterTestLanguage.g:576:2: ( () otherlv_1= 'linewrap' ( (lv_items_2_0= ruleLine ) )* )
            // InternalFormatterTestLanguage.g:577:3: () otherlv_1= 'linewrap' ( (lv_items_2_0= ruleLine ) )*
            {
            // InternalFormatterTestLanguage.g:577:3: ()
            // InternalFormatterTestLanguage.g:578:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTestLinewrapAccess().getTestLinewrapAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FollowSets000.FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getTestLinewrapAccess().getLinewrapKeyword_1());
            		
            // InternalFormatterTestLanguage.g:588:3: ( (lv_items_2_0= ruleLine ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID||LA8_0==19||LA8_0==23||LA8_0==29||(LA8_0>=31 && LA8_0<=33)||LA8_0==37) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalFormatterTestLanguage.g:589:4: (lv_items_2_0= ruleLine )
            	    {
            	    // InternalFormatterTestLanguage.g:589:4: (lv_items_2_0= ruleLine )
            	    // InternalFormatterTestLanguage.g:590:5: lv_items_2_0= ruleLine
            	    {

            	    					newCompositeNode(grammarAccess.getTestLinewrapAccess().getItemsLineParserRuleCall_2_0());
            	    				
            	    pushFollow(FollowSets000.FOLLOW_16);
            	    lv_items_2_0=ruleLine();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTestLinewrapRule());
            	    					}
            	    					add(
            	    						current,
            	    						"items",
            	    						lv_items_2_0,
            	    						"org.eclipse.xtext.parsetree.formatter.FormatterTestLanguage.Line");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }


            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTestLinewrap"


    // $ANTLR start "entryRuleTestLinewrapMinMax"
    // InternalFormatterTestLanguage.g:611:1: entryRuleTestLinewrapMinMax returns [EObject current=null] : iv_ruleTestLinewrapMinMax= ruleTestLinewrapMinMax EOF ;
    public final EObject entryRuleTestLinewrapMinMax() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTestLinewrapMinMax = null;


        try {
            // InternalFormatterTestLanguage.g:611:59: (iv_ruleTestLinewrapMinMax= ruleTestLinewrapMinMax EOF )
            // InternalFormatterTestLanguage.g:612:2: iv_ruleTestLinewrapMinMax= ruleTestLinewrapMinMax EOF
            {
             newCompositeNode(grammarAccess.getTestLinewrapMinMaxRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTestLinewrapMinMax=ruleTestLinewrapMinMax();

            state._fsp--;

             current =iv_ruleTestLinewrapMinMax; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTestLinewrapMinMax"


    // $ANTLR start "ruleTestLinewrapMinMax"
    // InternalFormatterTestLanguage.g:618:1: ruleTestLinewrapMinMax returns [EObject current=null] : ( () otherlv_1= 'wrapminmax' ( (lv_items_2_0= ruleLine ) )* ) ;
    public final EObject ruleTestLinewrapMinMax() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_items_2_0 = null;


        try {
            // InternalFormatterTestLanguage.g:619:1: ( ( () otherlv_1= 'wrapminmax' ( (lv_items_2_0= ruleLine ) )* ) )
            // InternalFormatterTestLanguage.g:620:2: ( () otherlv_1= 'wrapminmax' ( (lv_items_2_0= ruleLine ) )* )
            {
            // InternalFormatterTestLanguage.g:620:2: ( () otherlv_1= 'wrapminmax' ( (lv_items_2_0= ruleLine ) )* )
            // InternalFormatterTestLanguage.g:621:3: () otherlv_1= 'wrapminmax' ( (lv_items_2_0= ruleLine ) )*
            {
            // InternalFormatterTestLanguage.g:621:3: ()
            // InternalFormatterTestLanguage.g:622:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTestLinewrapMinMaxAccess().getTestLinewrapMinMaxAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FollowSets000.FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getTestLinewrapMinMaxAccess().getWrapminmaxKeyword_1());
            		
            // InternalFormatterTestLanguage.g:632:3: ( (lv_items_2_0= ruleLine ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID||LA9_0==19||LA9_0==23||LA9_0==29||(LA9_0>=31 && LA9_0<=33)||LA9_0==37) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalFormatterTestLanguage.g:633:4: (lv_items_2_0= ruleLine )
            	    {
            	    // InternalFormatterTestLanguage.g:633:4: (lv_items_2_0= ruleLine )
            	    // InternalFormatterTestLanguage.g:634:5: lv_items_2_0= ruleLine
            	    {

            	    					newCompositeNode(grammarAccess.getTestLinewrapMinMaxAccess().getItemsLineParserRuleCall_2_0());
            	    				
            	    pushFollow(FollowSets000.FOLLOW_16);
            	    lv_items_2_0=ruleLine();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTestLinewrapMinMaxRule());
            	    					}
            	    					add(
            	    						current,
            	    						"items",
            	    						lv_items_2_0,
            	    						"org.eclipse.xtext.parsetree.formatter.FormatterTestLanguage.Line");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }


            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTestLinewrapMinMax"


    // $ANTLR start "entryRuleTestIndentation"
    // InternalFormatterTestLanguage.g:655:1: entryRuleTestIndentation returns [EObject current=null] : iv_ruleTestIndentation= ruleTestIndentation EOF ;
    public final EObject entryRuleTestIndentation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTestIndentation = null;


        try {
            // InternalFormatterTestLanguage.g:655:56: (iv_ruleTestIndentation= ruleTestIndentation EOF )
            // InternalFormatterTestLanguage.g:656:2: iv_ruleTestIndentation= ruleTestIndentation EOF
            {
             newCompositeNode(grammarAccess.getTestIndentationRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTestIndentation=ruleTestIndentation();

            state._fsp--;

             current =iv_ruleTestIndentation; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTestIndentation"


    // $ANTLR start "ruleTestIndentation"
    // InternalFormatterTestLanguage.g:662:1: ruleTestIndentation returns [EObject current=null] : ( () otherlv_1= 'indentation' otherlv_2= '{' ( ( (lv_items_3_1= ruleLine | lv_items_3_2= ruleTestIndentation ) ) )* otherlv_4= '}' ( (lv_semi_5_0= ';' ) )? ) ;
    public final EObject ruleTestIndentation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_semi_5_0=null;
        EObject lv_items_3_1 = null;

        EObject lv_items_3_2 = null;


        try {
            // InternalFormatterTestLanguage.g:663:1: ( ( () otherlv_1= 'indentation' otherlv_2= '{' ( ( (lv_items_3_1= ruleLine | lv_items_3_2= ruleTestIndentation ) ) )* otherlv_4= '}' ( (lv_semi_5_0= ';' ) )? ) )
            // InternalFormatterTestLanguage.g:664:2: ( () otherlv_1= 'indentation' otherlv_2= '{' ( ( (lv_items_3_1= ruleLine | lv_items_3_2= ruleTestIndentation ) ) )* otherlv_4= '}' ( (lv_semi_5_0= ';' ) )? )
            {
            // InternalFormatterTestLanguage.g:664:2: ( () otherlv_1= 'indentation' otherlv_2= '{' ( ( (lv_items_3_1= ruleLine | lv_items_3_2= ruleTestIndentation ) ) )* otherlv_4= '}' ( (lv_semi_5_0= ';' ) )? )
            // InternalFormatterTestLanguage.g:665:3: () otherlv_1= 'indentation' otherlv_2= '{' ( ( (lv_items_3_1= ruleLine | lv_items_3_2= ruleTestIndentation ) ) )* otherlv_4= '}' ( (lv_semi_5_0= ';' ) )?
            {
            // InternalFormatterTestLanguage.g:665:3: ()
            // InternalFormatterTestLanguage.g:666:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTestIndentationAccess().getTestIndentationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FollowSets000.FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getTestIndentationAccess().getIndentationKeyword_1());
            		
            otherlv_2=(Token)match(input,27,FollowSets000.FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getTestIndentationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalFormatterTestLanguage.g:680:3: ( ( (lv_items_3_1= ruleLine | lv_items_3_2= ruleTestIndentation ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID||LA11_0==19||LA11_0==23||LA11_0==26||LA11_0==29||(LA11_0>=31 && LA11_0<=33)||LA11_0==37) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalFormatterTestLanguage.g:681:4: ( (lv_items_3_1= ruleLine | lv_items_3_2= ruleTestIndentation ) )
            	    {
            	    // InternalFormatterTestLanguage.g:681:4: ( (lv_items_3_1= ruleLine | lv_items_3_2= ruleTestIndentation ) )
            	    // InternalFormatterTestLanguage.g:682:5: (lv_items_3_1= ruleLine | lv_items_3_2= ruleTestIndentation )
            	    {
            	    // InternalFormatterTestLanguage.g:682:5: (lv_items_3_1= ruleLine | lv_items_3_2= ruleTestIndentation )
            	    int alt10=2;
            	    int LA10_0 = input.LA(1);

            	    if ( (LA10_0==RULE_ID||LA10_0==19||LA10_0==23||LA10_0==29||(LA10_0>=31 && LA10_0<=33)||LA10_0==37) ) {
            	        alt10=1;
            	    }
            	    else if ( (LA10_0==26) ) {
            	        alt10=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 10, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt10) {
            	        case 1 :
            	            // InternalFormatterTestLanguage.g:683:6: lv_items_3_1= ruleLine
            	            {

            	            						newCompositeNode(grammarAccess.getTestIndentationAccess().getItemsLineParserRuleCall_3_0_0());
            	            					
            	            pushFollow(FollowSets000.FOLLOW_18);
            	            lv_items_3_1=ruleLine();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getTestIndentationRule());
            	            						}
            	            						add(
            	            							current,
            	            							"items",
            	            							lv_items_3_1,
            	            							"org.eclipse.xtext.parsetree.formatter.FormatterTestLanguage.Line");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 2 :
            	            // InternalFormatterTestLanguage.g:699:6: lv_items_3_2= ruleTestIndentation
            	            {

            	            						newCompositeNode(grammarAccess.getTestIndentationAccess().getItemsTestIndentationParserRuleCall_3_0_1());
            	            					
            	            pushFollow(FollowSets000.FOLLOW_18);
            	            lv_items_3_2=ruleTestIndentation();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getTestIndentationRule());
            	            						}
            	            						add(
            	            							current,
            	            							"items",
            	            							lv_items_3_2,
            	            							"org.eclipse.xtext.parsetree.formatter.FormatterTestLanguage.TestIndentation");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_4=(Token)match(input,28,FollowSets000.FOLLOW_19); 

            			newLeafNode(otherlv_4, grammarAccess.getTestIndentationAccess().getRightCurlyBracketKeyword_4());
            		
            // InternalFormatterTestLanguage.g:721:3: ( (lv_semi_5_0= ';' ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==13) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalFormatterTestLanguage.g:722:4: (lv_semi_5_0= ';' )
                    {
                    // InternalFormatterTestLanguage.g:722:4: (lv_semi_5_0= ';' )
                    // InternalFormatterTestLanguage.g:723:5: lv_semi_5_0= ';'
                    {
                    lv_semi_5_0=(Token)match(input,13,FollowSets000.FOLLOW_2); 

                    					newLeafNode(lv_semi_5_0, grammarAccess.getTestIndentationAccess().getSemiSemicolonKeyword_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTestIndentationRule());
                    					}
                    					setWithLastConsumed(current, "semi", lv_semi_5_0 != null, ";");
                    				

                    }


                    }
                    break;

            }


            }


            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTestIndentation"


    // $ANTLR start "entryRuleFqnObj"
    // InternalFormatterTestLanguage.g:739:1: entryRuleFqnObj returns [EObject current=null] : iv_ruleFqnObj= ruleFqnObj EOF ;
    public final EObject entryRuleFqnObj() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFqnObj = null;


        try {
            // InternalFormatterTestLanguage.g:739:47: (iv_ruleFqnObj= ruleFqnObj EOF )
            // InternalFormatterTestLanguage.g:740:2: iv_ruleFqnObj= ruleFqnObj EOF
            {
             newCompositeNode(grammarAccess.getFqnObjRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleFqnObj=ruleFqnObj();

            state._fsp--;

             current =iv_ruleFqnObj; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFqnObj"


    // $ANTLR start "ruleFqnObj"
    // InternalFormatterTestLanguage.g:746:1: ruleFqnObj returns [EObject current=null] : (otherlv_0= 'fqn' ( (lv_name_1_0= ruleFQN ) ) ) ;
    public final EObject ruleFqnObj() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


        try {
            // InternalFormatterTestLanguage.g:747:1: ( (otherlv_0= 'fqn' ( (lv_name_1_0= ruleFQN ) ) ) )
            // InternalFormatterTestLanguage.g:748:2: (otherlv_0= 'fqn' ( (lv_name_1_0= ruleFQN ) ) )
            {
            // InternalFormatterTestLanguage.g:748:2: (otherlv_0= 'fqn' ( (lv_name_1_0= ruleFQN ) ) )
            // InternalFormatterTestLanguage.g:749:3: otherlv_0= 'fqn' ( (lv_name_1_0= ruleFQN ) )
            {
            otherlv_0=(Token)match(input,29,FollowSets000.FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getFqnObjAccess().getFqnKeyword_0());
            		
            // InternalFormatterTestLanguage.g:753:3: ( (lv_name_1_0= ruleFQN ) )
            // InternalFormatterTestLanguage.g:754:4: (lv_name_1_0= ruleFQN )
            {
            // InternalFormatterTestLanguage.g:754:4: (lv_name_1_0= ruleFQN )
            // InternalFormatterTestLanguage.g:755:5: lv_name_1_0= ruleFQN
            {

            					newCompositeNode(grammarAccess.getFqnObjAccess().getNameFQNParserRuleCall_1_0());
            				
            pushFollow(FollowSets000.FOLLOW_2);
            lv_name_1_0=ruleFQN();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFqnObjRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.parsetree.formatter.FormatterTestLanguage.FQN");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFqnObj"


    // $ANTLR start "entryRuleFQN"
    // InternalFormatterTestLanguage.g:776:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // InternalFormatterTestLanguage.g:776:43: (iv_ruleFQN= ruleFQN EOF )
            // InternalFormatterTestLanguage.g:777:2: iv_ruleFQN= ruleFQN EOF
            {
             newCompositeNode(grammarAccess.getFQNRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleFQN=ruleFQN();

            state._fsp--;

             current =iv_ruleFQN.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFQN"


    // $ANTLR start "ruleFQN"
    // InternalFormatterTestLanguage.g:783:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

        try {
            // InternalFormatterTestLanguage.g:784:1: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalFormatterTestLanguage.g:785:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalFormatterTestLanguage.g:785:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalFormatterTestLanguage.g:786:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_20); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0());
            		
            // InternalFormatterTestLanguage.g:793:3: (kw= '.' this_ID_2= RULE_ID )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==30) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalFormatterTestLanguage.g:794:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,30,FollowSets000.FOLLOW_6); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_20); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }


            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFQN"


    // $ANTLR start "entryRuleFqnRef"
    // InternalFormatterTestLanguage.g:811:1: entryRuleFqnRef returns [EObject current=null] : iv_ruleFqnRef= ruleFqnRef EOF ;
    public final EObject entryRuleFqnRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFqnRef = null;


        try {
            // InternalFormatterTestLanguage.g:811:47: (iv_ruleFqnRef= ruleFqnRef EOF )
            // InternalFormatterTestLanguage.g:812:2: iv_ruleFqnRef= ruleFqnRef EOF
            {
             newCompositeNode(grammarAccess.getFqnRefRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleFqnRef=ruleFqnRef();

            state._fsp--;

             current =iv_ruleFqnRef; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFqnRef"


    // $ANTLR start "ruleFqnRef"
    // InternalFormatterTestLanguage.g:818:1: ruleFqnRef returns [EObject current=null] : (otherlv_0= 'fqnref' ( ( ruleFQN ) ) ) ;
    public final EObject ruleFqnRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

        try {
            // InternalFormatterTestLanguage.g:819:1: ( (otherlv_0= 'fqnref' ( ( ruleFQN ) ) ) )
            // InternalFormatterTestLanguage.g:820:2: (otherlv_0= 'fqnref' ( ( ruleFQN ) ) )
            {
            // InternalFormatterTestLanguage.g:820:2: (otherlv_0= 'fqnref' ( ( ruleFQN ) ) )
            // InternalFormatterTestLanguage.g:821:3: otherlv_0= 'fqnref' ( ( ruleFQN ) )
            {
            otherlv_0=(Token)match(input,31,FollowSets000.FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getFqnRefAccess().getFqnrefKeyword_0());
            		
            // InternalFormatterTestLanguage.g:825:3: ( ( ruleFQN ) )
            // InternalFormatterTestLanguage.g:826:4: ( ruleFQN )
            {
            // InternalFormatterTestLanguage.g:826:4: ( ruleFQN )
            // InternalFormatterTestLanguage.g:827:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFqnRefRule());
            					}
            				

            					newCompositeNode(grammarAccess.getFqnRefAccess().getRefFqnObjCrossReference_1_0());
            				
            pushFollow(FollowSets000.FOLLOW_2);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFqnRef"


    // $ANTLR start "entryRuleEnumeration"
    // InternalFormatterTestLanguage.g:845:1: entryRuleEnumeration returns [EObject current=null] : iv_ruleEnumeration= ruleEnumeration EOF ;
    public final EObject entryRuleEnumeration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumeration = null;


        try {
            // InternalFormatterTestLanguage.g:845:52: (iv_ruleEnumeration= ruleEnumeration EOF )
            // InternalFormatterTestLanguage.g:846:2: iv_ruleEnumeration= ruleEnumeration EOF
            {
             newCompositeNode(grammarAccess.getEnumerationRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEnumeration=ruleEnumeration();

            state._fsp--;

             current =iv_ruleEnumeration; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumeration"


    // $ANTLR start "ruleEnumeration"
    // InternalFormatterTestLanguage.g:852:1: ruleEnumeration returns [EObject current=null] : (otherlv_0= 'enum' ( (lv_val_1_0= ruleEnum1 ) )+ (otherlv_2= ',' ( (lv_val_3_0= ruleEnum1 ) ) )* ) ;
    public final EObject ruleEnumeration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Enumerator lv_val_1_0 = null;

        Enumerator lv_val_3_0 = null;


        try {
            // InternalFormatterTestLanguage.g:853:1: ( (otherlv_0= 'enum' ( (lv_val_1_0= ruleEnum1 ) )+ (otherlv_2= ',' ( (lv_val_3_0= ruleEnum1 ) ) )* ) )
            // InternalFormatterTestLanguage.g:854:2: (otherlv_0= 'enum' ( (lv_val_1_0= ruleEnum1 ) )+ (otherlv_2= ',' ( (lv_val_3_0= ruleEnum1 ) ) )* )
            {
            // InternalFormatterTestLanguage.g:854:2: (otherlv_0= 'enum' ( (lv_val_1_0= ruleEnum1 ) )+ (otherlv_2= ',' ( (lv_val_3_0= ruleEnum1 ) ) )* )
            // InternalFormatterTestLanguage.g:855:3: otherlv_0= 'enum' ( (lv_val_1_0= ruleEnum1 ) )+ (otherlv_2= ',' ( (lv_val_3_0= ruleEnum1 ) ) )*
            {
            otherlv_0=(Token)match(input,32,FollowSets000.FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getEnumerationAccess().getEnumKeyword_0());
            		
            // InternalFormatterTestLanguage.g:859:3: ( (lv_val_1_0= ruleEnum1 ) )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=41 && LA14_0<=43)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalFormatterTestLanguage.g:860:4: (lv_val_1_0= ruleEnum1 )
            	    {
            	    // InternalFormatterTestLanguage.g:860:4: (lv_val_1_0= ruleEnum1 )
            	    // InternalFormatterTestLanguage.g:861:5: lv_val_1_0= ruleEnum1
            	    {

            	    					newCompositeNode(grammarAccess.getEnumerationAccess().getValEnum1EnumRuleCall_1_0());
            	    				
            	    pushFollow(FollowSets000.FOLLOW_22);
            	    lv_val_1_0=ruleEnum1();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEnumerationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"val",
            	    						lv_val_1_0,
            	    						"org.eclipse.xtext.parsetree.formatter.FormatterTestLanguage.Enum1");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);

            // InternalFormatterTestLanguage.g:878:3: (otherlv_2= ',' ( (lv_val_3_0= ruleEnum1 ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==17) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalFormatterTestLanguage.g:879:4: otherlv_2= ',' ( (lv_val_3_0= ruleEnum1 ) )
            	    {
            	    otherlv_2=(Token)match(input,17,FollowSets000.FOLLOW_21); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEnumerationAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalFormatterTestLanguage.g:883:4: ( (lv_val_3_0= ruleEnum1 ) )
            	    // InternalFormatterTestLanguage.g:884:5: (lv_val_3_0= ruleEnum1 )
            	    {
            	    // InternalFormatterTestLanguage.g:884:5: (lv_val_3_0= ruleEnum1 )
            	    // InternalFormatterTestLanguage.g:885:6: lv_val_3_0= ruleEnum1
            	    {

            	    						newCompositeNode(grammarAccess.getEnumerationAccess().getValEnum1EnumRuleCall_2_1_0());
            	    					
            	    pushFollow(FollowSets000.FOLLOW_23);
            	    lv_val_3_0=ruleEnum1();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEnumerationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"val",
            	    							lv_val_3_0,
            	    							"org.eclipse.xtext.parsetree.formatter.FormatterTestLanguage.Enum1");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }


            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumeration"


    // $ANTLR start "entryRuleSuppressedHidden"
    // InternalFormatterTestLanguage.g:907:1: entryRuleSuppressedHidden returns [EObject current=null] : iv_ruleSuppressedHidden= ruleSuppressedHidden EOF ;
    public final EObject entryRuleSuppressedHidden() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSuppressedHidden = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalFormatterTestLanguage.g:909:2: (iv_ruleSuppressedHidden= ruleSuppressedHidden EOF )
            // InternalFormatterTestLanguage.g:910:2: iv_ruleSuppressedHidden= ruleSuppressedHidden EOF
            {
             newCompositeNode(grammarAccess.getSuppressedHiddenRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSuppressedHidden=ruleSuppressedHidden();

            state._fsp--;

             current =iv_ruleSuppressedHidden; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleSuppressedHidden"


    // $ANTLR start "ruleSuppressedHidden"
    // InternalFormatterTestLanguage.g:919:1: ruleSuppressedHidden returns [EObject current=null] : ( () otherlv_1= '`' ( ( (lv_vals_2_0= ruleSuppressedHiddenSub ) ) (otherlv_3= '%' ( (lv_vals_4_0= ruleSuppressedHiddenSub ) ) )* )? otherlv_5= '`' ) ;
    public final EObject ruleSuppressedHidden() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_vals_2_0 = null;

        EObject lv_vals_4_0 = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalFormatterTestLanguage.g:923:1: ( ( () otherlv_1= '`' ( ( (lv_vals_2_0= ruleSuppressedHiddenSub ) ) (otherlv_3= '%' ( (lv_vals_4_0= ruleSuppressedHiddenSub ) ) )* )? otherlv_5= '`' ) )
            // InternalFormatterTestLanguage.g:924:2: ( () otherlv_1= '`' ( ( (lv_vals_2_0= ruleSuppressedHiddenSub ) ) (otherlv_3= '%' ( (lv_vals_4_0= ruleSuppressedHiddenSub ) ) )* )? otherlv_5= '`' )
            {
            // InternalFormatterTestLanguage.g:924:2: ( () otherlv_1= '`' ( ( (lv_vals_2_0= ruleSuppressedHiddenSub ) ) (otherlv_3= '%' ( (lv_vals_4_0= ruleSuppressedHiddenSub ) ) )* )? otherlv_5= '`' )
            // InternalFormatterTestLanguage.g:925:3: () otherlv_1= '`' ( ( (lv_vals_2_0= ruleSuppressedHiddenSub ) ) (otherlv_3= '%' ( (lv_vals_4_0= ruleSuppressedHiddenSub ) ) )* )? otherlv_5= '`'
            {
            // InternalFormatterTestLanguage.g:925:3: ()
            // InternalFormatterTestLanguage.g:926:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSuppressedHiddenAccess().getSuppressedHiddenAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,33,FollowSets000.FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getSuppressedHiddenAccess().getGraveAccentKeyword_1());
            		
            // InternalFormatterTestLanguage.g:936:3: ( ( (lv_vals_2_0= ruleSuppressedHiddenSub ) ) (otherlv_3= '%' ( (lv_vals_4_0= ruleSuppressedHiddenSub ) ) )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID||LA17_0==35) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalFormatterTestLanguage.g:937:4: ( (lv_vals_2_0= ruleSuppressedHiddenSub ) ) (otherlv_3= '%' ( (lv_vals_4_0= ruleSuppressedHiddenSub ) ) )*
                    {
                    // InternalFormatterTestLanguage.g:937:4: ( (lv_vals_2_0= ruleSuppressedHiddenSub ) )
                    // InternalFormatterTestLanguage.g:938:5: (lv_vals_2_0= ruleSuppressedHiddenSub )
                    {
                    // InternalFormatterTestLanguage.g:938:5: (lv_vals_2_0= ruleSuppressedHiddenSub )
                    // InternalFormatterTestLanguage.g:939:6: lv_vals_2_0= ruleSuppressedHiddenSub
                    {

                    						newCompositeNode(grammarAccess.getSuppressedHiddenAccess().getValsSuppressedHiddenSubParserRuleCall_2_0_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_25);
                    lv_vals_2_0=ruleSuppressedHiddenSub();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSuppressedHiddenRule());
                    						}
                    						add(
                    							current,
                    							"vals",
                    							lv_vals_2_0,
                    							"org.eclipse.xtext.parsetree.formatter.FormatterTestLanguage.SuppressedHiddenSub");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalFormatterTestLanguage.g:956:4: (otherlv_3= '%' ( (lv_vals_4_0= ruleSuppressedHiddenSub ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==34) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalFormatterTestLanguage.g:957:5: otherlv_3= '%' ( (lv_vals_4_0= ruleSuppressedHiddenSub ) )
                    	    {
                    	    otherlv_3=(Token)match(input,34,FollowSets000.FOLLOW_26); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getSuppressedHiddenAccess().getPercentSignKeyword_2_1_0());
                    	    				
                    	    // InternalFormatterTestLanguage.g:961:5: ( (lv_vals_4_0= ruleSuppressedHiddenSub ) )
                    	    // InternalFormatterTestLanguage.g:962:6: (lv_vals_4_0= ruleSuppressedHiddenSub )
                    	    {
                    	    // InternalFormatterTestLanguage.g:962:6: (lv_vals_4_0= ruleSuppressedHiddenSub )
                    	    // InternalFormatterTestLanguage.g:963:7: lv_vals_4_0= ruleSuppressedHiddenSub
                    	    {

                    	    							newCompositeNode(grammarAccess.getSuppressedHiddenAccess().getValsSuppressedHiddenSubParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FollowSets000.FOLLOW_25);
                    	    lv_vals_4_0=ruleSuppressedHiddenSub();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSuppressedHiddenRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"vals",
                    	    								lv_vals_4_0,
                    	    								"org.eclipse.xtext.parsetree.formatter.FormatterTestLanguage.SuppressedHiddenSub");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,33,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getSuppressedHiddenAccess().getGraveAccentKeyword_3());
            		

            }


            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleSuppressedHidden"


    // $ANTLR start "entryRuleSuppressedHiddenSub"
    // InternalFormatterTestLanguage.g:993:1: entryRuleSuppressedHiddenSub returns [EObject current=null] : iv_ruleSuppressedHiddenSub= ruleSuppressedHiddenSub EOF ;
    public final EObject entryRuleSuppressedHiddenSub() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSuppressedHiddenSub = null;


        try {
            // InternalFormatterTestLanguage.g:993:60: (iv_ruleSuppressedHiddenSub= ruleSuppressedHiddenSub EOF )
            // InternalFormatterTestLanguage.g:994:2: iv_ruleSuppressedHiddenSub= ruleSuppressedHiddenSub EOF
            {
             newCompositeNode(grammarAccess.getSuppressedHiddenSubRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSuppressedHiddenSub=ruleSuppressedHiddenSub();

            state._fsp--;

             current =iv_ruleSuppressedHiddenSub; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSuppressedHiddenSub"


    // $ANTLR start "ruleSuppressedHiddenSub"
    // InternalFormatterTestLanguage.g:1000:1: ruleSuppressedHiddenSub returns [EObject current=null] : (this_SuppressedHiddenSubSub_0= ruleSuppressedHiddenSubSub | this_SuppressedHiddenSubID_1= ruleSuppressedHiddenSubID ) ;
    public final EObject ruleSuppressedHiddenSub() throws RecognitionException {
        EObject current = null;

        EObject this_SuppressedHiddenSubSub_0 = null;

        EObject this_SuppressedHiddenSubID_1 = null;


        try {
            // InternalFormatterTestLanguage.g:1001:1: ( (this_SuppressedHiddenSubSub_0= ruleSuppressedHiddenSubSub | this_SuppressedHiddenSubID_1= ruleSuppressedHiddenSubID ) )
            // InternalFormatterTestLanguage.g:1002:2: (this_SuppressedHiddenSubSub_0= ruleSuppressedHiddenSubSub | this_SuppressedHiddenSubID_1= ruleSuppressedHiddenSubID )
            {
            // InternalFormatterTestLanguage.g:1002:2: (this_SuppressedHiddenSubSub_0= ruleSuppressedHiddenSubSub | this_SuppressedHiddenSubID_1= ruleSuppressedHiddenSubID )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==35) ) {
                alt18=1;
            }
            else if ( (LA18_0==RULE_ID) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalFormatterTestLanguage.g:1003:3: this_SuppressedHiddenSubSub_0= ruleSuppressedHiddenSubSub
                    {

                    			newCompositeNode(grammarAccess.getSuppressedHiddenSubAccess().getSuppressedHiddenSubSubParserRuleCall_0());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_SuppressedHiddenSubSub_0=ruleSuppressedHiddenSubSub();

                    state._fsp--;


                    			current = this_SuppressedHiddenSubSub_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalFormatterTestLanguage.g:1012:3: this_SuppressedHiddenSubID_1= ruleSuppressedHiddenSubID
                    {

                    			newCompositeNode(grammarAccess.getSuppressedHiddenSubAccess().getSuppressedHiddenSubIDParserRuleCall_1());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_SuppressedHiddenSubID_1=ruleSuppressedHiddenSubID();

                    state._fsp--;


                    			current = this_SuppressedHiddenSubID_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSuppressedHiddenSub"


    // $ANTLR start "entryRuleSuppressedHiddenSubSub"
    // InternalFormatterTestLanguage.g:1024:1: entryRuleSuppressedHiddenSubSub returns [EObject current=null] : iv_ruleSuppressedHiddenSubSub= ruleSuppressedHiddenSubSub EOF ;
    public final EObject entryRuleSuppressedHiddenSubSub() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSuppressedHiddenSubSub = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFormatterTestLanguage.g:1026:2: (iv_ruleSuppressedHiddenSubSub= ruleSuppressedHiddenSubSub EOF )
            // InternalFormatterTestLanguage.g:1027:2: iv_ruleSuppressedHiddenSubSub= ruleSuppressedHiddenSubSub EOF
            {
             newCompositeNode(grammarAccess.getSuppressedHiddenSubSubRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSuppressedHiddenSubSub=ruleSuppressedHiddenSubSub();

            state._fsp--;

             current =iv_ruleSuppressedHiddenSubSub; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleSuppressedHiddenSubSub"


    // $ANTLR start "ruleSuppressedHiddenSubSub"
    // InternalFormatterTestLanguage.g:1036:1: ruleSuppressedHiddenSubSub returns [EObject current=null] : (otherlv_0= '<' ( (lv_idval_1_0= RULE_ID ) ) otherlv_2= '>' ) ;
    public final EObject ruleSuppressedHiddenSubSub() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_idval_1_0=null;
        Token otherlv_2=null;


        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFormatterTestLanguage.g:1040:1: ( (otherlv_0= '<' ( (lv_idval_1_0= RULE_ID ) ) otherlv_2= '>' ) )
            // InternalFormatterTestLanguage.g:1041:2: (otherlv_0= '<' ( (lv_idval_1_0= RULE_ID ) ) otherlv_2= '>' )
            {
            // InternalFormatterTestLanguage.g:1041:2: (otherlv_0= '<' ( (lv_idval_1_0= RULE_ID ) ) otherlv_2= '>' )
            // InternalFormatterTestLanguage.g:1042:3: otherlv_0= '<' ( (lv_idval_1_0= RULE_ID ) ) otherlv_2= '>'
            {
            otherlv_0=(Token)match(input,35,FollowSets000.FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getSuppressedHiddenSubSubAccess().getLessThanSignKeyword_0());
            		
            // InternalFormatterTestLanguage.g:1046:3: ( (lv_idval_1_0= RULE_ID ) )
            // InternalFormatterTestLanguage.g:1047:4: (lv_idval_1_0= RULE_ID )
            {
            // InternalFormatterTestLanguage.g:1047:4: (lv_idval_1_0= RULE_ID )
            // InternalFormatterTestLanguage.g:1048:5: lv_idval_1_0= RULE_ID
            {
            lv_idval_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_27); 

            					newLeafNode(lv_idval_1_0, grammarAccess.getSuppressedHiddenSubSubAccess().getIdvalIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSuppressedHiddenSubSubRule());
            					}
            					setWithLastConsumed(
            						current,
            						"idval",
            						lv_idval_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,36,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getSuppressedHiddenSubSubAccess().getGreaterThanSignKeyword_2());
            		

            }


            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleSuppressedHiddenSubSub"


    // $ANTLR start "entryRuleSuppressedHiddenSubID"
    // InternalFormatterTestLanguage.g:1075:1: entryRuleSuppressedHiddenSubID returns [EObject current=null] : iv_ruleSuppressedHiddenSubID= ruleSuppressedHiddenSubID EOF ;
    public final EObject entryRuleSuppressedHiddenSubID() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSuppressedHiddenSubID = null;


        try {
            // InternalFormatterTestLanguage.g:1075:62: (iv_ruleSuppressedHiddenSubID= ruleSuppressedHiddenSubID EOF )
            // InternalFormatterTestLanguage.g:1076:2: iv_ruleSuppressedHiddenSubID= ruleSuppressedHiddenSubID EOF
            {
             newCompositeNode(grammarAccess.getSuppressedHiddenSubIDRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSuppressedHiddenSubID=ruleSuppressedHiddenSubID();

            state._fsp--;

             current =iv_ruleSuppressedHiddenSubID; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSuppressedHiddenSubID"


    // $ANTLR start "ruleSuppressedHiddenSubID"
    // InternalFormatterTestLanguage.g:1082:1: ruleSuppressedHiddenSubID returns [EObject current=null] : ( (lv_idval_0_0= RULE_ID ) ) ;
    public final EObject ruleSuppressedHiddenSubID() throws RecognitionException {
        EObject current = null;

        Token lv_idval_0_0=null;

        try {
            // InternalFormatterTestLanguage.g:1083:1: ( ( (lv_idval_0_0= RULE_ID ) ) )
            // InternalFormatterTestLanguage.g:1084:2: ( (lv_idval_0_0= RULE_ID ) )
            {
            // InternalFormatterTestLanguage.g:1084:2: ( (lv_idval_0_0= RULE_ID ) )
            // InternalFormatterTestLanguage.g:1085:3: (lv_idval_0_0= RULE_ID )
            {
            // InternalFormatterTestLanguage.g:1085:3: (lv_idval_0_0= RULE_ID )
            // InternalFormatterTestLanguage.g:1086:4: lv_idval_0_0= RULE_ID
            {
            lv_idval_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

            				newLeafNode(lv_idval_0_0, grammarAccess.getSuppressedHiddenSubIDAccess().getIdvalIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getSuppressedHiddenSubIDRule());
            				}
            				setWithLastConsumed(
            					current,
            					"idval",
            					lv_idval_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSuppressedHiddenSubID"


    // $ANTLR start "entryRuleDatatype1"
    // InternalFormatterTestLanguage.g:1105:1: entryRuleDatatype1 returns [String current=null] : iv_ruleDatatype1= ruleDatatype1 EOF ;
    public final String entryRuleDatatype1() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDatatype1 = null;


        try {
            // InternalFormatterTestLanguage.g:1105:49: (iv_ruleDatatype1= ruleDatatype1 EOF )
            // InternalFormatterTestLanguage.g:1106:2: iv_ruleDatatype1= ruleDatatype1 EOF
            {
             newCompositeNode(grammarAccess.getDatatype1Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDatatype1=ruleDatatype1();

            state._fsp--;

             current =iv_ruleDatatype1.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDatatype1"


    // $ANTLR start "ruleDatatype1"
    // InternalFormatterTestLanguage.g:1112:1: ruleDatatype1 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_FQN_0= ruleFQN ;
    public final AntlrDatatypeRuleToken ruleDatatype1() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_FQN_0 = null;


        try {
            // InternalFormatterTestLanguage.g:1113:1: (this_FQN_0= ruleFQN )
            // InternalFormatterTestLanguage.g:1114:2: this_FQN_0= ruleFQN
            {

            		newCompositeNode(grammarAccess.getDatatype1Access().getFQNParserRuleCall());
            	
            pushFollow(FollowSets000.FOLLOW_2);
            this_FQN_0=ruleFQN();

            state._fsp--;


            		current.merge(this_FQN_0);
            	

            		afterParserOrEnumRuleCall();
            	

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDatatype1"


    // $ANTLR start "entryRuleDatatype2"
    // InternalFormatterTestLanguage.g:1127:1: entryRuleDatatype2 returns [String current=null] : iv_ruleDatatype2= ruleDatatype2 EOF ;
    public final String entryRuleDatatype2() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDatatype2 = null;


        try {
            // InternalFormatterTestLanguage.g:1127:49: (iv_ruleDatatype2= ruleDatatype2 EOF )
            // InternalFormatterTestLanguage.g:1128:2: iv_ruleDatatype2= ruleDatatype2 EOF
            {
             newCompositeNode(grammarAccess.getDatatype2Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDatatype2=ruleDatatype2();

            state._fsp--;

             current =iv_ruleDatatype2.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDatatype2"


    // $ANTLR start "ruleDatatype2"
    // InternalFormatterTestLanguage.g:1134:1: ruleDatatype2 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_FQN_0= ruleFQN ;
    public final AntlrDatatypeRuleToken ruleDatatype2() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_FQN_0 = null;


        try {
            // InternalFormatterTestLanguage.g:1135:1: (this_FQN_0= ruleFQN )
            // InternalFormatterTestLanguage.g:1136:2: this_FQN_0= ruleFQN
            {

            		newCompositeNode(grammarAccess.getDatatype2Access().getFQNParserRuleCall());
            	
            pushFollow(FollowSets000.FOLLOW_2);
            this_FQN_0=ruleFQN();

            state._fsp--;


            		current.merge(this_FQN_0);
            	

            		afterParserOrEnumRuleCall();
            	

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDatatype2"


    // $ANTLR start "entryRuleDatatype3"
    // InternalFormatterTestLanguage.g:1149:1: entryRuleDatatype3 returns [String current=null] : iv_ruleDatatype3= ruleDatatype3 EOF ;
    public final String entryRuleDatatype3() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDatatype3 = null;


        try {
            // InternalFormatterTestLanguage.g:1149:49: (iv_ruleDatatype3= ruleDatatype3 EOF )
            // InternalFormatterTestLanguage.g:1150:2: iv_ruleDatatype3= ruleDatatype3 EOF
            {
             newCompositeNode(grammarAccess.getDatatype3Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDatatype3=ruleDatatype3();

            state._fsp--;

             current =iv_ruleDatatype3.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDatatype3"


    // $ANTLR start "ruleDatatype3"
    // InternalFormatterTestLanguage.g:1156:1: ruleDatatype3 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_FQN_0= ruleFQN ;
    public final AntlrDatatypeRuleToken ruleDatatype3() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_FQN_0 = null;


        try {
            // InternalFormatterTestLanguage.g:1157:1: (this_FQN_0= ruleFQN )
            // InternalFormatterTestLanguage.g:1158:2: this_FQN_0= ruleFQN
            {

            		newCompositeNode(grammarAccess.getDatatype3Access().getFQNParserRuleCall());
            	
            pushFollow(FollowSets000.FOLLOW_2);
            this_FQN_0=ruleFQN();

            state._fsp--;


            		current.merge(this_FQN_0);
            	

            		afterParserOrEnumRuleCall();
            	

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDatatype3"


    // $ANTLR start "entryRuleDatatypes"
    // InternalFormatterTestLanguage.g:1171:1: entryRuleDatatypes returns [EObject current=null] : iv_ruleDatatypes= ruleDatatypes EOF ;
    public final EObject entryRuleDatatypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatatypes = null;


        try {
            // InternalFormatterTestLanguage.g:1171:50: (iv_ruleDatatypes= ruleDatatypes EOF )
            // InternalFormatterTestLanguage.g:1172:2: iv_ruleDatatypes= ruleDatatypes EOF
            {
             newCompositeNode(grammarAccess.getDatatypesRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDatatypes=ruleDatatypes();

            state._fsp--;

             current =iv_ruleDatatypes; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDatatypes"


    // $ANTLR start "ruleDatatypes"
    // InternalFormatterTestLanguage.g:1178:1: ruleDatatypes returns [EObject current=null] : (otherlv_0= 'datatypes' ( (lv_val1_1_0= ruleDatatype1 ) ) otherlv_2= 'kw1' ( (lv_val2_3_0= ruleDatatype2 ) ) ( (lv_val3_4_0= ruleDatatype3 ) ) otherlv_5= 'kw3' ) ;
    public final EObject ruleDatatypes() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_val1_1_0 = null;

        AntlrDatatypeRuleToken lv_val2_3_0 = null;

        AntlrDatatypeRuleToken lv_val3_4_0 = null;


        try {
            // InternalFormatterTestLanguage.g:1179:1: ( (otherlv_0= 'datatypes' ( (lv_val1_1_0= ruleDatatype1 ) ) otherlv_2= 'kw1' ( (lv_val2_3_0= ruleDatatype2 ) ) ( (lv_val3_4_0= ruleDatatype3 ) ) otherlv_5= 'kw3' ) )
            // InternalFormatterTestLanguage.g:1180:2: (otherlv_0= 'datatypes' ( (lv_val1_1_0= ruleDatatype1 ) ) otherlv_2= 'kw1' ( (lv_val2_3_0= ruleDatatype2 ) ) ( (lv_val3_4_0= ruleDatatype3 ) ) otherlv_5= 'kw3' )
            {
            // InternalFormatterTestLanguage.g:1180:2: (otherlv_0= 'datatypes' ( (lv_val1_1_0= ruleDatatype1 ) ) otherlv_2= 'kw1' ( (lv_val2_3_0= ruleDatatype2 ) ) ( (lv_val3_4_0= ruleDatatype3 ) ) otherlv_5= 'kw3' )
            // InternalFormatterTestLanguage.g:1181:3: otherlv_0= 'datatypes' ( (lv_val1_1_0= ruleDatatype1 ) ) otherlv_2= 'kw1' ( (lv_val2_3_0= ruleDatatype2 ) ) ( (lv_val3_4_0= ruleDatatype3 ) ) otherlv_5= 'kw3'
            {
            otherlv_0=(Token)match(input,37,FollowSets000.FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getDatatypesAccess().getDatatypesKeyword_0());
            		
            // InternalFormatterTestLanguage.g:1185:3: ( (lv_val1_1_0= ruleDatatype1 ) )
            // InternalFormatterTestLanguage.g:1186:4: (lv_val1_1_0= ruleDatatype1 )
            {
            // InternalFormatterTestLanguage.g:1186:4: (lv_val1_1_0= ruleDatatype1 )
            // InternalFormatterTestLanguage.g:1187:5: lv_val1_1_0= ruleDatatype1
            {

            					newCompositeNode(grammarAccess.getDatatypesAccess().getVal1Datatype1ParserRuleCall_1_0());
            				
            pushFollow(FollowSets000.FOLLOW_28);
            lv_val1_1_0=ruleDatatype1();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDatatypesRule());
            					}
            					set(
            						current,
            						"val1",
            						lv_val1_1_0,
            						"org.eclipse.xtext.parsetree.formatter.FormatterTestLanguage.Datatype1");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,38,FollowSets000.FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getDatatypesAccess().getKw1Keyword_2());
            		
            // InternalFormatterTestLanguage.g:1208:3: ( (lv_val2_3_0= ruleDatatype2 ) )
            // InternalFormatterTestLanguage.g:1209:4: (lv_val2_3_0= ruleDatatype2 )
            {
            // InternalFormatterTestLanguage.g:1209:4: (lv_val2_3_0= ruleDatatype2 )
            // InternalFormatterTestLanguage.g:1210:5: lv_val2_3_0= ruleDatatype2
            {

            					newCompositeNode(grammarAccess.getDatatypesAccess().getVal2Datatype2ParserRuleCall_3_0());
            				
            pushFollow(FollowSets000.FOLLOW_6);
            lv_val2_3_0=ruleDatatype2();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDatatypesRule());
            					}
            					set(
            						current,
            						"val2",
            						lv_val2_3_0,
            						"org.eclipse.xtext.parsetree.formatter.FormatterTestLanguage.Datatype2");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFormatterTestLanguage.g:1227:3: ( (lv_val3_4_0= ruleDatatype3 ) )
            // InternalFormatterTestLanguage.g:1228:4: (lv_val3_4_0= ruleDatatype3 )
            {
            // InternalFormatterTestLanguage.g:1228:4: (lv_val3_4_0= ruleDatatype3 )
            // InternalFormatterTestLanguage.g:1229:5: lv_val3_4_0= ruleDatatype3
            {

            					newCompositeNode(grammarAccess.getDatatypesAccess().getVal3Datatype3ParserRuleCall_4_0());
            				
            pushFollow(FollowSets000.FOLLOW_29);
            lv_val3_4_0=ruleDatatype3();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDatatypesRule());
            					}
            					set(
            						current,
            						"val3",
            						lv_val3_4_0,
            						"org.eclipse.xtext.parsetree.formatter.FormatterTestLanguage.Datatype3");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,39,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getDatatypesAccess().getKw3Keyword_5());
            		

            }


            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDatatypes"


    // $ANTLR start "entryRuleWrappingDataTypeTest"
    // InternalFormatterTestLanguage.g:1254:1: entryRuleWrappingDataTypeTest returns [EObject current=null] : iv_ruleWrappingDataTypeTest= ruleWrappingDataTypeTest EOF ;
    public final EObject entryRuleWrappingDataTypeTest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWrappingDataTypeTest = null;


        try {
            // InternalFormatterTestLanguage.g:1254:61: (iv_ruleWrappingDataTypeTest= ruleWrappingDataTypeTest EOF )
            // InternalFormatterTestLanguage.g:1255:2: iv_ruleWrappingDataTypeTest= ruleWrappingDataTypeTest EOF
            {
             newCompositeNode(grammarAccess.getWrappingDataTypeTestRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleWrappingDataTypeTest=ruleWrappingDataTypeTest();

            state._fsp--;

             current =iv_ruleWrappingDataTypeTest; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWrappingDataTypeTest"


    // $ANTLR start "ruleWrappingDataTypeTest"
    // InternalFormatterTestLanguage.g:1261:1: ruleWrappingDataTypeTest returns [EObject current=null] : (otherlv_0= 'wrappingdt' ( (lv_datatype_1_0= ruleWrappingDataType ) ) otherlv_2= 'kw1' ) ;
    public final EObject ruleWrappingDataTypeTest() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_datatype_1_0 = null;


        try {
            // InternalFormatterTestLanguage.g:1262:1: ( (otherlv_0= 'wrappingdt' ( (lv_datatype_1_0= ruleWrappingDataType ) ) otherlv_2= 'kw1' ) )
            // InternalFormatterTestLanguage.g:1263:2: (otherlv_0= 'wrappingdt' ( (lv_datatype_1_0= ruleWrappingDataType ) ) otherlv_2= 'kw1' )
            {
            // InternalFormatterTestLanguage.g:1263:2: (otherlv_0= 'wrappingdt' ( (lv_datatype_1_0= ruleWrappingDataType ) ) otherlv_2= 'kw1' )
            // InternalFormatterTestLanguage.g:1264:3: otherlv_0= 'wrappingdt' ( (lv_datatype_1_0= ruleWrappingDataType ) ) otherlv_2= 'kw1'
            {
            otherlv_0=(Token)match(input,40,FollowSets000.FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getWrappingDataTypeTestAccess().getWrappingdtKeyword_0());
            		
            // InternalFormatterTestLanguage.g:1268:3: ( (lv_datatype_1_0= ruleWrappingDataType ) )
            // InternalFormatterTestLanguage.g:1269:4: (lv_datatype_1_0= ruleWrappingDataType )
            {
            // InternalFormatterTestLanguage.g:1269:4: (lv_datatype_1_0= ruleWrappingDataType )
            // InternalFormatterTestLanguage.g:1270:5: lv_datatype_1_0= ruleWrappingDataType
            {

            					newCompositeNode(grammarAccess.getWrappingDataTypeTestAccess().getDatatypeWrappingDataTypeParserRuleCall_1_0());
            				
            pushFollow(FollowSets000.FOLLOW_28);
            lv_datatype_1_0=ruleWrappingDataType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWrappingDataTypeTestRule());
            					}
            					set(
            						current,
            						"datatype",
            						lv_datatype_1_0,
            						"org.eclipse.xtext.parsetree.formatter.FormatterTestLanguage.WrappingDataType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,38,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getWrappingDataTypeTestAccess().getKw1Keyword_2());
            		

            }


            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWrappingDataTypeTest"


    // $ANTLR start "entryRuleWrappingDataType"
    // InternalFormatterTestLanguage.g:1295:1: entryRuleWrappingDataType returns [String current=null] : iv_ruleWrappingDataType= ruleWrappingDataType EOF ;
    public final String entryRuleWrappingDataType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleWrappingDataType = null;


        try {
            // InternalFormatterTestLanguage.g:1295:56: (iv_ruleWrappingDataType= ruleWrappingDataType EOF )
            // InternalFormatterTestLanguage.g:1296:2: iv_ruleWrappingDataType= ruleWrappingDataType EOF
            {
             newCompositeNode(grammarAccess.getWrappingDataTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleWrappingDataType=ruleWrappingDataType();

            state._fsp--;

             current =iv_ruleWrappingDataType.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWrappingDataType"


    // $ANTLR start "ruleWrappingDataType"
    // InternalFormatterTestLanguage.g:1302:1: ruleWrappingDataType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID )+ ;
    public final AntlrDatatypeRuleToken ruleWrappingDataType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

        try {
            // InternalFormatterTestLanguage.g:1303:1: ( (this_ID_0= RULE_ID )+ )
            // InternalFormatterTestLanguage.g:1304:2: (this_ID_0= RULE_ID )+
            {
            // InternalFormatterTestLanguage.g:1304:2: (this_ID_0= RULE_ID )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalFormatterTestLanguage.g:1305:3: this_ID_0= RULE_ID
            	    {
            	    this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_30); 

            	    			current.merge(this_ID_0);
            	    		

            	    			newLeafNode(this_ID_0, grammarAccess.getWrappingDataTypeAccess().getIDTerminalRuleCall());
            	    		

            	    }
            	    break;

            	default :
            	    if ( cnt19 >= 1 ) break loop19;
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
            } while (true);


            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWrappingDataType"


    // $ANTLR start "ruleEnum1"
    // InternalFormatterTestLanguage.g:1316:1: ruleEnum1 returns [Enumerator current=null] : ( (enumLiteral_0= 'lit1' ) | (enumLiteral_1= 'lit2' ) | (enumLiteral_2= 'lit3' ) ) ;
    public final Enumerator ruleEnum1() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

        try {
            // InternalFormatterTestLanguage.g:1317:1: ( ( (enumLiteral_0= 'lit1' ) | (enumLiteral_1= 'lit2' ) | (enumLiteral_2= 'lit3' ) ) )
            // InternalFormatterTestLanguage.g:1318:2: ( (enumLiteral_0= 'lit1' ) | (enumLiteral_1= 'lit2' ) | (enumLiteral_2= 'lit3' ) )
            {
            // InternalFormatterTestLanguage.g:1318:2: ( (enumLiteral_0= 'lit1' ) | (enumLiteral_1= 'lit2' ) | (enumLiteral_2= 'lit3' ) )
            int alt20=3;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt20=1;
                }
                break;
            case 42:
                {
                alt20=2;
                }
                break;
            case 43:
                {
                alt20=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalFormatterTestLanguage.g:1319:3: (enumLiteral_0= 'lit1' )
                    {
                    // InternalFormatterTestLanguage.g:1319:3: (enumLiteral_0= 'lit1' )
                    // InternalFormatterTestLanguage.g:1320:4: enumLiteral_0= 'lit1'
                    {
                    enumLiteral_0=(Token)match(input,41,FollowSets000.FOLLOW_2); 

                    				current = grammarAccess.getEnum1Access().getLit1EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEnum1Access().getLit1EnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalFormatterTestLanguage.g:1327:3: (enumLiteral_1= 'lit2' )
                    {
                    // InternalFormatterTestLanguage.g:1327:3: (enumLiteral_1= 'lit2' )
                    // InternalFormatterTestLanguage.g:1328:4: enumLiteral_1= 'lit2'
                    {
                    enumLiteral_1=(Token)match(input,42,FollowSets000.FOLLOW_2); 

                    				current = grammarAccess.getEnum1Access().getLit2EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEnum1Access().getLit2EnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalFormatterTestLanguage.g:1335:3: (enumLiteral_2= 'lit3' )
                    {
                    // InternalFormatterTestLanguage.g:1335:3: (enumLiteral_2= 'lit3' )
                    // InternalFormatterTestLanguage.g:1336:4: enumLiteral_2= 'lit3'
                    {
                    enumLiteral_2=(Token)match(input,43,FollowSets000.FOLLOW_2); 

                    				current = grammarAccess.getEnum1Access().getLit3EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getEnum1Access().getLit3EnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnum1"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\2\4\11\uffff";
    static final String dfa_3s = "\1\45\1\17\11\uffff";
    static final String dfa_4s = "\2\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\1\1\2";
    static final String dfa_5s = "\13\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\16\uffff\1\2\3\uffff\1\7\5\uffff\1\3\1\uffff\1\4\1\5\1\6\3\uffff\1\10",
            "\1\11\11\uffff\2\12",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "130:3: (this_Decl_0= ruleDecl | this_Assign_1= ruleAssign | this_Meth_2= ruleMeth | this_FqnObj_3= ruleFqnObj | this_FqnRef_4= ruleFqnRef | this_Enumeration_5= ruleEnumeration | (this_SuppressedHidden_6= ruleSuppressedHidden otherlv_7= 'post' ) | this_Space_8= ruleSpace | this_Datatypes_9= ruleDatatypes )";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000010007000000L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040020L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200010L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000220000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000023A0880012L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000023B4880010L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000040000002L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000E0000000000L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000E0000020002L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000A00000010L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000600000000L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000800000010L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000012L});
    }


}