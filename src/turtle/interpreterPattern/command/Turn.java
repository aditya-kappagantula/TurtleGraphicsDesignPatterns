package turtle.interpreterPattern.command;

import turtle.Turtle;
import turtle.interpreterPattern.visitorPattern.ICommandVisitor;

public class Turn extends Command {
	private double direction;

	public Turn(double direction) {
		this.direction = direction;
	}

	@Override
	public String type() {
		return "turn";
	}

	@Override
	public void execute(Turtle aTurtle) {
		double currentDirection = aTurtle.getDirection();
		aTurtle.setDirection(currentDirection + direction);
	}

	@Override
	public void accept(ICommandVisitor anICommandVisitor, Turtle aTurtle) {
		anICommandVisitor.visit(this, aTurtle);
	}
}
