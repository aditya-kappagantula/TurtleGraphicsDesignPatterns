package turtle.interpreterPattern.command;

import turtle.Turtle;
import turtle.interpreterPattern.visitorPattern.ICommandVisitor;

public class Number extends Command {
	private int number;

	public Number(int number) {
		this.number = number;
	}

	@Override
	public String type() {
		return "number";
	}

	@Override
	public void execute(Turtle aTurtle) {
		// Note: No functionality to implement for now
	}

	@Override
	public void accept(ICommandVisitor anICommandVisitor, Turtle aTurtle) {
		anICommandVisitor.visit(this, aTurtle);
	}
}
