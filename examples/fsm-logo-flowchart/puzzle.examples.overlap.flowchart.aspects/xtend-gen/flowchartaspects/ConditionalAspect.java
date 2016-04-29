package flowchartaspects;

import flowchartaspects.ConditionalAspectConditionalAspectProperties;
import flowchartaspects.ExpressionAspect;
import flowchartaspects.ProgramAspect;
import flowchartaspects.StatementAspect;
import flowchartpck.Conditional;
import flowchartpck.Expression;
import flowchartpck.Program;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.Hashtable;

@Aspect(className = Conditional.class)
@SuppressWarnings("all")
public class ConditionalAspect extends StatementAspect {
  @OverrideAspectMethod
  public static void eval(final Conditional _self, final Hashtable<String, Object> context) {
    flowchartaspects.ConditionalAspectConditionalAspectProperties _self_ = flowchartaspects.ConditionalAspectConditionalAspectContext.getSelf(_self);
     if (_self instanceof flowchartpck.Conditional){
     flowchartaspects.ConditionalAspect._privk3_eval(_self_, (flowchartpck.Conditional)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  private static void super_eval(final Conditional _self, final Hashtable<String, Object> context) {
    flowchartaspects.StatementAspectStatementAspectProperties _self_ = flowchartaspects.StatementAspectStatementAspectContext.getSelf(_self);
     flowchartaspects.StatementAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static void _privk3_eval(final ConditionalAspectConditionalAspectProperties _self_, final Conditional _self, final Hashtable<String, Object> context) {
    Expression _condition = _self.getCondition();
    Object _eval = ExpressionAspect.eval(_condition, context);
    if ((((Boolean) _eval)).booleanValue()) {
      Program _thenInstructions = _self.getThenInstructions();
      ProgramAspect.eval(_thenInstructions, context);
    } else {
      Program _elseInstructions = _self.getElseInstructions();
      ProgramAspect.eval(_elseInstructions, context);
    }
  }
}