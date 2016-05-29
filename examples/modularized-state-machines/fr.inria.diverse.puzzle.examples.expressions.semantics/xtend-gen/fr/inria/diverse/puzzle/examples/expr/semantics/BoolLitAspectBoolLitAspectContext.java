package fr.inria.diverse.puzzle.examples.expr.semantics;

import ExpressionPck.BoolLit;
import fr.inria.diverse.puzzle.examples.expr.semantics.BoolLitAspectBoolLitAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class BoolLitAspectBoolLitAspectContext {
  public final static BoolLitAspectBoolLitAspectContext INSTANCE = new BoolLitAspectBoolLitAspectContext();
  
  public static BoolLitAspectBoolLitAspectProperties getSelf(final BoolLit _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.puzzle.examples.expr.semantics.BoolLitAspectBoolLitAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<BoolLit, BoolLitAspectBoolLitAspectProperties> map = new java.util.WeakHashMap<ExpressionPck.BoolLit, fr.inria.diverse.puzzle.examples.expr.semantics.BoolLitAspectBoolLitAspectProperties>();
  
  public Map<BoolLit, BoolLitAspectBoolLitAspectProperties> getMap() {
    return map;
  }
}