/*
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class MyDslGrammarAccess extends AbstractGrammarElementFinder {
	
	public class StateMachineElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.StateMachine");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cStateMachineAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cStateMachineKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameEStringParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Alternatives cAlternatives_3 = (Alternatives)cGroup.eContents().get(3);
		private final Group cGroup_3_0 = (Group)cAlternatives_3.eContents().get(0);
		private final Assignment cTransitionAssignment_3_0_0 = (Assignment)cGroup_3_0.eContents().get(0);
		private final RuleCall cTransitionTransitionParserRuleCall_3_0_0_0 = (RuleCall)cTransitionAssignment_3_0_0.eContents().get(0);
		private final Group cGroup_3_0_1 = (Group)cGroup_3_0.eContents().get(1);
		private final Keyword cCommaKeyword_3_0_1_0 = (Keyword)cGroup_3_0_1.eContents().get(0);
		private final Assignment cTransitionAssignment_3_0_1_1 = (Assignment)cGroup_3_0_1.eContents().get(1);
		private final RuleCall cTransitionTransitionParserRuleCall_3_0_1_1_0 = (RuleCall)cTransitionAssignment_3_0_1_1.eContents().get(0);
		private final Group cGroup_3_1 = (Group)cAlternatives_3.eContents().get(1);
		private final Assignment cStateAssignment_3_1_0 = (Assignment)cGroup_3_1.eContents().get(0);
		private final RuleCall cStateStateParserRuleCall_3_1_0_0 = (RuleCall)cStateAssignment_3_1_0.eContents().get(0);
		private final Group cGroup_3_1_1 = (Group)cGroup_3_1.eContents().get(1);
		private final Keyword cCommaKeyword_3_1_1_0 = (Keyword)cGroup_3_1_1.eContents().get(0);
		private final Assignment cStateAssignment_3_1_1_1 = (Assignment)cGroup_3_1_1.eContents().get(1);
		private final RuleCall cStateStateParserRuleCall_3_1_1_1_0 = (RuleCall)cStateAssignment_3_1_1_1.eContents().get(0);
		
		//StateMachine:
		//	{StateMachine}
		//	'StateMachine'
		//	name=EString (transition+=Transition ("," transition+=Transition)* | state+=State ("," state+=State)*)*
		//	//('state' state+=State ( "," state+=State)* )?
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//{StateMachine} 'StateMachine' name=EString (transition+=Transition ("," transition+=Transition)* | state+=State (","
		//state+=State)*)*
		public Group getGroup() { return cGroup; }
		
		//{StateMachine}
		public Action getStateMachineAction_0() { return cStateMachineAction_0; }
		
		//'StateMachine'
		public Keyword getStateMachineKeyword_1() { return cStateMachineKeyword_1; }
		
		//name=EString
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_2_0() { return cNameEStringParserRuleCall_2_0; }
		
		//(transition+=Transition ("," transition+=Transition)* | state+=State ("," state+=State)*)*
		public Alternatives getAlternatives_3() { return cAlternatives_3; }
		
		//transition+=Transition ("," transition+=Transition)*
		public Group getGroup_3_0() { return cGroup_3_0; }
		
		//transition+=Transition
		public Assignment getTransitionAssignment_3_0_0() { return cTransitionAssignment_3_0_0; }
		
		//Transition
		public RuleCall getTransitionTransitionParserRuleCall_3_0_0_0() { return cTransitionTransitionParserRuleCall_3_0_0_0; }
		
		//("," transition+=Transition)*
		public Group getGroup_3_0_1() { return cGroup_3_0_1; }
		
		//","
		public Keyword getCommaKeyword_3_0_1_0() { return cCommaKeyword_3_0_1_0; }
		
		//transition+=Transition
		public Assignment getTransitionAssignment_3_0_1_1() { return cTransitionAssignment_3_0_1_1; }
		
		//Transition
		public RuleCall getTransitionTransitionParserRuleCall_3_0_1_1_0() { return cTransitionTransitionParserRuleCall_3_0_1_1_0; }
		
		//state+=State ("," state+=State)*
		public Group getGroup_3_1() { return cGroup_3_1; }
		
		//state+=State
		public Assignment getStateAssignment_3_1_0() { return cStateAssignment_3_1_0; }
		
		//State
		public RuleCall getStateStateParserRuleCall_3_1_0_0() { return cStateStateParserRuleCall_3_1_0_0; }
		
		//("," state+=State)*
		public Group getGroup_3_1_1() { return cGroup_3_1_1; }
		
		//","
		public Keyword getCommaKeyword_3_1_1_0() { return cCommaKeyword_3_1_1_0; }
		
		//state+=State
		public Assignment getStateAssignment_3_1_1_1() { return cStateAssignment_3_1_1_1; }
		
		//State
		public RuleCall getStateStateParserRuleCall_3_1_1_1_0() { return cStateStateParserRuleCall_3_1_1_1_0; }
	}
	public class EStringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.EString");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSTRINGTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//EString:
		//	STRING | ID;
		@Override public ParserRule getRule() { return rule; }
		
		//STRING | ID
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall_0() { return cSTRINGTerminalRuleCall_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }
	}
	public class TransitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Transition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cTransitionAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cTransitionKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameEStringParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Assignment cFromAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cFromStateCrossReference_3_0 = (CrossReference)cFromAssignment_3.eContents().get(0);
		private final RuleCall cFromStateEStringParserRuleCall_3_0_1 = (RuleCall)cFromStateCrossReference_3_0.eContents().get(1);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cHyphenMinusGreaterThanSignKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cToAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final CrossReference cToStateCrossReference_4_1_0 = (CrossReference)cToAssignment_4_1.eContents().get(0);
		private final RuleCall cToStateEStringParserRuleCall_4_1_0_1 = (RuleCall)cToStateCrossReference_4_1_0.eContents().get(1);
		
		//Transition:
		//	{Transition}
		//	'Transition'
		//	name=EString
		//	from=[State|EString]? ('->' to=[State|EString])?;
		@Override public ParserRule getRule() { return rule; }
		
		//{Transition} 'Transition' name=EString from=[State|EString]? ('->' to=[State|EString])?
		public Group getGroup() { return cGroup; }
		
		//{Transition}
		public Action getTransitionAction_0() { return cTransitionAction_0; }
		
		//'Transition'
		public Keyword getTransitionKeyword_1() { return cTransitionKeyword_1; }
		
		//name=EString
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_2_0() { return cNameEStringParserRuleCall_2_0; }
		
		//from=[State|EString]?
		public Assignment getFromAssignment_3() { return cFromAssignment_3; }
		
		//[State|EString]
		public CrossReference getFromStateCrossReference_3_0() { return cFromStateCrossReference_3_0; }
		
		//EString
		public RuleCall getFromStateEStringParserRuleCall_3_0_1() { return cFromStateEStringParserRuleCall_3_0_1; }
		
		//('->' to=[State|EString])?
		public Group getGroup_4() { return cGroup_4; }
		
		//'->'
		public Keyword getHyphenMinusGreaterThanSignKeyword_4_0() { return cHyphenMinusGreaterThanSignKeyword_4_0; }
		
		//to=[State|EString]
		public Assignment getToAssignment_4_1() { return cToAssignment_4_1; }
		
		//[State|EString]
		public CrossReference getToStateCrossReference_4_1_0() { return cToStateCrossReference_4_1_0; }
		
		//EString
		public RuleCall getToStateEStringParserRuleCall_4_1_0_1() { return cToStateEStringParserRuleCall_4_1_0_1; }
	}
	public class StateElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.State");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cStateAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cStateKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameEStringParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		
		//State:
		//	{State}
		//	'State'
		//	name=EString;
		@Override public ParserRule getRule() { return rule; }
		
		//{State} 'State' name=EString
		public Group getGroup() { return cGroup; }
		
		//{State}
		public Action getStateAction_0() { return cStateAction_0; }
		
		//'State'
		public Keyword getStateKeyword_1() { return cStateKeyword_1; }
		
		//name=EString
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_2_0() { return cNameEStringParserRuleCall_2_0; }
	}
	
	
	private final StateMachineElements pStateMachine;
	private final EStringElements pEString;
	private final TransitionElements pTransition;
	private final StateElements pState;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public MyDslGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pStateMachine = new StateMachineElements();
		this.pEString = new EStringElements();
		this.pTransition = new TransitionElements();
		this.pState = new StateElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.example.mydsl.MyDsl".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//StateMachine:
	//	{StateMachine}
	//	'StateMachine'
	//	name=EString (transition+=Transition ("," transition+=Transition)* | state+=State ("," state+=State)*)*
	//	//('state' state+=State ( "," state+=State)* )?
	//;
	public StateMachineElements getStateMachineAccess() {
		return pStateMachine;
	}
	
	public ParserRule getStateMachineRule() {
		return getStateMachineAccess().getRule();
	}
	
	//EString:
	//	STRING | ID;
	public EStringElements getEStringAccess() {
		return pEString;
	}
	
	public ParserRule getEStringRule() {
		return getEStringAccess().getRule();
	}
	
	//Transition:
	//	{Transition}
	//	'Transition'
	//	name=EString
	//	from=[State|EString]? ('->' to=[State|EString])?;
	public TransitionElements getTransitionAccess() {
		return pTransition;
	}
	
	public ParserRule getTransitionRule() {
		return getTransitionAccess().getRule();
	}
	
	//State:
	//	{State}
	//	'State'
	//	name=EString;
	public StateElements getStateAccess() {
		return pState;
	}
	
	public ParserRule getStateRule() {
		return getStateAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}