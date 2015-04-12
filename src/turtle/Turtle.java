package turtle;

import coordinateSystem.Point;

public class Turtle {
	private int direction;
	private Point location;
	private Pen pen;

	public enum Pen {
		UP, DOWN
	}

	public Turtle() {
		setLocation(new Point());
		setDirection(0);
		setPen(Pen.DOWN);
	}

	public void move(int distance) {
		// TODO Move the turtle distance units in the current direction and draw
		// on the screen if the pen is down.
	}

	public void turn(int degrees) {
		// TODO Add “degrees” to the current heading of the turtle.
	}

	public void penUp() {
		// TODO Lift the pen up.
	}

	public void penDown() {
		// TODO Put the pen down.
	}

	public boolean isPenUp() {
		// TODO Return true if pen is up, false if the pen is down.
		return false;
	}

	public int direction() {
		// TODO Returns the current direction of the turtle.
		return 0;
	}

	public Point location() {
		// TODO Returns the current location of the turtle
		return new Point();
	}

	/**
	 * @return the location
	 */
	public Point getLocation() {
		return location;
	}

	/**
	 * @param location
	 *            the location to set
	 */
	public void setLocation(Point location) {
		this.location = location;
	}

	/**
	 * @return the direction
	 */
	public int getDirection() {
		return direction;
	}

	/**
	 * @param direction
	 *            the direction to set
	 */
	public void setDirection(int direction) {
		this.direction = direction;
	}

	/**
	 * @return the pen
	 */
	public Pen getPen() {
		return pen;
	}

	/**
	 * @param pen
	 *            the pen to set
	 */
	public void setPen(Pen pen) {
		this.pen = pen;
	}
}
