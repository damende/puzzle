package fr.inria.diverse.puzzle.examples.actionscripting.semantics

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod

import java.util.Hashtable
import actionscripting.Print

@Aspect(className=Print)
class PrintAspect extends StatementAspect {
	
	@OverrideAspectMethod
	def public void evalStatement(Hashtable<String, Object> context){
		print(_self.input)
	}
}
