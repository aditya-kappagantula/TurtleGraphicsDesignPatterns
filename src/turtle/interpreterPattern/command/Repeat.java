package turtle.interpreterPattern.command;

import turtle.Turtle;
import turtle.interpreterPattern.visitorPattern.ICommandVisitor;

public class Repeat extends Command {
	private int count;

	public Repeat(int count) {
		this.setCount(count);
	}

	@Override
	public String type() {
		return "repeat";
	}

	@Override
	public void execute(Turtle aTurtle) {
		// Note: This functionality does nothing for now.
	}

	/**
	 * @return the count
	 */
	public int getCount() {
		return count;
	}

	/**
	 * @param count
	 *            the count to set
	 */
	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public void accept(ICommandVisitor anICommandVisitor, Turtle aTurtle) {
		anICommandVisitor.visit(this, aTurtle);
	}
}
