package logo

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import kmLogo.Left

import static extension logo.ExpressionAspect.*

@Aspect(className=Left)
public class LeftAspect extends PrimitiveAspect{
 
	@OverrideAspectMethod
	def int eval (Context context) {
		var int param = (-1)  *_self.angle.eval(context) as Integer
		println("LEFT " + param)
		context.turtle.rotate(param)
		return 0
	}

}