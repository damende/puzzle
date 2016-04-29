package fr.inria.diverse.puzzle.metrics.vos;

import java.util.ArrayList;
import java.util.List;

public class HCTree {

	// ----------------------------------------------
	// Attributes
	// ----------------------------------------------
	
	private List<HCTreeNode> nodes;
	private HCTreeNode root;

	// ----------------------------------------------
	// Constructor
	// ----------------------------------------------
	
	public HCTree(){
		nodes = new ArrayList<HCTreeNode>();
	}

	// ----------------------------------------------
	// Methods
	// ----------------------------------------------
	
	/**
	 * Find and return the a node in the tree with the identifier in the parameter. 
	 * Return null if there is no node satisfying such condition. 
	 * @param identifier
	 * @return
	 */
	public HCTreeNode findNodeByIdentifier(String identifier){
		for (HCTreeNode hcTreeNode : nodes) {
			if(hcTreeNode.getIdentifier().equals(identifier)){
				return hcTreeNode;
			}
		}
		return null;
	}
	
	// ----------------------------------------------
	// Getters and setters
	// ----------------------------------------------
	
	public List<HCTreeNode> getNodes() {
		return nodes;
	}

	public void setNodes(List<HCTreeNode> nodes) {
		this.nodes = nodes;
	}

	public HCTreeNode getRoot() {
		return root;
	}

	public void setRoot(HCTreeNode root) {
		this.root = root;
	}
}