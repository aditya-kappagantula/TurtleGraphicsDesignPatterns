package turtle.interpreterPattern.command;

import turtle.Turtle;

public class Move extends Command {
	private double distance;

	public Move(double distance) {
		this.distance = distance;
	}

	@Override
	public void execute(Turtle aTurtle) {
		double x = aTurtle.getLocation().getX();
		double y = aTurtle.getLocation().getY();
		double degrees = aTurtle.getDirection();
		// double radians =
	}
}
