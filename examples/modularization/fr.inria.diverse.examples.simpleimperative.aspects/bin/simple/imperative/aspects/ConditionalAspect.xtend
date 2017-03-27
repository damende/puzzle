package simple.imperative.aspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod

import java.util.Hashtable
import simpleimperative.Conditional
import simpleimperative.Statement

@Aspect(className=Conditional)
class ConditionalAspect extends StatementAspect {
	
	@OverrideAspectMethod
	def void eval(Hashtable<String, Object> context){
		var Boolean conditionEval = _self.condition.eval(context) as Boolean
		if(conditionEval){
			for(Statement _statement : _self.body){
				_statement.eval(context)
			}
		}
	}
}