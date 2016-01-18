package logos.semantics;

import Logo.Block;
import Logo.Expression;
import Logo.Repeat;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import logos.semantics.Context;
import logos.semantics.ControlStructureAspect;
import logos.semantics.InstructionAspect;
import logos.semantics.RepeatAspectRepeatAspectProperties;

@Aspect(className = Repeat.class)
@SuppressWarnings("all")
public class RepeatAspect extends ControlStructureAspect {
  @OverrideAspectMethod
  public static int eval(final Repeat _self, final Context context) {
    logos.semantics.RepeatAspectRepeatAspectProperties _self_ = logos.semantics.RepeatAspectRepeatAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_eval(_self_, _self,context);
    return (int)result;
  }
  
  private static int super_eval(final Repeat _self, final Context context) {
    logos.semantics.ControlStructureAspectControlStructureAspectProperties _self_ = logos.semantics.ControlStructureAspectControlStructureAspectContext.getSelf(_self);
    return  logos.semantics.ControlStructureAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static int _privk3_eval(final RepeatAspectRepeatAspectProperties _self_, final Repeat _self, final Context context) {
    Expression _condition = _self.getCondition();
    Object _eval = _condition.eval(context);
    int time = (((Integer) _eval)).intValue();
    while ((time > 0)) {
      {
        Block _block = _self.getBlock();
        InstructionAspect.eval(_block, context);
        time = (time - 1);
      }
    }
    return 0;
  }
}