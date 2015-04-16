package turtle.interpreterPattern.command;

import pen.Pen;
import turtle.Turtle;
import turtle.interpreterPattern.visitorPattern.ICommandVisitor;

public class PenUp extends Command {
	@Override
	public String type() {
		return "penUp";
	}

	@Override
	public void execute(Turtle aTurtle) {
		Pen aPen = new Pen();
		aPen.penUp();
		aTurtle.setPen(aPen);
	}

	@Override
	public void accept(ICommandVisitor anICommandVisitor, Turtle aTurtle) {
		anICommandVisitor.visit(this, aTurtle);
	}
}
