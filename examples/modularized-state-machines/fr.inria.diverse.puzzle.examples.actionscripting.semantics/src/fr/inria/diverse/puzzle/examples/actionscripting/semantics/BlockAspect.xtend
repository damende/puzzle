package fr.inria.diverse.puzzle.examples.actionscripting.semantics

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.Main

import actionscripting.Statement
import actionscripting.Block
import java.util.Hashtable

import static extension fr.inria.diverse.puzzle.examples.actionscripting.semantics.StatementAspect.*

@Aspect(className=Block)
class BlockAspect {
	
	@Main
	def void evalStatement(Hashtable<String, Object> context){
		for(Statement _statement : _self.statements){
			_statement.evalStatement(context)
		}
	}
}