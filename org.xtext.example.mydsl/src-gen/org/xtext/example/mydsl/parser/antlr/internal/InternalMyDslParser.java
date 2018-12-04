package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'StateMachine'", "','", "'Transition'", "'->'", "'State'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int RULE_INT=6;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "StateMachine";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleStateMachine"
    // InternalMyDsl.g:64:1: entryRuleStateMachine returns [EObject current=null] : iv_ruleStateMachine= ruleStateMachine EOF ;
    public final EObject entryRuleStateMachine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateMachine = null;


        try {
            // InternalMyDsl.g:64:53: (iv_ruleStateMachine= ruleStateMachine EOF )
            // InternalMyDsl.g:65:2: iv_ruleStateMachine= ruleStateMachine EOF
            {
             newCompositeNode(grammarAccess.getStateMachineRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStateMachine=ruleStateMachine();

            state._fsp--;

             current =iv_ruleStateMachine; 
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
    // $ANTLR end "entryRuleStateMachine"


    // $ANTLR start "ruleStateMachine"
    // InternalMyDsl.g:71:1: ruleStateMachine returns [EObject current=null] : ( () otherlv_1= 'StateMachine' ( (lv_name_2_0= ruleEString ) ) ( ( ( (lv_transition_3_0= ruleTransition ) ) (otherlv_4= ',' ( (lv_transition_5_0= ruleTransition ) ) )* ) | ( ( (lv_state_6_0= ruleState ) ) (otherlv_7= ',' ( (lv_state_8_0= ruleState ) ) )* ) )* ) ;
    public final EObject ruleStateMachine() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_transition_3_0 = null;

        EObject lv_transition_5_0 = null;

        EObject lv_state_6_0 = null;

        EObject lv_state_8_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( () otherlv_1= 'StateMachine' ( (lv_name_2_0= ruleEString ) ) ( ( ( (lv_transition_3_0= ruleTransition ) ) (otherlv_4= ',' ( (lv_transition_5_0= ruleTransition ) ) )* ) | ( ( (lv_state_6_0= ruleState ) ) (otherlv_7= ',' ( (lv_state_8_0= ruleState ) ) )* ) )* ) )
            // InternalMyDsl.g:78:2: ( () otherlv_1= 'StateMachine' ( (lv_name_2_0= ruleEString ) ) ( ( ( (lv_transition_3_0= ruleTransition ) ) (otherlv_4= ',' ( (lv_transition_5_0= ruleTransition ) ) )* ) | ( ( (lv_state_6_0= ruleState ) ) (otherlv_7= ',' ( (lv_state_8_0= ruleState ) ) )* ) )* )
            {
            // InternalMyDsl.g:78:2: ( () otherlv_1= 'StateMachine' ( (lv_name_2_0= ruleEString ) ) ( ( ( (lv_transition_3_0= ruleTransition ) ) (otherlv_4= ',' ( (lv_transition_5_0= ruleTransition ) ) )* ) | ( ( (lv_state_6_0= ruleState ) ) (otherlv_7= ',' ( (lv_state_8_0= ruleState ) ) )* ) )* )
            // InternalMyDsl.g:79:3: () otherlv_1= 'StateMachine' ( (lv_name_2_0= ruleEString ) ) ( ( ( (lv_transition_3_0= ruleTransition ) ) (otherlv_4= ',' ( (lv_transition_5_0= ruleTransition ) ) )* ) | ( ( (lv_state_6_0= ruleState ) ) (otherlv_7= ',' ( (lv_state_8_0= ruleState ) ) )* ) )*
            {
            // InternalMyDsl.g:79:3: ()
            // InternalMyDsl.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStateMachineAccess().getStateMachineAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getStateMachineAccess().getStateMachineKeyword_1());
            		
            // InternalMyDsl.g:90:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:91:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:91:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:92:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getStateMachineAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStateMachineRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:109:3: ( ( ( (lv_transition_3_0= ruleTransition ) ) (otherlv_4= ',' ( (lv_transition_5_0= ruleTransition ) ) )* ) | ( ( (lv_state_6_0= ruleState ) ) (otherlv_7= ',' ( (lv_state_8_0= ruleState ) ) )* ) )*
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==13) ) {
                    alt3=1;
                }
                else if ( (LA3_0==15) ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:110:4: ( ( (lv_transition_3_0= ruleTransition ) ) (otherlv_4= ',' ( (lv_transition_5_0= ruleTransition ) ) )* )
            	    {
            	    // InternalMyDsl.g:110:4: ( ( (lv_transition_3_0= ruleTransition ) ) (otherlv_4= ',' ( (lv_transition_5_0= ruleTransition ) ) )* )
            	    // InternalMyDsl.g:111:5: ( (lv_transition_3_0= ruleTransition ) ) (otherlv_4= ',' ( (lv_transition_5_0= ruleTransition ) ) )*
            	    {
            	    // InternalMyDsl.g:111:5: ( (lv_transition_3_0= ruleTransition ) )
            	    // InternalMyDsl.g:112:6: (lv_transition_3_0= ruleTransition )
            	    {
            	    // InternalMyDsl.g:112:6: (lv_transition_3_0= ruleTransition )
            	    // InternalMyDsl.g:113:7: lv_transition_3_0= ruleTransition
            	    {

            	    							newCompositeNode(grammarAccess.getStateMachineAccess().getTransitionTransitionParserRuleCall_3_0_0_0());
            	    						
            	    pushFollow(FOLLOW_5);
            	    lv_transition_3_0=ruleTransition();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getStateMachineRule());
            	    							}
            	    							add(
            	    								current,
            	    								"transition",
            	    								lv_transition_3_0,
            	    								"org.xtext.example.mydsl.MyDsl.Transition");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }

            	    // InternalMyDsl.g:130:5: (otherlv_4= ',' ( (lv_transition_5_0= ruleTransition ) ) )*
            	    loop1:
            	    do {
            	        int alt1=2;
            	        int LA1_0 = input.LA(1);

            	        if ( (LA1_0==12) ) {
            	            alt1=1;
            	        }


            	        switch (alt1) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:131:6: otherlv_4= ',' ( (lv_transition_5_0= ruleTransition ) )
            	    	    {
            	    	    otherlv_4=(Token)match(input,12,FOLLOW_6); 

            	    	    						newLeafNode(otherlv_4, grammarAccess.getStateMachineAccess().getCommaKeyword_3_0_1_0());
            	    	    					
            	    	    // InternalMyDsl.g:135:6: ( (lv_transition_5_0= ruleTransition ) )
            	    	    // InternalMyDsl.g:136:7: (lv_transition_5_0= ruleTransition )
            	    	    {
            	    	    // InternalMyDsl.g:136:7: (lv_transition_5_0= ruleTransition )
            	    	    // InternalMyDsl.g:137:8: lv_transition_5_0= ruleTransition
            	    	    {

            	    	    								newCompositeNode(grammarAccess.getStateMachineAccess().getTransitionTransitionParserRuleCall_3_0_1_1_0());
            	    	    							
            	    	    pushFollow(FOLLOW_5);
            	    	    lv_transition_5_0=ruleTransition();

            	    	    state._fsp--;


            	    	    								if (current==null) {
            	    	    									current = createModelElementForParent(grammarAccess.getStateMachineRule());
            	    	    								}
            	    	    								add(
            	    	    									current,
            	    	    									"transition",
            	    	    									lv_transition_5_0,
            	    	    									"org.xtext.example.mydsl.MyDsl.Transition");
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


            	    }
            	    break;
            	case 2 :
            	    // InternalMyDsl.g:157:4: ( ( (lv_state_6_0= ruleState ) ) (otherlv_7= ',' ( (lv_state_8_0= ruleState ) ) )* )
            	    {
            	    // InternalMyDsl.g:157:4: ( ( (lv_state_6_0= ruleState ) ) (otherlv_7= ',' ( (lv_state_8_0= ruleState ) ) )* )
            	    // InternalMyDsl.g:158:5: ( (lv_state_6_0= ruleState ) ) (otherlv_7= ',' ( (lv_state_8_0= ruleState ) ) )*
            	    {
            	    // InternalMyDsl.g:158:5: ( (lv_state_6_0= ruleState ) )
            	    // InternalMyDsl.g:159:6: (lv_state_6_0= ruleState )
            	    {
            	    // InternalMyDsl.g:159:6: (lv_state_6_0= ruleState )
            	    // InternalMyDsl.g:160:7: lv_state_6_0= ruleState
            	    {

            	    							newCompositeNode(grammarAccess.getStateMachineAccess().getStateStateParserRuleCall_3_1_0_0());
            	    						
            	    pushFollow(FOLLOW_5);
            	    lv_state_6_0=ruleState();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getStateMachineRule());
            	    							}
            	    							add(
            	    								current,
            	    								"state",
            	    								lv_state_6_0,
            	    								"org.xtext.example.mydsl.MyDsl.State");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }

            	    // InternalMyDsl.g:177:5: (otherlv_7= ',' ( (lv_state_8_0= ruleState ) ) )*
            	    loop2:
            	    do {
            	        int alt2=2;
            	        int LA2_0 = input.LA(1);

            	        if ( (LA2_0==12) ) {
            	            alt2=1;
            	        }


            	        switch (alt2) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:178:6: otherlv_7= ',' ( (lv_state_8_0= ruleState ) )
            	    	    {
            	    	    otherlv_7=(Token)match(input,12,FOLLOW_7); 

            	    	    						newLeafNode(otherlv_7, grammarAccess.getStateMachineAccess().getCommaKeyword_3_1_1_0());
            	    	    					
            	    	    // InternalMyDsl.g:182:6: ( (lv_state_8_0= ruleState ) )
            	    	    // InternalMyDsl.g:183:7: (lv_state_8_0= ruleState )
            	    	    {
            	    	    // InternalMyDsl.g:183:7: (lv_state_8_0= ruleState )
            	    	    // InternalMyDsl.g:184:8: lv_state_8_0= ruleState
            	    	    {

            	    	    								newCompositeNode(grammarAccess.getStateMachineAccess().getStateStateParserRuleCall_3_1_1_1_0());
            	    	    							
            	    	    pushFollow(FOLLOW_5);
            	    	    lv_state_8_0=ruleState();

            	    	    state._fsp--;


            	    	    								if (current==null) {
            	    	    									current = createModelElementForParent(grammarAccess.getStateMachineRule());
            	    	    								}
            	    	    								add(
            	    	    									current,
            	    	    									"state",
            	    	    									lv_state_8_0,
            	    	    									"org.xtext.example.mydsl.MyDsl.State");
            	    	    								afterParserOrEnumRuleCall();
            	    	    							

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop2;
            	        }
            	    } while (true);


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStateMachine"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:208:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMyDsl.g:208:47: (iv_ruleEString= ruleEString EOF )
            // InternalMyDsl.g:209:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMyDsl.g:215:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:221:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMyDsl.g:222:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMyDsl.g:222:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:223:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:231:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleTransition"
    // InternalMyDsl.g:242:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalMyDsl.g:242:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalMyDsl.g:243:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
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
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalMyDsl.g:249:1: ruleTransition returns [EObject current=null] : ( () otherlv_1= 'Transition' ( (lv_name_2_0= ruleEString ) ) ( ( ruleEString ) )? (otherlv_4= '->' ( ( ruleEString ) ) )? ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:255:2: ( ( () otherlv_1= 'Transition' ( (lv_name_2_0= ruleEString ) ) ( ( ruleEString ) )? (otherlv_4= '->' ( ( ruleEString ) ) )? ) )
            // InternalMyDsl.g:256:2: ( () otherlv_1= 'Transition' ( (lv_name_2_0= ruleEString ) ) ( ( ruleEString ) )? (otherlv_4= '->' ( ( ruleEString ) ) )? )
            {
            // InternalMyDsl.g:256:2: ( () otherlv_1= 'Transition' ( (lv_name_2_0= ruleEString ) ) ( ( ruleEString ) )? (otherlv_4= '->' ( ( ruleEString ) ) )? )
            // InternalMyDsl.g:257:3: () otherlv_1= 'Transition' ( (lv_name_2_0= ruleEString ) ) ( ( ruleEString ) )? (otherlv_4= '->' ( ( ruleEString ) ) )?
            {
            // InternalMyDsl.g:257:3: ()
            // InternalMyDsl.g:258:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTransitionAccess().getTransitionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getTransitionKeyword_1());
            		
            // InternalMyDsl.g:268:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:269:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:269:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:270:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTransitionAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransitionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:287:3: ( ( ruleEString ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_STRING && LA5_0<=RULE_ID)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:288:4: ( ruleEString )
                    {
                    // InternalMyDsl.g:288:4: ( ruleEString )
                    // InternalMyDsl.g:289:5: ruleEString
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTransitionRule());
                    					}
                    				

                    					newCompositeNode(grammarAccess.getTransitionAccess().getFromStateCrossReference_3_0());
                    				
                    pushFollow(FOLLOW_9);
                    ruleEString();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:303:3: (otherlv_4= '->' ( ( ruleEString ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==14) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:304:4: otherlv_4= '->' ( ( ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_4_0());
                    			
                    // InternalMyDsl.g:308:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:309:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:309:5: ( ruleEString )
                    // InternalMyDsl.g:310:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTransitionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTransitionAccess().getToStateCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleState"
    // InternalMyDsl.g:329:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalMyDsl.g:329:46: (iv_ruleState= ruleState EOF )
            // InternalMyDsl.g:330:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
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
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalMyDsl.g:336:1: ruleState returns [EObject current=null] : ( () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:342:2: ( ( () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalMyDsl.g:343:2: ( () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalMyDsl.g:343:2: ( () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) )
            // InternalMyDsl.g:344:3: () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalMyDsl.g:344:3: ()
            // InternalMyDsl.g:345:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStateAccess().getStateAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getStateAccess().getStateKeyword_1());
            		
            // InternalMyDsl.g:355:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:356:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:356:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:357:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getStateAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStateRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleState"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000000A002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000B002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004032L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004002L});

}