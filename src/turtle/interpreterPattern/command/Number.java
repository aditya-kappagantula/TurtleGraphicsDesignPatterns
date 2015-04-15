package turtle.interpreterPattern.command;

import java.util.Map;

import turtle.Turtle;
import turtle.interpreterPattern.IExpression;

public class Number extends Command implements IExpression {
	private int number;

	public Number(int number) {
		this.number = number;
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
