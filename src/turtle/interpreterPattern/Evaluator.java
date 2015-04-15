package turtle.interpreterPattern;

import java.util.Map;
import java.util.Stack;

import turtle.Turtle;

public class Evaluator implements IExpression {
	private IExpression syntaxTree;
	private Turtle aTurtle;

	public Evaluator(String expression, Turtle aTurtle) {
		Stack<IExpression> expressionStack = new Stack<IExpression>();
		for (String token : expression.split(" ")) {
			if (token.equals("Repeat")) {
			} else if (token.equals("End")) {
			} else if (token.equals("Move")) {
				IExpression subExpression = new Move(expressionStack.pop());
				expressionStack.push(subExpression);
			} else if (token.equals("Turn")) {
				IExpression left = expressionStack.pop();
				IExpression subExpression = new Turn(expressionStack.pop());
				expressionStack.push(subExpression);
			} else if (token.charAt(0) == '$') {
			} else {
			}
			// expressionStack.push(new Variable(token));
		}
		syntaxTree = expressionStack.pop();
	}

	@Override
	public Command interpret(Map<String, IExpression> variables) {
		// TODO Auto-generated method stub
		return syntaxTree.interpret(variables);
	}
}
