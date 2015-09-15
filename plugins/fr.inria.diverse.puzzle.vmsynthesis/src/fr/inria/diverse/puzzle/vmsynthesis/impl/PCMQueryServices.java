package fr.inria.diverse.puzzle.vmsynthesis.impl;

import java.util.ArrayList;
import java.util.List;

/**
 * Provides query services for PCMs.
 * @author David Mendez-Acuna
 *
 */
public class PCMQueryServices {

	// ----------------------------------------------------------
	// Attributes
	// ----------------------------------------------------------
	
	private static PCMQueryServices instance;
	
	private String[][] PCM;
	
	// ----------------------------------------------------------
	// Constructor and singleton
	// ----------------------------------------------------------
	
	private PCMQueryServices(){
		
	}
	
	public static PCMQueryServices getInstance(){
		if(instance == null)
			instance = new PCMQueryServices();
		return instance;
	}
	
	// ----------------------------------------------------------
	// Methods
	// ----------------------------------------------------------
	
	public boolean existsProductWithFeature(String feature){
		for (int i = 0; i < PCM.length; i++) {
			for (int j = 0; j < PCM.length; j++) {
				if(PCM[0][j].equals(feature)){
					if(PCM[i][j].equals("YES"))
						return true;
				}
			}
		}
		return false;
	}
	
	public boolean existsProductWithoutFeature(String feature) {
		for (int i = 1; i < PCM.length; i++) {
			for (int j = 1; j < PCM[0].length; j++) {
				if(PCM[0][j].equals("\"" + feature + "\"")){
					if(PCM[i][j].equals("\"NO\""))
						return true;
				}
			}
		}
		return false;
	}
	
	public boolean productContainsFeature(String product, String feature){
		for (int i = 1; i < PCM.length; i++) {
			if(PCM[i][0].equals(product)){
				for (int j = 1; j < PCM[0].length; j++) {
					if(PCM[0][j].equals(feature)){
						String answer = PCM[i][j];
						if(answer.equals("YES"))
							return true;
						else
							return false;
					}
				}
			}
		}
		return false;
	}
	
	public ArrayList<String> getProductsContainingFeature(String feature){
		ArrayList<String> answer = new ArrayList<String>();
		for (int i = 1; i < PCM.length; i++) {
			String currentProduct = PCM[i][0];
			for (int j = 1; j < PCM[0].length; j++) {
				if(PCM[0][j].replace("\"", "").equals(feature)){
					if(PCM[i][j].replace("\"", "").equals("YES")){
						answer.add(currentProduct);
						break;
					}
				}
			}
		}
		return answer;
	}
	
	public boolean xor(List<String> features){
		ArrayList<ArrayList<String>> productsSet = new ArrayList<ArrayList<String>>();
		for (String feature : features) {
			productsSet.add(this.getProductsContainingFeature(feature));
		}
		return this.disjointSets(productsSet);
	}
	
	private boolean disjointSets(ArrayList<ArrayList<String>> set){
		ArrayList<String> bigSet = new ArrayList<String>();
		int sumCount = 0;
		for (ArrayList<String> arrayList : set) {
			sumCount += arrayList.size();
			for (String string : arrayList) {
				if(!bigSet.contains(string))
					bigSet.add(string);
			}
		}
		
		return sumCount == bigSet.size();
	}
	
	
	public void loadPCM(String PCMString){
		String[] products = PCMString.split("\n");
		int productsAmount = products.length;
		
		String[] features = products[0].split(",");
		int featuresAmount = features.length;
		
		PCM = new String[productsAmount][featuresAmount];
		
		for (int i = 1; i < features.length; i++) {
			PCM[0][i] = features[i];
		}
		
		for (int i = 1; i < products.length; i++) {
			String[] productFeatures = products[i].split(",");
			for (int j = 0; j < productFeatures.length; j++) {
				PCM[i][j] = productFeatures[j];
			}
		}
		
		this.printPCM();
	}
	
	private void printPCM(){
		for (int i = 0; i < PCM.length; i++) {
			for (int j = 0; j < PCM[0].length; j++) {
				System.out.print(PCM[i][j] + ",");
			}
			System.out.println();
		}
	}

	public boolean existsProductWithFeatureAWithoutFeatureB(String A,
			String B) {
		
		for (int i = 1; i < PCM.length; i++) {
			boolean withA = false;
			for (int j = 1; j < PCM[0].length; j++) {
				if(PCM[0][j].equals("\"" + A + "\"")){
					if(PCM[i][j].equals("\"YES\""))
						withA = true;
				}
			}
			
			boolean withoutB = false;
			for (int j = 1; j < PCM[0].length; j++) {
				if(PCM[0][j].equals("\"" + A + "\"")){
					if(PCM[i][j].equals("\"NO\""))
						withoutB = true;
				}
			}
			
			if(withA && withoutB)
				return true;
			
		}
		return false;
	}
}
