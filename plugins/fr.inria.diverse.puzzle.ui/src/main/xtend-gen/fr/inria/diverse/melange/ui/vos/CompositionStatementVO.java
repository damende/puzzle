package fr.inria.diverse.melange.ui.vos;

import fr.inria.diverse.puzzle.adl.language.puzzle.Binding;

@SuppressWarnings("all")
public class CompositionStatementVO {
  public boolean considered;
  
  public Binding statement;
  
  public CompositionStatementVO(final Binding statement) {
    this.statement = statement;
    this.considered = false;
  }
}
