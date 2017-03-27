package logos.semantics

import fr.inria.diverse.k3.al.annotationprocessor.Aspect

import Logo.LogoProgram
import java.util.Hashtable

import static extension logos.semantics.PrimitiveAspect.*

@Aspect(className=LogoProgram)
public class LogoProgramAspect {
	
	def int eval (Hashtable<String, Object> context) {
		println("LogoProgram eval !")
		_self.primitives.forEach[ primitive  | primitive.eval(context)]
		return 0
	}
}