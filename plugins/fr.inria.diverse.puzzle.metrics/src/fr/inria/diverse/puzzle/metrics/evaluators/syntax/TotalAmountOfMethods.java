package fr.inria.diverse.puzzle.metrics.evaluators.syntax;

import java.util.ArrayList;

import fr.inria.diverse.k3.sle.common.comparisonOperators.ConceptComparison;
import fr.inria.diverse.k3.sle.common.comparisonOperators.MethodComparison;
import fr.inria.diverse.k3.sle.common.tuples.TupleConceptMethodMember;
import fr.inria.diverse.k3.sle.common.tuples.TupleConceptMethodMembers;
import fr.inria.diverse.k3.sle.common.utils.FamiliesServices;
import fr.inria.diverse.melange.metamodel.melange.Language;

public class TotalAmountOfMethods {

	public static int evaluateMetric(ArrayList<Language> languages, ConceptComparison conceptComparisonOperator, MethodComparison methodComparisonOperator ){
		ArrayList<TupleConceptMethodMember> conceptMethodMemberList = FamiliesServices.getInstance().getConceptMethodMemberMappingList(languages);
		ArrayList<TupleConceptMethodMembers> conceptMethodMemberGroupList = FamiliesServices.getInstance().getConceptMethodMemberGroupList(conceptMethodMemberList, conceptComparisonOperator, methodComparisonOperator);
		return conceptMethodMemberGroupList.size();
	}
}
