package de.trier.cs.jccd.tests;

import org.eposoft.jccd.data.JCCDFile;
import org.eposoft.jccd.data.SimilarityGroupManager;
import org.eposoft.jccd.data.ast.ANode;
import org.eposoft.jccd.detectors.APipeline;
import org.eposoft.jccd.detectors.ASTDetector;
import org.eposoft.jccd.preprocessors.java.GeneralizeMethodArgumentTypes;
import org.eposoft.jccd.preprocessors.java.GeneralizeMethodReturnTypes;
import org.eposoft.jccd.preprocessors.java.GeneralizeVariableDeclarationTypes;

public class Main {

	public void test() {
		APipeline<ANode> detector = new ASTDetector();
		JCCDFile[] files = { new JCCDFile("data/TestFileOne.java"),
				new JCCDFile("data/TestFileTwo.java") };
		detector.setSourceFiles(files);
		
		detector.addOperator(new GeneralizeMethodArgumentTypes());
		detector.addOperator(new GeneralizeMethodReturnTypes());
		detector.addOperator(new GeneralizeVariableDeclarationTypes());
		
		SimilarityGroupManager manager = detector.process();
		APipeline.printSimilarityGroups(manager);
	}
	
	public static void main(String[] args){
		(new Main()).test();
	}
}
