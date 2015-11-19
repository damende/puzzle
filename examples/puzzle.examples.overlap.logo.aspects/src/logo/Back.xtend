package logo

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod

import kmLogo.Back

import static extension logo.ExpressionAspect.*

@Aspect(className=Back)
public class BackAspect extends PrimitiveAspect{
 
	@OverrideAspectMethod
	def int eval (Context context) {
		var int param = -1*  _self.steps.eval(context) as Integer
		println("BACK "+ param)
		context.turtle.forward(param)
		return 0
	}
}