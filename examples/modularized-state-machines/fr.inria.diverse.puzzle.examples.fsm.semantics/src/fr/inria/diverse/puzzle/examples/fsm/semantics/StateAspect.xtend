package fr.inria.diverse.puzzle.examples.fsm.semantics

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fsm.State
import java.util.Hashtable

@Aspect(className=State)
class StateAspect {
	
	Thread executionThread
	
	def public void entryState(Hashtable<String, Object> context){
		if(_self.entryAction != null)
			_self.entryAction.evalStatement(context)
	}
	
	def public void evalState(Hashtable<String, Object> context) {
		if(_self.doAction != null){
			var Runnable _runnable = new Runnable{
				override run(){
					 synchronized (_self) {
					 	_self.doAction.evalStatement(context)
					 }
				}
			}
		 	var Thread _thread = new Thread(_runnable)
		 	_self.executionThread = _thread
			_self.executionThread.start
		}
	}
	
	def public void exitState(Hashtable<String, Object> context){
		if(_self.executionThread != null && _self.executionThread.isAlive){
			_self.executionThread.stop
			_self.executionThread = null
		}
			
			
		if(_self.exitAction != null)
			_self.exitAction.evalStatement(context)
	}
}