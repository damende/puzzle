package fr.inria.diverse.puzzle.metrics;

import java.io.File;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import fr.inria.diverse.k3.sle.common.commands.ConceptComparison;
import fr.inria.diverse.k3.sle.common.comparisonOperators.DeepConceptComparison;
import fr.inria.diverse.k3.sle.common.comparisonOperators.NamingConceptComparison;
import fr.inria.diverse.melange.metamodel.melange.Language;
import fr.inria.diverse.melange.metamodel.melange.MelangeFactory;
import fr.inria.diverse.melange.metamodel.melange.Metamodel;
import fr.inria.diverse.puzzle.metrics.specialCharts.SyntacticNamingVennDiagram;

public class Histograms {

	// ------------------------------------------------
	// Attributes
	// ------------------------------------------------
	
	private String dataFolder = "temp";
	private ArrayList<Language> languages;
	
	// ------------------------------------------------
	// Loading scenarios
	// ------------------------------------------------
	
	@Before
	public void loadScenario(){
		languages = new ArrayList<Language>();
		
		File dataFolderObject = new File(dataFolder);
		
		for (File file : dataFolderObject.listFiles()) {
			if(file.getName().endsWith("ecore")){
				System.out.println("file.getName(): " + file.getName());
				Language currentLanguage = MelangeFactory.eINSTANCE.createLanguage();
				Metamodel currentMetamodel = MelangeFactory.eINSTANCE.createMetamodel();
				currentMetamodel.setEcoreUri(file.getAbsolutePath());
				currentLanguage.setSyntax(currentMetamodel);
				currentLanguage.setName(file.getName());
				languages.add(currentLanguage);
			}
		}
	}

	// ------------------------------------------------
	// Test cases
	// ------------------------------------------------

	@Ignore
	@Test
	public void computeHistogramCount() throws Exception{
		ConceptComparison conceptComparisonOperator = new DeepConceptComparison();

		SyntacticNamingVennDiagram metrics = new SyntacticNamingVennDiagram();
		int[][] theMatrix = metrics.getCommonalitiesMatrix(languages, conceptComparisonOperator);
		Hashtable<Integer, Integer> histogramByConstructs = metrics.computeLanguagesCommonality(theMatrix);
		
		int max = -1;
		for (int i = 0; i < theMatrix.length; i++) {
			int current = histogramByConstructs.get(i);
			System.out.println(i + " - " + histogramByConstructs.get(i));
			if(current > max)
				max = current;
		}
		
		System.out.println("max: " + max);
		
		ArrayList<Integer> histogram = new ArrayList<Integer>();
		
		Iterator<Integer> it = histogramByConstructs.keySet().iterator();
		int count = 0;
		while (it.hasNext()) {
			Integer currentKey = (Integer) it.next();
			Integer currentValue = histogramByConstructs.get(currentKey);
			if(currentValue == 0){
				count ++;
			}
		}
		histogram.add(new Integer(count));
		
		int interval = 1;
		
		int maxI = 0;
		for (int i = 1; i <= max; i+=interval) {
			it = histogramByConstructs.keySet().iterator();
			count = 0;
			while (it.hasNext()) {
				Integer currentKey = (Integer) it.next();
				Integer currentValue = histogramByConstructs.get(currentKey);
				int proxI = i + interval;
								
				if(/*currentValue >= i &&*/ currentValue < proxI){
					count ++;
				}
			}
			histogram.add(new Integer(count));
			maxI = i;
		}
		
		it = histogramByConstructs.keySet().iterator();
		count = 0;
		while (it.hasNext()) {
			Integer currentKey = (Integer) it.next();
			Integer currentValue = histogramByConstructs.get(currentKey);
			if(currentValue >= maxI && currentValue <= max){
				count ++;
			}
		}
		histogram.add(new Integer(count));
		
		
		for (int i = 0; i < histogram.size(); i++) {
			if(histogram.get(i) != 0)
				System.out.println(i*interval + "," + histogram.get(i));
		}
	}	
	
//	@Ignore
	@Test
	public void question2() throws Exception{
		ConceptComparison conceptComparisonOperator = new DeepConceptComparison();

		SyntacticNamingVennDiagram metrics = new SyntacticNamingVennDiagram();
		int[][] theMatrix = metrics.getCommonalitiesMatrix(languages, conceptComparisonOperator);
		
		ArrayList<Double> mmaverages = new ArrayList<Double>();
		
		for (int i = 0; i < theMatrix.length; i++) {
			int sum = 0;
			int count = 0;
			for (int j = 0; j < theMatrix[0].length; j++) {
				if(theMatrix[i][j] > 0){
					sum += theMatrix[i][j];
					count ++;
				}
			}
			
			if(count != 0){
				double avg = ((double)sum)/((double)count);
				mmaverages.add(avg);
//				System.out.println("adding average: " + avg);
			}
		}
		
		double sumAVG = 0;
		for (Double _double : mmaverages) {
			sumAVG += _double;
		}
		
		double AVG = sumAVG/((double)mmaverages.size());
		System.out.println("AVG: " + AVG);
		
	}	
}