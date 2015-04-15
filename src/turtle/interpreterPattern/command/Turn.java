package turtle.interpreterPattern.command;

import turtle.Turtle;

public class Turn extends Command {
	private double direction;

	public Turn(double direction) {
		this.direction = direction;
	}

	@Override
	public void execute(Turtle aTurtle) {
		double currentDirection = aTurtle.getDirection();
		aTurtle.setDirection(currentDirection + direction);
	}
}
