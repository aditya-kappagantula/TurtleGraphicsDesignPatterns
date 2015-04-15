package turtle.interpreterPattern.command;

import pen.Pen;
import turtle.Turtle;

public class PenUp extends Command {
	@Override
	public void execute(Turtle aTurtle) {
		Pen aPen = new Pen();
		aPen.penUp();
		aTurtle.setPen(aPen);
	}
}
