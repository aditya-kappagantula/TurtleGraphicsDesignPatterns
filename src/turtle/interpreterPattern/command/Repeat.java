package turtle.interpreterPattern.command;

import turtle.Turtle;

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
		// TODO Auto-generated method stub
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
}
