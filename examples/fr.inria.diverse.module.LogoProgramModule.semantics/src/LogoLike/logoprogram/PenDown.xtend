package LogoLike.logoprogram

import commons.*

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import LogoProgramModule.PenDown

@Aspect(className=PenDown)
public class PenDownAspect extends PrimitiveAspect{
	@OverrideAspectMethod
	def int eval (Context context) {
		println("PENDOWN")
		context.turtle.setPenUp(false)
		return 0
	}
}
