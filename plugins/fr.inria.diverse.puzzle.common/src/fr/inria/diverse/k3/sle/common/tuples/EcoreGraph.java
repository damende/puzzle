package fr.inria.diverse.k3.sle.common.tuples;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

public class EcoreGraph {

	// -----------------------------------------------
	// Attributes
	// -----------------------------------------------
	
	private ArrayList<EcoreNode> nodes;
	private ArrayList<EcoreArc> arcs;
	private ArrayList<ArrayList<EcoreNode>> groups;
	
	// -----------------------------------------------
	// Constructor
	// -----------------------------------------------
	
	/**
	 * Constructor by default. Returns an emtpy graph. 
	 */
	public EcoreGraph(){
		this.nodes = new ArrayList<EcoreNode>();
		this.arcs = new ArrayList<EcoreArc>();
		this.groups = new ArrayList<ArrayList<EcoreNode>>();
	}
	
	/**
	 * Constructor that builds a dependencies graph from a list of Concept-Members tuple
	 */
	public EcoreGraph(ArrayList<TupleConceptMembers> conceptMembersList){
		this.nodes = new ArrayList<EcoreNode>();
		this.arcs = new ArrayList<EcoreArc>();
		this.groups = new ArrayList<ArrayList<EcoreNode>>();
		this.computeDependenciesGraph(conceptMembersList);
	}
	
	// -----------------------------------------------
	// Getters
	// -----------------------------------------------

	public ArrayList<EcoreNode> getNodes() {
		return nodes;
	}

	public ArrayList<EcoreArc> getArcs() {
		return arcs;
	}
	
	public ArrayList<ArrayList<EcoreNode>> getGroups() {
		return groups;
	}
	
	// -----------------------------------------------
	// Methods
	// -----------------------------------------------

	/**
	 * Computes the dependencies graph from a list of tuples Concept-Members
	 * @param conceptMembersList
	 * @return
	 */
	public void computeDependenciesGraph(ArrayList<TupleConceptMembers> conceptMembersList){
		for (TupleConceptMembers conceptMembersGroupVO : conceptMembersList) {
			EClassifier currentClassifier = conceptMembersGroupVO.getConcept();
			EcoreNode node = new EcoreNode(currentClassifier.getName(), currentClassifier);
			this.getNodes().add(node);
		}
		
		// Adding one arc for each reference
		for (EcoreNode node : this.getNodes()) {
			EClassifier currentClassifier = node.getClassifier();
			
			if(currentClassifier instanceof EClass){
				EClass currentEClass = (EClass) currentClassifier;
				for (EStructuralFeature structuralFeature : currentEClass.getEStructuralFeatures()) {
					if(structuralFeature instanceof EReference){
						EReference currentEReference = (EReference) structuralFeature;
						EcoreNode toNode = getNodeByName(this, currentEReference.getEType().getName());
						if(toNode != null){
							EcoreArc arc = new EcoreArc(node, toNode);
							this.getArcs().add(arc);
						}
					}
					
					if(structuralFeature instanceof EAttribute){
						EAttribute currentEAttribute = (EAttribute) structuralFeature;
						if(currentEAttribute.getEType() instanceof EEnum){
							EcoreNode toNode = getNodeByName(this, currentEAttribute.getEType().getName());
							if(toNode != null){
								EcoreArc arc = new EcoreArc(node, toNode);
								this.getArcs().add(arc);
							}
						}
					}
				}
			}
		}
		
		// Adding one arc for each inheritance
		for (EcoreNode node : this.getNodes()) {
			EClassifier currentClassifier = node.getClassifier();
			
			if(currentClassifier instanceof EClass){
				EClass currentEClass = (EClass) currentClassifier;
				for (EClass superClass : currentEClass.getESuperTypes()) {
					EcoreNode toNode = getNodeByName(this, superClass.getName());
					if(toNode != null){
						EcoreArc arc = new EcoreArc(node, toNode);
						this.getArcs().add(arc);
					}
				}
			}
		}
	}
	
	/**
	 * Returns a node by its name in the graph in the paramter
	 * @param graph
	 * @param nodeName
	 * @return
	 */
	private EcoreNode getNodeByName(EcoreGraph graph, String nodeName){
		for (EcoreNode node : graph.getNodes()) {
			if(node.getClassifier().getName().equals(nodeName))
				return node;
		} return null;
	}
	
	/**
	 * Groups the current graphs according to the membership of each of its nodes.
	 */
	public void groupGraphByFamilyMembership(ArrayList<TupleMembersConcepts> membersConceptList){
		 
		for (TupleMembersConcepts membersGroupVsConceptVO : membersConceptList) {
			ArrayList<EcoreNode> currentGroup = new ArrayList<EcoreNode>();
			for (String currentConcept : membersGroupVsConceptVO.getConcepts()) {
				currentGroup.add(this.getNodeByName(this, currentConcept));
			}
			this.groups.add(currentGroup);
		}
	}
}