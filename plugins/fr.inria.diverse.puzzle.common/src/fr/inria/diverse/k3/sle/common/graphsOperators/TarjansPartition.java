package fr.inria.diverse.k3.sle.common.graphsOperators;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import fr.inria.diverse.k3.sle.common.commands.ConceptComparison;
import fr.inria.diverse.k3.sle.common.commands.GraphPartition;
import fr.inria.diverse.k3.sle.common.graphs.EcoreArc;
import fr.inria.diverse.k3.sle.common.graphs.EcoreGraph;
import fr.inria.diverse.k3.sle.common.graphs.EcoreVertex;
import fr.inria.diverse.k3.sle.common.tuples.TupleMembersConcepts;

public class TarjansPartition implements GraphPartition {

	private int tarjansIndex;
	private Stack<EcoreVertex> tarjansStack;
	
	@Override
	public void graphPartition(EcoreGraph graph,
			ArrayList<TupleMembersConcepts> membersConceptList,
			ConceptComparison conceptComparisonOperator) {
		
		this.tarjansIndex = 0;
		tarjansStack = new Stack<EcoreVertex>();
		graph.setGroups(new ArrayList<ArrayList<EcoreVertex>>());
		for (EcoreVertex currentVertex : graph.getVertex()) {
			if(currentVertex.getTarjansIndex() == -1){
				this.strongConnect(graph, currentVertex);
			}
		}
	}

	private void strongConnect(EcoreGraph graph, EcoreVertex theVertex) {
		theVertex.setTarjansIndex(this.tarjansIndex);
		theVertex.setTarjansLowlink(this.tarjansIndex);
		this.tarjansIndex++;
		this.tarjansStack.push(theVertex);
		theVertex.setOnTarjansStack(true);
		
		for (EcoreVertex sucessor : this.getSucessors(graph, theVertex)) {
			if(sucessor.getTarjansIndex() == -1){
				this.strongConnect(graph, sucessor);
				theVertex.setTarjansLowlink(Math.min(theVertex.getTarjansLowlink(), sucessor.getTarjansLowlink()));
			}
			else if(sucessor.isOnTarjansStack()){
				theVertex.setTarjansLowlink(Math.min(theVertex.getTarjansLowlink(), sucessor.getTarjansLowlink()));
			}
		}
		
		if(theVertex.getTarjansLowlink() == theVertex.getTarjansIndex()){
			ArrayList<EcoreVertex> newGroup = new ArrayList<EcoreVertex>();
			EcoreVertex sucessor = null;
			do{
				sucessor = tarjansStack.pop();
				sucessor.setOnTarjansStack(false);
				newGroup.add(sucessor);
			} while(!theVertex.getVertexId().equals(sucessor.getVertexId()));
			graph.getGroups().add(newGroup);
		}
	}

	private List<EcoreVertex> getSucessors(EcoreGraph graph, EcoreVertex theVertex) {
		List<EcoreVertex> sucessors = new ArrayList<EcoreVertex>();
		for (EcoreArc arc : graph.getArcs()) {
			if(arc.getFrom().getVertexId().equals(theVertex.getVertexId()))
				sucessors.add(arc.getTo());
		}
		return sucessors;
	}
}