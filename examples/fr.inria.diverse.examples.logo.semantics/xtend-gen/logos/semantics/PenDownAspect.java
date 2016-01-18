package logos.semantics;

import Logo.PenDown;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import logos.semantics.Context;
import logos.semantics.PenDownAspectPenDownAspectProperties;
import logos.semantics.PrimitiveAspect;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = PenDown.class)
@SuppressWarnings("all")
public class PenDownAspect extends PrimitiveAspect {
  @OverrideAspectMethod
  public static int eval(final PenDown _self, final Context context) {
    logos.semantics.PenDownAspectPenDownAspectProperties _self_ = logos.semantics.PenDownAspectPenDownAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_eval(_self_, _self,context);
    return (int)result;
  }
  
  private static int super_eval(final PenDown _self, final Context context) {
    logos.semantics.PrimitiveAspectPrimitiveAspectProperties _self_ = logos.semantics.PrimitiveAspectPrimitiveAspectContext.getSelf(_self);
    return  logos.semantics.PrimitiveAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static int _privk3_eval(final PenDownAspectPenDownAspectProperties _self_, final PenDown _self, final Context context) {
    InputOutput.<String>println("PENDOWN");
    context.turtle.setPenUp(false);
    return 0;
  }
}