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
	
	public static ArrayList<String> generatePCMs(DependencyGraph graph, int PCMsAmount, int productsAmount, long seed, int k){
		ArrayList<String> PCMs = new ArrayList<String>();
		Random generator = new Random(seed);
		int iterations = PCMsAmount;
		while(iterations > 0){
			String PCM = "\"Product\",";
			
			for (DependencyVertex vertex : graph.getVertex()) {
				PCM += "\"" + vertex.getIdentifier() + "\",";
			}
			PCM += "\n";
			int i = 0;
			int productsIterations = productsAmount;
			while(productsIterations > 0){
				
				ArrayList<DependencyVertex> vertexToInclude = new ArrayList<DependencyVertex>();
				PCM += "\"P" + i + "\",";
				
				// Randomly choosing k vertex
				int graphSize = graph.getVertex().size();
				int iterationsK = k;
				while(iterationsK > 0){
					
					int currentVertexIndex = 0 + (int)(generator.nextDouble() * (graphSize - 1));
					DependencyVertex currentVertex = graph.getVertex().get(currentVertexIndex);
					addDependencies(currentVertex, vertexToInclude);
					iterationsK--;
				}
				
				String currentProduct = "";
				for (int j = 0; j < graphSize; j++) {
					boolean vertexIncluded = contains(vertexToInclude, ("F" + j));
					
					if(vertexIncluded)
						currentProduct += "\"YES\",";
					else
						currentProduct += "\"NO\",";
				}
				
				if(!exists(currentProduct, PCM)){
					PCM += currentProduct + "\n";
					i++;
					productsIterations--;
				}
			}
			
			PCMs.add(PCM);
			iterations--;
		}
		return PCMs;
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
