var G = new jsnx.DiGraph();
G.addNodesFrom(["StateMachine: [FSM]","AbstractState: [FSM]","State: [FSM]","Transition: [FSM]","Trigger: [FSM]","Pseudostate: [FSM]","PseudostateKind: [FSM]","FinalState: [FSM]"], {group:0});
G.addNodesFrom(["Constraint: [FSM, Flowcharts]","RelationalConstraint: [FSM, Flowcharts]","Statement: [FSM, Flowcharts]","Program: [FSM, Flowcharts]","Conditional: [FSM, Flowcharts]","Loop: [FSM, Flowcharts]","VarDecl: [FSM, Flowcharts]","VarReference: [FSM, Flowcharts]","ConsoleOutput: [FSM, Flowcharts]","Println: [FSM, Flowcharts]","Print: [FSM, Flowcharts]","Assignation: [FSM, Flowcharts]","Wait: [FSM, Flowcharts]","NamedElement: [FSM, Flowcharts]"], {group:1});
G.addNodesFrom(["Expression: [FSM, Logo, Flowcharts]","Literal: [FSM, Logo, Flowcharts]","IntegerLit: [FSM, Logo, Flowcharts]","StringLit: [FSM, Logo, Flowcharts]","BoolLit: [FSM, Logo, Flowcharts]","ArithmeticExpression: [FSM, Logo, Flowcharts]","ArithmeticOperator: [FSM, Logo, Flowcharts]","RelationalExpression: [FSM, Logo, Flowcharts]","RelationalOperator: [FSM, Logo, Flowcharts]"], {group:2});
G.addNodesFrom(["LogoProgram: [Logo]","Instruction: [Logo]","Primitive: [Logo]","Back: [Logo]","Forward: [Logo]","Left: [Logo]","Right: [Logo]","PenDown: [Logo]","PenUp: [Logo]","Clear: [Logo]","ProcCall: [Logo]","ProcDeclaration: [Logo]","Block: [Logo]","If: [Logo]","ControlStructure: [Logo]","Repeat: [Logo]","While: [Logo]","Parameter: [Logo]","ParameterCall: [Logo]"], {group:3});
G.addNodesFrom(["Flowchart: [Flowcharts]","Node: [Flowcharts]","Arc: [Flowcharts]","Action: [Flowcharts]","Decision: [Flowcharts]","Start: [Flowcharts]","End: [Flowcharts]"], {group:4});

G.addEdgesFrom([["StateMachine: [FSM]","AbstractState: [FSM]"],["StateMachine: [FSM]","Transition: [FSM]"],["AbstractState: [FSM]","Transition: [FSM]"],["AbstractState: [FSM]","Transition: [FSM]"],["State: [FSM]","Program: [FSM, Flowcharts]"],["State: [FSM]","Program: [FSM, Flowcharts]"],["State: [FSM]","Program: [FSM, Flowcharts]"],["Transition: [FSM]","Trigger: [FSM]"],["Transition: [FSM]","AbstractState: [FSM]"],["Transition: [FSM]","AbstractState: [FSM]"],["Transition: [FSM]","Statement: [FSM, Flowcharts]"],["Transition: [FSM]","Constraint: [FSM, Flowcharts]"],["Pseudostate: [FSM]","PseudostateKind: [FSM]"],["RelationalConstraint: [FSM, Flowcharts]","Expression: [FSM, Logo, Flowcharts]"],["Program: [FSM, Flowcharts]","Statement: [FSM, Flowcharts]"],["Conditional: [FSM, Flowcharts]","Expression: [FSM, Logo, Flowcharts]"],["Conditional: [FSM, Flowcharts]","Program: [FSM, Flowcharts]"],["Loop: [FSM, Flowcharts]","Expression: [FSM, Logo, Flowcharts]"],["Loop: [FSM, Flowcharts]","Program: [FSM, Flowcharts]"],["VarDecl: [FSM, Flowcharts]","Expression: [FSM, Logo, Flowcharts]"],["Assignation: [FSM, Flowcharts]","VarDecl: [FSM, Flowcharts]"],["Assignation: [FSM, Flowcharts]","Expression: [FSM, Logo, Flowcharts]"],["ArithmeticExpression: [FSM, Logo, Flowcharts]","ArithmeticOperator: [FSM, Logo, Flowcharts]"],["ArithmeticExpression: [FSM, Logo, Flowcharts]","Expression: [FSM, Logo, Flowcharts]"],["ArithmeticExpression: [FSM, Logo, Flowcharts]","Expression: [FSM, Logo, Flowcharts]"],["RelationalExpression: [FSM, Logo, Flowcharts]","RelationalOperator: [FSM, Logo, Flowcharts]"],["RelationalExpression: [FSM, Logo, Flowcharts]","Expression: [FSM, Logo, Flowcharts]"],["RelationalExpression: [FSM, Logo, Flowcharts]","Expression: [FSM, Logo, Flowcharts]"],["LogoProgram: [Logo]","Instruction: [Logo]"],["Back: [Logo]","Expression: [FSM, Logo, Flowcharts]"],["Forward: [Logo]","Expression: [FSM, Logo, Flowcharts]"],["Left: [Logo]","Expression: [FSM, Logo, Flowcharts]"],["Right: [Logo]","Expression: [FSM, Logo, Flowcharts]"],["ProcCall: [Logo]","Expression: [FSM, Logo, Flowcharts]"],["ProcCall: [Logo]","ProcDeclaration: [Logo]"],["ProcDeclaration: [Logo]","Parameter: [Logo]"],["ProcDeclaration: [Logo]","ProcCall: [Logo]"],["ProcDeclaration: [Logo]","Instruction: [Logo]"],["Block: [Logo]","Instruction: [Logo]"],["If: [Logo]","Block: [Logo]"],["If: [Logo]","Block: [Logo]"],["ControlStructure: [Logo]","Expression: [FSM, Logo, Flowcharts]"],["Repeat: [Logo]","Block: [Logo]"],["While: [Logo]","Block: [Logo]"],["ParameterCall: [Logo]","Parameter: [Logo]"],["Flowchart: [Flowcharts]","Node: [Flowcharts]"],["Flowchart: [Flowcharts]","Arc: [Flowcharts]"],["Node: [Flowcharts]","Arc: [Flowcharts]"],["Node: [Flowcharts]","Arc: [Flowcharts]"],["Arc: [Flowcharts]","Node: [Flowcharts]"],["Arc: [Flowcharts]","Node: [Flowcharts]"],["Action: [Flowcharts]","Program: [FSM, Flowcharts]"],["Decision: [Flowcharts]","Constraint: [FSM, Flowcharts]"],["StateMachine: [FSM]","NamedElement: [FSM, Flowcharts]"],["AbstractState: [FSM]","NamedElement: [FSM, Flowcharts]"],["State: [FSM]","AbstractState: [FSM]"],["Transition: [FSM]","NamedElement: [FSM, Flowcharts]"],["Pseudostate: [FSM]","AbstractState: [FSM]"],["FinalState: [FSM]","State: [FSM]"],["RelationalConstraint: [FSM, Flowcharts]","Constraint: [FSM, Flowcharts]"],["Program: [FSM, Flowcharts]","Statement: [FSM, Flowcharts]"],["Conditional: [FSM, Flowcharts]","Statement: [FSM, Flowcharts]"],["Loop: [FSM, Flowcharts]","Statement: [FSM, Flowcharts]"],["VarDecl: [FSM, Flowcharts]","Statement: [FSM, Flowcharts]"],["VarReference: [FSM, Flowcharts]","Expression: [FSM, Logo, Flowcharts]"],["ConsoleOutput: [FSM, Flowcharts]","Statement: [FSM, Flowcharts]"],["Println: [FSM, Flowcharts]","ConsoleOutput: [FSM, Flowcharts]"],["Print: [FSM, Flowcharts]","ConsoleOutput: [FSM, Flowcharts]"],["Assignation: [FSM, Flowcharts]","Statement: [FSM, Flowcharts]"],["Wait: [FSM, Flowcharts]","Statement: [FSM, Flowcharts]"],["Literal: [FSM, Logo, Flowcharts]","Expression: [FSM, Logo, Flowcharts]"],["IntegerLit: [FSM, Logo, Flowcharts]","Literal: [FSM, Logo, Flowcharts]"],["StringLit: [FSM, Logo, Flowcharts]","Literal: [FSM, Logo, Flowcharts]"],["BoolLit: [FSM, Logo, Flowcharts]","Literal: [FSM, Logo, Flowcharts]"],["ArithmeticExpression: [FSM, Logo, Flowcharts]","Expression: [FSM, Logo, Flowcharts]"],["RelationalExpression: [FSM, Logo, Flowcharts]","Expression: [FSM, Logo, Flowcharts]"],["Primitive: [Logo]","Instruction: [Logo]"],["Back: [Logo]","Primitive: [Logo]"],["Forward: [Logo]","Primitive: [Logo]"],["Left: [Logo]","Primitive: [Logo]"],["Right: [Logo]","Primitive: [Logo]"],["PenDown: [Logo]","Primitive: [Logo]"],["PenUp: [Logo]","Primitive: [Logo]"],["Clear: [Logo]","Primitive: [Logo]"],["ProcCall: [Logo]","Expression: [FSM, Logo, Flowcharts]"],["ProcDeclaration: [Logo]","Instruction: [Logo]"],["Block: [Logo]","Instruction: [Logo]"],["If: [Logo]","ControlStructure: [Logo]"],["ControlStructure: [Logo]","Instruction: [Logo]"],["Repeat: [Logo]","ControlStructure: [Logo]"],["While: [Logo]","ControlStructure: [Logo]"],["Parameter: [Logo]","Expression: [FSM, Logo, Flowcharts]"],["ParameterCall: [Logo]","Expression: [FSM, Logo, Flowcharts]"],["Flowchart: [Flowcharts]","NamedElement: [FSM, Flowcharts]"],["Node: [Flowcharts]","NamedElement: [FSM, Flowcharts]"],["Action: [Flowcharts]","Node: [Flowcharts]"],["Decision: [Flowcharts]","Node: [Flowcharts]"],["Start: [Flowcharts]","Node: [Flowcharts]"],["End: [Flowcharts]","Node: [Flowcharts]"]]);
