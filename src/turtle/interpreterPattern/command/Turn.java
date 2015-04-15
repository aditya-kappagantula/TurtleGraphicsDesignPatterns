package turtle.interpreterPattern.command;

import java.util.Map;

import turtle.Turtle;
import turtle.interpreterPattern.IExpression;

public class Turn extends Command implements IExpression {
	IExpression rightOperand;

	public Turn(IExpression rightOperand) {
		this.rightOperand = rightOperand;
	}

	@Override
	public Command interpret(Map<String, IExpression> variables) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void execute(Turtle aTurtle) {
		// TODO Auto-generated method stub
	}
}
