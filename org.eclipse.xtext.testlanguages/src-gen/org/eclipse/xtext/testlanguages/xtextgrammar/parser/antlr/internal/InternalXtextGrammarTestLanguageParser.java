package org.eclipse.xtext.testlanguages.xtextgrammar.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.testlanguages.xtextgrammar.services.XtextGrammarTestLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXtextGrammarTestLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'grammar'", "'with'", "','", "'hidden'", "'('", "')'", "'.'", "'generate'", "'as'", "'import'", "'returns'", "':'", "';'", "'::'", "'|'", "'?'", "'*'", "'+'", "'{'", "'='", "'+='", "'current'", "'}'", "'?='", "'['", "']'", "'terminal'", "'!'", "'->'", "'..'", "'enum'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalXtextGrammarTestLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalXtextGrammarTestLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalXtextGrammarTestLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "InternalXtextGrammarTestLanguage.g"; }



     	private XtextGrammarTestLanguageGrammarAccess grammarAccess;

        public InternalXtextGrammarTestLanguageParser(TokenStream input, XtextGrammarTestLanguageGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Grammar";
       	}

       	@Override
       	protected XtextGrammarTestLanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleGrammar"
    // InternalXtextGrammarTestLanguage.g:64:1: entryRuleGrammar returns [EObject current=null] : iv_ruleGrammar= ruleGrammar EOF ;
    public final EObject entryRuleGrammar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGrammar = null;


        try {
            // InternalXtextGrammarTestLanguage.g:64:48: (iv_ruleGrammar= ruleGrammar EOF )
            // InternalXtextGrammarTestLanguage.g:65:2: iv_ruleGrammar= ruleGrammar EOF
            {
             newCompositeNode(grammarAccess.getGrammarRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGrammar=ruleGrammar();

            state._fsp--;

             current =iv_ruleGrammar; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleGrammar"


    // $ANTLR start "ruleGrammar"
    // InternalXtextGrammarTestLanguage.g:71:1: ruleGrammar returns [EObject current=null] : (otherlv_0= 'grammar' ( (lv_name_1_0= ruleGrammarID ) ) (otherlv_2= 'with' ( ( ruleGrammarID ) ) (otherlv_4= ',' ( ( ruleGrammarID ) ) )* )? ( ( (lv_definesHiddenTokens_6_0= 'hidden' ) ) otherlv_7= '(' ( ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )? otherlv_11= ')' )? ( (lv_metamodelDeclarations_12_0= ruleAbstractMetamodelDeclaration ) )* ( (lv_rules_13_0= ruleAbstractRule ) )+ ) ;
    public final EObject ruleGrammar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_definesHiddenTokens_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_metamodelDeclarations_12_0 = null;

        EObject lv_rules_13_0 = null;


        try {
            // InternalXtextGrammarTestLanguage.g:72:1: ( (otherlv_0= 'grammar' ( (lv_name_1_0= ruleGrammarID ) ) (otherlv_2= 'with' ( ( ruleGrammarID ) ) (otherlv_4= ',' ( ( ruleGrammarID ) ) )* )? ( ( (lv_definesHiddenTokens_6_0= 'hidden' ) ) otherlv_7= '(' ( ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )? otherlv_11= ')' )? ( (lv_metamodelDeclarations_12_0= ruleAbstractMetamodelDeclaration ) )* ( (lv_rules_13_0= ruleAbstractRule ) )+ ) )
            // InternalXtextGrammarTestLanguage.g:73:2: (otherlv_0= 'grammar' ( (lv_name_1_0= ruleGrammarID ) ) (otherlv_2= 'with' ( ( ruleGrammarID ) ) (otherlv_4= ',' ( ( ruleGrammarID ) ) )* )? ( ( (lv_definesHiddenTokens_6_0= 'hidden' ) ) otherlv_7= '(' ( ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )? otherlv_11= ')' )? ( (lv_metamodelDeclarations_12_0= ruleAbstractMetamodelDeclaration ) )* ( (lv_rules_13_0= ruleAbstractRule ) )+ )
            {
            // InternalXtextGrammarTestLanguage.g:73:2: (otherlv_0= 'grammar' ( (lv_name_1_0= ruleGrammarID ) ) (otherlv_2= 'with' ( ( ruleGrammarID ) ) (otherlv_4= ',' ( ( ruleGrammarID ) ) )* )? ( ( (lv_definesHiddenTokens_6_0= 'hidden' ) ) otherlv_7= '(' ( ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )? otherlv_11= ')' )? ( (lv_metamodelDeclarations_12_0= ruleAbstractMetamodelDeclaration ) )* ( (lv_rules_13_0= ruleAbstractRule ) )+ )
            // InternalXtextGrammarTestLanguage.g:74:3: otherlv_0= 'grammar' ( (lv_name_1_0= ruleGrammarID ) ) (otherlv_2= 'with' ( ( ruleGrammarID ) ) (otherlv_4= ',' ( ( ruleGrammarID ) ) )* )? ( ( (lv_definesHiddenTokens_6_0= 'hidden' ) ) otherlv_7= '(' ( ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )? otherlv_11= ')' )? ( (lv_metamodelDeclarations_12_0= ruleAbstractMetamodelDeclaration ) )* ( (lv_rules_13_0= ruleAbstractRule ) )+
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getGrammarAccess().getGrammarKeyword_0());
            		
            // InternalXtextGrammarTestLanguage.g:78:3: ( (lv_name_1_0= ruleGrammarID ) )
            // InternalXtextGrammarTestLanguage.g:79:4: (lv_name_1_0= ruleGrammarID )
            {
            // InternalXtextGrammarTestLanguage.g:79:4: (lv_name_1_0= ruleGrammarID )
            // InternalXtextGrammarTestLanguage.g:80:5: lv_name_1_0= ruleGrammarID
            {

            					newCompositeNode(grammarAccess.getGrammarAccess().getNameGrammarIDParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleGrammarID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGrammarRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.testlanguages.xtextgrammar.XtextGrammarTestLanguage.GrammarID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXtextGrammarTestLanguage.g:97:3: (otherlv_2= 'with' ( ( ruleGrammarID ) ) (otherlv_4= ',' ( ( ruleGrammarID ) ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalXtextGrammarTestLanguage.g:98:4: otherlv_2= 'with' ( ( ruleGrammarID ) ) (otherlv_4= ',' ( ( ruleGrammarID ) ) )*
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getGrammarAccess().getWithKeyword_2_0());
                    			
                    // InternalXtextGrammarTestLanguage.g:102:4: ( ( ruleGrammarID ) )
                    // InternalXtextGrammarTestLanguage.g:103:5: ( ruleGrammarID )
                    {
                    // InternalXtextGrammarTestLanguage.g:103:5: ( ruleGrammarID )
                    // InternalXtextGrammarTestLanguage.g:104:6: ruleGrammarID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getGrammarRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getGrammarAccess().getUsedGrammarsGrammarCrossReference_2_1_0());
                    					
                    pushFollow(FOLLOW_5);
                    ruleGrammarID();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalXtextGrammarTestLanguage.g:118:4: (otherlv_4= ',' ( ( ruleGrammarID ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==13) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalXtextGrammarTestLanguage.g:119:5: otherlv_4= ',' ( ( ruleGrammarID ) )
                    	    {
                    	    otherlv_4=(Token)match(input,13,FOLLOW_3); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getGrammarAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalXtextGrammarTestLanguage.g:123:5: ( ( ruleGrammarID ) )
                    	    // InternalXtextGrammarTestLanguage.g:124:6: ( ruleGrammarID )
                    	    {
                    	    // InternalXtextGrammarTestLanguage.g:124:6: ( ruleGrammarID )
                    	    // InternalXtextGrammarTestLanguage.g:125:7: ruleGrammarID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getGrammarRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getGrammarAccess().getUsedGrammarsGrammarCrossReference_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_5);
                    	    ruleGrammarID();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalXtextGrammarTestLanguage.g:141:3: ( ( (lv_definesHiddenTokens_6_0= 'hidden' ) ) otherlv_7= '(' ( ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )? otherlv_11= ')' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalXtextGrammarTestLanguage.g:142:4: ( (lv_definesHiddenTokens_6_0= 'hidden' ) ) otherlv_7= '(' ( ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )? otherlv_11= ')'
                    {
                    // InternalXtextGrammarTestLanguage.g:142:4: ( (lv_definesHiddenTokens_6_0= 'hidden' ) )
                    // InternalXtextGrammarTestLanguage.g:143:5: (lv_definesHiddenTokens_6_0= 'hidden' )
                    {
                    // InternalXtextGrammarTestLanguage.g:143:5: (lv_definesHiddenTokens_6_0= 'hidden' )
                    // InternalXtextGrammarTestLanguage.g:144:6: lv_definesHiddenTokens_6_0= 'hidden'
                    {
                    lv_definesHiddenTokens_6_0=(Token)match(input,14,FOLLOW_6); 

                    						newLeafNode(lv_definesHiddenTokens_6_0, grammarAccess.getGrammarAccess().getDefinesHiddenTokensHiddenKeyword_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getGrammarRule());
                    						}
                    						setWithLastConsumed(current, "definesHiddenTokens", lv_definesHiddenTokens_6_0 != null, "hidden");
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_7, grammarAccess.getGrammarAccess().getLeftParenthesisKeyword_3_1());
                    			
                    // InternalXtextGrammarTestLanguage.g:160:4: ( ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==RULE_ID) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalXtextGrammarTestLanguage.g:161:5: ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )*
                            {
                            // InternalXtextGrammarTestLanguage.g:161:5: ( (otherlv_8= RULE_ID ) )
                            // InternalXtextGrammarTestLanguage.g:162:6: (otherlv_8= RULE_ID )
                            {
                            // InternalXtextGrammarTestLanguage.g:162:6: (otherlv_8= RULE_ID )
                            // InternalXtextGrammarTestLanguage.g:163:7: otherlv_8= RULE_ID
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getGrammarRule());
                            							}
                            						
                            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_8); 

                            							newLeafNode(otherlv_8, grammarAccess.getGrammarAccess().getHiddenTokensAbstractRuleCrossReference_3_2_0_0());
                            						

                            }


                            }

                            // InternalXtextGrammarTestLanguage.g:174:5: (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )*
                            loop3:
                            do {
                                int alt3=2;
                                int LA3_0 = input.LA(1);

                                if ( (LA3_0==13) ) {
                                    alt3=1;
                                }


                                switch (alt3) {
                            	case 1 :
                            	    // InternalXtextGrammarTestLanguage.g:175:6: otherlv_9= ',' ( (otherlv_10= RULE_ID ) )
                            	    {
                            	    otherlv_9=(Token)match(input,13,FOLLOW_3); 

                            	    						newLeafNode(otherlv_9, grammarAccess.getGrammarAccess().getCommaKeyword_3_2_1_0());
                            	    					
                            	    // InternalXtextGrammarTestLanguage.g:179:6: ( (otherlv_10= RULE_ID ) )
                            	    // InternalXtextGrammarTestLanguage.g:180:7: (otherlv_10= RULE_ID )
                            	    {
                            	    // InternalXtextGrammarTestLanguage.g:180:7: (otherlv_10= RULE_ID )
                            	    // InternalXtextGrammarTestLanguage.g:181:8: otherlv_10= RULE_ID
                            	    {

                            	    								if (current==null) {
                            	    									current = createModelElement(grammarAccess.getGrammarRule());
                            	    								}
                            	    							
                            	    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_8); 

                            	    								newLeafNode(otherlv_10, grammarAccess.getGrammarAccess().getHiddenTokensAbstractRuleCrossReference_3_2_1_1_0());
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop3;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_11=(Token)match(input,16,FOLLOW_4); 

                    				newLeafNode(otherlv_11, grammarAccess.getGrammarAccess().getRightParenthesisKeyword_3_3());
                    			

                    }
                    break;

            }

            // InternalXtextGrammarTestLanguage.g:199:3: ( (lv_metamodelDeclarations_12_0= ruleAbstractMetamodelDeclaration ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==18||LA6_0==20) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalXtextGrammarTestLanguage.g:200:4: (lv_metamodelDeclarations_12_0= ruleAbstractMetamodelDeclaration )
            	    {
            	    // InternalXtextGrammarTestLanguage.g:200:4: (lv_metamodelDeclarations_12_0= ruleAbstractMetamodelDeclaration )
            	    // InternalXtextGrammarTestLanguage.g:201:5: lv_metamodelDeclarations_12_0= ruleAbstractMetamodelDeclaration
            	    {

            	    					newCompositeNode(grammarAccess.getGrammarAccess().getMetamodelDeclarationsAbstractMetamodelDeclarationParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_metamodelDeclarations_12_0=ruleAbstractMetamodelDeclaration();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGrammarRule());
            	    					}
            	    					add(
            	    						current,
            	    						"metamodelDeclarations",
            	    						lv_metamodelDeclarations_12_0,
            	    						"org.eclipse.xtext.testlanguages.xtextgrammar.XtextGrammarTestLanguage.AbstractMetamodelDeclaration");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // InternalXtextGrammarTestLanguage.g:218:3: ( (lv_rules_13_0= ruleAbstractRule ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID||LA7_0==37||LA7_0==41) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalXtextGrammarTestLanguage.g:219:4: (lv_rules_13_0= ruleAbstractRule )
            	    {
            	    // InternalXtextGrammarTestLanguage.g:219:4: (lv_rules_13_0= ruleAbstractRule )
            	    // InternalXtextGrammarTestLanguage.g:220:5: lv_rules_13_0= ruleAbstractRule
            	    {

            	    					newCompositeNode(grammarAccess.getGrammarAccess().getRulesAbstractRuleParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_rules_13_0=ruleAbstractRule();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGrammarRule());
            	    					}
            	    					add(
            	    						current,
            	    						"rules",
            	    						lv_rules_13_0,
            	    						"org.eclipse.xtext.testlanguages.xtextgrammar.XtextGrammarTestLanguage.AbstractRule");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
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
    // $ANTLR end "ruleGrammar"


    // $ANTLR start "entryRuleGrammarID"
    // InternalXtextGrammarTestLanguage.g:241:1: entryRuleGrammarID returns [String current=null] : iv_ruleGrammarID= ruleGrammarID EOF ;
    public final String entryRuleGrammarID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleGrammarID = null;


        try {
            // InternalXtextGrammarTestLanguage.g:241:49: (iv_ruleGrammarID= ruleGrammarID EOF )
            // InternalXtextGrammarTestLanguage.g:242:2: iv_ruleGrammarID= ruleGrammarID EOF
            {
             newCompositeNode(grammarAccess.getGrammarIDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGrammarID=ruleGrammarID();

            state._fsp--;

             current =iv_ruleGrammarID.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleGrammarID"


    // $ANTLR start "ruleGrammarID"
    // InternalXtextGrammarTestLanguage.g:248:1: ruleGrammarID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleGrammarID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

        try {
            // InternalXtextGrammarTestLanguage.g:249:1: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalXtextGrammarTestLanguage.g:250:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalXtextGrammarTestLanguage.g:250:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalXtextGrammarTestLanguage.g:251:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getGrammarIDAccess().getIDTerminalRuleCall_0());
            		
            // InternalXtextGrammarTestLanguage.g:258:3: (kw= '.' this_ID_2= RULE_ID )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==17) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalXtextGrammarTestLanguage.g:259:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,17,FOLLOW_3); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getGrammarIDAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_10); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getGrammarIDAccess().getIDTerminalRuleCall_1_1());
            	    			

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
    // $ANTLR end "ruleGrammarID"


    // $ANTLR start "entryRuleAbstractRule"
    // InternalXtextGrammarTestLanguage.g:276:1: entryRuleAbstractRule returns [EObject current=null] : iv_ruleAbstractRule= ruleAbstractRule EOF ;
    public final EObject entryRuleAbstractRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractRule = null;


        try {
            // InternalXtextGrammarTestLanguage.g:276:53: (iv_ruleAbstractRule= ruleAbstractRule EOF )
            // InternalXtextGrammarTestLanguage.g:277:2: iv_ruleAbstractRule= ruleAbstractRule EOF
            {
             newCompositeNode(grammarAccess.getAbstractRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractRule=ruleAbstractRule();

            state._fsp--;

             current =iv_ruleAbstractRule; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAbstractRule"


    // $ANTLR start "ruleAbstractRule"
    // InternalXtextGrammarTestLanguage.g:283:1: ruleAbstractRule returns [EObject current=null] : (this_ParserRule_0= ruleParserRule | this_TerminalRule_1= ruleTerminalRule | this_EnumRule_2= ruleEnumRule ) ;
    public final EObject ruleAbstractRule() throws RecognitionException {
        EObject current = null;

        EObject this_ParserRule_0 = null;

        EObject this_TerminalRule_1 = null;

        EObject this_EnumRule_2 = null;


        try {
            // InternalXtextGrammarTestLanguage.g:284:1: ( (this_ParserRule_0= ruleParserRule | this_TerminalRule_1= ruleTerminalRule | this_EnumRule_2= ruleEnumRule ) )
            // InternalXtextGrammarTestLanguage.g:285:2: (this_ParserRule_0= ruleParserRule | this_TerminalRule_1= ruleTerminalRule | this_EnumRule_2= ruleEnumRule )
            {
            // InternalXtextGrammarTestLanguage.g:285:2: (this_ParserRule_0= ruleParserRule | this_TerminalRule_1= ruleTerminalRule | this_EnumRule_2= ruleEnumRule )
            int alt9=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt9=1;
                }
                break;
            case 37:
                {
                alt9=2;
                }
                break;
            case 41:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalXtextGrammarTestLanguage.g:286:3: this_ParserRule_0= ruleParserRule
                    {

                    			newCompositeNode(grammarAccess.getAbstractRuleAccess().getParserRuleParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParserRule_0=ruleParserRule();

                    state._fsp--;


                    			current = this_ParserRule_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalXtextGrammarTestLanguage.g:295:3: this_TerminalRule_1= ruleTerminalRule
                    {

                    			newCompositeNode(grammarAccess.getAbstractRuleAccess().getTerminalRuleParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_TerminalRule_1=ruleTerminalRule();

                    state._fsp--;


                    			current = this_TerminalRule_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalXtextGrammarTestLanguage.g:304:3: this_EnumRule_2= ruleEnumRule
                    {

                    			newCompositeNode(grammarAccess.getAbstractRuleAccess().getEnumRuleParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_EnumRule_2=ruleEnumRule();

                    state._fsp--;


                    			current = this_EnumRule_2;
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
    // $ANTLR end "ruleAbstractRule"


    // $ANTLR start "entryRuleAbstractMetamodelDeclaration"
    // InternalXtextGrammarTestLanguage.g:316:1: entryRuleAbstractMetamodelDeclaration returns [EObject current=null] : iv_ruleAbstractMetamodelDeclaration= ruleAbstractMetamodelDeclaration EOF ;
    public final EObject entryRuleAbstractMetamodelDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractMetamodelDeclaration = null;


        try {
            // InternalXtextGrammarTestLanguage.g:316:69: (iv_ruleAbstractMetamodelDeclaration= ruleAbstractMetamodelDeclaration EOF )
            // InternalXtextGrammarTestLanguage.g:317:2: iv_ruleAbstractMetamodelDeclaration= ruleAbstractMetamodelDeclaration EOF
            {
             newCompositeNode(grammarAccess.getAbstractMetamodelDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractMetamodelDeclaration=ruleAbstractMetamodelDeclaration();

            state._fsp--;

             current =iv_ruleAbstractMetamodelDeclaration; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAbstractMetamodelDeclaration"


    // $ANTLR start "ruleAbstractMetamodelDeclaration"
    // InternalXtextGrammarTestLanguage.g:323:1: ruleAbstractMetamodelDeclaration returns [EObject current=null] : (this_GeneratedMetamodel_0= ruleGeneratedMetamodel | this_ReferencedMetamodel_1= ruleReferencedMetamodel ) ;
    public final EObject ruleAbstractMetamodelDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_GeneratedMetamodel_0 = null;

        EObject this_ReferencedMetamodel_1 = null;


        try {
            // InternalXtextGrammarTestLanguage.g:324:1: ( (this_GeneratedMetamodel_0= ruleGeneratedMetamodel | this_ReferencedMetamodel_1= ruleReferencedMetamodel ) )
            // InternalXtextGrammarTestLanguage.g:325:2: (this_GeneratedMetamodel_0= ruleGeneratedMetamodel | this_ReferencedMetamodel_1= ruleReferencedMetamodel )
            {
            // InternalXtextGrammarTestLanguage.g:325:2: (this_GeneratedMetamodel_0= ruleGeneratedMetamodel | this_ReferencedMetamodel_1= ruleReferencedMetamodel )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==18) ) {
                alt10=1;
            }
            else if ( (LA10_0==20) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalXtextGrammarTestLanguage.g:326:3: this_GeneratedMetamodel_0= ruleGeneratedMetamodel
                    {

                    			newCompositeNode(grammarAccess.getAbstractMetamodelDeclarationAccess().getGeneratedMetamodelParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_GeneratedMetamodel_0=ruleGeneratedMetamodel();

                    state._fsp--;


                    			current = this_GeneratedMetamodel_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalXtextGrammarTestLanguage.g:335:3: this_ReferencedMetamodel_1= ruleReferencedMetamodel
                    {

                    			newCompositeNode(grammarAccess.getAbstractMetamodelDeclarationAccess().getReferencedMetamodelParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ReferencedMetamodel_1=ruleReferencedMetamodel();

                    state._fsp--;


                    			current = this_ReferencedMetamodel_1;
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
    // $ANTLR end "ruleAbstractMetamodelDeclaration"


    // $ANTLR start "entryRuleGeneratedMetamodel"
    // InternalXtextGrammarTestLanguage.g:347:1: entryRuleGeneratedMetamodel returns [EObject current=null] : iv_ruleGeneratedMetamodel= ruleGeneratedMetamodel EOF ;
    public final EObject entryRuleGeneratedMetamodel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneratedMetamodel = null;


        try {
            // InternalXtextGrammarTestLanguage.g:347:59: (iv_ruleGeneratedMetamodel= ruleGeneratedMetamodel EOF )
            // InternalXtextGrammarTestLanguage.g:348:2: iv_ruleGeneratedMetamodel= ruleGeneratedMetamodel EOF
            {
             newCompositeNode(grammarAccess.getGeneratedMetamodelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGeneratedMetamodel=ruleGeneratedMetamodel();

            state._fsp--;

             current =iv_ruleGeneratedMetamodel; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleGeneratedMetamodel"


    // $ANTLR start "ruleGeneratedMetamodel"
    // InternalXtextGrammarTestLanguage.g:354:1: ruleGeneratedMetamodel returns [EObject current=null] : (otherlv_0= 'generate' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_STRING ) ) (otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) )? ) ;
    public final EObject ruleGeneratedMetamodel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_alias_4_0=null;

        try {
            // InternalXtextGrammarTestLanguage.g:355:1: ( (otherlv_0= 'generate' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_STRING ) ) (otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) )? ) )
            // InternalXtextGrammarTestLanguage.g:356:2: (otherlv_0= 'generate' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_STRING ) ) (otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) )? )
            {
            // InternalXtextGrammarTestLanguage.g:356:2: (otherlv_0= 'generate' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_STRING ) ) (otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) )? )
            // InternalXtextGrammarTestLanguage.g:357:3: otherlv_0= 'generate' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_STRING ) ) (otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) )?
            {
            otherlv_0=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getGeneratedMetamodelAccess().getGenerateKeyword_0());
            		
            // InternalXtextGrammarTestLanguage.g:361:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalXtextGrammarTestLanguage.g:362:4: (lv_name_1_0= RULE_ID )
            {
            // InternalXtextGrammarTestLanguage.g:362:4: (lv_name_1_0= RULE_ID )
            // InternalXtextGrammarTestLanguage.g:363:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_1_0, grammarAccess.getGeneratedMetamodelAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGeneratedMetamodelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalXtextGrammarTestLanguage.g:379:3: ( (otherlv_2= RULE_STRING ) )
            // InternalXtextGrammarTestLanguage.g:380:4: (otherlv_2= RULE_STRING )
            {
            // InternalXtextGrammarTestLanguage.g:380:4: (otherlv_2= RULE_STRING )
            // InternalXtextGrammarTestLanguage.g:381:5: otherlv_2= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGeneratedMetamodelRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_STRING,FOLLOW_12); 

            					newLeafNode(otherlv_2, grammarAccess.getGeneratedMetamodelAccess().getEPackageEPackageCrossReference_2_0());
            				

            }


            }

            // InternalXtextGrammarTestLanguage.g:392:3: (otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==19) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalXtextGrammarTestLanguage.g:393:4: otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getGeneratedMetamodelAccess().getAsKeyword_3_0());
                    			
                    // InternalXtextGrammarTestLanguage.g:397:4: ( (lv_alias_4_0= RULE_ID ) )
                    // InternalXtextGrammarTestLanguage.g:398:5: (lv_alias_4_0= RULE_ID )
                    {
                    // InternalXtextGrammarTestLanguage.g:398:5: (lv_alias_4_0= RULE_ID )
                    // InternalXtextGrammarTestLanguage.g:399:6: lv_alias_4_0= RULE_ID
                    {
                    lv_alias_4_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_alias_4_0, grammarAccess.getGeneratedMetamodelAccess().getAliasIDTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getGeneratedMetamodelRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"alias",
                    							lv_alias_4_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


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
    // $ANTLR end "ruleGeneratedMetamodel"


    // $ANTLR start "entryRuleReferencedMetamodel"
    // InternalXtextGrammarTestLanguage.g:420:1: entryRuleReferencedMetamodel returns [EObject current=null] : iv_ruleReferencedMetamodel= ruleReferencedMetamodel EOF ;
    public final EObject entryRuleReferencedMetamodel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferencedMetamodel = null;


        try {
            // InternalXtextGrammarTestLanguage.g:420:60: (iv_ruleReferencedMetamodel= ruleReferencedMetamodel EOF )
            // InternalXtextGrammarTestLanguage.g:421:2: iv_ruleReferencedMetamodel= ruleReferencedMetamodel EOF
            {
             newCompositeNode(grammarAccess.getReferencedMetamodelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReferencedMetamodel=ruleReferencedMetamodel();

            state._fsp--;

             current =iv_ruleReferencedMetamodel; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleReferencedMetamodel"


    // $ANTLR start "ruleReferencedMetamodel"
    // InternalXtextGrammarTestLanguage.g:427:1: ruleReferencedMetamodel returns [EObject current=null] : (otherlv_0= 'import' ( (otherlv_1= RULE_STRING ) ) (otherlv_2= 'as' ( (lv_alias_3_0= RULE_ID ) ) )? ) ;
    public final EObject ruleReferencedMetamodel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_alias_3_0=null;

        try {
            // InternalXtextGrammarTestLanguage.g:428:1: ( (otherlv_0= 'import' ( (otherlv_1= RULE_STRING ) ) (otherlv_2= 'as' ( (lv_alias_3_0= RULE_ID ) ) )? ) )
            // InternalXtextGrammarTestLanguage.g:429:2: (otherlv_0= 'import' ( (otherlv_1= RULE_STRING ) ) (otherlv_2= 'as' ( (lv_alias_3_0= RULE_ID ) ) )? )
            {
            // InternalXtextGrammarTestLanguage.g:429:2: (otherlv_0= 'import' ( (otherlv_1= RULE_STRING ) ) (otherlv_2= 'as' ( (lv_alias_3_0= RULE_ID ) ) )? )
            // InternalXtextGrammarTestLanguage.g:430:3: otherlv_0= 'import' ( (otherlv_1= RULE_STRING ) ) (otherlv_2= 'as' ( (lv_alias_3_0= RULE_ID ) ) )?
            {
            otherlv_0=(Token)match(input,20,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getReferencedMetamodelAccess().getImportKeyword_0());
            		
            // InternalXtextGrammarTestLanguage.g:434:3: ( (otherlv_1= RULE_STRING ) )
            // InternalXtextGrammarTestLanguage.g:435:4: (otherlv_1= RULE_STRING )
            {
            // InternalXtextGrammarTestLanguage.g:435:4: (otherlv_1= RULE_STRING )
            // InternalXtextGrammarTestLanguage.g:436:5: otherlv_1= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReferencedMetamodelRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_STRING,FOLLOW_12); 

            					newLeafNode(otherlv_1, grammarAccess.getReferencedMetamodelAccess().getEPackageEPackageCrossReference_1_0());
            				

            }


            }

            // InternalXtextGrammarTestLanguage.g:447:3: (otherlv_2= 'as' ( (lv_alias_3_0= RULE_ID ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==19) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalXtextGrammarTestLanguage.g:448:4: otherlv_2= 'as' ( (lv_alias_3_0= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getReferencedMetamodelAccess().getAsKeyword_2_0());
                    			
                    // InternalXtextGrammarTestLanguage.g:452:4: ( (lv_alias_3_0= RULE_ID ) )
                    // InternalXtextGrammarTestLanguage.g:453:5: (lv_alias_3_0= RULE_ID )
                    {
                    // InternalXtextGrammarTestLanguage.g:453:5: (lv_alias_3_0= RULE_ID )
                    // InternalXtextGrammarTestLanguage.g:454:6: lv_alias_3_0= RULE_ID
                    {
                    lv_alias_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_alias_3_0, grammarAccess.getReferencedMetamodelAccess().getAliasIDTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getReferencedMetamodelRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"alias",
                    							lv_alias_3_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


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
    // $ANTLR end "ruleReferencedMetamodel"


    // $ANTLR start "entryRuleParserRule"
    // InternalXtextGrammarTestLanguage.g:475:1: entryRuleParserRule returns [EObject current=null] : iv_ruleParserRule= ruleParserRule EOF ;
    public final EObject entryRuleParserRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParserRule = null;


        try {
            // InternalXtextGrammarTestLanguage.g:475:51: (iv_ruleParserRule= ruleParserRule EOF )
            // InternalXtextGrammarTestLanguage.g:476:2: iv_ruleParserRule= ruleParserRule EOF
            {
             newCompositeNode(grammarAccess.getParserRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParserRule=ruleParserRule();

            state._fsp--;

             current =iv_ruleParserRule; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleParserRule"


    // $ANTLR start "ruleParserRule"
    // InternalXtextGrammarTestLanguage.g:482:1: ruleParserRule returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'returns' ( (lv_type_2_0= ruleTypeRef ) ) )? ( ( (lv_definesHiddenTokens_3_0= 'hidden' ) ) otherlv_4= '(' ( ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* )? otherlv_8= ')' )? otherlv_9= ':' ( (lv_alternatives_10_0= ruleAlternatives ) ) otherlv_11= ';' ) ;
    public final EObject ruleParserRule() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_definesHiddenTokens_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_type_2_0 = null;

        EObject lv_alternatives_10_0 = null;


        try {
            // InternalXtextGrammarTestLanguage.g:483:1: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'returns' ( (lv_type_2_0= ruleTypeRef ) ) )? ( ( (lv_definesHiddenTokens_3_0= 'hidden' ) ) otherlv_4= '(' ( ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* )? otherlv_8= ')' )? otherlv_9= ':' ( (lv_alternatives_10_0= ruleAlternatives ) ) otherlv_11= ';' ) )
            // InternalXtextGrammarTestLanguage.g:484:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'returns' ( (lv_type_2_0= ruleTypeRef ) ) )? ( ( (lv_definesHiddenTokens_3_0= 'hidden' ) ) otherlv_4= '(' ( ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* )? otherlv_8= ')' )? otherlv_9= ':' ( (lv_alternatives_10_0= ruleAlternatives ) ) otherlv_11= ';' )
            {
            // InternalXtextGrammarTestLanguage.g:484:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'returns' ( (lv_type_2_0= ruleTypeRef ) ) )? ( ( (lv_definesHiddenTokens_3_0= 'hidden' ) ) otherlv_4= '(' ( ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* )? otherlv_8= ')' )? otherlv_9= ':' ( (lv_alternatives_10_0= ruleAlternatives ) ) otherlv_11= ';' )
            // InternalXtextGrammarTestLanguage.g:485:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'returns' ( (lv_type_2_0= ruleTypeRef ) ) )? ( ( (lv_definesHiddenTokens_3_0= 'hidden' ) ) otherlv_4= '(' ( ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* )? otherlv_8= ')' )? otherlv_9= ':' ( (lv_alternatives_10_0= ruleAlternatives ) ) otherlv_11= ';'
            {
            // InternalXtextGrammarTestLanguage.g:485:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalXtextGrammarTestLanguage.g:486:4: (lv_name_0_0= RULE_ID )
            {
            // InternalXtextGrammarTestLanguage.g:486:4: (lv_name_0_0= RULE_ID )
            // InternalXtextGrammarTestLanguage.g:487:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_name_0_0, grammarAccess.getParserRuleAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParserRuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalXtextGrammarTestLanguage.g:503:3: (otherlv_1= 'returns' ( (lv_type_2_0= ruleTypeRef ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==21) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalXtextGrammarTestLanguage.g:504:4: otherlv_1= 'returns' ( (lv_type_2_0= ruleTypeRef ) )
                    {
                    otherlv_1=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getParserRuleAccess().getReturnsKeyword_1_0());
                    			
                    // InternalXtextGrammarTestLanguage.g:508:4: ( (lv_type_2_0= ruleTypeRef ) )
                    // InternalXtextGrammarTestLanguage.g:509:5: (lv_type_2_0= ruleTypeRef )
                    {
                    // InternalXtextGrammarTestLanguage.g:509:5: (lv_type_2_0= ruleTypeRef )
                    // InternalXtextGrammarTestLanguage.g:510:6: lv_type_2_0= ruleTypeRef
                    {

                    						newCompositeNode(grammarAccess.getParserRuleAccess().getTypeTypeRefParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_type_2_0=ruleTypeRef();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParserRuleRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_2_0,
                    							"org.eclipse.xtext.testlanguages.xtextgrammar.XtextGrammarTestLanguage.TypeRef");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXtextGrammarTestLanguage.g:528:3: ( ( (lv_definesHiddenTokens_3_0= 'hidden' ) ) otherlv_4= '(' ( ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* )? otherlv_8= ')' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==14) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalXtextGrammarTestLanguage.g:529:4: ( (lv_definesHiddenTokens_3_0= 'hidden' ) ) otherlv_4= '(' ( ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* )? otherlv_8= ')'
                    {
                    // InternalXtextGrammarTestLanguage.g:529:4: ( (lv_definesHiddenTokens_3_0= 'hidden' ) )
                    // InternalXtextGrammarTestLanguage.g:530:5: (lv_definesHiddenTokens_3_0= 'hidden' )
                    {
                    // InternalXtextGrammarTestLanguage.g:530:5: (lv_definesHiddenTokens_3_0= 'hidden' )
                    // InternalXtextGrammarTestLanguage.g:531:6: lv_definesHiddenTokens_3_0= 'hidden'
                    {
                    lv_definesHiddenTokens_3_0=(Token)match(input,14,FOLLOW_6); 

                    						newLeafNode(lv_definesHiddenTokens_3_0, grammarAccess.getParserRuleAccess().getDefinesHiddenTokensHiddenKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getParserRuleRule());
                    						}
                    						setWithLastConsumed(current, "definesHiddenTokens", lv_definesHiddenTokens_3_0 != null, "hidden");
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_4, grammarAccess.getParserRuleAccess().getLeftParenthesisKeyword_2_1());
                    			
                    // InternalXtextGrammarTestLanguage.g:547:4: ( ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==RULE_ID) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalXtextGrammarTestLanguage.g:548:5: ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )*
                            {
                            // InternalXtextGrammarTestLanguage.g:548:5: ( (otherlv_5= RULE_ID ) )
                            // InternalXtextGrammarTestLanguage.g:549:6: (otherlv_5= RULE_ID )
                            {
                            // InternalXtextGrammarTestLanguage.g:549:6: (otherlv_5= RULE_ID )
                            // InternalXtextGrammarTestLanguage.g:550:7: otherlv_5= RULE_ID
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getParserRuleRule());
                            							}
                            						
                            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_8); 

                            							newLeafNode(otherlv_5, grammarAccess.getParserRuleAccess().getHiddenTokensAbstractRuleCrossReference_2_2_0_0());
                            						

                            }


                            }

                            // InternalXtextGrammarTestLanguage.g:561:5: (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )*
                            loop14:
                            do {
                                int alt14=2;
                                int LA14_0 = input.LA(1);

                                if ( (LA14_0==13) ) {
                                    alt14=1;
                                }


                                switch (alt14) {
                            	case 1 :
                            	    // InternalXtextGrammarTestLanguage.g:562:6: otherlv_6= ',' ( (otherlv_7= RULE_ID ) )
                            	    {
                            	    otherlv_6=(Token)match(input,13,FOLLOW_3); 

                            	    						newLeafNode(otherlv_6, grammarAccess.getParserRuleAccess().getCommaKeyword_2_2_1_0());
                            	    					
                            	    // InternalXtextGrammarTestLanguage.g:566:6: ( (otherlv_7= RULE_ID ) )
                            	    // InternalXtextGrammarTestLanguage.g:567:7: (otherlv_7= RULE_ID )
                            	    {
                            	    // InternalXtextGrammarTestLanguage.g:567:7: (otherlv_7= RULE_ID )
                            	    // InternalXtextGrammarTestLanguage.g:568:8: otherlv_7= RULE_ID
                            	    {

                            	    								if (current==null) {
                            	    									current = createModelElement(grammarAccess.getParserRuleRule());
                            	    								}
                            	    							
                            	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_8); 

                            	    								newLeafNode(otherlv_7, grammarAccess.getParserRuleAccess().getHiddenTokensAbstractRuleCrossReference_2_2_1_1_0());
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop14;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_8=(Token)match(input,16,FOLLOW_15); 

                    				newLeafNode(otherlv_8, grammarAccess.getParserRuleAccess().getRightParenthesisKeyword_2_3());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,22,FOLLOW_16); 

            			newLeafNode(otherlv_9, grammarAccess.getParserRuleAccess().getColonKeyword_3());
            		
            // InternalXtextGrammarTestLanguage.g:590:3: ( (lv_alternatives_10_0= ruleAlternatives ) )
            // InternalXtextGrammarTestLanguage.g:591:4: (lv_alternatives_10_0= ruleAlternatives )
            {
            // InternalXtextGrammarTestLanguage.g:591:4: (lv_alternatives_10_0= ruleAlternatives )
            // InternalXtextGrammarTestLanguage.g:592:5: lv_alternatives_10_0= ruleAlternatives
            {

            					newCompositeNode(grammarAccess.getParserRuleAccess().getAlternativesAlternativesParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_17);
            lv_alternatives_10_0=ruleAlternatives();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParserRuleRule());
            					}
            					set(
            						current,
            						"alternatives",
            						lv_alternatives_10_0,
            						"org.eclipse.xtext.testlanguages.xtextgrammar.XtextGrammarTestLanguage.Alternatives");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getParserRuleAccess().getSemicolonKeyword_5());
            		

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
    // $ANTLR end "ruleParserRule"


    // $ANTLR start "entryRuleTypeRef"
    // InternalXtextGrammarTestLanguage.g:617:1: entryRuleTypeRef returns [EObject current=null] : iv_ruleTypeRef= ruleTypeRef EOF ;
    public final EObject entryRuleTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeRef = null;


        try {
            // InternalXtextGrammarTestLanguage.g:617:48: (iv_ruleTypeRef= ruleTypeRef EOF )
            // InternalXtextGrammarTestLanguage.g:618:2: iv_ruleTypeRef= ruleTypeRef EOF
            {
             newCompositeNode(grammarAccess.getTypeRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeRef=ruleTypeRef();

            state._fsp--;

             current =iv_ruleTypeRef; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTypeRef"


    // $ANTLR start "ruleTypeRef"
    // InternalXtextGrammarTestLanguage.g:624:1: ruleTypeRef returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleTypeRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

        try {
            // InternalXtextGrammarTestLanguage.g:625:1: ( ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) ) ) )
            // InternalXtextGrammarTestLanguage.g:626:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalXtextGrammarTestLanguage.g:626:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) ) )
            // InternalXtextGrammarTestLanguage.g:627:3: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) )
            {
            // InternalXtextGrammarTestLanguage.g:627:3: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==24) ) {
                    alt17=1;
                }
            }
            switch (alt17) {
                case 1 :
                    // InternalXtextGrammarTestLanguage.g:628:4: ( (otherlv_0= RULE_ID ) ) otherlv_1= '::'
                    {
                    // InternalXtextGrammarTestLanguage.g:628:4: ( (otherlv_0= RULE_ID ) )
                    // InternalXtextGrammarTestLanguage.g:629:5: (otherlv_0= RULE_ID )
                    {
                    // InternalXtextGrammarTestLanguage.g:629:5: (otherlv_0= RULE_ID )
                    // InternalXtextGrammarTestLanguage.g:630:6: otherlv_0= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTypeRefRule());
                    						}
                    					
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_18); 

                    						newLeafNode(otherlv_0, grammarAccess.getTypeRefAccess().getMetamodelAbstractMetamodelDeclarationCrossReference_0_0_0());
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getTypeRefAccess().getColonColonKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalXtextGrammarTestLanguage.g:646:3: ( (otherlv_2= RULE_ID ) )
            // InternalXtextGrammarTestLanguage.g:647:4: (otherlv_2= RULE_ID )
            {
            // InternalXtextGrammarTestLanguage.g:647:4: (otherlv_2= RULE_ID )
            // InternalXtextGrammarTestLanguage.g:648:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypeRefRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getTypeRefAccess().getClassifierEClassifierCrossReference_1_0());
            				

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
    // $ANTLR end "ruleTypeRef"


    // $ANTLR start "entryRuleAlternatives"
    // InternalXtextGrammarTestLanguage.g:663:1: entryRuleAlternatives returns [EObject current=null] : iv_ruleAlternatives= ruleAlternatives EOF ;
    public final EObject entryRuleAlternatives() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlternatives = null;


        try {
            // InternalXtextGrammarTestLanguage.g:663:53: (iv_ruleAlternatives= ruleAlternatives EOF )
            // InternalXtextGrammarTestLanguage.g:664:2: iv_ruleAlternatives= ruleAlternatives EOF
            {
             newCompositeNode(grammarAccess.getAlternativesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlternatives=ruleAlternatives();

            state._fsp--;

             current =iv_ruleAlternatives; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAlternatives"


    // $ANTLR start "ruleAlternatives"
    // InternalXtextGrammarTestLanguage.g:670:1: ruleAlternatives returns [EObject current=null] : (this_Group_0= ruleGroup ( () (otherlv_2= '|' ( (lv_groups_3_0= ruleGroup ) ) )+ )? ) ;
    public final EObject ruleAlternatives() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Group_0 = null;

        EObject lv_groups_3_0 = null;


        try {
            // InternalXtextGrammarTestLanguage.g:671:1: ( (this_Group_0= ruleGroup ( () (otherlv_2= '|' ( (lv_groups_3_0= ruleGroup ) ) )+ )? ) )
            // InternalXtextGrammarTestLanguage.g:672:2: (this_Group_0= ruleGroup ( () (otherlv_2= '|' ( (lv_groups_3_0= ruleGroup ) ) )+ )? )
            {
            // InternalXtextGrammarTestLanguage.g:672:2: (this_Group_0= ruleGroup ( () (otherlv_2= '|' ( (lv_groups_3_0= ruleGroup ) ) )+ )? )
            // InternalXtextGrammarTestLanguage.g:673:3: this_Group_0= ruleGroup ( () (otherlv_2= '|' ( (lv_groups_3_0= ruleGroup ) ) )+ )?
            {

            			newCompositeNode(grammarAccess.getAlternativesAccess().getGroupParserRuleCall_0());
            		
            pushFollow(FOLLOW_19);
            this_Group_0=ruleGroup();

            state._fsp--;


            			current = this_Group_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalXtextGrammarTestLanguage.g:681:3: ( () (otherlv_2= '|' ( (lv_groups_3_0= ruleGroup ) ) )+ )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==25) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalXtextGrammarTestLanguage.g:682:4: () (otherlv_2= '|' ( (lv_groups_3_0= ruleGroup ) ) )+
                    {
                    // InternalXtextGrammarTestLanguage.g:682:4: ()
                    // InternalXtextGrammarTestLanguage.g:683:5: 
                    {

                    					current = forceCreateModelElementAndAdd(
                    						grammarAccess.getAlternativesAccess().getAlternativesGroupsAction_1_0(),
                    						current);
                    				

                    }

                    // InternalXtextGrammarTestLanguage.g:689:4: (otherlv_2= '|' ( (lv_groups_3_0= ruleGroup ) ) )+
                    int cnt18=0;
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==25) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalXtextGrammarTestLanguage.g:690:5: otherlv_2= '|' ( (lv_groups_3_0= ruleGroup ) )
                    	    {
                    	    otherlv_2=(Token)match(input,25,FOLLOW_16); 

                    	    					newLeafNode(otherlv_2, grammarAccess.getAlternativesAccess().getVerticalLineKeyword_1_1_0());
                    	    				
                    	    // InternalXtextGrammarTestLanguage.g:694:5: ( (lv_groups_3_0= ruleGroup ) )
                    	    // InternalXtextGrammarTestLanguage.g:695:6: (lv_groups_3_0= ruleGroup )
                    	    {
                    	    // InternalXtextGrammarTestLanguage.g:695:6: (lv_groups_3_0= ruleGroup )
                    	    // InternalXtextGrammarTestLanguage.g:696:7: lv_groups_3_0= ruleGroup
                    	    {

                    	    							newCompositeNode(grammarAccess.getAlternativesAccess().getGroupsGroupParserRuleCall_1_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_19);
                    	    lv_groups_3_0=ruleGroup();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAlternativesRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"groups",
                    	    								lv_groups_3_0,
                    	    								"org.eclipse.xtext.testlanguages.xtextgrammar.XtextGrammarTestLanguage.Group");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt18 >= 1 ) break loop18;
                                EarlyExitException eee =
                                    new EarlyExitException(18, input);
                                throw eee;
                        }
                        cnt18++;
                    } while (true);


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
    // $ANTLR end "ruleAlternatives"


    // $ANTLR start "entryRuleGroup"
    // InternalXtextGrammarTestLanguage.g:719:1: entryRuleGroup returns [EObject current=null] : iv_ruleGroup= ruleGroup EOF ;
    public final EObject entryRuleGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroup = null;


        try {
            // InternalXtextGrammarTestLanguage.g:719:46: (iv_ruleGroup= ruleGroup EOF )
            // InternalXtextGrammarTestLanguage.g:720:2: iv_ruleGroup= ruleGroup EOF
            {
             newCompositeNode(grammarAccess.getGroupRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGroup=ruleGroup();

            state._fsp--;

             current =iv_ruleGroup; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleGroup"


    // $ANTLR start "ruleGroup"
    // InternalXtextGrammarTestLanguage.g:726:1: ruleGroup returns [EObject current=null] : (this_AbstractToken_0= ruleAbstractToken ( () ( (lv_tokens_2_0= ruleAbstractToken ) )+ )? ) ;
    public final EObject ruleGroup() throws RecognitionException {
        EObject current = null;

        EObject this_AbstractToken_0 = null;

        EObject lv_tokens_2_0 = null;


        try {
            // InternalXtextGrammarTestLanguage.g:727:1: ( (this_AbstractToken_0= ruleAbstractToken ( () ( (lv_tokens_2_0= ruleAbstractToken ) )+ )? ) )
            // InternalXtextGrammarTestLanguage.g:728:2: (this_AbstractToken_0= ruleAbstractToken ( () ( (lv_tokens_2_0= ruleAbstractToken ) )+ )? )
            {
            // InternalXtextGrammarTestLanguage.g:728:2: (this_AbstractToken_0= ruleAbstractToken ( () ( (lv_tokens_2_0= ruleAbstractToken ) )+ )? )
            // InternalXtextGrammarTestLanguage.g:729:3: this_AbstractToken_0= ruleAbstractToken ( () ( (lv_tokens_2_0= ruleAbstractToken ) )+ )?
            {

            			newCompositeNode(grammarAccess.getGroupAccess().getAbstractTokenParserRuleCall_0());
            		
            pushFollow(FOLLOW_20);
            this_AbstractToken_0=ruleAbstractToken();

            state._fsp--;


            			current = this_AbstractToken_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalXtextGrammarTestLanguage.g:737:3: ( () ( (lv_tokens_2_0= ruleAbstractToken ) )+ )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=RULE_ID && LA21_0<=RULE_STRING)||LA21_0==15||LA21_0==29) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalXtextGrammarTestLanguage.g:738:4: () ( (lv_tokens_2_0= ruleAbstractToken ) )+
                    {
                    // InternalXtextGrammarTestLanguage.g:738:4: ()
                    // InternalXtextGrammarTestLanguage.g:739:5: 
                    {

                    					current = forceCreateModelElementAndAdd(
                    						grammarAccess.getGroupAccess().getGroupTokensAction_1_0(),
                    						current);
                    				

                    }

                    // InternalXtextGrammarTestLanguage.g:745:4: ( (lv_tokens_2_0= ruleAbstractToken ) )+
                    int cnt20=0;
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( ((LA20_0>=RULE_ID && LA20_0<=RULE_STRING)||LA20_0==15||LA20_0==29) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalXtextGrammarTestLanguage.g:746:5: (lv_tokens_2_0= ruleAbstractToken )
                    	    {
                    	    // InternalXtextGrammarTestLanguage.g:746:5: (lv_tokens_2_0= ruleAbstractToken )
                    	    // InternalXtextGrammarTestLanguage.g:747:6: lv_tokens_2_0= ruleAbstractToken
                    	    {

                    	    						newCompositeNode(grammarAccess.getGroupAccess().getTokensAbstractTokenParserRuleCall_1_1_0());
                    	    					
                    	    pushFollow(FOLLOW_20);
                    	    lv_tokens_2_0=ruleAbstractToken();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getGroupRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"tokens",
                    	    							lv_tokens_2_0,
                    	    							"org.eclipse.xtext.testlanguages.xtextgrammar.XtextGrammarTestLanguage.AbstractToken");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt20 >= 1 ) break loop20;
                                EarlyExitException eee =
                                    new EarlyExitException(20, input);
                                throw eee;
                        }
                        cnt20++;
                    } while (true);


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
    // $ANTLR end "ruleGroup"


    // $ANTLR start "entryRuleAbstractToken"
    // InternalXtextGrammarTestLanguage.g:769:1: entryRuleAbstractToken returns [EObject current=null] : iv_ruleAbstractToken= ruleAbstractToken EOF ;
    public final EObject entryRuleAbstractToken() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractToken = null;


        try {
            // InternalXtextGrammarTestLanguage.g:769:54: (iv_ruleAbstractToken= ruleAbstractToken EOF )
            // InternalXtextGrammarTestLanguage.g:770:2: iv_ruleAbstractToken= ruleAbstractToken EOF
            {
             newCompositeNode(grammarAccess.getAbstractTokenRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractToken=ruleAbstractToken();

            state._fsp--;

             current =iv_ruleAbstractToken; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAbstractToken"


    // $ANTLR start "ruleAbstractToken"
    // InternalXtextGrammarTestLanguage.g:776:1: ruleAbstractToken returns [EObject current=null] : (this_AbstractTokenWithCardinality_0= ruleAbstractTokenWithCardinality | this_Action_1= ruleAction ) ;
    public final EObject ruleAbstractToken() throws RecognitionException {
        EObject current = null;

        EObject this_AbstractTokenWithCardinality_0 = null;

        EObject this_Action_1 = null;


        try {
            // InternalXtextGrammarTestLanguage.g:777:1: ( (this_AbstractTokenWithCardinality_0= ruleAbstractTokenWithCardinality | this_Action_1= ruleAction ) )
            // InternalXtextGrammarTestLanguage.g:778:2: (this_AbstractTokenWithCardinality_0= ruleAbstractTokenWithCardinality | this_Action_1= ruleAction )
            {
            // InternalXtextGrammarTestLanguage.g:778:2: (this_AbstractTokenWithCardinality_0= ruleAbstractTokenWithCardinality | this_Action_1= ruleAction )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=RULE_ID && LA22_0<=RULE_STRING)||LA22_0==15) ) {
                alt22=1;
            }
            else if ( (LA22_0==29) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalXtextGrammarTestLanguage.g:779:3: this_AbstractTokenWithCardinality_0= ruleAbstractTokenWithCardinality
                    {

                    			newCompositeNode(grammarAccess.getAbstractTokenAccess().getAbstractTokenWithCardinalityParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AbstractTokenWithCardinality_0=ruleAbstractTokenWithCardinality();

                    state._fsp--;


                    			current = this_AbstractTokenWithCardinality_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalXtextGrammarTestLanguage.g:788:3: this_Action_1= ruleAction
                    {

                    			newCompositeNode(grammarAccess.getAbstractTokenAccess().getActionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Action_1=ruleAction();

                    state._fsp--;


                    			current = this_Action_1;
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
    // $ANTLR end "ruleAbstractToken"


    // $ANTLR start "entryRuleAbstractTokenWithCardinality"
    // InternalXtextGrammarTestLanguage.g:800:1: entryRuleAbstractTokenWithCardinality returns [EObject current=null] : iv_ruleAbstractTokenWithCardinality= ruleAbstractTokenWithCardinality EOF ;
    public final EObject entryRuleAbstractTokenWithCardinality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractTokenWithCardinality = null;


        try {
            // InternalXtextGrammarTestLanguage.g:800:69: (iv_ruleAbstractTokenWithCardinality= ruleAbstractTokenWithCardinality EOF )
            // InternalXtextGrammarTestLanguage.g:801:2: iv_ruleAbstractTokenWithCardinality= ruleAbstractTokenWithCardinality EOF
            {
             newCompositeNode(grammarAccess.getAbstractTokenWithCardinalityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractTokenWithCardinality=ruleAbstractTokenWithCardinality();

            state._fsp--;

             current =iv_ruleAbstractTokenWithCardinality; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAbstractTokenWithCardinality"


    // $ANTLR start "ruleAbstractTokenWithCardinality"
    // InternalXtextGrammarTestLanguage.g:807:1: ruleAbstractTokenWithCardinality returns [EObject current=null] : ( (this_Assignment_0= ruleAssignment | this_AbstractTerminal_1= ruleAbstractTerminal ) ( ( (lv_cardinality_2_1= '?' | lv_cardinality_2_2= '*' | lv_cardinality_2_3= '+' ) ) )? ) ;
    public final EObject ruleAbstractTokenWithCardinality() throws RecognitionException {
        EObject current = null;

        Token lv_cardinality_2_1=null;
        Token lv_cardinality_2_2=null;
        Token lv_cardinality_2_3=null;
        EObject this_Assignment_0 = null;

        EObject this_AbstractTerminal_1 = null;


        try {
            // InternalXtextGrammarTestLanguage.g:808:1: ( ( (this_Assignment_0= ruleAssignment | this_AbstractTerminal_1= ruleAbstractTerminal ) ( ( (lv_cardinality_2_1= '?' | lv_cardinality_2_2= '*' | lv_cardinality_2_3= '+' ) ) )? ) )
            // InternalXtextGrammarTestLanguage.g:809:2: ( (this_Assignment_0= ruleAssignment | this_AbstractTerminal_1= ruleAbstractTerminal ) ( ( (lv_cardinality_2_1= '?' | lv_cardinality_2_2= '*' | lv_cardinality_2_3= '+' ) ) )? )
            {
            // InternalXtextGrammarTestLanguage.g:809:2: ( (this_Assignment_0= ruleAssignment | this_AbstractTerminal_1= ruleAbstractTerminal ) ( ( (lv_cardinality_2_1= '?' | lv_cardinality_2_2= '*' | lv_cardinality_2_3= '+' ) ) )? )
            // InternalXtextGrammarTestLanguage.g:810:3: (this_Assignment_0= ruleAssignment | this_AbstractTerminal_1= ruleAbstractTerminal ) ( ( (lv_cardinality_2_1= '?' | lv_cardinality_2_2= '*' | lv_cardinality_2_3= '+' ) ) )?
            {
            // InternalXtextGrammarTestLanguage.g:810:3: (this_Assignment_0= ruleAssignment | this_AbstractTerminal_1= ruleAbstractTerminal )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID) ) {
                int LA23_1 = input.LA(2);

                if ( (LA23_1==EOF||(LA23_1>=RULE_ID && LA23_1<=RULE_STRING)||(LA23_1>=15 && LA23_1<=16)||LA23_1==23||(LA23_1>=25 && LA23_1<=29)) ) {
                    alt23=2;
                }
                else if ( ((LA23_1>=30 && LA23_1<=31)||LA23_1==34) ) {
                    alt23=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA23_0==RULE_STRING||LA23_0==15) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalXtextGrammarTestLanguage.g:811:4: this_Assignment_0= ruleAssignment
                    {

                    				newCompositeNode(grammarAccess.getAbstractTokenWithCardinalityAccess().getAssignmentParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_21);
                    this_Assignment_0=ruleAssignment();

                    state._fsp--;


                    				current = this_Assignment_0;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalXtextGrammarTestLanguage.g:820:4: this_AbstractTerminal_1= ruleAbstractTerminal
                    {

                    				newCompositeNode(grammarAccess.getAbstractTokenWithCardinalityAccess().getAbstractTerminalParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_21);
                    this_AbstractTerminal_1=ruleAbstractTerminal();

                    state._fsp--;


                    				current = this_AbstractTerminal_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalXtextGrammarTestLanguage.g:829:3: ( ( (lv_cardinality_2_1= '?' | lv_cardinality_2_2= '*' | lv_cardinality_2_3= '+' ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=26 && LA25_0<=28)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalXtextGrammarTestLanguage.g:830:4: ( (lv_cardinality_2_1= '?' | lv_cardinality_2_2= '*' | lv_cardinality_2_3= '+' ) )
                    {
                    // InternalXtextGrammarTestLanguage.g:830:4: ( (lv_cardinality_2_1= '?' | lv_cardinality_2_2= '*' | lv_cardinality_2_3= '+' ) )
                    // InternalXtextGrammarTestLanguage.g:831:5: (lv_cardinality_2_1= '?' | lv_cardinality_2_2= '*' | lv_cardinality_2_3= '+' )
                    {
                    // InternalXtextGrammarTestLanguage.g:831:5: (lv_cardinality_2_1= '?' | lv_cardinality_2_2= '*' | lv_cardinality_2_3= '+' )
                    int alt24=3;
                    switch ( input.LA(1) ) {
                    case 26:
                        {
                        alt24=1;
                        }
                        break;
                    case 27:
                        {
                        alt24=2;
                        }
                        break;
                    case 28:
                        {
                        alt24=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 0, input);

                        throw nvae;
                    }

                    switch (alt24) {
                        case 1 :
                            // InternalXtextGrammarTestLanguage.g:832:6: lv_cardinality_2_1= '?'
                            {
                            lv_cardinality_2_1=(Token)match(input,26,FOLLOW_2); 

                            						newLeafNode(lv_cardinality_2_1, grammarAccess.getAbstractTokenWithCardinalityAccess().getCardinalityQuestionMarkKeyword_1_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getAbstractTokenWithCardinalityRule());
                            						}
                            						setWithLastConsumed(current, "cardinality", lv_cardinality_2_1, null);
                            					

                            }
                            break;
                        case 2 :
                            // InternalXtextGrammarTestLanguage.g:843:6: lv_cardinality_2_2= '*'
                            {
                            lv_cardinality_2_2=(Token)match(input,27,FOLLOW_2); 

                            						newLeafNode(lv_cardinality_2_2, grammarAccess.getAbstractTokenWithCardinalityAccess().getCardinalityAsteriskKeyword_1_0_1());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getAbstractTokenWithCardinalityRule());
                            						}
                            						setWithLastConsumed(current, "cardinality", lv_cardinality_2_2, null);
                            					

                            }
                            break;
                        case 3 :
                            // InternalXtextGrammarTestLanguage.g:854:6: lv_cardinality_2_3= '+'
                            {
                            lv_cardinality_2_3=(Token)match(input,28,FOLLOW_2); 

                            						newLeafNode(lv_cardinality_2_3, grammarAccess.getAbstractTokenWithCardinalityAccess().getCardinalityPlusSignKeyword_1_0_2());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getAbstractTokenWithCardinalityRule());
                            						}
                            						setWithLastConsumed(current, "cardinality", lv_cardinality_2_3, null);
                            					

                            }
                            break;

                    }


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
    // $ANTLR end "ruleAbstractTokenWithCardinality"


    // $ANTLR start "entryRuleAction"
    // InternalXtextGrammarTestLanguage.g:871:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalXtextGrammarTestLanguage.g:871:47: (iv_ruleAction= ruleAction EOF )
            // InternalXtextGrammarTestLanguage.g:872:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalXtextGrammarTestLanguage.g:878:1: ruleAction returns [EObject current=null] : (otherlv_0= '{' ( (lv_type_1_0= ruleTypeRef ) ) (otherlv_2= '.' ( (lv_feature_3_0= RULE_ID ) ) ( ( (lv_operator_4_1= '=' | lv_operator_4_2= '+=' ) ) ) otherlv_5= 'current' )? otherlv_6= '}' ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_feature_3_0=null;
        Token lv_operator_4_1=null;
        Token lv_operator_4_2=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_type_1_0 = null;


        try {
            // InternalXtextGrammarTestLanguage.g:879:1: ( (otherlv_0= '{' ( (lv_type_1_0= ruleTypeRef ) ) (otherlv_2= '.' ( (lv_feature_3_0= RULE_ID ) ) ( ( (lv_operator_4_1= '=' | lv_operator_4_2= '+=' ) ) ) otherlv_5= 'current' )? otherlv_6= '}' ) )
            // InternalXtextGrammarTestLanguage.g:880:2: (otherlv_0= '{' ( (lv_type_1_0= ruleTypeRef ) ) (otherlv_2= '.' ( (lv_feature_3_0= RULE_ID ) ) ( ( (lv_operator_4_1= '=' | lv_operator_4_2= '+=' ) ) ) otherlv_5= 'current' )? otherlv_6= '}' )
            {
            // InternalXtextGrammarTestLanguage.g:880:2: (otherlv_0= '{' ( (lv_type_1_0= ruleTypeRef ) ) (otherlv_2= '.' ( (lv_feature_3_0= RULE_ID ) ) ( ( (lv_operator_4_1= '=' | lv_operator_4_2= '+=' ) ) ) otherlv_5= 'current' )? otherlv_6= '}' )
            // InternalXtextGrammarTestLanguage.g:881:3: otherlv_0= '{' ( (lv_type_1_0= ruleTypeRef ) ) (otherlv_2= '.' ( (lv_feature_3_0= RULE_ID ) ) ( ( (lv_operator_4_1= '=' | lv_operator_4_2= '+=' ) ) ) otherlv_5= 'current' )? otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalXtextGrammarTestLanguage.g:885:3: ( (lv_type_1_0= ruleTypeRef ) )
            // InternalXtextGrammarTestLanguage.g:886:4: (lv_type_1_0= ruleTypeRef )
            {
            // InternalXtextGrammarTestLanguage.g:886:4: (lv_type_1_0= ruleTypeRef )
            // InternalXtextGrammarTestLanguage.g:887:5: lv_type_1_0= ruleTypeRef
            {

            					newCompositeNode(grammarAccess.getActionAccess().getTypeTypeRefParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_22);
            lv_type_1_0=ruleTypeRef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActionRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"org.eclipse.xtext.testlanguages.xtextgrammar.XtextGrammarTestLanguage.TypeRef");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXtextGrammarTestLanguage.g:904:3: (otherlv_2= '.' ( (lv_feature_3_0= RULE_ID ) ) ( ( (lv_operator_4_1= '=' | lv_operator_4_2= '+=' ) ) ) otherlv_5= 'current' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==17) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalXtextGrammarTestLanguage.g:905:4: otherlv_2= '.' ( (lv_feature_3_0= RULE_ID ) ) ( ( (lv_operator_4_1= '=' | lv_operator_4_2= '+=' ) ) ) otherlv_5= 'current'
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getActionAccess().getFullStopKeyword_2_0());
                    			
                    // InternalXtextGrammarTestLanguage.g:909:4: ( (lv_feature_3_0= RULE_ID ) )
                    // InternalXtextGrammarTestLanguage.g:910:5: (lv_feature_3_0= RULE_ID )
                    {
                    // InternalXtextGrammarTestLanguage.g:910:5: (lv_feature_3_0= RULE_ID )
                    // InternalXtextGrammarTestLanguage.g:911:6: lv_feature_3_0= RULE_ID
                    {
                    lv_feature_3_0=(Token)match(input,RULE_ID,FOLLOW_23); 

                    						newLeafNode(lv_feature_3_0, grammarAccess.getActionAccess().getFeatureIDTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getActionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"feature",
                    							lv_feature_3_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    // InternalXtextGrammarTestLanguage.g:927:4: ( ( (lv_operator_4_1= '=' | lv_operator_4_2= '+=' ) ) )
                    // InternalXtextGrammarTestLanguage.g:928:5: ( (lv_operator_4_1= '=' | lv_operator_4_2= '+=' ) )
                    {
                    // InternalXtextGrammarTestLanguage.g:928:5: ( (lv_operator_4_1= '=' | lv_operator_4_2= '+=' ) )
                    // InternalXtextGrammarTestLanguage.g:929:6: (lv_operator_4_1= '=' | lv_operator_4_2= '+=' )
                    {
                    // InternalXtextGrammarTestLanguage.g:929:6: (lv_operator_4_1= '=' | lv_operator_4_2= '+=' )
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==30) ) {
                        alt26=1;
                    }
                    else if ( (LA26_0==31) ) {
                        alt26=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 26, 0, input);

                        throw nvae;
                    }
                    switch (alt26) {
                        case 1 :
                            // InternalXtextGrammarTestLanguage.g:930:7: lv_operator_4_1= '='
                            {
                            lv_operator_4_1=(Token)match(input,30,FOLLOW_24); 

                            							newLeafNode(lv_operator_4_1, grammarAccess.getActionAccess().getOperatorEqualsSignKeyword_2_2_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getActionRule());
                            							}
                            							setWithLastConsumed(current, "operator", lv_operator_4_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalXtextGrammarTestLanguage.g:941:7: lv_operator_4_2= '+='
                            {
                            lv_operator_4_2=(Token)match(input,31,FOLLOW_24); 

                            							newLeafNode(lv_operator_4_2, grammarAccess.getActionAccess().getOperatorPlusSignEqualsSignKeyword_2_2_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getActionRule());
                            							}
                            							setWithLastConsumed(current, "operator", lv_operator_4_2, null);
                            						

                            }
                            break;

                    }


                    }


                    }

                    otherlv_5=(Token)match(input,32,FOLLOW_25); 

                    				newLeafNode(otherlv_5, grammarAccess.getActionAccess().getCurrentKeyword_2_3());
                    			

                    }
                    break;

            }

            otherlv_6=(Token)match(input,33,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getActionAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleAbstractTerminal"
    // InternalXtextGrammarTestLanguage.g:967:1: entryRuleAbstractTerminal returns [EObject current=null] : iv_ruleAbstractTerminal= ruleAbstractTerminal EOF ;
    public final EObject entryRuleAbstractTerminal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractTerminal = null;


        try {
            // InternalXtextGrammarTestLanguage.g:967:57: (iv_ruleAbstractTerminal= ruleAbstractTerminal EOF )
            // InternalXtextGrammarTestLanguage.g:968:2: iv_ruleAbstractTerminal= ruleAbstractTerminal EOF
            {
             newCompositeNode(grammarAccess.getAbstractTerminalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractTerminal=ruleAbstractTerminal();

            state._fsp--;

             current =iv_ruleAbstractTerminal; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAbstractTerminal"


    // $ANTLR start "ruleAbstractTerminal"
    // InternalXtextGrammarTestLanguage.g:974:1: ruleAbstractTerminal returns [EObject current=null] : (this_Keyword_0= ruleKeyword | this_RuleCall_1= ruleRuleCall | this_ParenthesizedElement_2= ruleParenthesizedElement ) ;
    public final EObject ruleAbstractTerminal() throws RecognitionException {
        EObject current = null;

        EObject this_Keyword_0 = null;

        EObject this_RuleCall_1 = null;

        EObject this_ParenthesizedElement_2 = null;


        try {
            // InternalXtextGrammarTestLanguage.g:975:1: ( (this_Keyword_0= ruleKeyword | this_RuleCall_1= ruleRuleCall | this_ParenthesizedElement_2= ruleParenthesizedElement ) )
            // InternalXtextGrammarTestLanguage.g:976:2: (this_Keyword_0= ruleKeyword | this_RuleCall_1= ruleRuleCall | this_ParenthesizedElement_2= ruleParenthesizedElement )
            {
            // InternalXtextGrammarTestLanguage.g:976:2: (this_Keyword_0= ruleKeyword | this_RuleCall_1= ruleRuleCall | this_ParenthesizedElement_2= ruleParenthesizedElement )
            int alt28=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt28=1;
                }
                break;
            case RULE_ID:
                {
                alt28=2;
                }
                break;
            case 15:
                {
                alt28=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalXtextGrammarTestLanguage.g:977:3: this_Keyword_0= ruleKeyword
                    {

                    			newCompositeNode(grammarAccess.getAbstractTerminalAccess().getKeywordParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Keyword_0=ruleKeyword();

                    state._fsp--;


                    			current = this_Keyword_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalXtextGrammarTestLanguage.g:986:3: this_RuleCall_1= ruleRuleCall
                    {

                    			newCompositeNode(grammarAccess.getAbstractTerminalAccess().getRuleCallParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RuleCall_1=ruleRuleCall();

                    state._fsp--;


                    			current = this_RuleCall_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalXtextGrammarTestLanguage.g:995:3: this_ParenthesizedElement_2= ruleParenthesizedElement
                    {

                    			newCompositeNode(grammarAccess.getAbstractTerminalAccess().getParenthesizedElementParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParenthesizedElement_2=ruleParenthesizedElement();

                    state._fsp--;


                    			current = this_ParenthesizedElement_2;
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
    // $ANTLR end "ruleAbstractTerminal"


    // $ANTLR start "entryRuleKeyword"
    // InternalXtextGrammarTestLanguage.g:1007:1: entryRuleKeyword returns [EObject current=null] : iv_ruleKeyword= ruleKeyword EOF ;
    public final EObject entryRuleKeyword() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyword = null;


        try {
            // InternalXtextGrammarTestLanguage.g:1007:48: (iv_ruleKeyword= ruleKeyword EOF )
            // InternalXtextGrammarTestLanguage.g:1008:2: iv_ruleKeyword= ruleKeyword EOF
            {
             newCompositeNode(grammarAccess.getKeywordRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKeyword=ruleKeyword();

            state._fsp--;

             current =iv_ruleKeyword; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleKeyword"


    // $ANTLR start "ruleKeyword"
    // InternalXtextGrammarTestLanguage.g:1014:1: ruleKeyword returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleKeyword() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

        try {
            // InternalXtextGrammarTestLanguage.g:1015:1: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalXtextGrammarTestLanguage.g:1016:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalXtextGrammarTestLanguage.g:1016:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalXtextGrammarTestLanguage.g:1017:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalXtextGrammarTestLanguage.g:1017:3: (lv_value_0_0= RULE_STRING )
            // InternalXtextGrammarTestLanguage.g:1018:4: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getKeywordAccess().getValueSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getKeywordRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

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
    // $ANTLR end "ruleKeyword"


    // $ANTLR start "entryRuleRuleCall"
    // InternalXtextGrammarTestLanguage.g:1037:1: entryRuleRuleCall returns [EObject current=null] : iv_ruleRuleCall= ruleRuleCall EOF ;
    public final EObject entryRuleRuleCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleCall = null;


        try {
            // InternalXtextGrammarTestLanguage.g:1037:49: (iv_ruleRuleCall= ruleRuleCall EOF )
            // InternalXtextGrammarTestLanguage.g:1038:2: iv_ruleRuleCall= ruleRuleCall EOF
            {
             newCompositeNode(grammarAccess.getRuleCallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRuleCall=ruleRuleCall();

            state._fsp--;

             current =iv_ruleRuleCall; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRuleCall"


    // $ANTLR start "ruleRuleCall"
    // InternalXtextGrammarTestLanguage.g:1044:1: ruleRuleCall returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleRuleCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

        try {
            // InternalXtextGrammarTestLanguage.g:1045:1: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalXtextGrammarTestLanguage.g:1046:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalXtextGrammarTestLanguage.g:1046:2: ( (otherlv_0= RULE_ID ) )
            // InternalXtextGrammarTestLanguage.g:1047:3: (otherlv_0= RULE_ID )
            {
            // InternalXtextGrammarTestLanguage.g:1047:3: (otherlv_0= RULE_ID )
            // InternalXtextGrammarTestLanguage.g:1048:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getRuleCallRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getRuleCallAccess().getRuleAbstractRuleCrossReference_0());
            			

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
    // $ANTLR end "ruleRuleCall"


    // $ANTLR start "entryRuleAssignment"
    // InternalXtextGrammarTestLanguage.g:1062:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // InternalXtextGrammarTestLanguage.g:1062:51: (iv_ruleAssignment= ruleAssignment EOF )
            // InternalXtextGrammarTestLanguage.g:1063:2: iv_ruleAssignment= ruleAssignment EOF
            {
             newCompositeNode(grammarAccess.getAssignmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;

             current =iv_ruleAssignment; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // InternalXtextGrammarTestLanguage.g:1069:1: ruleAssignment returns [EObject current=null] : ( ( (lv_feature_0_0= RULE_ID ) ) ( ( (lv_operator_1_1= '+=' | lv_operator_1_2= '=' | lv_operator_1_3= '?=' ) ) ) ( (lv_terminal_2_0= ruleAssignableTerminal ) ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token lv_feature_0_0=null;
        Token lv_operator_1_1=null;
        Token lv_operator_1_2=null;
        Token lv_operator_1_3=null;
        EObject lv_terminal_2_0 = null;


        try {
            // InternalXtextGrammarTestLanguage.g:1070:1: ( ( ( (lv_feature_0_0= RULE_ID ) ) ( ( (lv_operator_1_1= '+=' | lv_operator_1_2= '=' | lv_operator_1_3= '?=' ) ) ) ( (lv_terminal_2_0= ruleAssignableTerminal ) ) ) )
            // InternalXtextGrammarTestLanguage.g:1071:2: ( ( (lv_feature_0_0= RULE_ID ) ) ( ( (lv_operator_1_1= '+=' | lv_operator_1_2= '=' | lv_operator_1_3= '?=' ) ) ) ( (lv_terminal_2_0= ruleAssignableTerminal ) ) )
            {
            // InternalXtextGrammarTestLanguage.g:1071:2: ( ( (lv_feature_0_0= RULE_ID ) ) ( ( (lv_operator_1_1= '+=' | lv_operator_1_2= '=' | lv_operator_1_3= '?=' ) ) ) ( (lv_terminal_2_0= ruleAssignableTerminal ) ) )
            // InternalXtextGrammarTestLanguage.g:1072:3: ( (lv_feature_0_0= RULE_ID ) ) ( ( (lv_operator_1_1= '+=' | lv_operator_1_2= '=' | lv_operator_1_3= '?=' ) ) ) ( (lv_terminal_2_0= ruleAssignableTerminal ) )
            {
            // InternalXtextGrammarTestLanguage.g:1072:3: ( (lv_feature_0_0= RULE_ID ) )
            // InternalXtextGrammarTestLanguage.g:1073:4: (lv_feature_0_0= RULE_ID )
            {
            // InternalXtextGrammarTestLanguage.g:1073:4: (lv_feature_0_0= RULE_ID )
            // InternalXtextGrammarTestLanguage.g:1074:5: lv_feature_0_0= RULE_ID
            {
            lv_feature_0_0=(Token)match(input,RULE_ID,FOLLOW_26); 

            					newLeafNode(lv_feature_0_0, grammarAccess.getAssignmentAccess().getFeatureIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssignmentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"feature",
            						lv_feature_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalXtextGrammarTestLanguage.g:1090:3: ( ( (lv_operator_1_1= '+=' | lv_operator_1_2= '=' | lv_operator_1_3= '?=' ) ) )
            // InternalXtextGrammarTestLanguage.g:1091:4: ( (lv_operator_1_1= '+=' | lv_operator_1_2= '=' | lv_operator_1_3= '?=' ) )
            {
            // InternalXtextGrammarTestLanguage.g:1091:4: ( (lv_operator_1_1= '+=' | lv_operator_1_2= '=' | lv_operator_1_3= '?=' ) )
            // InternalXtextGrammarTestLanguage.g:1092:5: (lv_operator_1_1= '+=' | lv_operator_1_2= '=' | lv_operator_1_3= '?=' )
            {
            // InternalXtextGrammarTestLanguage.g:1092:5: (lv_operator_1_1= '+=' | lv_operator_1_2= '=' | lv_operator_1_3= '?=' )
            int alt29=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt29=1;
                }
                break;
            case 30:
                {
                alt29=2;
                }
                break;
            case 34:
                {
                alt29=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalXtextGrammarTestLanguage.g:1093:6: lv_operator_1_1= '+='
                    {
                    lv_operator_1_1=(Token)match(input,31,FOLLOW_27); 

                    						newLeafNode(lv_operator_1_1, grammarAccess.getAssignmentAccess().getOperatorPlusSignEqualsSignKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAssignmentRule());
                    						}
                    						setWithLastConsumed(current, "operator", lv_operator_1_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalXtextGrammarTestLanguage.g:1104:6: lv_operator_1_2= '='
                    {
                    lv_operator_1_2=(Token)match(input,30,FOLLOW_27); 

                    						newLeafNode(lv_operator_1_2, grammarAccess.getAssignmentAccess().getOperatorEqualsSignKeyword_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAssignmentRule());
                    						}
                    						setWithLastConsumed(current, "operator", lv_operator_1_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalXtextGrammarTestLanguage.g:1115:6: lv_operator_1_3= '?='
                    {
                    lv_operator_1_3=(Token)match(input,34,FOLLOW_27); 

                    						newLeafNode(lv_operator_1_3, grammarAccess.getAssignmentAccess().getOperatorQuestionMarkEqualsSignKeyword_1_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAssignmentRule());
                    						}
                    						setWithLastConsumed(current, "operator", lv_operator_1_3, null);
                    					

                    }
                    break;

            }


            }


            }

            // InternalXtextGrammarTestLanguage.g:1128:3: ( (lv_terminal_2_0= ruleAssignableTerminal ) )
            // InternalXtextGrammarTestLanguage.g:1129:4: (lv_terminal_2_0= ruleAssignableTerminal )
            {
            // InternalXtextGrammarTestLanguage.g:1129:4: (lv_terminal_2_0= ruleAssignableTerminal )
            // InternalXtextGrammarTestLanguage.g:1130:5: lv_terminal_2_0= ruleAssignableTerminal
            {

            					newCompositeNode(grammarAccess.getAssignmentAccess().getTerminalAssignableTerminalParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_terminal_2_0=ruleAssignableTerminal();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssignmentRule());
            					}
            					set(
            						current,
            						"terminal",
            						lv_terminal_2_0,
            						"org.eclipse.xtext.testlanguages.xtextgrammar.XtextGrammarTestLanguage.AssignableTerminal");
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
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleAssignableTerminal"
    // InternalXtextGrammarTestLanguage.g:1151:1: entryRuleAssignableTerminal returns [EObject current=null] : iv_ruleAssignableTerminal= ruleAssignableTerminal EOF ;
    public final EObject entryRuleAssignableTerminal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignableTerminal = null;


        try {
            // InternalXtextGrammarTestLanguage.g:1151:59: (iv_ruleAssignableTerminal= ruleAssignableTerminal EOF )
            // InternalXtextGrammarTestLanguage.g:1152:2: iv_ruleAssignableTerminal= ruleAssignableTerminal EOF
            {
             newCompositeNode(grammarAccess.getAssignableTerminalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssignableTerminal=ruleAssignableTerminal();

            state._fsp--;

             current =iv_ruleAssignableTerminal; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAssignableTerminal"


    // $ANTLR start "ruleAssignableTerminal"
    // InternalXtextGrammarTestLanguage.g:1158:1: ruleAssignableTerminal returns [EObject current=null] : (this_Keyword_0= ruleKeyword | this_RuleCall_1= ruleRuleCall | this_ParenthesizedAssignableElement_2= ruleParenthesizedAssignableElement | this_CrossReference_3= ruleCrossReference ) ;
    public final EObject ruleAssignableTerminal() throws RecognitionException {
        EObject current = null;

        EObject this_Keyword_0 = null;

        EObject this_RuleCall_1 = null;

        EObject this_ParenthesizedAssignableElement_2 = null;

        EObject this_CrossReference_3 = null;


        try {
            // InternalXtextGrammarTestLanguage.g:1159:1: ( (this_Keyword_0= ruleKeyword | this_RuleCall_1= ruleRuleCall | this_ParenthesizedAssignableElement_2= ruleParenthesizedAssignableElement | this_CrossReference_3= ruleCrossReference ) )
            // InternalXtextGrammarTestLanguage.g:1160:2: (this_Keyword_0= ruleKeyword | this_RuleCall_1= ruleRuleCall | this_ParenthesizedAssignableElement_2= ruleParenthesizedAssignableElement | this_CrossReference_3= ruleCrossReference )
            {
            // InternalXtextGrammarTestLanguage.g:1160:2: (this_Keyword_0= ruleKeyword | this_RuleCall_1= ruleRuleCall | this_ParenthesizedAssignableElement_2= ruleParenthesizedAssignableElement | this_CrossReference_3= ruleCrossReference )
            int alt30=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt30=1;
                }
                break;
            case RULE_ID:
                {
                alt30=2;
                }
                break;
            case 15:
                {
                alt30=3;
                }
                break;
            case 35:
                {
                alt30=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // InternalXtextGrammarTestLanguage.g:1161:3: this_Keyword_0= ruleKeyword
                    {

                    			newCompositeNode(grammarAccess.getAssignableTerminalAccess().getKeywordParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Keyword_0=ruleKeyword();

                    state._fsp--;


                    			current = this_Keyword_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalXtextGrammarTestLanguage.g:1170:3: this_RuleCall_1= ruleRuleCall
                    {

                    			newCompositeNode(grammarAccess.getAssignableTerminalAccess().getRuleCallParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RuleCall_1=ruleRuleCall();

                    state._fsp--;


                    			current = this_RuleCall_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalXtextGrammarTestLanguage.g:1179:3: this_ParenthesizedAssignableElement_2= ruleParenthesizedAssignableElement
                    {

                    			newCompositeNode(grammarAccess.getAssignableTerminalAccess().getParenthesizedAssignableElementParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParenthesizedAssignableElement_2=ruleParenthesizedAssignableElement();

                    state._fsp--;


                    			current = this_ParenthesizedAssignableElement_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalXtextGrammarTestLanguage.g:1188:3: this_CrossReference_3= ruleCrossReference
                    {

                    			newCompositeNode(grammarAccess.getAssignableTerminalAccess().getCrossReferenceParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_CrossReference_3=ruleCrossReference();

                    state._fsp--;


                    			current = this_CrossReference_3;
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
    // $ANTLR end "ruleAssignableTerminal"


    // $ANTLR start "entryRuleParenthesizedAssignableElement"
    // InternalXtextGrammarTestLanguage.g:1200:1: entryRuleParenthesizedAssignableElement returns [EObject current=null] : iv_ruleParenthesizedAssignableElement= ruleParenthesizedAssignableElement EOF ;
    public final EObject entryRuleParenthesizedAssignableElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesizedAssignableElement = null;


        try {
            // InternalXtextGrammarTestLanguage.g:1200:71: (iv_ruleParenthesizedAssignableElement= ruleParenthesizedAssignableElement EOF )
            // InternalXtextGrammarTestLanguage.g:1201:2: iv_ruleParenthesizedAssignableElement= ruleParenthesizedAssignableElement EOF
            {
             newCompositeNode(grammarAccess.getParenthesizedAssignableElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParenthesizedAssignableElement=ruleParenthesizedAssignableElement();

            state._fsp--;

             current =iv_ruleParenthesizedAssignableElement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleParenthesizedAssignableElement"


    // $ANTLR start "ruleParenthesizedAssignableElement"
    // InternalXtextGrammarTestLanguage.g:1207:1: ruleParenthesizedAssignableElement returns [EObject current=null] : (otherlv_0= '(' this_AssignableAlternatives_1= ruleAssignableAlternatives otherlv_2= ')' ) ;
    public final EObject ruleParenthesizedAssignableElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_AssignableAlternatives_1 = null;


        try {
            // InternalXtextGrammarTestLanguage.g:1208:1: ( (otherlv_0= '(' this_AssignableAlternatives_1= ruleAssignableAlternatives otherlv_2= ')' ) )
            // InternalXtextGrammarTestLanguage.g:1209:2: (otherlv_0= '(' this_AssignableAlternatives_1= ruleAssignableAlternatives otherlv_2= ')' )
            {
            // InternalXtextGrammarTestLanguage.g:1209:2: (otherlv_0= '(' this_AssignableAlternatives_1= ruleAssignableAlternatives otherlv_2= ')' )
            // InternalXtextGrammarTestLanguage.g:1210:3: otherlv_0= '(' this_AssignableAlternatives_1= ruleAssignableAlternatives otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_27); 

            			newLeafNode(otherlv_0, grammarAccess.getParenthesizedAssignableElementAccess().getLeftParenthesisKeyword_0());
            		

            			newCompositeNode(grammarAccess.getParenthesizedAssignableElementAccess().getAssignableAlternativesParserRuleCall_1());
            		
            pushFollow(FOLLOW_28);
            this_AssignableAlternatives_1=ruleAssignableAlternatives();

            state._fsp--;


            			current = this_AssignableAlternatives_1;
            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getParenthesizedAssignableElementAccess().getRightParenthesisKeyword_2());
            		

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
    // $ANTLR end "ruleParenthesizedAssignableElement"


    // $ANTLR start "entryRuleAssignableAlternatives"
    // InternalXtextGrammarTestLanguage.g:1230:1: entryRuleAssignableAlternatives returns [EObject current=null] : iv_ruleAssignableAlternatives= ruleAssignableAlternatives EOF ;
    public final EObject entryRuleAssignableAlternatives() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignableAlternatives = null;


        try {
            // InternalXtextGrammarTestLanguage.g:1230:63: (iv_ruleAssignableAlternatives= ruleAssignableAlternatives EOF )
            // InternalXtextGrammarTestLanguage.g:1231:2: iv_ruleAssignableAlternatives= ruleAssignableAlternatives EOF
            {
             newCompositeNode(grammarAccess.getAssignableAlternativesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssignableAlternatives=ruleAssignableAlternatives();

            state._fsp--;

             current =iv_ruleAssignableAlternatives; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAssignableAlternatives"


    // $ANTLR start "ruleAssignableAlternatives"
    // InternalXtextGrammarTestLanguage.g:1237:1: ruleAssignableAlternatives returns [EObject current=null] : (this_AssignableTerminal_0= ruleAssignableTerminal ( () (otherlv_2= '|' ( (lv_groups_3_0= ruleAssignableTerminal ) ) )+ )? ) ;
    public final EObject ruleAssignableAlternatives() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_AssignableTerminal_0 = null;

        EObject lv_groups_3_0 = null;


        try {
            // InternalXtextGrammarTestLanguage.g:1238:1: ( (this_AssignableTerminal_0= ruleAssignableTerminal ( () (otherlv_2= '|' ( (lv_groups_3_0= ruleAssignableTerminal ) ) )+ )? ) )
            // InternalXtextGrammarTestLanguage.g:1239:2: (this_AssignableTerminal_0= ruleAssignableTerminal ( () (otherlv_2= '|' ( (lv_groups_3_0= ruleAssignableTerminal ) ) )+ )? )
            {
            // InternalXtextGrammarTestLanguage.g:1239:2: (this_AssignableTerminal_0= ruleAssignableTerminal ( () (otherlv_2= '|' ( (lv_groups_3_0= ruleAssignableTerminal ) ) )+ )? )
            // InternalXtextGrammarTestLanguage.g:1240:3: this_AssignableTerminal_0= ruleAssignableTerminal ( () (otherlv_2= '|' ( (lv_groups_3_0= ruleAssignableTerminal ) ) )+ )?
            {

            			newCompositeNode(grammarAccess.getAssignableAlternativesAccess().getAssignableTerminalParserRuleCall_0());
            		
            pushFollow(FOLLOW_19);
            this_AssignableTerminal_0=ruleAssignableTerminal();

            state._fsp--;


            			current = this_AssignableTerminal_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalXtextGrammarTestLanguage.g:1248:3: ( () (otherlv_2= '|' ( (lv_groups_3_0= ruleAssignableTerminal ) ) )+ )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==25) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalXtextGrammarTestLanguage.g:1249:4: () (otherlv_2= '|' ( (lv_groups_3_0= ruleAssignableTerminal ) ) )+
                    {
                    // InternalXtextGrammarTestLanguage.g:1249:4: ()
                    // InternalXtextGrammarTestLanguage.g:1250:5: 
                    {

                    					current = forceCreateModelElementAndAdd(
                    						grammarAccess.getAssignableAlternativesAccess().getAlternativesGroupsAction_1_0(),
                    						current);
                    				

                    }

                    // InternalXtextGrammarTestLanguage.g:1256:4: (otherlv_2= '|' ( (lv_groups_3_0= ruleAssignableTerminal ) ) )+
                    int cnt31=0;
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==25) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // InternalXtextGrammarTestLanguage.g:1257:5: otherlv_2= '|' ( (lv_groups_3_0= ruleAssignableTerminal ) )
                    	    {
                    	    otherlv_2=(Token)match(input,25,FOLLOW_27); 

                    	    					newLeafNode(otherlv_2, grammarAccess.getAssignableAlternativesAccess().getVerticalLineKeyword_1_1_0());
                    	    				
                    	    // InternalXtextGrammarTestLanguage.g:1261:5: ( (lv_groups_3_0= ruleAssignableTerminal ) )
                    	    // InternalXtextGrammarTestLanguage.g:1262:6: (lv_groups_3_0= ruleAssignableTerminal )
                    	    {
                    	    // InternalXtextGrammarTestLanguage.g:1262:6: (lv_groups_3_0= ruleAssignableTerminal )
                    	    // InternalXtextGrammarTestLanguage.g:1263:7: lv_groups_3_0= ruleAssignableTerminal
                    	    {

                    	    							newCompositeNode(grammarAccess.getAssignableAlternativesAccess().getGroupsAssignableTerminalParserRuleCall_1_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_19);
                    	    lv_groups_3_0=ruleAssignableTerminal();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAssignableAlternativesRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"groups",
                    	    								lv_groups_3_0,
                    	    								"org.eclipse.xtext.testlanguages.xtextgrammar.XtextGrammarTestLanguage.AssignableTerminal");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt31 >= 1 ) break loop31;
                                EarlyExitException eee =
                                    new EarlyExitException(31, input);
                                throw eee;
                        }
                        cnt31++;
                    } while (true);


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
    // $ANTLR end "ruleAssignableAlternatives"


    // $ANTLR start "entryRuleCrossReference"
    // InternalXtextGrammarTestLanguage.g:1286:1: entryRuleCrossReference returns [EObject current=null] : iv_ruleCrossReference= ruleCrossReference EOF ;
    public final EObject entryRuleCrossReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCrossReference = null;


        try {
            // InternalXtextGrammarTestLanguage.g:1286:55: (iv_ruleCrossReference= ruleCrossReference EOF )
            // InternalXtextGrammarTestLanguage.g:1287:2: iv_ruleCrossReference= ruleCrossReference EOF
            {
             newCompositeNode(grammarAccess.getCrossReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCrossReference=ruleCrossReference();

            state._fsp--;

             current =iv_ruleCrossReference; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCrossReference"


    // $ANTLR start "ruleCrossReference"
    // InternalXtextGrammarTestLanguage.g:1293:1: ruleCrossReference returns [EObject current=null] : (otherlv_0= '[' ( (lv_type_1_0= ruleTypeRef ) ) (otherlv_2= '|' ( (lv_terminal_3_0= ruleCrossReferenceableTerminal ) ) )? otherlv_4= ']' ) ;
    public final EObject ruleCrossReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_type_1_0 = null;

        EObject lv_terminal_3_0 = null;


        try {
            // InternalXtextGrammarTestLanguage.g:1294:1: ( (otherlv_0= '[' ( (lv_type_1_0= ruleTypeRef ) ) (otherlv_2= '|' ( (lv_terminal_3_0= ruleCrossReferenceableTerminal ) ) )? otherlv_4= ']' ) )
            // InternalXtextGrammarTestLanguage.g:1295:2: (otherlv_0= '[' ( (lv_type_1_0= ruleTypeRef ) ) (otherlv_2= '|' ( (lv_terminal_3_0= ruleCrossReferenceableTerminal ) ) )? otherlv_4= ']' )
            {
            // InternalXtextGrammarTestLanguage.g:1295:2: (otherlv_0= '[' ( (lv_type_1_0= ruleTypeRef ) ) (otherlv_2= '|' ( (lv_terminal_3_0= ruleCrossReferenceableTerminal ) ) )? otherlv_4= ']' )
            // InternalXtextGrammarTestLanguage.g:1296:3: otherlv_0= '[' ( (lv_type_1_0= ruleTypeRef ) ) (otherlv_2= '|' ( (lv_terminal_3_0= ruleCrossReferenceableTerminal ) ) )? otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCrossReferenceAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalXtextGrammarTestLanguage.g:1300:3: ( (lv_type_1_0= ruleTypeRef ) )
            // InternalXtextGrammarTestLanguage.g:1301:4: (lv_type_1_0= ruleTypeRef )
            {
            // InternalXtextGrammarTestLanguage.g:1301:4: (lv_type_1_0= ruleTypeRef )
            // InternalXtextGrammarTestLanguage.g:1302:5: lv_type_1_0= ruleTypeRef
            {

            					newCompositeNode(grammarAccess.getCrossReferenceAccess().getTypeTypeRefParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_29);
            lv_type_1_0=ruleTypeRef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCrossReferenceRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"org.eclipse.xtext.testlanguages.xtextgrammar.XtextGrammarTestLanguage.TypeRef");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXtextGrammarTestLanguage.g:1319:3: (otherlv_2= '|' ( (lv_terminal_3_0= ruleCrossReferenceableTerminal ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==25) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalXtextGrammarTestLanguage.g:1320:4: otherlv_2= '|' ( (lv_terminal_3_0= ruleCrossReferenceableTerminal ) )
                    {
                    otherlv_2=(Token)match(input,25,FOLLOW_30); 

                    				newLeafNode(otherlv_2, grammarAccess.getCrossReferenceAccess().getVerticalLineKeyword_2_0());
                    			
                    // InternalXtextGrammarTestLanguage.g:1324:4: ( (lv_terminal_3_0= ruleCrossReferenceableTerminal ) )
                    // InternalXtextGrammarTestLanguage.g:1325:5: (lv_terminal_3_0= ruleCrossReferenceableTerminal )
                    {
                    // InternalXtextGrammarTestLanguage.g:1325:5: (lv_terminal_3_0= ruleCrossReferenceableTerminal )
                    // InternalXtextGrammarTestLanguage.g:1326:6: lv_terminal_3_0= ruleCrossReferenceableTerminal
                    {

                    						newCompositeNode(grammarAccess.getCrossReferenceAccess().getTerminalCrossReferenceableTerminalParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_terminal_3_0=ruleCrossReferenceableTerminal();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCrossReferenceRule());
                    						}
                    						set(
                    							current,
                    							"terminal",
                    							lv_terminal_3_0,
                    							"org.eclipse.xtext.testlanguages.xtextgrammar.XtextGrammarTestLanguage.CrossReferenceableTerminal");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,36,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getCrossReferenceAccess().getRightSquareBracketKeyword_3());
            		

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
    // $ANTLR end "ruleCrossReference"


    // $ANTLR start "entryRuleCrossReferenceableTerminal"
    // InternalXtextGrammarTestLanguage.g:1352:1: entryRuleCrossReferenceableTerminal returns [EObject current=null] : iv_ruleCrossReferenceableTerminal= ruleCrossReferenceableTerminal EOF ;
    public final EObject entryRuleCrossReferenceableTerminal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCrossReferenceableTerminal = null;


        try {
            // InternalXtextGrammarTestLanguage.g:1352:67: (iv_ruleCrossReferenceableTerminal= ruleCrossReferenceableTerminal EOF )
            // InternalXtextGrammarTestLanguage.g:1353:2: iv_ruleCrossReferenceableTerminal= ruleCrossReferenceableTerminal EOF
            {
             newCompositeNode(grammarAccess.getCrossReferenceableTerminalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCrossReferenceableTerminal=ruleCrossReferenceableTerminal();

            state._fsp--;

             current =iv_ruleCrossReferenceableTerminal; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCrossReferenceableTerminal"


    // $ANTLR start "ruleCrossReferenceableTerminal"
    // InternalXtextGrammarTestLanguage.g:1359:1: ruleCrossReferenceableTerminal returns [EObject current=null] : (this_Keyword_0= ruleKeyword | this_RuleCall_1= ruleRuleCall | this_ParenthesizedCrossReferenceableElement_2= ruleParenthesizedCrossReferenceableElement ) ;
    public final EObject ruleCrossReferenceableTerminal() throws RecognitionException {
        EObject current = null;

        EObject this_Keyword_0 = null;

        EObject this_RuleCall_1 = null;

        EObject this_ParenthesizedCrossReferenceableElement_2 = null;


        try {
            // InternalXtextGrammarTestLanguage.g:1360:1: ( (this_Keyword_0= ruleKeyword | this_RuleCall_1= ruleRuleCall | this_ParenthesizedCrossReferenceableElement_2= ruleParenthesizedCrossReferenceableElement ) )
            // InternalXtextGrammarTestLanguage.g:1361:2: (this_Keyword_0= ruleKeyword | this_RuleCall_1= ruleRuleCall | this_ParenthesizedCrossReferenceableElement_2= ruleParenthesizedCrossReferenceableElement )
            {
            // InternalXtextGrammarTestLanguage.g:1361:2: (this_Keyword_0= ruleKeyword | this_RuleCall_1= ruleRuleCall | this_ParenthesizedCrossReferenceableElement_2= ruleParenthesizedCrossReferenceableElement )
            int alt34=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt34=1;
                }
                break;
            case RULE_ID:
                {
                alt34=2;
                }
                break;
            case 15:
                {
                alt34=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // InternalXtextGrammarTestLanguage.g:1362:3: this_Keyword_0= ruleKeyword
                    {

                    			newCompositeNode(grammarAccess.getCrossReferenceableTerminalAccess().getKeywordParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Keyword_0=ruleKeyword();

                    state._fsp--;


                    			current = this_Keyword_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalXtextGrammarTestLanguage.g:1371:3: this_RuleCall_1= ruleRuleCall
                    {

                    			newCompositeNode(grammarAccess.getCrossReferenceableTerminalAccess().getRuleCallParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RuleCall_1=ruleRuleCall();

                    state._fsp--;


                    			current = this_RuleCall_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalXtextGrammarTestLanguage.g:1380:3: this_ParenthesizedCrossReferenceableElement_2= ruleParenthesizedCrossReferenceableElement
                    {

                    			newCompositeNode(grammarAccess.getCrossReferenceableTerminalAccess().getParenthesizedCrossReferenceableElementParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParenthesizedCrossReferenceableElement_2=ruleParenthesizedCrossReferenceableElement();

                    state._fsp--;


                    			current = this_ParenthesizedCrossReferenceableElement_2;
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
    // $ANTLR end "ruleCrossReferenceableTerminal"


    // $ANTLR start "entryRuleParenthesizedCrossReferenceableElement"
    // InternalXtextGrammarTestLanguage.g:1392:1: entryRuleParenthesizedCrossReferenceableElement returns [EObject current=null] : iv_ruleParenthesizedCrossReferenceableElement= ruleParenthesizedCrossReferenceableElement EOF ;
    public final EObject entryRuleParenthesizedCrossReferenceableElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesizedCrossReferenceableElement = null;


        try {
            // InternalXtextGrammarTestLanguage.g:1392:79: (iv_ruleParenthesizedCrossReferenceableElement= ruleParenthesizedCrossReferenceableElement EOF )
            // InternalXtextGrammarTestLanguage.g:1393:2: iv_ruleParenthesizedCrossReferenceableElement= ruleParenthesizedCrossReferenceableElement EOF
            {
             newCompositeNode(grammarAccess.getParenthesizedCrossReferenceableElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParenthesizedCrossReferenceableElement=ruleParenthesizedCrossReferenceableElement();

            state._fsp--;

             current =iv_ruleParenthesizedCrossReferenceableElement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleParenthesizedCrossReferenceableElement"


    // $ANTLR start "ruleParenthesizedCrossReferenceableElement"
    // InternalXtextGrammarTestLanguage.g:1399:1: ruleParenthesizedCrossReferenceableElement returns [EObject current=null] : (otherlv_0= '(' this_CrossReferenceableAlternatives_1= ruleCrossReferenceableAlternatives otherlv_2= ')' ) ;
    public final EObject ruleParenthesizedCrossReferenceableElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_CrossReferenceableAlternatives_1 = null;


        try {
            // InternalXtextGrammarTestLanguage.g:1400:1: ( (otherlv_0= '(' this_CrossReferenceableAlternatives_1= ruleCrossReferenceableAlternatives otherlv_2= ')' ) )
            // InternalXtextGrammarTestLanguage.g:1401:2: (otherlv_0= '(' this_CrossReferenceableAlternatives_1= ruleCrossReferenceableAlternatives otherlv_2= ')' )
            {
            // InternalXtextGrammarTestLanguage.g:1401:2: (otherlv_0= '(' this_CrossReferenceableAlternatives_1= ruleCrossReferenceableAlternatives otherlv_2= ')' )
            // InternalXtextGrammarTestLanguage.g:1402:3: otherlv_0= '(' this_CrossReferenceableAlternatives_1= ruleCrossReferenceableAlternatives otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_30); 

            			newLeafNode(otherlv_0, grammarAccess.getParenthesizedCrossReferenceableElementAccess().getLeftParenthesisKeyword_0());
            		

            			newCompositeNode(grammarAccess.getParenthesizedCrossReferenceableElementAccess().getCrossReferenceableAlternativesParserRuleCall_1());
            		
            pushFollow(FOLLOW_28);
            this_CrossReferenceableAlternatives_1=ruleCrossReferenceableAlternatives();

            state._fsp--;


            			current = this_CrossReferenceableAlternatives_1;
            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getParenthesizedCrossReferenceableElementAccess().getRightParenthesisKeyword_2());
            		

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
    // $ANTLR end "ruleParenthesizedCrossReferenceableElement"


    // $ANTLR start "entryRuleCrossReferenceableAlternatives"
    // InternalXtextGrammarTestLanguage.g:1422:1: entryRuleCrossReferenceableAlternatives returns [EObject current=null] : iv_ruleCrossReferenceableAlternatives= ruleCrossReferenceableAlternatives EOF ;
    public final EObject entryRuleCrossReferenceableAlternatives() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCrossReferenceableAlternatives = null;


        try {
            // InternalXtextGrammarTestLanguage.g:1422:71: (iv_ruleCrossReferenceableAlternatives= ruleCrossReferenceableAlternatives EOF )
            // InternalXtextGrammarTestLanguage.g:1423:2: iv_ruleCrossReferenceableAlternatives= ruleCrossReferenceableAlternatives EOF
            {
             newCompositeNode(grammarAccess.getCrossReferenceableAlternativesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCrossReferenceableAlternatives=ruleCrossReferenceableAlternatives();

            state._fsp--;

             current =iv_ruleCrossReferenceableAlternatives; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCrossReferenceableAlternatives"


    // $ANTLR start "ruleCrossReferenceableAlternatives"
    // InternalXtextGrammarTestLanguage.g:1429:1: ruleCrossReferenceableAlternatives returns [EObject current=null] : (this_CrossReferenceableTerminal_0= ruleCrossReferenceableTerminal ( () (otherlv_2= '|' ( (lv_groups_3_0= ruleCrossReferenceableTerminal ) ) )+ )? ) ;
    public final EObject ruleCrossReferenceableAlternatives() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_CrossReferenceableTerminal_0 = null;

        EObject lv_groups_3_0 = null;


        try {
            // InternalXtextGrammarTestLanguage.g:1430:1: ( (this_CrossReferenceableTerminal_0= ruleCrossReferenceableTerminal ( () (otherlv_2= '|' ( (lv_groups_3_0= ruleCrossReferenceableTerminal ) ) )+ )? ) )
            // InternalXtextGrammarTestLanguage.g:1431:2: (this_CrossReferenceableTerminal_0= ruleCrossReferenceableTerminal ( () (otherlv_2= '|' ( (lv_groups_3_0= ruleCrossReferenceableTerminal ) ) )+ )? )
            {
            // InternalXtextGrammarTestLanguage.g:1431:2: (this_CrossReferenceableTerminal_0= ruleCrossReferenceableTerminal ( () (otherlv_2= '|' ( (lv_groups_3_0= ruleCrossReferenceableTerminal ) ) )+ )? )
            // InternalXtextGrammarTestLanguage.g:1432:3: this_CrossReferenceableTerminal_0= ruleCrossReferenceableTerminal ( () (otherlv_2= '|' ( (lv_groups_3_0= ruleCrossReferenceableTerminal ) ) )+ )?
            {

            			newCompositeNode(grammarAccess.getCrossReferenceableAlternativesAccess().getCrossReferenceableTerminalParserRuleCall_0());
            		
            pushFollow(FOLLOW_19);
            this_CrossReferenceableTerminal_0=ruleCrossReferenceableTerminal();

            state._fsp--;


            			current = this_CrossReferenceableTerminal_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalXtextGrammarTestLanguage.g:1440:3: ( () (otherlv_2= '|' ( (lv_groups_3_0= ruleCrossReferenceableTerminal ) ) )+ )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==25) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalXtextGrammarTestLanguage.g:1441:4: () (otherlv_2= '|' ( (lv_groups_3_0= ruleCrossReferenceableTerminal ) ) )+
                    {
                    // InternalXtextGrammarTestLanguage.g:1441:4: ()
                    // InternalXtextGrammarTestLanguage.g:1442:5: 
                    {

                    					current = forceCreateModelElementAndAdd(
                    						grammarAccess.getCrossReferenceableAlternativesAccess().getAlternativesGroupsAction_1_0(),
                    						current);
                    				

                    }

                    // InternalXtextGrammarTestLanguage.g:1448:4: (otherlv_2= '|' ( (lv_groups_3_0= ruleCrossReferenceableTerminal ) ) )+
                    int cnt35=0;
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==25) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // InternalXtextGrammarTestLanguage.g:1449:5: otherlv_2= '|' ( (lv_groups_3_0= ruleCrossReferenceableTerminal ) )
                    	    {
                    	    otherlv_2=(Token)match(input,25,FOLLOW_30); 

                    	    					newLeafNode(otherlv_2, grammarAccess.getCrossReferenceableAlternativesAccess().getVerticalLineKeyword_1_1_0());
                    	    				
                    	    // InternalXtextGrammarTestLanguage.g:1453:5: ( (lv_groups_3_0= ruleCrossReferenceableTerminal ) )
                    	    // InternalXtextGrammarTestLanguage.g:1454:6: (lv_groups_3_0= ruleCrossReferenceableTerminal )
                    	    {
                    	    // InternalXtextGrammarTestLanguage.g:1454:6: (lv_groups_3_0= ruleCrossReferenceableTerminal )
                    	    // InternalXtextGrammarTestLanguage.g:1455:7: lv_groups_3_0= ruleCrossReferenceableTerminal
                    	    {

                    	    							newCompositeNode(grammarAccess.getCrossReferenceableAlternativesAccess().getGroupsCrossReferenceableTerminalParserRuleCall_1_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_19);
                    	    lv_groups_3_0=ruleCrossReferenceableTerminal();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCrossReferenceableAlternativesRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"groups",
                    	    								lv_groups_3_0,
                    	    								"org.eclipse.xtext.testlanguages.xtextgrammar.XtextGrammarTestLanguage.CrossReferenceableTerminal");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt35 >= 1 ) break loop35;
                                EarlyExitException eee =
                                    new EarlyExitException(35, input);
                                throw eee;
                        }
                        cnt35++;
                    } while (true);


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
    // $ANTLR end "ruleCrossReferenceableAlternatives"


    // $ANTLR start "entryRuleParenthesizedElement"
    // InternalXtextGrammarTestLanguage.g:1478:1: entryRuleParenthesizedElement returns [EObject current=null] : iv_ruleParenthesizedElement= ruleParenthesizedElement EOF ;
    public final EObject entryRuleParenthesizedElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesizedElement = null;


        try {
            // InternalXtextGrammarTestLanguage.g:1478:61: (iv_ruleParenthesizedElement= ruleParenthesizedElement EOF )
            // InternalXtextGrammarTestLanguage.g:1479:2: iv_ruleParenthesizedElement= ruleParenthesizedElement EOF
            {
             newCompositeNode(grammarAccess.getParenthesizedElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParenthesizedElement=ruleParenthesizedElement();

            state._fsp--;

             current =iv_ruleParenthesizedElement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleParenthesizedElement"


    // $ANTLR start "ruleParenthesizedElement"
    // InternalXtextGrammarTestLanguage.g:1485:1: ruleParenthesizedElement returns [EObject current=null] : (otherlv_0= '(' this_Alternatives_1= ruleAlternatives otherlv_2= ')' ) ;
    public final EObject ruleParenthesizedElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Alternatives_1 = null;


        try {
            // InternalXtextGrammarTestLanguage.g:1486:1: ( (otherlv_0= '(' this_Alternatives_1= ruleAlternatives otherlv_2= ')' ) )
            // InternalXtextGrammarTestLanguage.g:1487:2: (otherlv_0= '(' this_Alternatives_1= ruleAlternatives otherlv_2= ')' )
            {
            // InternalXtextGrammarTestLanguage.g:1487:2: (otherlv_0= '(' this_Alternatives_1= ruleAlternatives otherlv_2= ')' )
            // InternalXtextGrammarTestLanguage.g:1488:3: otherlv_0= '(' this_Alternatives_1= ruleAlternatives otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getParenthesizedElementAccess().getLeftParenthesisKeyword_0());
            		

            			newCompositeNode(grammarAccess.getParenthesizedElementAccess().getAlternativesParserRuleCall_1());
            		
            pushFollow(FOLLOW_28);
            this_Alternatives_1=ruleAlternatives();

            state._fsp--;


            			current = this_Alternatives_1;
            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getParenthesizedElementAccess().getRightParenthesisKeyword_2());
            		

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
    // $ANTLR end "ruleParenthesizedElement"


    // $ANTLR start "entryRuleTerminalRule"
    // InternalXtextGrammarTestLanguage.g:1508:1: entryRuleTerminalRule returns [EObject current=null] : iv_ruleTerminalRule= ruleTerminalRule EOF ;
    public final EObject entryRuleTerminalRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalRule = null;


        try {
            // InternalXtextGrammarTestLanguage.g:1508:53: (iv_ruleTerminalRule= ruleTerminalRule EOF )
            // InternalXtextGrammarTestLanguage.g:1509:2: iv_ruleTerminalRule= ruleTerminalRule EOF
            {
             newCompositeNode(grammarAccess.getTerminalRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTerminalRule=ruleTerminalRule();

            state._fsp--;

             current =iv_ruleTerminalRule; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTerminalRule"


    // $ANTLR start "ruleTerminalRule"
    // InternalXtextGrammarTestLanguage.g:1515:1: ruleTerminalRule returns [EObject current=null] : (otherlv_0= 'terminal' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'returns' ( (lv_type_3_0= ruleTypeRef ) ) )? otherlv_4= ':' ( (lv_alternatives_5_0= ruleTerminalAlternatives ) ) otherlv_6= ';' ) ;
    public final EObject ruleTerminalRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_type_3_0 = null;

        EObject lv_alternatives_5_0 = null;


        try {
            // InternalXtextGrammarTestLanguage.g:1516:1: ( (otherlv_0= 'terminal' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'returns' ( (lv_type_3_0= ruleTypeRef ) ) )? otherlv_4= ':' ( (lv_alternatives_5_0= ruleTerminalAlternatives ) ) otherlv_6= ';' ) )
            // InternalXtextGrammarTestLanguage.g:1517:2: (otherlv_0= 'terminal' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'returns' ( (lv_type_3_0= ruleTypeRef ) ) )? otherlv_4= ':' ( (lv_alternatives_5_0= ruleTerminalAlternatives ) ) otherlv_6= ';' )
            {
            // InternalXtextGrammarTestLanguage.g:1517:2: (otherlv_0= 'terminal' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'returns' ( (lv_type_3_0= ruleTypeRef ) ) )? otherlv_4= ':' ( (lv_alternatives_5_0= ruleTerminalAlternatives ) ) otherlv_6= ';' )
            // InternalXtextGrammarTestLanguage.g:1518:3: otherlv_0= 'terminal' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'returns' ( (lv_type_3_0= ruleTypeRef ) ) )? otherlv_4= ':' ( (lv_alternatives_5_0= ruleTerminalAlternatives ) ) otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTerminalRuleAccess().getTerminalKeyword_0());
            		
            // InternalXtextGrammarTestLanguage.g:1522:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalXtextGrammarTestLanguage.g:1523:4: (lv_name_1_0= RULE_ID )
            {
            // InternalXtextGrammarTestLanguage.g:1523:4: (lv_name_1_0= RULE_ID )
            // InternalXtextGrammarTestLanguage.g:1524:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_32); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTerminalRuleAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTerminalRuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalXtextGrammarTestLanguage.g:1540:3: (otherlv_2= 'returns' ( (lv_type_3_0= ruleTypeRef ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==21) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalXtextGrammarTestLanguage.g:1541:4: otherlv_2= 'returns' ( (lv_type_3_0= ruleTypeRef ) )
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getTerminalRuleAccess().getReturnsKeyword_2_0());
                    			
                    // InternalXtextGrammarTestLanguage.g:1545:4: ( (lv_type_3_0= ruleTypeRef ) )
                    // InternalXtextGrammarTestLanguage.g:1546:5: (lv_type_3_0= ruleTypeRef )
                    {
                    // InternalXtextGrammarTestLanguage.g:1546:5: (lv_type_3_0= ruleTypeRef )
                    // InternalXtextGrammarTestLanguage.g:1547:6: lv_type_3_0= ruleTypeRef
                    {

                    						newCompositeNode(grammarAccess.getTerminalRuleAccess().getTypeTypeRefParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_type_3_0=ruleTypeRef();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTerminalRuleRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_3_0,
                    							"org.eclipse.xtext.testlanguages.xtextgrammar.XtextGrammarTestLanguage.TypeRef");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,22,FOLLOW_33); 

            			newLeafNode(otherlv_4, grammarAccess.getTerminalRuleAccess().getColonKeyword_3());
            		
            // InternalXtextGrammarTestLanguage.g:1569:3: ( (lv_alternatives_5_0= ruleTerminalAlternatives ) )
            // InternalXtextGrammarTestLanguage.g:1570:4: (lv_alternatives_5_0= ruleTerminalAlternatives )
            {
            // InternalXtextGrammarTestLanguage.g:1570:4: (lv_alternatives_5_0= ruleTerminalAlternatives )
            // InternalXtextGrammarTestLanguage.g:1571:5: lv_alternatives_5_0= ruleTerminalAlternatives
            {

            					newCompositeNode(grammarAccess.getTerminalRuleAccess().getAlternativesTerminalAlternativesParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_17);
            lv_alternatives_5_0=ruleTerminalAlternatives();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTerminalRuleRule());
            					}
            					set(
            						current,
            						"alternatives",
            						lv_alternatives_5_0,
            						"org.eclipse.xtext.testlanguages.xtextgrammar.XtextGrammarTestLanguage.TerminalAlternatives");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getTerminalRuleAccess().getSemicolonKeyword_5());
            		

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
    // $ANTLR end "ruleTerminalRule"


    // $ANTLR start "entryRuleTerminalAlternatives"
    // InternalXtextGrammarTestLanguage.g:1596:1: entryRuleTerminalAlternatives returns [EObject current=null] : iv_ruleTerminalAlternatives= ruleTerminalAlternatives EOF ;
    public final EObject entryRuleTerminalAlternatives() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalAlternatives = null;


        try {
            // InternalXtextGrammarTestLanguage.g:1596:61: (iv_ruleTerminalAlternatives= ruleTerminalAlternatives EOF )
            // InternalXtextGrammarTestLanguage.g:1597:2: iv_ruleTerminalAlternatives= ruleTerminalAlternatives EOF
            {
             newCompositeNode(grammarAccess.getTerminalAlternativesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTerminalAlternatives=ruleTerminalAlternatives();

            state._fsp--;

             current =iv_ruleTerminalAlternatives; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTerminalAlternatives"


    // $ANTLR start "ruleTerminalAlternatives"
    // InternalXtextGrammarTestLanguage.g:1603:1: ruleTerminalAlternatives returns [EObject current=null] : (this_TerminalGroup_0= ruleTerminalGroup ( () (otherlv_2= '|' ( (lv_groups_3_0= ruleTerminalGroup ) ) )+ )? ) ;
    public final EObject ruleTerminalAlternatives() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_TerminalGroup_0 = null;

        EObject lv_groups_3_0 = null;


        try {
            // InternalXtextGrammarTestLanguage.g:1604:1: ( (this_TerminalGroup_0= ruleTerminalGroup ( () (otherlv_2= '|' ( (lv_groups_3_0= ruleTerminalGroup ) ) )+ )? ) )
            // InternalXtextGrammarTestLanguage.g:1605:2: (this_TerminalGroup_0= ruleTerminalGroup ( () (otherlv_2= '|' ( (lv_groups_3_0= ruleTerminalGroup ) ) )+ )? )
            {
            // InternalXtextGrammarTestLanguage.g:1605:2: (this_TerminalGroup_0= ruleTerminalGroup ( () (otherlv_2= '|' ( (lv_groups_3_0= ruleTerminalGroup ) ) )+ )? )
            // InternalXtextGrammarTestLanguage.g:1606:3: this_TerminalGroup_0= ruleTerminalGroup ( () (otherlv_2= '|' ( (lv_groups_3_0= ruleTerminalGroup ) ) )+ )?
            {

            			newCompositeNode(grammarAccess.getTerminalAlternativesAccess().getTerminalGroupParserRuleCall_0());
            		
            pushFollow(FOLLOW_19);
            this_TerminalGroup_0=ruleTerminalGroup();

            state._fsp--;


            			current = this_TerminalGroup_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalXtextGrammarTestLanguage.g:1614:3: ( () (otherlv_2= '|' ( (lv_groups_3_0= ruleTerminalGroup ) ) )+ )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==25) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalXtextGrammarTestLanguage.g:1615:4: () (otherlv_2= '|' ( (lv_groups_3_0= ruleTerminalGroup ) ) )+
                    {
                    // InternalXtextGrammarTestLanguage.g:1615:4: ()
                    // InternalXtextGrammarTestLanguage.g:1616:5: 
                    {

                    					current = forceCreateModelElementAndAdd(
                    						grammarAccess.getTerminalAlternativesAccess().getAlternativesGroupsAction_1_0(),
                    						current);
                    				

                    }

                    // InternalXtextGrammarTestLanguage.g:1622:4: (otherlv_2= '|' ( (lv_groups_3_0= ruleTerminalGroup ) ) )+
                    int cnt38=0;
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==25) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // InternalXtextGrammarTestLanguage.g:1623:5: otherlv_2= '|' ( (lv_groups_3_0= ruleTerminalGroup ) )
                    	    {
                    	    otherlv_2=(Token)match(input,25,FOLLOW_33); 

                    	    					newLeafNode(otherlv_2, grammarAccess.getTerminalAlternativesAccess().getVerticalLineKeyword_1_1_0());
                    	    				
                    	    // InternalXtextGrammarTestLanguage.g:1627:5: ( (lv_groups_3_0= ruleTerminalGroup ) )
                    	    // InternalXtextGrammarTestLanguage.g:1628:6: (lv_groups_3_0= ruleTerminalGroup )
                    	    {
                    	    // InternalXtextGrammarTestLanguage.g:1628:6: (lv_groups_3_0= ruleTerminalGroup )
                    	    // InternalXtextGrammarTestLanguage.g:1629:7: lv_groups_3_0= ruleTerminalGroup
                    	    {

                    	    							newCompositeNode(grammarAccess.getTerminalAlternativesAccess().getGroupsTerminalGroupParserRuleCall_1_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_19);
                    	    lv_groups_3_0=ruleTerminalGroup();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTerminalAlternativesRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"groups",
                    	    								lv_groups_3_0,
                    	    								"org.eclipse.xtext.testlanguages.xtextgrammar.XtextGrammarTestLanguage.TerminalGroup");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt38 >= 1 ) break loop38;
                                EarlyExitException eee =
                                    new EarlyExitException(38, input);
                                throw eee;
                        }
                        cnt38++;
                    } while (true);


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
    // $ANTLR end "ruleTerminalAlternatives"


    // $ANTLR start "entryRuleTerminalGroup"
    // InternalXtextGrammarTestLanguage.g:1652:1: entryRuleTerminalGroup returns [EObject current=null] : iv_ruleTerminalGroup= ruleTerminalGroup EOF ;
    public final EObject entryRuleTerminalGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalGroup = null;


        try {
            // InternalXtextGrammarTestLanguage.g:1652:54: (iv_ruleTerminalGroup= ruleTerminalGroup EOF )
            // InternalXtextGrammarTestLanguage.g:1653:2: iv_ruleTerminalGroup= ruleTerminalGroup EOF
            {
             newCompositeNode(grammarAccess.getTerminalGroupRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTerminalGroup=ruleTerminalGroup();

            state._fsp--;

             current =iv_ruleTerminalGroup; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTerminalGroup"


    // $ANTLR start "ruleTerminalGroup"
    // InternalXtextGrammarTestLanguage.g:1659:1: ruleTerminalGroup returns [EObject current=null] : (this_TerminalToken_0= ruleTerminalToken ( () ( (lv_tokens_2_0= ruleTerminalToken ) )+ )? ) ;
    public final EObject ruleTerminalGroup() throws RecognitionException {
        EObject current = null;

        EObject this_TerminalToken_0 = null;

        EObject lv_tokens_2_0 = null;


        try {
            // InternalXtextGrammarTestLanguage.g:1660:1: ( (this_TerminalToken_0= ruleTerminalToken ( () ( (lv_tokens_2_0= ruleTerminalToken ) )+ )? ) )
            // InternalXtextGrammarTestLanguage.g:1661:2: (this_TerminalToken_0= ruleTerminalToken ( () ( (lv_tokens_2_0= ruleTerminalToken ) )+ )? )
            {
            // InternalXtextGrammarTestLanguage.g:1661:2: (this_TerminalToken_0= ruleTerminalToken ( () ( (lv_tokens_2_0= ruleTerminalToken ) )+ )? )
            // InternalXtextGrammarTestLanguage.g:1662:3: this_TerminalToken_0= ruleTerminalToken ( () ( (lv_tokens_2_0= ruleTerminalToken ) )+ )?
            {

            			newCompositeNode(grammarAccess.getTerminalGroupAccess().getTerminalTokenParserRuleCall_0());
            		
            pushFollow(FOLLOW_34);
            this_TerminalToken_0=ruleTerminalToken();

            state._fsp--;


            			current = this_TerminalToken_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalXtextGrammarTestLanguage.g:1670:3: ( () ( (lv_tokens_2_0= ruleTerminalToken ) )+ )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=RULE_ID && LA41_0<=RULE_STRING)||LA41_0==15||LA41_0==17||(LA41_0>=38 && LA41_0<=39)) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalXtextGrammarTestLanguage.g:1671:4: () ( (lv_tokens_2_0= ruleTerminalToken ) )+
                    {
                    // InternalXtextGrammarTestLanguage.g:1671:4: ()
                    // InternalXtextGrammarTestLanguage.g:1672:5: 
                    {

                    					current = forceCreateModelElementAndAdd(
                    						grammarAccess.getTerminalGroupAccess().getGroupTokensAction_1_0(),
                    						current);
                    				

                    }

                    // InternalXtextGrammarTestLanguage.g:1678:4: ( (lv_tokens_2_0= ruleTerminalToken ) )+
                    int cnt40=0;
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( ((LA40_0>=RULE_ID && LA40_0<=RULE_STRING)||LA40_0==15||LA40_0==17||(LA40_0>=38 && LA40_0<=39)) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // InternalXtextGrammarTestLanguage.g:1679:5: (lv_tokens_2_0= ruleTerminalToken )
                    	    {
                    	    // InternalXtextGrammarTestLanguage.g:1679:5: (lv_tokens_2_0= ruleTerminalToken )
                    	    // InternalXtextGrammarTestLanguage.g:1680:6: lv_tokens_2_0= ruleTerminalToken
                    	    {

                    	    						newCompositeNode(grammarAccess.getTerminalGroupAccess().getTokensTerminalTokenParserRuleCall_1_1_0());
                    	    					
                    	    pushFollow(FOLLOW_34);
                    	    lv_tokens_2_0=ruleTerminalToken();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getTerminalGroupRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"tokens",
                    	    							lv_tokens_2_0,
                    	    							"org.eclipse.xtext.testlanguages.xtextgrammar.XtextGrammarTestLanguage.TerminalToken");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt40 >= 1 ) break loop40;
                                EarlyExitException eee =
                                    new EarlyExitException(40, input);
                                throw eee;
                        }
                        cnt40++;
                    } while (true);


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
    // $ANTLR end "ruleTerminalGroup"


    // $ANTLR start "entryRuleTerminalToken"
    // InternalXtextGrammarTestLanguage.g:1702:1: entryRuleTerminalToken returns [EObject current=null] : iv_ruleTerminalToken= ruleTerminalToken EOF ;
    public final EObject entryRuleTerminalToken() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalToken = null;


        try {
            // InternalXtextGrammarTestLanguage.g:1702:54: (iv_ruleTerminalToken= ruleTerminalToken EOF )
            // InternalXtextGrammarTestLanguage.g:1703:2: iv_ruleTerminalToken= ruleTerminalToken EOF
            {
             newCompositeNode(grammarAccess.getTerminalTokenRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTerminalToken=ruleTerminalToken();

            state._fsp--;

             current =iv_ruleTerminalToken; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTerminalToken"


    // $ANTLR start "ruleTerminalToken"
    // InternalXtextGrammarTestLanguage.g:1709:1: ruleTerminalToken returns [EObject current=null] : (this_TerminalTokenElement_0= ruleTerminalTokenElement ( ( (lv_cardinality_1_1= '?' | lv_cardinality_1_2= '*' | lv_cardinality_1_3= '+' ) ) )? ) ;
    public final EObject ruleTerminalToken() throws RecognitionException {
        EObject current = null;

        Token lv_cardinality_1_1=null;
        Token lv_cardinality_1_2=null;
        Token lv_cardinality_1_3=null;
        EObject this_TerminalTokenElement_0 = null;


        try {
            // InternalXtextGrammarTestLanguage.g:1710:1: ( (this_TerminalTokenElement_0= ruleTerminalTokenElement ( ( (lv_cardinality_1_1= '?' | lv_cardinality_1_2= '*' | lv_cardinality_1_3= '+' ) ) )? ) )
            // InternalXtextGrammarTestLanguage.g:1711:2: (this_TerminalTokenElement_0= ruleTerminalTokenElement ( ( (lv_cardinality_1_1= '?' | lv_cardinality_1_2= '*' | lv_cardinality_1_3= '+' ) ) )? )
            {
            // InternalXtextGrammarTestLanguage.g:1711:2: (this_TerminalTokenElement_0= ruleTerminalTokenElement ( ( (lv_cardinality_1_1= '?' | lv_cardinality_1_2= '*' | lv_cardinality_1_3= '+' ) ) )? )
            // InternalXtextGrammarTestLanguage.g:1712:3: this_TerminalTokenElement_0= ruleTerminalTokenElement ( ( (lv_cardinality_1_1= '?' | lv_cardinality_1_2= '*' | lv_cardinality_1_3= '+' ) ) )?
            {

            			newCompositeNode(grammarAccess.getTerminalTokenAccess().getTerminalTokenElementParserRuleCall_0());
            		
            pushFollow(FOLLOW_21);
            this_TerminalTokenElement_0=ruleTerminalTokenElement();

            state._fsp--;


            			current = this_TerminalTokenElement_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalXtextGrammarTestLanguage.g:1720:3: ( ( (lv_cardinality_1_1= '?' | lv_cardinality_1_2= '*' | lv_cardinality_1_3= '+' ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( ((LA43_0>=26 && LA43_0<=28)) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalXtextGrammarTestLanguage.g:1721:4: ( (lv_cardinality_1_1= '?' | lv_cardinality_1_2= '*' | lv_cardinality_1_3= '+' ) )
                    {
                    // InternalXtextGrammarTestLanguage.g:1721:4: ( (lv_cardinality_1_1= '?' | lv_cardinality_1_2= '*' | lv_cardinality_1_3= '+' ) )
                    // InternalXtextGrammarTestLanguage.g:1722:5: (lv_cardinality_1_1= '?' | lv_cardinality_1_2= '*' | lv_cardinality_1_3= '+' )
                    {
                    // InternalXtextGrammarTestLanguage.g:1722:5: (lv_cardinality_1_1= '?' | lv_cardinality_1_2= '*' | lv_cardinality_1_3= '+' )
                    int alt42=3;
                    switch ( input.LA(1) ) {
                    case 26:
                        {
                        alt42=1;
                        }
                        break;
                    case 27:
                        {
                        alt42=2;
                        }
                        break;
                    case 28:
                        {
                        alt42=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 42, 0, input);

                        throw nvae;
                    }

                    switch (alt42) {
                        case 1 :
                            // InternalXtextGrammarTestLanguage.g:1723:6: lv_cardinality_1_1= '?'
                            {
                            lv_cardinality_1_1=(Token)match(input,26,FOLLOW_2); 

                            						newLeafNode(lv_cardinality_1_1, grammarAccess.getTerminalTokenAccess().getCardinalityQuestionMarkKeyword_1_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getTerminalTokenRule());
                            						}
                            						setWithLastConsumed(current, "cardinality", lv_cardinality_1_1, null);
                            					

                            }
                            break;
                        case 2 :
                            // InternalXtextGrammarTestLanguage.g:1734:6: lv_cardinality_1_2= '*'
                            {
                            lv_cardinality_1_2=(Token)match(input,27,FOLLOW_2); 

                            						newLeafNode(lv_cardinality_1_2, grammarAccess.getTerminalTokenAccess().getCardinalityAsteriskKeyword_1_0_1());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getTerminalTokenRule());
                            						}
                            						setWithLastConsumed(current, "cardinality", lv_cardinality_1_2, null);
                            					

                            }
                            break;
                        case 3 :
                            // InternalXtextGrammarTestLanguage.g:1745:6: lv_cardinality_1_3= '+'
                            {
                            lv_cardinality_1_3=(Token)match(input,28,FOLLOW_2); 

                            						newLeafNode(lv_cardinality_1_3, grammarAccess.getTerminalTokenAccess().getCardinalityPlusSignKeyword_1_0_2());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getTerminalTokenRule());
                            						}
                            						setWithLastConsumed(current, "cardinality", lv_cardinality_1_3, null);
                            					

                            }
                            break;

                    }


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
    // $ANTLR end "ruleTerminalToken"


    // $ANTLR start "entryRuleTerminalTokenElement"
    // InternalXtextGrammarTestLanguage.g:1762:1: entryRuleTerminalTokenElement returns [EObject current=null] : iv_ruleTerminalTokenElement= ruleTerminalTokenElement EOF ;
    public final EObject entryRuleTerminalTokenElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalTokenElement = null;


        try {
            // InternalXtextGrammarTestLanguage.g:1762:61: (iv_ruleTerminalTokenElement= ruleTerminalTokenElement EOF )
            // InternalXtextGrammarTestLanguage.g:1763:2: iv_ruleTerminalTokenElement= ruleTerminalTokenElement EOF
            {
             newCompositeNode(grammarAccess.getTerminalTokenElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTerminalTokenElement=ruleTerminalTokenElement();

            state._fsp--;

             current =iv_ruleTerminalTokenElement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTerminalTokenElement"


    // $ANTLR start "ruleTerminalTokenElement"
    // InternalXtextGrammarTestLanguage.g:1769:1: ruleTerminalTokenElement returns [EObject current=null] : (this_CharacterRange_0= ruleCharacterRange | this_RuleCall_1= ruleRuleCall | this_ParenthesizedTerminalElement_2= ruleParenthesizedTerminalElement | this_AbstractNegatedToken_3= ruleAbstractNegatedToken | this_Wildcard_4= ruleWildcard ) ;
    public final EObject ruleTerminalTokenElement() throws RecognitionException {
        EObject current = null;

        EObject this_CharacterRange_0 = null;

        EObject this_RuleCall_1 = null;

        EObject this_ParenthesizedTerminalElement_2 = null;

        EObject this_AbstractNegatedToken_3 = null;

        EObject this_Wildcard_4 = null;


        try {
            // InternalXtextGrammarTestLanguage.g:1770:1: ( (this_CharacterRange_0= ruleCharacterRange | this_RuleCall_1= ruleRuleCall | this_ParenthesizedTerminalElement_2= ruleParenthesizedTerminalElement | this_AbstractNegatedToken_3= ruleAbstractNegatedToken | this_Wildcard_4= ruleWildcard ) )
            // InternalXtextGrammarTestLanguage.g:1771:2: (this_CharacterRange_0= ruleCharacterRange | this_RuleCall_1= ruleRuleCall | this_ParenthesizedTerminalElement_2= ruleParenthesizedTerminalElement | this_AbstractNegatedToken_3= ruleAbstractNegatedToken | this_Wildcard_4= ruleWildcard )
            {
            // InternalXtextGrammarTestLanguage.g:1771:2: (this_CharacterRange_0= ruleCharacterRange | this_RuleCall_1= ruleRuleCall | this_ParenthesizedTerminalElement_2= ruleParenthesizedTerminalElement | this_AbstractNegatedToken_3= ruleAbstractNegatedToken | this_Wildcard_4= ruleWildcard )
            int alt44=5;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt44=1;
                }
                break;
            case RULE_ID:
                {
                alt44=2;
                }
                break;
            case 15:
                {
                alt44=3;
                }
                break;
            case 38:
            case 39:
                {
                alt44=4;
                }
                break;
            case 17:
                {
                alt44=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // InternalXtextGrammarTestLanguage.g:1772:3: this_CharacterRange_0= ruleCharacterRange
                    {

                    			newCompositeNode(grammarAccess.getTerminalTokenElementAccess().getCharacterRangeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_CharacterRange_0=ruleCharacterRange();

                    state._fsp--;


                    			current = this_CharacterRange_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalXtextGrammarTestLanguage.g:1781:3: this_RuleCall_1= ruleRuleCall
                    {

                    			newCompositeNode(grammarAccess.getTerminalTokenElementAccess().getRuleCallParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RuleCall_1=ruleRuleCall();

                    state._fsp--;


                    			current = this_RuleCall_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalXtextGrammarTestLanguage.g:1790:3: this_ParenthesizedTerminalElement_2= ruleParenthesizedTerminalElement
                    {

                    			newCompositeNode(grammarAccess.getTerminalTokenElementAccess().getParenthesizedTerminalElementParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParenthesizedTerminalElement_2=ruleParenthesizedTerminalElement();

                    state._fsp--;


                    			current = this_ParenthesizedTerminalElement_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalXtextGrammarTestLanguage.g:1799:3: this_AbstractNegatedToken_3= ruleAbstractNegatedToken
                    {

                    			newCompositeNode(grammarAccess.getTerminalTokenElementAccess().getAbstractNegatedTokenParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_AbstractNegatedToken_3=ruleAbstractNegatedToken();

                    state._fsp--;


                    			current = this_AbstractNegatedToken_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalXtextGrammarTestLanguage.g:1808:3: this_Wildcard_4= ruleWildcard
                    {

                    			newCompositeNode(grammarAccess.getTerminalTokenElementAccess().getWildcardParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Wildcard_4=ruleWildcard();

                    state._fsp--;


                    			current = this_Wildcard_4;
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
    // $ANTLR end "ruleTerminalTokenElement"


    // $ANTLR start "entryRuleParenthesizedTerminalElement"
    // InternalXtextGrammarTestLanguage.g:1820:1: entryRuleParenthesizedTerminalElement returns [EObject current=null] : iv_ruleParenthesizedTerminalElement= ruleParenthesizedTerminalElement EOF ;
    public final EObject entryRuleParenthesizedTerminalElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesizedTerminalElement = null;


        try {
            // InternalXtextGrammarTestLanguage.g:1820:69: (iv_ruleParenthesizedTerminalElement= ruleParenthesizedTerminalElement EOF )
            // InternalXtextGrammarTestLanguage.g:1821:2: iv_ruleParenthesizedTerminalElement= ruleParenthesizedTerminalElement EOF
            {
             newCompositeNode(grammarAccess.getParenthesizedTerminalElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParenthesizedTerminalElement=ruleParenthesizedTerminalElement();

            state._fsp--;

             current =iv_ruleParenthesizedTerminalElement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleParenthesizedTerminalElement"


    // $ANTLR start "ruleParenthesizedTerminalElement"
    // InternalXtextGrammarTestLanguage.g:1827:1: ruleParenthesizedTerminalElement returns [EObject current=null] : (otherlv_0= '(' this_TerminalAlternatives_1= ruleTerminalAlternatives otherlv_2= ')' ) ;
    public final EObject ruleParenthesizedTerminalElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_TerminalAlternatives_1 = null;


        try {
            // InternalXtextGrammarTestLanguage.g:1828:1: ( (otherlv_0= '(' this_TerminalAlternatives_1= ruleTerminalAlternatives otherlv_2= ')' ) )
            // InternalXtextGrammarTestLanguage.g:1829:2: (otherlv_0= '(' this_TerminalAlternatives_1= ruleTerminalAlternatives otherlv_2= ')' )
            {
            // InternalXtextGrammarTestLanguage.g:1829:2: (otherlv_0= '(' this_TerminalAlternatives_1= ruleTerminalAlternatives otherlv_2= ')' )
            // InternalXtextGrammarTestLanguage.g:1830:3: otherlv_0= '(' this_TerminalAlternatives_1= ruleTerminalAlternatives otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_33); 

            			newLeafNode(otherlv_0, grammarAccess.getParenthesizedTerminalElementAccess().getLeftParenthesisKeyword_0());
            		

            			newCompositeNode(grammarAccess.getParenthesizedTerminalElementAccess().getTerminalAlternativesParserRuleCall_1());
            		
            pushFollow(FOLLOW_28);
            this_TerminalAlternatives_1=ruleTerminalAlternatives();

            state._fsp--;


            			current = this_TerminalAlternatives_1;
            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getParenthesizedTerminalElementAccess().getRightParenthesisKeyword_2());
            		

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
    // $ANTLR end "ruleParenthesizedTerminalElement"


    // $ANTLR start "entryRuleAbstractNegatedToken"
    // InternalXtextGrammarTestLanguage.g:1850:1: entryRuleAbstractNegatedToken returns [EObject current=null] : iv_ruleAbstractNegatedToken= ruleAbstractNegatedToken EOF ;
    public final EObject entryRuleAbstractNegatedToken() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractNegatedToken = null;


        try {
            // InternalXtextGrammarTestLanguage.g:1850:61: (iv_ruleAbstractNegatedToken= ruleAbstractNegatedToken EOF )
            // InternalXtextGrammarTestLanguage.g:1851:2: iv_ruleAbstractNegatedToken= ruleAbstractNegatedToken EOF
            {
             newCompositeNode(grammarAccess.getAbstractNegatedTokenRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractNegatedToken=ruleAbstractNegatedToken();

            state._fsp--;

             current =iv_ruleAbstractNegatedToken; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAbstractNegatedToken"


    // $ANTLR start "ruleAbstractNegatedToken"
    // InternalXtextGrammarTestLanguage.g:1857:1: ruleAbstractNegatedToken returns [EObject current=null] : (this_NegatedToken_0= ruleNegatedToken | this_UntilToken_1= ruleUntilToken ) ;
    public final EObject ruleAbstractNegatedToken() throws RecognitionException {
        EObject current = null;

        EObject this_NegatedToken_0 = null;

        EObject this_UntilToken_1 = null;


        try {
            // InternalXtextGrammarTestLanguage.g:1858:1: ( (this_NegatedToken_0= ruleNegatedToken | this_UntilToken_1= ruleUntilToken ) )
            // InternalXtextGrammarTestLanguage.g:1859:2: (this_NegatedToken_0= ruleNegatedToken | this_UntilToken_1= ruleUntilToken )
            {
            // InternalXtextGrammarTestLanguage.g:1859:2: (this_NegatedToken_0= ruleNegatedToken | this_UntilToken_1= ruleUntilToken )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==38) ) {
                alt45=1;
            }
            else if ( (LA45_0==39) ) {
                alt45=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // InternalXtextGrammarTestLanguage.g:1860:3: this_NegatedToken_0= ruleNegatedToken
                    {

                    			newCompositeNode(grammarAccess.getAbstractNegatedTokenAccess().getNegatedTokenParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_NegatedToken_0=ruleNegatedToken();

                    state._fsp--;


                    			current = this_NegatedToken_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalXtextGrammarTestLanguage.g:1869:3: this_UntilToken_1= ruleUntilToken
                    {

                    			newCompositeNode(grammarAccess.getAbstractNegatedTokenAccess().getUntilTokenParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_UntilToken_1=ruleUntilToken();

                    state._fsp--;


                    			current = this_UntilToken_1;
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
    // $ANTLR end "ruleAbstractNegatedToken"


    // $ANTLR start "entryRuleNegatedToken"
    // InternalXtextGrammarTestLanguage.g:1881:1: entryRuleNegatedToken returns [EObject current=null] : iv_ruleNegatedToken= ruleNegatedToken EOF ;
    public final EObject entryRuleNegatedToken() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegatedToken = null;


        try {
            // InternalXtextGrammarTestLanguage.g:1881:53: (iv_ruleNegatedToken= ruleNegatedToken EOF )
            // InternalXtextGrammarTestLanguage.g:1882:2: iv_ruleNegatedToken= ruleNegatedToken EOF
            {
             newCompositeNode(grammarAccess.getNegatedTokenRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNegatedToken=ruleNegatedToken();

            state._fsp--;

             current =iv_ruleNegatedToken; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNegatedToken"


    // $ANTLR start "ruleNegatedToken"
    // InternalXtextGrammarTestLanguage.g:1888:1: ruleNegatedToken returns [EObject current=null] : (otherlv_0= '!' ( (lv_terminal_1_0= ruleTerminalTokenElement ) ) ) ;
    public final EObject ruleNegatedToken() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_terminal_1_0 = null;


        try {
            // InternalXtextGrammarTestLanguage.g:1889:1: ( (otherlv_0= '!' ( (lv_terminal_1_0= ruleTerminalTokenElement ) ) ) )
            // InternalXtextGrammarTestLanguage.g:1890:2: (otherlv_0= '!' ( (lv_terminal_1_0= ruleTerminalTokenElement ) ) )
            {
            // InternalXtextGrammarTestLanguage.g:1890:2: (otherlv_0= '!' ( (lv_terminal_1_0= ruleTerminalTokenElement ) ) )
            // InternalXtextGrammarTestLanguage.g:1891:3: otherlv_0= '!' ( (lv_terminal_1_0= ruleTerminalTokenElement ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_33); 

            			newLeafNode(otherlv_0, grammarAccess.getNegatedTokenAccess().getExclamationMarkKeyword_0());
            		
            // InternalXtextGrammarTestLanguage.g:1895:3: ( (lv_terminal_1_0= ruleTerminalTokenElement ) )
            // InternalXtextGrammarTestLanguage.g:1896:4: (lv_terminal_1_0= ruleTerminalTokenElement )
            {
            // InternalXtextGrammarTestLanguage.g:1896:4: (lv_terminal_1_0= ruleTerminalTokenElement )
            // InternalXtextGrammarTestLanguage.g:1897:5: lv_terminal_1_0= ruleTerminalTokenElement
            {

            					newCompositeNode(grammarAccess.getNegatedTokenAccess().getTerminalTerminalTokenElementParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_terminal_1_0=ruleTerminalTokenElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNegatedTokenRule());
            					}
            					set(
            						current,
            						"terminal",
            						lv_terminal_1_0,
            						"org.eclipse.xtext.testlanguages.xtextgrammar.XtextGrammarTestLanguage.TerminalTokenElement");
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
    // $ANTLR end "ruleNegatedToken"


    // $ANTLR start "entryRuleUntilToken"
    // InternalXtextGrammarTestLanguage.g:1918:1: entryRuleUntilToken returns [EObject current=null] : iv_ruleUntilToken= ruleUntilToken EOF ;
    public final EObject entryRuleUntilToken() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUntilToken = null;


        try {
            // InternalXtextGrammarTestLanguage.g:1918:51: (iv_ruleUntilToken= ruleUntilToken EOF )
            // InternalXtextGrammarTestLanguage.g:1919:2: iv_ruleUntilToken= ruleUntilToken EOF
            {
             newCompositeNode(grammarAccess.getUntilTokenRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUntilToken=ruleUntilToken();

            state._fsp--;

             current =iv_ruleUntilToken; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleUntilToken"


    // $ANTLR start "ruleUntilToken"
    // InternalXtextGrammarTestLanguage.g:1925:1: ruleUntilToken returns [EObject current=null] : (otherlv_0= '->' ( (lv_terminal_1_0= ruleTerminalTokenElement ) ) ) ;
    public final EObject ruleUntilToken() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_terminal_1_0 = null;


        try {
            // InternalXtextGrammarTestLanguage.g:1926:1: ( (otherlv_0= '->' ( (lv_terminal_1_0= ruleTerminalTokenElement ) ) ) )
            // InternalXtextGrammarTestLanguage.g:1927:2: (otherlv_0= '->' ( (lv_terminal_1_0= ruleTerminalTokenElement ) ) )
            {
            // InternalXtextGrammarTestLanguage.g:1927:2: (otherlv_0= '->' ( (lv_terminal_1_0= ruleTerminalTokenElement ) ) )
            // InternalXtextGrammarTestLanguage.g:1928:3: otherlv_0= '->' ( (lv_terminal_1_0= ruleTerminalTokenElement ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_33); 

            			newLeafNode(otherlv_0, grammarAccess.getUntilTokenAccess().getHyphenMinusGreaterThanSignKeyword_0());
            		
            // InternalXtextGrammarTestLanguage.g:1932:3: ( (lv_terminal_1_0= ruleTerminalTokenElement ) )
            // InternalXtextGrammarTestLanguage.g:1933:4: (lv_terminal_1_0= ruleTerminalTokenElement )
            {
            // InternalXtextGrammarTestLanguage.g:1933:4: (lv_terminal_1_0= ruleTerminalTokenElement )
            // InternalXtextGrammarTestLanguage.g:1934:5: lv_terminal_1_0= ruleTerminalTokenElement
            {

            					newCompositeNode(grammarAccess.getUntilTokenAccess().getTerminalTerminalTokenElementParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_terminal_1_0=ruleTerminalTokenElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUntilTokenRule());
            					}
            					set(
            						current,
            						"terminal",
            						lv_terminal_1_0,
            						"org.eclipse.xtext.testlanguages.xtextgrammar.XtextGrammarTestLanguage.TerminalTokenElement");
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
    // $ANTLR end "ruleUntilToken"


    // $ANTLR start "entryRuleWildcard"
    // InternalXtextGrammarTestLanguage.g:1955:1: entryRuleWildcard returns [EObject current=null] : iv_ruleWildcard= ruleWildcard EOF ;
    public final EObject entryRuleWildcard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWildcard = null;


        try {
            // InternalXtextGrammarTestLanguage.g:1955:49: (iv_ruleWildcard= ruleWildcard EOF )
            // InternalXtextGrammarTestLanguage.g:1956:2: iv_ruleWildcard= ruleWildcard EOF
            {
             newCompositeNode(grammarAccess.getWildcardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWildcard=ruleWildcard();

            state._fsp--;

             current =iv_ruleWildcard; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleWildcard"


    // $ANTLR start "ruleWildcard"
    // InternalXtextGrammarTestLanguage.g:1962:1: ruleWildcard returns [EObject current=null] : ( () otherlv_1= '.' ) ;
    public final EObject ruleWildcard() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

        try {
            // InternalXtextGrammarTestLanguage.g:1963:1: ( ( () otherlv_1= '.' ) )
            // InternalXtextGrammarTestLanguage.g:1964:2: ( () otherlv_1= '.' )
            {
            // InternalXtextGrammarTestLanguage.g:1964:2: ( () otherlv_1= '.' )
            // InternalXtextGrammarTestLanguage.g:1965:3: () otherlv_1= '.'
            {
            // InternalXtextGrammarTestLanguage.g:1965:3: ()
            // InternalXtextGrammarTestLanguage.g:1966:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getWildcardAccess().getWildcardAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getWildcardAccess().getFullStopKeyword_1());
            		

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
    // $ANTLR end "ruleWildcard"


    // $ANTLR start "entryRuleCharacterRange"
    // InternalXtextGrammarTestLanguage.g:1980:1: entryRuleCharacterRange returns [EObject current=null] : iv_ruleCharacterRange= ruleCharacterRange EOF ;
    public final EObject entryRuleCharacterRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharacterRange = null;


        try {
            // InternalXtextGrammarTestLanguage.g:1980:55: (iv_ruleCharacterRange= ruleCharacterRange EOF )
            // InternalXtextGrammarTestLanguage.g:1981:2: iv_ruleCharacterRange= ruleCharacterRange EOF
            {
             newCompositeNode(grammarAccess.getCharacterRangeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCharacterRange=ruleCharacterRange();

            state._fsp--;

             current =iv_ruleCharacterRange; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCharacterRange"


    // $ANTLR start "ruleCharacterRange"
    // InternalXtextGrammarTestLanguage.g:1987:1: ruleCharacterRange returns [EObject current=null] : (this_Keyword_0= ruleKeyword ( () otherlv_2= '..' ( (lv_right_3_0= ruleKeyword ) ) )? ) ;
    public final EObject ruleCharacterRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Keyword_0 = null;

        EObject lv_right_3_0 = null;


        try {
            // InternalXtextGrammarTestLanguage.g:1988:1: ( (this_Keyword_0= ruleKeyword ( () otherlv_2= '..' ( (lv_right_3_0= ruleKeyword ) ) )? ) )
            // InternalXtextGrammarTestLanguage.g:1989:2: (this_Keyword_0= ruleKeyword ( () otherlv_2= '..' ( (lv_right_3_0= ruleKeyword ) ) )? )
            {
            // InternalXtextGrammarTestLanguage.g:1989:2: (this_Keyword_0= ruleKeyword ( () otherlv_2= '..' ( (lv_right_3_0= ruleKeyword ) ) )? )
            // InternalXtextGrammarTestLanguage.g:1990:3: this_Keyword_0= ruleKeyword ( () otherlv_2= '..' ( (lv_right_3_0= ruleKeyword ) ) )?
            {

            			newCompositeNode(grammarAccess.getCharacterRangeAccess().getKeywordParserRuleCall_0());
            		
            pushFollow(FOLLOW_35);
            this_Keyword_0=ruleKeyword();

            state._fsp--;


            			current = this_Keyword_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalXtextGrammarTestLanguage.g:1998:3: ( () otherlv_2= '..' ( (lv_right_3_0= ruleKeyword ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==40) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalXtextGrammarTestLanguage.g:1999:4: () otherlv_2= '..' ( (lv_right_3_0= ruleKeyword ) )
                    {
                    // InternalXtextGrammarTestLanguage.g:1999:4: ()
                    // InternalXtextGrammarTestLanguage.g:2000:5: 
                    {

                    					current = forceCreateModelElementAndSet(
                    						grammarAccess.getCharacterRangeAccess().getCharacterRangeLeftAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_2=(Token)match(input,40,FOLLOW_11); 

                    				newLeafNode(otherlv_2, grammarAccess.getCharacterRangeAccess().getFullStopFullStopKeyword_1_1());
                    			
                    // InternalXtextGrammarTestLanguage.g:2010:4: ( (lv_right_3_0= ruleKeyword ) )
                    // InternalXtextGrammarTestLanguage.g:2011:5: (lv_right_3_0= ruleKeyword )
                    {
                    // InternalXtextGrammarTestLanguage.g:2011:5: (lv_right_3_0= ruleKeyword )
                    // InternalXtextGrammarTestLanguage.g:2012:6: lv_right_3_0= ruleKeyword
                    {

                    						newCompositeNode(grammarAccess.getCharacterRangeAccess().getRightKeywordParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_right_3_0=ruleKeyword();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCharacterRangeRule());
                    						}
                    						set(
                    							current,
                    							"right",
                    							lv_right_3_0,
                    							"org.eclipse.xtext.testlanguages.xtextgrammar.XtextGrammarTestLanguage.Keyword");
                    						afterParserOrEnumRuleCall();
                    					

                    }


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
    // $ANTLR end "ruleCharacterRange"


    // $ANTLR start "entryRuleEnumRule"
    // InternalXtextGrammarTestLanguage.g:2034:1: entryRuleEnumRule returns [EObject current=null] : iv_ruleEnumRule= ruleEnumRule EOF ;
    public final EObject entryRuleEnumRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumRule = null;


        try {
            // InternalXtextGrammarTestLanguage.g:2034:49: (iv_ruleEnumRule= ruleEnumRule EOF )
            // InternalXtextGrammarTestLanguage.g:2035:2: iv_ruleEnumRule= ruleEnumRule EOF
            {
             newCompositeNode(grammarAccess.getEnumRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnumRule=ruleEnumRule();

            state._fsp--;

             current =iv_ruleEnumRule; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEnumRule"


    // $ANTLR start "ruleEnumRule"
    // InternalXtextGrammarTestLanguage.g:2041:1: ruleEnumRule returns [EObject current=null] : (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'returns' ( (lv_type_3_0= ruleTypeRef ) ) )? otherlv_4= ':' ( (lv_alternatives_5_0= ruleEnumLiterals ) ) otherlv_6= ';' ) ;
    public final EObject ruleEnumRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_type_3_0 = null;

        EObject lv_alternatives_5_0 = null;


        try {
            // InternalXtextGrammarTestLanguage.g:2042:1: ( (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'returns' ( (lv_type_3_0= ruleTypeRef ) ) )? otherlv_4= ':' ( (lv_alternatives_5_0= ruleEnumLiterals ) ) otherlv_6= ';' ) )
            // InternalXtextGrammarTestLanguage.g:2043:2: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'returns' ( (lv_type_3_0= ruleTypeRef ) ) )? otherlv_4= ':' ( (lv_alternatives_5_0= ruleEnumLiterals ) ) otherlv_6= ';' )
            {
            // InternalXtextGrammarTestLanguage.g:2043:2: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'returns' ( (lv_type_3_0= ruleTypeRef ) ) )? otherlv_4= ':' ( (lv_alternatives_5_0= ruleEnumLiterals ) ) otherlv_6= ';' )
            // InternalXtextGrammarTestLanguage.g:2044:3: otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'returns' ( (lv_type_3_0= ruleTypeRef ) ) )? otherlv_4= ':' ( (lv_alternatives_5_0= ruleEnumLiterals ) ) otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEnumRuleAccess().getEnumKeyword_0());
            		
            // InternalXtextGrammarTestLanguage.g:2048:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalXtextGrammarTestLanguage.g:2049:4: (lv_name_1_0= RULE_ID )
            {
            // InternalXtextGrammarTestLanguage.g:2049:4: (lv_name_1_0= RULE_ID )
            // InternalXtextGrammarTestLanguage.g:2050:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_32); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEnumRuleAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEnumRuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalXtextGrammarTestLanguage.g:2066:3: (otherlv_2= 'returns' ( (lv_type_3_0= ruleTypeRef ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==21) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalXtextGrammarTestLanguage.g:2067:4: otherlv_2= 'returns' ( (lv_type_3_0= ruleTypeRef ) )
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getEnumRuleAccess().getReturnsKeyword_2_0());
                    			
                    // InternalXtextGrammarTestLanguage.g:2071:4: ( (lv_type_3_0= ruleTypeRef ) )
                    // InternalXtextGrammarTestLanguage.g:2072:5: (lv_type_3_0= ruleTypeRef )
                    {
                    // InternalXtextGrammarTestLanguage.g:2072:5: (lv_type_3_0= ruleTypeRef )
                    // InternalXtextGrammarTestLanguage.g:2073:6: lv_type_3_0= ruleTypeRef
                    {

                    						newCompositeNode(grammarAccess.getEnumRuleAccess().getTypeTypeRefParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_type_3_0=ruleTypeRef();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEnumRuleRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_3_0,
                    							"org.eclipse.xtext.testlanguages.xtextgrammar.XtextGrammarTestLanguage.TypeRef");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getEnumRuleAccess().getColonKeyword_3());
            		
            // InternalXtextGrammarTestLanguage.g:2095:3: ( (lv_alternatives_5_0= ruleEnumLiterals ) )
            // InternalXtextGrammarTestLanguage.g:2096:4: (lv_alternatives_5_0= ruleEnumLiterals )
            {
            // InternalXtextGrammarTestLanguage.g:2096:4: (lv_alternatives_5_0= ruleEnumLiterals )
            // InternalXtextGrammarTestLanguage.g:2097:5: lv_alternatives_5_0= ruleEnumLiterals
            {

            					newCompositeNode(grammarAccess.getEnumRuleAccess().getAlternativesEnumLiteralsParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_17);
            lv_alternatives_5_0=ruleEnumLiterals();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnumRuleRule());
            					}
            					set(
            						current,
            						"alternatives",
            						lv_alternatives_5_0,
            						"org.eclipse.xtext.testlanguages.xtextgrammar.XtextGrammarTestLanguage.EnumLiterals");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getEnumRuleAccess().getSemicolonKeyword_5());
            		

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
    // $ANTLR end "ruleEnumRule"


    // $ANTLR start "entryRuleEnumLiterals"
    // InternalXtextGrammarTestLanguage.g:2122:1: entryRuleEnumLiterals returns [EObject current=null] : iv_ruleEnumLiterals= ruleEnumLiterals EOF ;
    public final EObject entryRuleEnumLiterals() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumLiterals = null;


        try {
            // InternalXtextGrammarTestLanguage.g:2122:53: (iv_ruleEnumLiterals= ruleEnumLiterals EOF )
            // InternalXtextGrammarTestLanguage.g:2123:2: iv_ruleEnumLiterals= ruleEnumLiterals EOF
            {
             newCompositeNode(grammarAccess.getEnumLiteralsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnumLiterals=ruleEnumLiterals();

            state._fsp--;

             current =iv_ruleEnumLiterals; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEnumLiterals"


    // $ANTLR start "ruleEnumLiterals"
    // InternalXtextGrammarTestLanguage.g:2129:1: ruleEnumLiterals returns [EObject current=null] : (this_EnumLiteralDeclaration_0= ruleEnumLiteralDeclaration ( () (otherlv_2= '|' ( (lv_groups_3_0= ruleEnumLiteralDeclaration ) ) )+ )? ) ;
    public final EObject ruleEnumLiterals() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EnumLiteralDeclaration_0 = null;

        EObject lv_groups_3_0 = null;


        try {
            // InternalXtextGrammarTestLanguage.g:2130:1: ( (this_EnumLiteralDeclaration_0= ruleEnumLiteralDeclaration ( () (otherlv_2= '|' ( (lv_groups_3_0= ruleEnumLiteralDeclaration ) ) )+ )? ) )
            // InternalXtextGrammarTestLanguage.g:2131:2: (this_EnumLiteralDeclaration_0= ruleEnumLiteralDeclaration ( () (otherlv_2= '|' ( (lv_groups_3_0= ruleEnumLiteralDeclaration ) ) )+ )? )
            {
            // InternalXtextGrammarTestLanguage.g:2131:2: (this_EnumLiteralDeclaration_0= ruleEnumLiteralDeclaration ( () (otherlv_2= '|' ( (lv_groups_3_0= ruleEnumLiteralDeclaration ) ) )+ )? )
            // InternalXtextGrammarTestLanguage.g:2132:3: this_EnumLiteralDeclaration_0= ruleEnumLiteralDeclaration ( () (otherlv_2= '|' ( (lv_groups_3_0= ruleEnumLiteralDeclaration ) ) )+ )?
            {

            			newCompositeNode(grammarAccess.getEnumLiteralsAccess().getEnumLiteralDeclarationParserRuleCall_0());
            		
            pushFollow(FOLLOW_19);
            this_EnumLiteralDeclaration_0=ruleEnumLiteralDeclaration();

            state._fsp--;


            			current = this_EnumLiteralDeclaration_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalXtextGrammarTestLanguage.g:2140:3: ( () (otherlv_2= '|' ( (lv_groups_3_0= ruleEnumLiteralDeclaration ) ) )+ )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==25) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalXtextGrammarTestLanguage.g:2141:4: () (otherlv_2= '|' ( (lv_groups_3_0= ruleEnumLiteralDeclaration ) ) )+
                    {
                    // InternalXtextGrammarTestLanguage.g:2141:4: ()
                    // InternalXtextGrammarTestLanguage.g:2142:5: 
                    {

                    					current = forceCreateModelElementAndAdd(
                    						grammarAccess.getEnumLiteralsAccess().getAlternativesGroupsAction_1_0(),
                    						current);
                    				

                    }

                    // InternalXtextGrammarTestLanguage.g:2148:4: (otherlv_2= '|' ( (lv_groups_3_0= ruleEnumLiteralDeclaration ) ) )+
                    int cnt48=0;
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==25) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // InternalXtextGrammarTestLanguage.g:2149:5: otherlv_2= '|' ( (lv_groups_3_0= ruleEnumLiteralDeclaration ) )
                    	    {
                    	    otherlv_2=(Token)match(input,25,FOLLOW_3); 

                    	    					newLeafNode(otherlv_2, grammarAccess.getEnumLiteralsAccess().getVerticalLineKeyword_1_1_0());
                    	    				
                    	    // InternalXtextGrammarTestLanguage.g:2153:5: ( (lv_groups_3_0= ruleEnumLiteralDeclaration ) )
                    	    // InternalXtextGrammarTestLanguage.g:2154:6: (lv_groups_3_0= ruleEnumLiteralDeclaration )
                    	    {
                    	    // InternalXtextGrammarTestLanguage.g:2154:6: (lv_groups_3_0= ruleEnumLiteralDeclaration )
                    	    // InternalXtextGrammarTestLanguage.g:2155:7: lv_groups_3_0= ruleEnumLiteralDeclaration
                    	    {

                    	    							newCompositeNode(grammarAccess.getEnumLiteralsAccess().getGroupsEnumLiteralDeclarationParserRuleCall_1_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_19);
                    	    lv_groups_3_0=ruleEnumLiteralDeclaration();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEnumLiteralsRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"groups",
                    	    								lv_groups_3_0,
                    	    								"org.eclipse.xtext.testlanguages.xtextgrammar.XtextGrammarTestLanguage.EnumLiteralDeclaration");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt48 >= 1 ) break loop48;
                                EarlyExitException eee =
                                    new EarlyExitException(48, input);
                                throw eee;
                        }
                        cnt48++;
                    } while (true);


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
    // $ANTLR end "ruleEnumLiterals"


    // $ANTLR start "entryRuleEnumLiteralDeclaration"
    // InternalXtextGrammarTestLanguage.g:2178:1: entryRuleEnumLiteralDeclaration returns [EObject current=null] : iv_ruleEnumLiteralDeclaration= ruleEnumLiteralDeclaration EOF ;
    public final EObject entryRuleEnumLiteralDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumLiteralDeclaration = null;


        try {
            // InternalXtextGrammarTestLanguage.g:2178:63: (iv_ruleEnumLiteralDeclaration= ruleEnumLiteralDeclaration EOF )
            // InternalXtextGrammarTestLanguage.g:2179:2: iv_ruleEnumLiteralDeclaration= ruleEnumLiteralDeclaration EOF
            {
             newCompositeNode(grammarAccess.getEnumLiteralDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnumLiteralDeclaration=ruleEnumLiteralDeclaration();

            state._fsp--;

             current =iv_ruleEnumLiteralDeclaration; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEnumLiteralDeclaration"


    // $ANTLR start "ruleEnumLiteralDeclaration"
    // InternalXtextGrammarTestLanguage.g:2185:1: ruleEnumLiteralDeclaration returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_literal_2_0= ruleKeyword ) ) )? ) ;
    public final EObject ruleEnumLiteralDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_literal_2_0 = null;


        try {
            // InternalXtextGrammarTestLanguage.g:2186:1: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_literal_2_0= ruleKeyword ) ) )? ) )
            // InternalXtextGrammarTestLanguage.g:2187:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_literal_2_0= ruleKeyword ) ) )? )
            {
            // InternalXtextGrammarTestLanguage.g:2187:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_literal_2_0= ruleKeyword ) ) )? )
            // InternalXtextGrammarTestLanguage.g:2188:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_literal_2_0= ruleKeyword ) ) )?
            {
            // InternalXtextGrammarTestLanguage.g:2188:3: ( (otherlv_0= RULE_ID ) )
            // InternalXtextGrammarTestLanguage.g:2189:4: (otherlv_0= RULE_ID )
            {
            // InternalXtextGrammarTestLanguage.g:2189:4: (otherlv_0= RULE_ID )
            // InternalXtextGrammarTestLanguage.g:2190:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEnumLiteralDeclarationRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_36); 

            					newLeafNode(otherlv_0, grammarAccess.getEnumLiteralDeclarationAccess().getEnumLiteralEEnumLiteralCrossReference_0_0());
            				

            }


            }

            // InternalXtextGrammarTestLanguage.g:2201:3: (otherlv_1= '=' ( (lv_literal_2_0= ruleKeyword ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==30) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalXtextGrammarTestLanguage.g:2202:4: otherlv_1= '=' ( (lv_literal_2_0= ruleKeyword ) )
                    {
                    otherlv_1=(Token)match(input,30,FOLLOW_11); 

                    				newLeafNode(otherlv_1, grammarAccess.getEnumLiteralDeclarationAccess().getEqualsSignKeyword_1_0());
                    			
                    // InternalXtextGrammarTestLanguage.g:2206:4: ( (lv_literal_2_0= ruleKeyword ) )
                    // InternalXtextGrammarTestLanguage.g:2207:5: (lv_literal_2_0= ruleKeyword )
                    {
                    // InternalXtextGrammarTestLanguage.g:2207:5: (lv_literal_2_0= ruleKeyword )
                    // InternalXtextGrammarTestLanguage.g:2208:6: lv_literal_2_0= ruleKeyword
                    {

                    						newCompositeNode(grammarAccess.getEnumLiteralDeclarationAccess().getLiteralKeywordParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_literal_2_0=ruleKeyword();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEnumLiteralDeclarationRule());
                    						}
                    						set(
                    							current,
                    							"literal",
                    							lv_literal_2_0,
                    							"org.eclipse.xtext.testlanguages.xtextgrammar.XtextGrammarTestLanguage.Keyword");
                    						afterParserOrEnumRuleCall();
                    					

                    }


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
    // $ANTLR end "ruleEnumLiteralDeclaration"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000022000145010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000022000147010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000022000145012L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000604000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000404000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000020008030L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020008032L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000001C000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000200020000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00000004C0000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000800008030L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001002000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000008030L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x000000C000028030L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x000000C000028032L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000040000002L});

}