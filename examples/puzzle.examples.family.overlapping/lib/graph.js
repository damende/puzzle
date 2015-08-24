var G = new jsnx.DiGraph();
G.addNodesFrom(["NamedElement","StateMachine","AbstractState","State","Transition","Trigger","Pseudostate","PseudostateKind","FinalState","Statement","Program","Conditional","Loop","VarDecl","ConsoleOutput","Println","Print","Assignation","Wait"], {group:0});
G.addNodesFrom(["Constraint","RelationalConstraint","VarReference"], {group:1});
G.addNodesFrom(["Expression","Literal","IntegerLit","StringLit","BoolLit","ArithmeticExpression","ArithmeticOperator","RelationalExpression","RelationalOperator"], {group:2});
G.addNodesFrom(["Instruction","Primitive","Back","Forward","Left","Right","PenDown","PenUp","Clear","ProcCall","ProcDeclaration","Block","If","ControlStructure","Repeat","While","Parameter","ParameterCall","LogoProgram"], {group:3});
G.addNodesFrom(["Flowchart","Node","Arc","Subflow","Action","Decision"], {group:4});

G.addEdgesFrom([["StateMachine","AbstractState"],["StateMachine","Transition"],["AbstractState","Transition"],["AbstractState","Transition"],["State","Program"],["State","Program"],["State","Program"],["Transition","Trigger"],["Transition","AbstractState"],["Transition","AbstractState"],["Transition","Statement"],["Transition","Constraint"],["Pseudostate","PseudostateKind"],["RelationalConstraint","Expression"],["Program","Statement"],["Conditional","Expression"],["Conditional","Program"],["Loop","Expression"],["Loop","Program"],["VarDecl","Expression"],["ArithmeticExpression","ArithmeticOperator"],["ArithmeticExpression","Expression"],["ArithmeticExpression","Expression"],["RelationalExpression","RelationalOperator"],["RelationalExpression","Expression"],["RelationalExpression","Expression"],["Assignation","VarDecl"],["Assignation","Expression"],["Back","Expression"],["Forward","Expression"],["Left","Expression"],["Right","Expression"],["ProcCall","Expression"],["ProcCall","ProcDeclaration"],["ProcDeclaration","Parameter"],["ProcDeclaration","ProcCall"],["ProcDeclaration","Instruction"],["Block","Instruction"],["If","Block"],["If","Block"],["ControlStructure","Expression"],["Repeat","Block"],["While","Block"],["ParameterCall","Parameter"],["LogoProgram","Instruction"],["Flowchart","Node"],["Flowchart","Arc"],["Node","Arc"],["Node","Arc"],["Arc","Node"],["Arc","Node"],["Decision","Constraint"],["StateMachine","NamedElement"],["AbstractState","NamedElement"],["State","AbstractState"],["Transition","NamedElement"],["Pseudostate","AbstractState"],["FinalState","State"],["RelationalConstraint","Constraint"],["Program","Statement"],["Conditional","Statement"],["Loop","Statement"],["VarDecl","Statement"],["Literal","Expression"],["IntegerLit","Literal"],["StringLit","Literal"],["BoolLit","Literal"],["ArithmeticExpression","Expression"],["RelationalExpression","Expression"],["VarReference","Expression"],["ConsoleOutput","Statement"],["Println","ConsoleOutput"],["Print","ConsoleOutput"],["Assignation","Statement"],["Wait","Statement"],["Primitive","Instruction"],["Back","Primitive"],["Forward","Primitive"],["Left","Primitive"],["Right","Primitive"],["PenDown","Primitive"],["PenUp","Primitive"],["Clear","Primitive"],["ProcCall","Expression"],["ProcDeclaration","Instruction"],["Block","Instruction"],["If","ControlStructure"],["ControlStructure","Instruction"],["Repeat","ControlStructure"],["While","ControlStructure"],["ParameterCall","Expression"],["Subflow","Flowchart"],["Subflow","Node"],["Action","Node"],["Decision","Node"]]);