package fr.inria.diverse.puzzle.examples.expr.semantics;

import ExpressionPck.Literal;
import fr.inria.diverse.puzzle.examples.expr.semantics.LiteralAspectLiteralAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class LiteralAspectLiteralAspectContext {
  public final static LiteralAspectLiteralAspectContext INSTANCE = new LiteralAspectLiteralAspectContext();
  
  public static LiteralAspectLiteralAspectProperties getSelf(final Literal _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.puzzle.examples.expr.semantics.LiteralAspectLiteralAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Literal, LiteralAspectLiteralAspectProperties> map = new java.util.WeakHashMap<ExpressionPck.Literal, fr.inria.diverse.puzzle.examples.expr.semantics.LiteralAspectLiteralAspectProperties>();
  
  public Map<Literal, LiteralAspectLiteralAspectProperties> getMap() {
    return map;
  }
}