package fr.inria.diverse.melange.ui.vos

import fr.inria.diverse.puzzle.adl.language.puzzle.Binding
import fr.inria.diverse.melange.metamodel.melange.Language

class CompositionTreeNode extends AbstractCompositionTreeNode {
	
	// -------------------------------------------------
	// Attributes
	// -------------------------------------------------
	
	public AbstractCompositionTreeNode _requiring
	public AbstractCompositionTreeNode _providing
	public Binding _binding
	
	// -------------------------------------------------
	// Constructor
	// -------------------------------------------------
	
	new(CompositionGraph graph) {
		super(graph)
	}
	
	// -------------------------------------------------
	// Methods
	// -------------------------------------------------
	
	/** 
	 * Adds a node to the current tree
	 */
	def void addNode(Language language){
		
	}
}