package fr.inria.diverse.puzzle.metrics.evaluators.syntax;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EPackage;

import fr.inria.diverse.k3.sle.common.comparisonOperators.ConceptComparison;
import fr.inria.diverse.k3.sle.common.tuples.EcoreNode;
import fr.inria.diverse.k3.sle.common.tuples.TupleConceptMember;
import fr.inria.diverse.k3.sle.common.tuples.TupleConceptMembers;
import fr.inria.diverse.k3.sle.common.tuples.EcoreArc;
import fr.inria.diverse.k3.sle.common.tuples.EcoreGraph;
import fr.inria.diverse.k3.sle.common.tuples.TupleMembersConcepts;
import fr.inria.diverse.k3.sle.common.utils.FamiliesServices;
import fr.inria.diverse.k3.sle.common.utils.MelangeServices;
import fr.inria.diverse.melange.metamodel.melange.Language;

public class DependenciesGraph {

	public static String getVariablesDeclaration(ArrayList<Language> languages, ConceptComparison conceptComparisonOperator) throws Exception{
		String answer = "";
		ArrayList<EPackage> ePackages = MelangeServices.getEPackagesByALanguagesList(languages);
		ArrayList<TupleConceptMember> conceptMemberList = FamiliesServices.getInstance().getConceptMemberMappingList(ePackages);
		ArrayList<TupleConceptMembers> conceptMembersList = FamiliesServices.getInstance().getConceptMemberGroupList(conceptMemberList, conceptComparisonOperator);
		ArrayList<TupleMembersConcepts> membersConceptList = FamiliesServices.getInstance().getMembersGroupVsConceptVOList(conceptMembersList);
		EcoreGraph dependenciesGraph = new EcoreGraph(conceptMembersList);
		dependenciesGraph.groupGraphByFamilyMembership(membersConceptList);
		
		answer += "var G = new jsnx.DiGraph();\n";
		int i = 0;
		for (ArrayList<EcoreNode> group : dependenciesGraph.getGroups()) {
			String nodes = "";
			boolean first = true;
			for (EcoreNode currentNode : group) {
				if(!first)
					nodes += ",";
				nodes += "\"" + currentNode.getNodeId() + "\"";
				first = false;
			}
			answer += "G.addNodesFrom([" + nodes + "], {group:" + i + "});\n";
			i++;
		}
		answer += "\n";
		if(dependenciesGraph.getArcs().size() > 0){
			answer += "G.addEdgesFrom([";
			
			boolean first = true;
			for (EcoreArc arc : dependenciesGraph.getArcs()) {
				if(!first) answer += ",";
				answer += "[\"" + arc.getFrom().getClassifier().getName() + "\",\""+ arc.getTo().getClassifier().getName() +"\"]";
				first = false;
			}
			answer += "]);\n";
		}
		return answer;
	}
}