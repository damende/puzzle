package fr.inria.diverse.k3.sle.common.comparisonOperators;

import org.eclipse.xtext.common.types.JvmOperation;

/**
 * Service for methods comparison by simple naming match
 * @author David Mendez-Acuna
 */
public class NamingMethodComparison implements MethodComparison {

	@Override
	public boolean equal(JvmOperation left, JvmOperation right) {
		return left.getSimpleName().equals(right.getSimpleName());
	}
}