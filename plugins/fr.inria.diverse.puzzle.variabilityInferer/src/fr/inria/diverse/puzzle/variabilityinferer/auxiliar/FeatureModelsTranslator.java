package fr.inria.diverse.puzzle.variabilityinferer.auxiliar;

import vm.PFeature;
import vm.PFeatureModel;
import vm.VmFactory;
import es.us.isa.FAMA.models.FAMAfeatureModel.FAMAFeatureModel;
import es.us.isa.FAMA.models.FAMAfeatureModel.Feature;
import fr.familiar.variable.FeatureModelVariable;

/**
 * Offers the services for translating feature models from diverse formats to the VM metamodel.
 * @author David Mendez-Acuna
 *
 */
public class FeatureModelsTranslator {

	// -----------------------------------------------------------
	// Attributes
	// -----------------------------------------------------------
	
	private static FeatureModelsTranslator instance;
	
	// -----------------------------------------------------------
	// Constructor and singleton
	// -----------------------------------------------------------
	
	private FeatureModelsTranslator(){
		
	}
	
	public static FeatureModelsTranslator getInstance(){
		if(instance == null)
			instance = new FeatureModelsTranslator();
		return instance;
	}

	// -----------------------------------------------------------
	// Methods
	// -----------------------------------------------------------

	/**
	 * Translates from a features model from FeatureModelVariable (Familiar) to FeatureModel (Puzzle).
	 * @param fmv The feature model as an FeatureModelVariable object.
	 * @return
	 */
	public PFeatureModel fromFeatureModelVariableToFeatureModel(
			FeatureModelVariable fmv) {
		PFeatureModel fm = VmFactory.eINSTANCE.createPFeatureModel();
		
		gsd.synthesis.FeatureModel<String> originalFeatureModel = fmv.getHierarchy();
		
		
		gsd.synthesis.FeatureGraph<String> diagram = originalFeatureModel.getDiagram();
		System.out.println("diagram.getTopVertex(): " + diagram.getTopVertex());
		System.out.println("diagram.getBottomVertex(): " + diagram.getBottomVertex());
		
		return fm;
	}

	/**
	 * Translates from a features model from FAMAFeatureModel (FAMA) to FeatureModel (Puzzle).
	 * @param famafm The feature model as an FAMAFeatureModel object.
	 * @return
	 */
	public PFeatureModel fromFAMAFeatureModelToFeatureModel(
			FAMAFeatureModel famafm) {
		PFeatureModel fm = VmFactory.eINSTANCE.createPFeatureModel();
		PFeature root = this.fromFAMAFeatureToPFeature(famafm.getRoot());
		fm.setRootFeature(root);
		return fm;
	}
	
	private PFeature fromFAMAFeatureToPFeature(Feature famaFeature){
		PFeature pf = VmFactory.eINSTANCE.createPFeature();
		pf.setName(famaFeature.getName());
		return pf;
	}
}