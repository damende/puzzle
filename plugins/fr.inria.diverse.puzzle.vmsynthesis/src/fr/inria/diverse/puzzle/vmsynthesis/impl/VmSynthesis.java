package fr.inria.diverse.puzzle.vmsynthesis.impl;

import java.util.List;

import fr.inria.diverse.k3.sle.common.graphs.DependencyArc;
import fr.inria.diverse.k3.sle.common.graphs.DependencyGraph;
import fr.inria.diverse.k3.sle.common.graphs.DependencyVertex;
import vm.PBinaryExpression;
import vm.PBinaryOperator;
import vm.PConstraint;
import vm.PFeature;
import vm.PFeatureModel;
import vm.PFeatureRef;
import vm.VmFactory;

/**
 * Algorithm for synthesizing feature models from PCMs and dependencies graphs. 
 * @author David Mendez-Acuna
 *
 */
public class VmSynthesis {
	
	// ----------------------------------------------------------
	// Attributes
	// ----------------------------------------------------------
	
	private static VmSynthesis instance;
	
	// ----------------------------------------------------------
	// Constructor and singleton
	// ----------------------------------------------------------
	
	private VmSynthesis(){
		
	}
	
	public static VmSynthesis getInstance(){
		if(instance == null)
			instance = new VmSynthesis();
		return instance;
	}
	
	// ----------------------------------------------------------
	// Methods
	// ----------------------------------------------------------
	
	public PFeatureModel synthesizeFeatureModel(String PCM, DependencyGraph dependenciesGraph){
		PFeatureModel featureModel = VmFactory.eINSTANCE.createPFeatureModel();
		
		PFeature rootFeature = VmFactory.eINSTANCE.createPFeature();
		rootFeature.setMandatory(true);
		rootFeature.setName("Root");
		
		// Step 2: The first level features are those vertex in the graph such that they have not dependencies with other vertex.
		List<DependencyVertex> firstLevelVertex = dependenciesGraph.getIndendependentVertex();
		for (DependencyVertex dependencyVertex : firstLevelVertex) {
			PFeature feature = VmFactory.eINSTANCE.createPFeature();
			feature.setName(dependencyVertex.getIdentifier());
			feature.setParent(rootFeature);
			dependencyVertex.setIncluded(true);
		}
		
		List<DependencyVertex> currentLevel = firstLevelVertex;
		
		while(!dependenciesGraph.allIncluded()){
			System.out.println("currentLevel: " + currentLevel);
			List<DependencyVertex> directDependentVertex = dependenciesGraph.getDirectDependentVertex(currentLevel);
			for (DependencyVertex dependencyVertex : directDependentVertex) {
				if(!dependencyVertex.isIncluded()){
					PFeature feature = VmFactory.eINSTANCE.createPFeature();
					feature.setName(dependencyVertex.getIdentifier());
					dependencyVertex.setIncluded(true);
					
					boolean first = true;
					for (DependencyArc dependencyArc : dependencyVertex.getOutgoingArcs()) {
						if(currentLevel.contains(dependencyArc.getTo())){
							if(first){
								// Esta feature no tiene padre. Asignelo.
								PFeature parent = this.getPFeatureByName(dependencyArc.getTo().getIdentifier(), rootFeature);
								feature.setParent(parent);
							}else{
								// Esta feature ya tiene padre. Cree la constraint.
								PFeature requiredFeature = this.getPFeatureByName(dependencyArc.getTo().getIdentifier(), rootFeature);
								PConstraint constraint = VmFactory.eINSTANCE.createPConstraint();
								PBinaryExpression binaryExpression = VmFactory.eINSTANCE.createPBinaryExpression();
								PFeatureRef left = VmFactory.eINSTANCE.createPFeatureRef();
								left.setRef(feature);
								PFeatureRef right = VmFactory.eINSTANCE.createPFeatureRef();
								right.setRef(requiredFeature);
								binaryExpression.setLeft(left);
								binaryExpression.setRight(right);
								binaryExpression.setOperator(PBinaryOperator.IMPLIES);
								constraint.setExpression(binaryExpression);
								constraint.setName(left.getRef().getName() + " implies " + right.getRef().getName());
								featureModel.getConstraints().add(constraint);
							}
							first = false;
						}
					}
				}
			}
			currentLevel = directDependentVertex;
		}
		
		featureModel.setRootFeature(rootFeature);
		return featureModel;
	}
	
	/**
	 * Finds a PFeature by the name in the features model in the parameter.
	 * @param featureName. Name of the feature.
	 * @param featuresModelRoot. Root of the features model where the feature should be searched. 
	 * @return
	 */
	private PFeature getPFeatureByName(String featureName, PFeature featureModelRoot) {
		if(featureModelRoot.getName().equals(featureName)){
			return featureModelRoot;
		}
		for (PFeature feature : featureModelRoot.getChildren()) {
			PFeature found = this.getPFeatureByName(featureName, feature);
			if(found != null)
				return found;
		}
		return null;
	}
	
}