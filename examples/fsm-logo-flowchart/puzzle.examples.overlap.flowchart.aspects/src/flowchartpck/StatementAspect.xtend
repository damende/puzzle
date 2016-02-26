package flowchartpck

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import java.util.Hashtable
import flowchartpck.Statement

import static extension flowchartpck.ConditionalAspect.*
import static extension flowchartpck.LoopAspect.*
import static extension flowchartpck.PrintlnAspect.*
import static extension flowchartpck.PrintAspect.*
import static extension flowchartpck.AssignationAspect.*
import static extension flowchartpck.WaitAspect.*
import static extension flowchartpck.VarDeclAspect.*

@Aspect(className=Statement)
class StatementAspect {
	
	def void eval(Hashtable<String, Object> context){
		if(_self instanceof Program){
			(_self as Program).eval(context)
		}
		else if(_self instanceof Conditional){
			(_self as Conditional).eval(context)
		}
		else if(_self instanceof Loop){
			(_self as Loop).eval(context)
		}
		else if(_self instanceof Println){
			(_self as Println).eval(context)
		}
		else if(_self instanceof Print){
			(_self as Print).eval(context)
		}
		else if(_self instanceof Assignation){
			(_self as Assignation).eval(context)
		}
		else if(_self instanceof Wait){
			(_self as Wait).eval(context)
		}
		else if(_self instanceof VarDecl){
			(_self as VarDecl).eval(context)
		}
	}
}