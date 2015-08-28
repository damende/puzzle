package de.trier.cs.jccd.tests;

import org.eposoft.jccd.data.JCCDFile;
import org.eposoft.jccd.data.SimilarityGroupManager;
import org.eposoft.jccd.data.ast.ANode;
import org.eposoft.jccd.detectors.APipeline;
import org.eposoft.jccd.detectors.ASTDetector;

public class Main {

	public void test() {
		APipeline<ANode> detector = new ASTDetector();
		JCCDFile[] files = { new JCCDFile("data/TestFileOne.java"),
				new JCCDFile("data/TestFileTwo.java") };
		detector.setSourceFiles(files);
		SimilarityGroupManager manager = detector.process();
		APipeline.printSimilarityGroups(manager);
	}
	
	public static void main(String[] args){
		(new Main()).test();
	}
}
