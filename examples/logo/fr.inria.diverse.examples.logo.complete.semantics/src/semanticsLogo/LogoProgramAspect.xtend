package semanticsLogo

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.Main

import java.util.Hashtable

import static extension semanticsLogo.InstructionAspect.*
//import static extension logo.VarDeclAspect.*
import Logo.LogoProgram
import Logo.Instruction

@Aspect(className=LogoProgram)
public class LogoProgramAspect {

	@Main
	def void eval (Hashtable<String, Object> context) {
		println("LogoProgram eval !")
		for(Instruction instruction : _self.instructions){
			println(instruction)
			instruction.eval(context)
		}
	}
}
