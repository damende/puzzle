package LogoLike.logoprogram

import commons.*

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import java.util.Hashtable
import kmLogo.Expression
import LogoProgramModule.ProcCall

import static extension logoprogram.InstructionAspect.*
@Aspect(className=ProcCall)
public class ProcCallAspect extends ExpressionAspect{
	@OverrideAspectMethod
	def Object eval (Context context) {
		println("Calling of : " + _self.declaration.name)
		var Hashtable<String,Integer> params = new Hashtable<String,Integer>()
		
		var int i = 0
		for (Expression exp : _self.actualArgs){
			var int currentArg = exp.eval(context) as Integer
			params.put(_self.declaration.args.get(i).name,currentArg)
			i= i+1
		}
		
		context.push(params)
		
		 _self.res = 0
		_self.declaration.instructions.forEach[instr | _self.res = instr.eval(context)]
		
		context.pop
		return _self.res
	}
	 int res = 0
}
