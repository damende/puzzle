package fr.inria.diverse.puzzle.vmsynthesis.tests;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import org.junit.Before;
import org.junit.Test;

import vm.PFeature;
import vm.PFeatureGroup;
import vm.PFeatureGroupCardinality;
import vm.PFeatureModel;
import vm.VmFactory;
import fr.inria.diverse.k3.sle.common.utils.PCMQueryServices;
import fr.inria.diverse.puzzle.vmsynthesis.impl.VmSynthesis;

/**
 * Test cases for the synthesis of closed feature models
 * @author David Mendez-Acuna
 *
 */
public class TestSynthesizeClosedModel {
	
	// -------------------------------------------------
	// Attributes
	// -------------------------------------------------
	
	private String PCMFile;
	
	private String PCM;
	
	private PFeatureModel openFM;
	
	private VmSynthesis synthesis;
	
	// -------------------------------------------------
	// Loading Scenarios
	// -------------------------------------------------
	
	@Before
	public void loadScenarios() throws Exception{
		synthesis = VmSynthesis.getInstance();
		PCMFile = "./testdata/PCMTest1.txt";
		
		File PCMFileObject = new File(PCMFile);
		BufferedReader br = new BufferedReader(new FileReader(PCMFileObject));
		
		String line = br.readLine();
		
		while(line != null){
			PCM += line + "\n";
			line = br.readLine();
		}
		
		br.close();
		
		System.out.println(PCMFileObject.exists());
		System.out.println(PCM);
		
		openFM = VmFactory.eINSTANCE.createPFeatureModel();
		
		PFeature root = VmFactory.eINSTANCE.createPFeature();
		root.setName("Root");
		root.setMandatory(true);
		openFM.setRootFeature(root);
		
		PFeature f1 = VmFactory.eINSTANCE.createPFeature();
		f1.setName("F1");
		f1.setParent(root);
		this.createOptionalGroup(root, f1);
		
		PFeature f2 = VmFactory.eINSTANCE.createPFeature();
		f2.setName("F2");
		f2.setParent(root);
		this.createOptionalGroup(root, f2);
		
		PFeature f3 = VmFactory.eINSTANCE.createPFeature();
		f3.setName("F3");
		f3.setParent(root);
		this.createOptionalGroup(root, f3);
		
		PFeature f4 = VmFactory.eINSTANCE.createPFeature();
		f4.setName("F4");
		f4.setParent(root);
		this.createOptionalGroup(root, f4);
		
		PFeature f5 = VmFactory.eINSTANCE.createPFeature();
		f5.setName("F5");
		f5.setParent(root);
		this.createOptionalGroup(root, f5);
		
		PFeature f6 = VmFactory.eINSTANCE.createPFeature();
		f6.setName("F6");
		f6.setParent(f1);
		this.createOptionalGroup(f1, f6);
		
		PFeature f7 = VmFactory.eINSTANCE.createPFeature();
		f7.setName("F7");
		f7.setParent(f1);
		this.createOptionalGroup(f1, f7);
		
		PFeature f8 = VmFactory.eINSTANCE.createPFeature();
		f8.setName("F8");
		f8.setParent(f2);
		this.createOptionalGroup(f2, f8);
		
		PFeature f9 = VmFactory.eINSTANCE.createPFeature();
		f9.setName("F9");
		f9.setParent(f2);
		this.createOptionalGroup(f2, f9);
		
		PFeature f10 = VmFactory.eINSTANCE.createPFeature();
		f10.setName("F10");
		f10.setParent(f2);
		this.createOptionalGroup(f2, f10);
		
		PFeature f11 = VmFactory.eINSTANCE.createPFeature();
		f11.setName("F11");
		f11.setParent(f3);
		this.createOptionalGroup(f3, f11);
		
		PFeature f12 = VmFactory.eINSTANCE.createPFeature();
		f12.setName("F12");
		f12.setParent(f3);
		this.createOptionalGroup(f3, f12);
		
		PFeature f13 = VmFactory.eINSTANCE.createPFeature();
		f13.setName("F13");
		f13.setParent(f3);
		this.createOptionalGroup(f3, f13);
		
		PFeature f14 = VmFactory.eINSTANCE.createPFeature();
		f14.setName("F14");
		f14.setParent(f3);
		this.createOptionalGroup(f3, f14);
		
		PFeature f15 = VmFactory.eINSTANCE.createPFeature();
		f15.setName("F15");
		f15.setParent(f4);
		this.createOptionalGroup(f4, f15);
		
		PFeature f16 = VmFactory.eINSTANCE.createPFeature();
		f16.setName("F16");
		f16.setParent(f4);
		this.createOptionalGroup(f4, f16);
		
		PFeature f17 = VmFactory.eINSTANCE.createPFeature();
		f17.setName("F17");
		f17.setParent(f4);
		this.createOptionalGroup(f4, f17);
		
		PFeature f18 = VmFactory.eINSTANCE.createPFeature();
		f18.setName("F18");
		f18.setParent(f5);
		this.createOptionalGroup(f5, f18);
		
		PFeature f19 = VmFactory.eINSTANCE.createPFeature();
		f19.setName("F19");
		f19.setParent(f5);
		this.createOptionalGroup(f5, f19);
		
		PFeature f20 = VmFactory.eINSTANCE.createPFeature();
		f20.setName("F20");
		f20.setParent(f5);
		this.createOptionalGroup(f5, f20);
		
		PFeature f21 = VmFactory.eINSTANCE.createPFeature();
		f21.setName("F21");
		f21.setParent(f5);
		this.createOptionalGroup(f5, f21);
	}
	
	private void createOptionalGroup(PFeature parent, PFeature feature){
		PFeatureGroup group = VmFactory.eINSTANCE.createPFeatureGroup();
		PFeatureGroupCardinality cardinality = VmFactory.eINSTANCE.createPFeatureGroupCardinality();
		cardinality.setLowerBound(0);
		cardinality.setUpperBound(1);
		group.setCardinality(cardinality);
		group.getFeatures().add(feature);
		parent.getGroups().add(group);
	}
	
	// -------------------------------------------------
	// Test Cases
	// -------------------------------------------------
	
	@Test
	public void testIdentifyMandatoryFeatures() throws Exception{
		PFeatureModel closedFM = synthesis.cloneFeatureModel(openFM);
		PCMQueryServices.getInstance().loadPCM(PCM);
		TestServices.printAllValidProducts(closedFM, PCM);
		
		synthesis.identifyMandatoryFeatures(closedFM);
		TestServices.printFM(closedFM);
		TestServices.printAllValidProducts(closedFM, PCM);
		
		synthesis.identifyXORs(closedFM);
		TestServices.printFM(closedFM);
		TestServices.printAllValidProducts(closedFM, PCM);
		
		synthesis.identifyORs(closedFM);
		TestServices.printFM(closedFM);
		TestServices.printAllValidProducts(closedFM, PCM);
		
		synthesis.addAdditionalImpliesConstraints(closedFM);
		TestServices.printFM(closedFM);
		TestServices.printAllValidProducts(closedFM, PCM);
		
		synthesis.addAdditionalExcludesConstraints(closedFM);
		TestServices.printFM(closedFM);
		TestServices.printAllValidProducts(closedFM, PCM);
	}
}