package turtle.interpreterPattern.command;

import turtle.Turtle;

public class Number extends Command {
	private int number;

	public Number(int number) {
		this.number = number;
	}

	@Override
	public String type() {
		return "number";
	}

	@Override
	public void execute(Turtle aTurtle) {
		// TODO Auto-generated method stub
	}
}
