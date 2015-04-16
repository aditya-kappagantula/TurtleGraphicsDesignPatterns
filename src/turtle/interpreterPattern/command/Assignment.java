package turtle.interpreterPattern.command;

import turtle.Turtle;
import turtle.interpreterPattern.visitorPattern.ICommandVisitor;

public class Assignment extends Command {
	private String aString;
	private Double aValue;

	public Assignment(String aString, Double aValue) {
		this.aString = aString;
		this.aValue = aValue;
	}

	@Override
	public String type() {
		return "assignment";
	}

	@Override
	public void execute(Turtle aTurtle) {
		aTurtle.addVariable(aString, aValue);
	}

	@Override
	public void accept(ICommandVisitor anICommandVisitor, Turtle aTurtle) {
		anICommandVisitor.visit(this, aTurtle);
	}
}
