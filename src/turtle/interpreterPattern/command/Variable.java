package turtle.interpreterPattern.command;

import turtle.Turtle;

public class Variable extends Command {
	private String name;

	public Variable(String name) {
		this.name = name;
	}

	@Override
	public String type() {
		return "variable";
	}

	@Override
	public void execute(Turtle aTurtle) {
		// TODO Auto-generated method stub
	}
}
