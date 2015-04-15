package turtle.interpreterPattern.command;

import turtle.Turtle;

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
		// TODO Auto-generated method stub
		aTurtle.addVariable(aString, aValue);
	}
}
