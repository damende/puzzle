package logo

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import kmLogo.Block
import java.util.Hashtable

@Aspect(className=Block)
public class BlockAspect extends InstructionAspect {

	@OverrideAspectMethod
	def void eval (Hashtable<String, Object> context) {
		_self.instructions.forEach[instruction | instruction.eval(context)]
	}
}