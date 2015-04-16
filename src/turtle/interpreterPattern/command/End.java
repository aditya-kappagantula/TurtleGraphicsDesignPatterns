package turtle.interpreterPattern.command;

import turtle.Turtle;
import turtle.interpreterPattern.visitorPattern.ICommandVisitor;

public class End extends Command {
	@Override
	public String type() {
		return "end";
	}

	@Override
	public void execute(Turtle aTurtle) {
		// Note: No functionality to implement for now.
	}

	@Override
	public void accept(ICommandVisitor anICommandVisitor, Turtle aTurtle) {
		anICommandVisitor.visit(this, aTurtle);
	}
}
