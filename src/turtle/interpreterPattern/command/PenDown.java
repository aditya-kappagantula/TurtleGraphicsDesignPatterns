package turtle.interpreterPattern.command;

import pen.Pen;
import turtle.Turtle;

public class PenDown extends Command {
	@Override
	public void execute(Turtle aTurtle) {
		Pen aPen = new Pen();
		aPen.penDown();
		aTurtle.setPen(aPen);
	}
}
