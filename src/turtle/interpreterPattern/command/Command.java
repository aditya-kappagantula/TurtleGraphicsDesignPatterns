package turtle.interpreterPattern.command;

import turtle.Turtle;
import turtle.interpreterPattern.visitorPattern.ICommandElement;

public abstract class Command implements ICommandElement {
	public abstract void execute(Turtle aTurtle);
}
