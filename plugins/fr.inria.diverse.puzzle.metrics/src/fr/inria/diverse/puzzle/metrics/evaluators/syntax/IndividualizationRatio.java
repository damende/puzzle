package fr.inria.diverse.puzzle.metrics.evaluators.syntax;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EPackage;

import fr.inria.diverse.k3.sle.common.comparisonOperators.ConceptComparison;
import fr.inria.diverse.k3.sle.common.comparisonOperators.MethodComparison;
import fr.inria.diverse.k3.sle.common.tuples.TupleConceptMember;
import fr.inria.diverse.k3.sle.common.tuples.TupleConceptMembers;
import fr.inria.diverse.k3.sle.common.tuples.TupleConceptMethodMember;
import fr.inria.diverse.k3.sle.common.tuples.TupleConceptMethodMembers;
import fr.inria.diverse.k3.sle.common.utils.FamiliesServices;
import fr.inria.diverse.k3.sle.common.utils.MelangeServices;
import fr.inria.diverse.melange.metamodel.melange.Language;

/**
 * Chart metric for the Individualization Ratio (IR)
 * @author David Mendez-Acuna
 */
public class IndividualizationRatio implements ChartMetric {

	// ---------------------------------------------------
	// Methods
	// ---------------------------------------------------

	@Override
	public String getVariablesDeclaration(ArrayList<Language> languages, ConceptComparison conceptComparisonOperator, MethodComparison methodComparisonOperator) throws Exception{
		ArrayList<EPackage> ePackages = MelangeServices.getEPackagesByALanguagesList(languages);
		
		String answer = "var barIndividualizationRatio = {\n";
		
		boolean first = true;
		String labels = "";
		for (EPackage ePackage : ePackages) {
			if(!first) labels += ",";
			labels += "\"" + ePackage.getName() + "\"";
			first = false;
		}
		
		answer += "   labels : [" + labels + "],\n";
		answer += "   datasets : [\n";
		answer += "     {\n";
		answer += "        fillColor : \"rgba(220,220,220,0.5)\",\n";
		answer += "        strokeColor : \"rgba(220,220,220,0.8)\",\n";
		answer += "        highlightFill: \"rgba(220,220,220,0.75)\",\n";
		answer += "        highlightStroke: \"rgba(220,220,220,1)\",\n";
		answer += "        data : [" + evaluateForSyntax(languages, conceptComparisonOperator) + "]\n";
		answer += "      },\n";
		answer += "      {\n";
		answer += "        fillColor : \"rgba(151,187,205,0.5)\",\n";
		answer += "        strokeColor : \"rgba(151,187,205,0.8)\",\n";
		answer += "        highlightFill : \"rgba(151,187,205,0.75)\",\n";
		answer += "        highlightStroke : \"rgba(151,187,205,1)\",\n";
		answer += "        data : [" + evaluateForSemantics(languages, conceptComparisonOperator, methodComparisonOperator) + "]\n"; 
		answer += "      }\n";
		answer += "    ]\n";
		answer += "};\n";
		
		return answer;
	}
	
	@Override
	public String getWindow(ArrayList<Language> languages){
		String answer = "    var ctxIndividualizationRatio = document.getElementById(\"pie-individualization-ratio\").getContext(\"2d\");\n";
		answer += "    window.window.myBarIndividualizationRatio = new Chart(ctxIndividualizationRatio).Bar(barIndividualizationRatio, {\n";
		answer += "       responsive : false\n";
		answer += "    });\n\n";
		return answer;
	}
	
	// ---------------------------------------------------
	// Auxiliar Services
	// ---------------------------------------------------

	private String evaluateForSyntax(ArrayList<Language> languages, ConceptComparison comparisonOperator) throws Exception{
		String answer = "";
		ArrayList<EPackage> ePackages = MelangeServices.getEPackagesByALanguagesList(languages);
		ArrayList<TupleConceptMember> conceptMemberList = FamiliesServices.getInstance().getConceptMemberMappingList(ePackages);
		ArrayList<TupleConceptMembers> conceptMemberGroupList = FamiliesServices.getInstance().getConceptMemberGroupList(conceptMemberList, comparisonOperator);
		boolean first = true;
		for (EPackage ePackage : ePackages) {
			double count = 0;
			for (TupleConceptMembers conceptMembersGroupVO : conceptMemberGroupList) {
				if(conceptMembersGroupVO.getMembers().size() >= 2 && conceptMembersGroupVO.getMembers().contains(ePackage.getName())){
					count++;
				}
			}
			double individualizationRatio = (count/countConstructs(ePackage))*100;
			
			if(!first)
				answer +=  ",";
			answer += individualizationRatio;
			first = false;
		}
		
		return answer;
	}
	
	private String evaluateForSemantics(ArrayList<Language> languages, ConceptComparison conceptComparisonOperator, MethodComparison methodComparisonOperator) throws Exception{
		ArrayList<EPackage> ePackages = MelangeServices.getEPackagesByALanguagesList(languages);
		String answer = "";
		ArrayList<TupleConceptMethodMember> conceptMethodMemberList = FamiliesServices.getInstance().getConceptMethodMemberMappingList(languages);
		ArrayList<TupleConceptMethodMembers> conceptMethodMemberGroupList = FamiliesServices.getInstance().getConceptMethodMemberGroupList(conceptMethodMemberList, conceptComparisonOperator, methodComparisonOperator);
		
		boolean first = true;
		for (EPackage ePackage : ePackages) {
			double count = 0;
			for (TupleConceptMethodMembers conceptMethodMembersGroupVO : conceptMethodMemberGroupList) {
				if(conceptMethodMembersGroupVO.getMembers().size() >= 2 && conceptMethodMembersGroupVO.getMembers().contains(ePackage.getName())){
					count++;
				}
			}
			double individualizationRatio = (count/countConstructs(ePackage))*100;
			
			if(!first)
				answer +=  ",";
			answer += individualizationRatio;
			first = false;
		}
		
		return answer;
	}
	
	private static double countConstructs(EPackage ePackage){
		double count = ePackage.getEClassifiers().size();
		
		for (EPackage eSubPackage : ePackage.getESubpackages()) {
			count += countConstructs(eSubPackage);
		}
		
		return count;
	}
}
