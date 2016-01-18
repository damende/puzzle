package fsmharelaspects;

import fr.inria.diverse.k3.al.annotationprocessor.Abstract;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fsm.Statement;
import fsmharelaspects.StatementAspectStatementAspectProperties;
import java.util.Hashtable;

@Aspect(className = Statement.class)
@SuppressWarnings("all")
public abstract class StatementAspect {
  @Abstract
  public static void eval(final Statement _self, final Hashtable<String, Object> context) {
    fsmharelaspects.StatementAspectStatementAspectProperties _self_ = fsmharelaspects.StatementAspectStatementAspectContext.getSelf(_self);
    _privk3_eval(_self_, _self,context);
  }
  
  protected static void _privk3_eval(final StatementAspectStatementAspectProperties _self_, final Statement _self, final Hashtable<String, Object> context) {
    throw new java.lang.RuntimeException("Not implemented");
  }
}
