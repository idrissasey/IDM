/*
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl.formatting2

import com.google.inject.Inject
import idm.tp1.State
import idm.tp1.StateMachine
import idm.tp1.Transition
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import org.xtext.example.mydsl.services.MyDslGrammarAccess

class MyDslFormatter extends AbstractFormatter2 {
	
	@Inject extension MyDslGrammarAccess

	def dispatch void format(StateMachine stateMachine, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (Transition transition : stateMachine.getTransition()) {
			transition.format;
		}
		for (State state : stateMachine.getState()) {
			state.format;
		}
	}
	
	// TODO: implement for 
}