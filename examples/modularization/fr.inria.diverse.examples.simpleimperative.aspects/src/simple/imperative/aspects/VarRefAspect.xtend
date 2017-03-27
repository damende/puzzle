package simple.imperative.aspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod

import java.util.Hashtable
import simpleimperative.VarRef


@Aspect(className=VarRef)
class VarRefAspect extends ExpressionAspect {
	
	@OverrideAspectMethod
	def Object eval(Hashtable<String, Object> context){
		return context.get(_self.varRef) 
	}
}