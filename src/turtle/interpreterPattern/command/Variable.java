package turtle.interpreterPattern.command;

import java.util.Map;

import turtle.Turtle;
import turtle.interpreterPattern.IExpression;

public class Variable extends Command implements IExpression {
	private String name;

	public Variable(String name) {
		this.name = name;
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
