package turtle.interpreterPattern.command;

import pen.Pen;
import turtle.Turtle;
import turtle.interpreterPattern.visitorPattern.ICommandVisitor;

public class PenDown extends Command {
	@Override
	public String type() {
		return "penDown";
	}

	@Override
	public void execute(Turtle aTurtle) {
		Pen aPen = new Pen();
		aPen.penDown();
		aTurtle.setPen(aPen);
	}

	@Override
	public void accept(ICommandVisitor anICommandVisitor, Turtle aTurtle) {
		anICommandVisitor.visit(this, aTurtle);
	}
}
