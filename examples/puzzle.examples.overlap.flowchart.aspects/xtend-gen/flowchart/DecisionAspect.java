package flowchart;

import flowchart.ConstraintAspect;
import flowchart.DecisionAspectDecisionAspectProperties;
import flowchartpck.Constraint;
import flowchartpck.Decision;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import java.util.Hashtable;

@Aspect(className = Decision.class)
@SuppressWarnings("all")
public class DecisionAspect {
  public static void eval(final Decision _self, final Hashtable<String, Object> context) {
    flowchart.DecisionAspectDecisionAspectProperties _self_ = flowchart.DecisionAspectDecisionAspectContext.getSelf(_self);
    _privk3_eval(_self_, _self,context);
  }
  
  protected static void _privk3_eval(final DecisionAspectDecisionAspectProperties _self_, final Decision _self, final Hashtable<String, Object> context) {
    Constraint _guard = _self.getGuard();
    ConstraintAspect.evalConstraint(_guard, context);
  }
}