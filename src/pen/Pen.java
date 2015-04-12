package pen;

public class Pen {
	public enum Position {
		UP, DOWN
	}

	private Position position;

	public Pen() {
		setPosition(Position.DOWN);
	}

	public void penUp() {
		setPosition(Position.UP);
	}

	public void penDown() {
		setPosition(Position.DOWN);
	}

	public boolean isPenUp() {
		return getPosition().equals(Position.UP);
	}

	/**
	 * @return the position
	 */
	public Position getPosition() {
		return position;
	}

	/**
	 * @param position
	 *            the position to set
	 */
	public void setPosition(Position position) {
		this.position = position;
	}
}
