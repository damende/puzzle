package fr.inria.diverse.puzzle.vmsynthesis.tests;

import java.util.ArrayList;

import org.junit.Test;

import vm.PFeatureModel;
import fr.inria.diverse.k3.sle.common.graphs.DependencyGraph;
import fr.inria.diverse.puzzle.instancesgenerator.impl.GraphGenerator;
import fr.inria.diverse.puzzle.instancesgenerator.impl.PCMGenerator;
import fr.inria.diverse.puzzle.vmsynthesis.impl.VmSynthesis;

public class RandomTest {

	@Test
	public void testRandom(){
		DependencyGraph randomAciclic = GraphGenerator.generateGraph(10, 880608);
		System.out.println(randomAciclic.toString());
		System.out.println(randomAciclic.thereIsLoop());
		
		PFeatureModel openFM = VmSynthesis.getInstance().synthesizeOpenFeatureModel(randomAciclic);
		System.out.println(openFM.getRootFeature().getChildren().size());
		
		ArrayList<String> PCMs = PCMGenerator.generatePCMs(randomAciclic, 2, 10, 880608, 3);
		for (String string : PCMs) {
			System.out.println(string);
		}
	}
}
