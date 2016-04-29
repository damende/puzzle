package logo

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod

import java.util.Hashtable
import kmLogo.VarDecl

import static extension logo.ExpressionAspect.*

@Aspect(className=VarDecl)
class VarDeclAspect extends InstructionAspect {
	
	@OverrideAspectMethod
	def void eval(Hashtable<String, Object> context){
		context.put(_self.key, _self.expression.eval(context))
	}
}