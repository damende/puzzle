package fr.inria.diverse.puzzle.metrics;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcoreFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import fr.inria.diverse.puzzle.metrics.auxiliarMetrics.PairwiseCohesionMatrix;

public class HCCalculatorTest {

	// -------------------------------------------------
	// Scenarios
	// -------------------------------------------------
	
	private EClass stateMachine;
	private EClass state;
	private EClass transition;
	private EClass statement;
	private EClass block;
	private EClass conditional;
	private EClass loop;
	private List<EClass> metaclasses;
	
	// -------------------------------------------------
	// Scenarios loading
	// -------------------------------------------------
	
	@Before
	public void loadScenario(){
		// Creating EClasses
		stateMachine = EcoreFactory.eINSTANCE.createEClass();
		stateMachine.setName("StateMachine");
		
		state = EcoreFactory.eINSTANCE.createEClass();
		state.setName("State");
		
		transition = EcoreFactory.eINSTANCE.createEClass();
		transition.setName("Transition");
		
		statement = EcoreFactory.eINSTANCE.createEClass();
		statement.setName("Statement");
		statement.setAbstract(true);
		
		block = EcoreFactory.eINSTANCE.createEClass();
		block.setName("Block");
		
		conditional = EcoreFactory.eINSTANCE.createEClass();
		conditional.setName("Conditional");
		
		loop = EcoreFactory.eINSTANCE.createEClass();
		loop.setName("Loop");
		
		metaclasses = new ArrayList<EClass>();
		metaclasses.add(stateMachine);
		metaclasses.add(state);
		metaclasses.add(transition);
		metaclasses.add(statement);
		metaclasses.add(block);
		metaclasses.add(conditional);
		metaclasses.add(loop);
		
		// Creating EReferences
		EReference states = EcoreFactory.eINSTANCE.createEReference();
		states.setContainment(true);
		states.setName("states");
		states.setEType(state);
		stateMachine.getEStructuralFeatures().add(states);
		
		EReference stateMachineStates = EcoreFactory.eINSTANCE.createEReference();
		stateMachineStates.setContainment(false);
		stateMachineStates.setEType(stateMachine);
		stateMachineStates.setName("stateMachine");
		stateMachineStates.setEOpposite(states);
		state.getEStructuralFeatures().add(stateMachineStates);
		
		EReference transitions = EcoreFactory.eINSTANCE.createEReference();
		transitions.setContainment(true);
		transitions.setName("transitions");
		transitions.setEType(transition);
		stateMachine.getEStructuralFeatures().add(transitions);
		
		EReference stateMachineTransitions = EcoreFactory.eINSTANCE.createEReference();
		stateMachineTransitions.setContainment(false);
		stateMachineTransitions.setName("stateMachine");
		stateMachineTransitions.setEType(stateMachine);
		stateMachineTransitions.setEOpposite(transitions);
		transition.getEStructuralFeatures().add(stateMachineTransitions);
		
		EReference incoming = EcoreFactory.eINSTANCE.createEReference();
		incoming.setContainment(false);
		incoming.setName("incoming");
		incoming.setEType(transition);
		incoming.setLowerBound(0);
		incoming.setUpperBound(-1);
		state.getEStructuralFeatures().add(incoming);
		
		EReference target = EcoreFactory.eINSTANCE.createEReference();
		target.setContainment(false);
		target.setName("target");
		target.setEType(state);
		target.setLowerBound(1);
		target.setUpperBound(1);
		target.setEOpposite(incoming);
		transition.getEStructuralFeatures().add(target);
		
		EReference outgoing = EcoreFactory.eINSTANCE.createEReference();
		outgoing.setContainment(false);
		outgoing.setName("outgoing");
		outgoing.setEType(transition);
		outgoing.setLowerBound(0);
		outgoing.setUpperBound(-1);
		state.getEStructuralFeatures().add(outgoing);
		
		EReference source = EcoreFactory.eINSTANCE.createEReference();
		source.setContainment(false);
		source.setName("source");
		source.setEType(state);
		source.setLowerBound(1);
		source.setUpperBound(1);
		source.setEOpposite(outgoing);
		transition.getEStructuralFeatures().add(source);
		
		EReference doAction = EcoreFactory.eINSTANCE.createEReference();
		doAction.setContainment(true);
		doAction.setName("doAction");
		doAction.setEType(block);
		doAction.setLowerBound(0);
		doAction.setUpperBound(1);
		state.getEStructuralFeatures().add(doAction);
		
		EReference conditionalBody = EcoreFactory.eINSTANCE.createEReference();
		conditionalBody.setContainment(true);
		conditionalBody.setName("body");
		conditionalBody.setEType(block);
		conditionalBody.setLowerBound(0);
		conditionalBody.setUpperBound(1);
		conditional.getEStructuralFeatures().add(conditionalBody);
		
		EReference loopBody = EcoreFactory.eINSTANCE.createEReference();
		loopBody.setContainment(true);
		loopBody.setName("body");
		loopBody.setEType(block);
		loopBody.setLowerBound(0);
		loopBody.setUpperBound(1);
		loop.getEStructuralFeatures().add(loopBody);
		
		// Creating ESuperTypes
		block.getESuperTypes().add(statement);
		conditional.getESuperTypes().add(statement);
		loop.getESuperTypes().add(statement);
	}
	
	// -------------------------------------------------
	// Test cases
	// -------------------------------------------------
	
	@Test
	public void testMetricComputation(){
		double[][] matrix = PairwiseCohesionMatrix.computePairwiseCohesionMatrix(metaclasses);
		
		Assert.assertEquals(0.14, matrix[0][1], 0.01);
		Assert.assertEquals(0.14, matrix[0][2], 0.01);
		Assert.assertEquals(0, matrix[0][3], 0);
		Assert.assertEquals(0, matrix[0][4], 0);
		Assert.assertEquals(0, matrix[0][5], 0);
		Assert.assertEquals(0, matrix[0][5], 0);
		
		Assert.assertEquals(0.28, matrix[1][2], 0.01);
		Assert.assertEquals(0, matrix[1][3], 0);
		Assert.assertEquals(0.07, matrix[1][4], 0.01);
		Assert.assertEquals(0, matrix[1][5], 0);
		Assert.assertEquals(0, matrix[1][5], 0);
		
		Assert.assertEquals(0, matrix[2][3], 0);
		Assert.assertEquals(0, matrix[2][4], 0);
		Assert.assertEquals(0, matrix[2][5], 0);
		Assert.assertEquals(0, matrix[2][5], 0);
		
		Assert.assertEquals(0.07, matrix[3][4], 0.01);
		Assert.assertEquals(0.07, matrix[3][5], 0.01);
		Assert.assertEquals(0.07, matrix[3][5], 0.01);
		
		Assert.assertEquals(0.07, matrix[4][5], 0.01);
		Assert.assertEquals(0.07, matrix[4][5], 0.01);
		
		Assert.assertEquals(0, matrix[5][5], 0);
	}
}
