package LogoLike.logoprogram

import commons.*

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import LogoProgramModule.If

import static extension logoprogram.BlockAspect.*
@Aspect(className=If)
public class IfAspect extends ControlStructureAspect{
	@OverrideAspectMethod
	def int eval (Context context) {
		if (_self.condition.eval(context) != 0) {
			return _self.thenPart.eval(context)
		}
		else{
			return _self.elsePart.eval(context)
		}
	}
}
