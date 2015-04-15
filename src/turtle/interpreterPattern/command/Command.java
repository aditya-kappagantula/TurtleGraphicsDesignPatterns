package turtle.interpreterPattern.command;

import turtle.Turtle;

public abstract class Command {
	public abstract void execute(Turtle aTurtle);

	public abstract String type();
}
