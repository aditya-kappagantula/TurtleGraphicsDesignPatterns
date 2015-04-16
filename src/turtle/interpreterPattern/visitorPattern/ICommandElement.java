package turtle.interpreterPattern.visitorPattern;

import turtle.Turtle;

public interface ICommandElement {
	public void accept(ICommandVisitor anICommandVisitor, Turtle aTurtle);

	public abstract String type();

	public void execute(Turtle aTurtle);
}
