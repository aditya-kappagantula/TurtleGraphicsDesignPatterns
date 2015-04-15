package turtle.interpreterPattern.command;

import java.util.Map;

import turtle.Turtle;
import turtle.interpreterPattern.IExpression;

public class Move extends Command implements IExpression {
	private double distance;

	public Move(double distance) {
		this.distance = distance;
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
