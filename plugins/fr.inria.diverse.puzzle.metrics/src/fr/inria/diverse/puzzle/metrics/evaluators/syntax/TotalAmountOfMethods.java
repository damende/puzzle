package fr.inria.diverse.puzzle.metrics.evaluators.syntax;

import java.util.ArrayList;

import fr.inria.diverse.k3.sle.common.comparisonOperators.ConceptComparison;
import fr.inria.diverse.k3.sle.common.comparisonOperators.MethodComparison;
import fr.inria.diverse.k3.sle.common.utils.FamiliesServices;
import fr.inria.diverse.k3.sle.common.vos.ConceptMethodMemberVO;
import fr.inria.diverse.k3.sle.common.vos.ConceptMethodMembersGroupVO;
import fr.inria.diverse.melange.metamodel.melange.Language;

public class TotalAmountOfMethods {

	public static double evaluateMetric(ArrayList<Language> languages, ConceptComparison conceptComparisonOperator, MethodComparison methodComparisonOperator ){
		ArrayList<ConceptMethodMemberVO> conceptMethodMemberList = FamiliesServices.getInstance().getConceptMethodMemberMappingList(languages);
		ArrayList<ConceptMethodMembersGroupVO> conceptMethodMemberGroupList = FamiliesServices.getInstance().getConceptMethodMemberGroupList(conceptMethodMemberList, conceptComparisonOperator, methodComparisonOperator);
		return conceptMethodMemberGroupList.size();
	}
}
