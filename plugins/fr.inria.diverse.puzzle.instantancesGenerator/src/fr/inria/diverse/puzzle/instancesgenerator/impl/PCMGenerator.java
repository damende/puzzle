package fr.inria.diverse.puzzle.instancesgenerator.impl;

import java.util.ArrayList;
import java.util.Random;

import fr.inria.diverse.k3.sle.common.graphs.DependencyArc;
import fr.inria.diverse.k3.sle.common.graphs.DependencyGraph;
import fr.inria.diverse.k3.sle.common.graphs.DependencyVertex;

/**
 * Random generator of PCMs for a given dependencies graph.
 * 
 * @author David Mendez-Acuna
 * 
 */
public class PCMGenerator {

	// -------------------------------------------------------
	// Methods
	// -------------------------------------------------------
	
	public static String generatePCMs(DependencyGraph graph, int productsAmount, long seed, int k){
		Random generator = new Random(seed);
		int count = 0;
		String PCM = "\"Product\",";
		
		for (DependencyVertex vertex : graph.getVertex()) {
			PCM += "\"" + vertex.getIdentifier() + "\",";
		}
		PCM += "\n";
		int i = 0;
		int productsIterations = productsAmount;
		while(productsIterations > 0){
			
			ArrayList<DependencyVertex> vertexToInclude = new ArrayList<DependencyVertex>();
			
			// Randomly choosing k vertex
			int graphSize = graph.getVertex().size();
			int iterationsK = 1;
			while(iterationsK > 0){
				
				int currentVertexIndex = 0 + (int)(generator.nextDouble() * (graphSize));
				DependencyVertex currentVertex = graph.getVertex().get(currentVertexIndex);
				addDependencies(currentVertex, vertexToInclude);
				iterationsK--;
			}
			
			String currentProduct = "";
			for (int j = 1; j <= graphSize; j++) {
				boolean vertexIncluded = contains(vertexToInclude, ("F" + j));
				
				if(vertexIncluded)
					currentProduct += "\"YES\",";
				else
					currentProduct += "\"NO\",";
			}
			
			if(!exists(currentProduct, PCM) /*&& currentProduct.contains("NO")*/){
				PCM += "\"P" + i + "\",";
				PCM += currentProduct + "\n";
				i++;
				productsIterations--;
			}else{
				count++;
			}
			
			if(count > 900){
				System.out.println("No hay tantos productos como pide!");
				return PCM;
			}
		}
		
		return PCM;
	}

	private static boolean exists(String currentProduct, String PCM) {
		String[] products = PCM.split("\n");
		for (String product : products) {
			if(product.endsWith(currentProduct))
				return true;
		}
		return false;
	}

	private static boolean contains(
			ArrayList<DependencyVertex> array, String vertexIdentifier) {
		for (DependencyVertex dependencyVertex : array) {
			if(dependencyVertex.getIdentifier().equals(vertexIdentifier))
				return true;
		}
		return false;
	}

	/**
	 * Add the dependencies to the given vertex in the array in the parameter. 
	 * @param vertex
	 * @param array
	 */
	private static void addDependencies(DependencyVertex vertex,
			ArrayList<DependencyVertex> array) {
		
		if(!array.contains(vertex))
			array.add(vertex);
		
		for (DependencyArc arc : vertex.getOutgoingArcs()) {
			addDependencies(arc.getTo(), array);
		}
	}
}