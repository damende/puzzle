package fr.inria.diverse.melange.ui.vos

import fr.inria.diverse.puzzle.adl.language.puzzle.Binding

class CompositionStatementVO {
	
	// -------------------------------------------------
	// Attributes
	// -------------------------------------------------
	
	public boolean considered
	public Binding statement
	
	// -------------------------------------------------
	// Constructor
	// -------------------------------------------------
	
	new(Binding statement){
		this.statement = statement
		this.considered = false
	}
}