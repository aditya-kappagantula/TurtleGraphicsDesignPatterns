package turtle.interpreterPattern.command;

import turtle.Turtle;
import turtle.interpreterPattern.visitorPattern.ICommandVisitor;

public class Variable extends Command {
	private String name;

	public Variable(String name) {
		this.name = name;
	}

	@Override
	public String type() {
		return "variable";
	}

	@Override
	public void execute(Turtle aTurtle) {
		// Note: This functionality does nothing for now.
	}

	@Override
	public void accept(ICommandVisitor anICommandVisitor, Turtle aTurtle) {
		anICommandVisitor.visit(this, aTurtle);
	}
}
