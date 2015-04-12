package turtle;

import pen.Pen;
import coordinateSystem.Point;

public class Turtle {
	private double direction;
	private Point location;
	private Pen pen;

	public Turtle() {
		setLocation(new Point());
		setDirection(0);
		pen = new Pen();
	}

	public void move(int distance) {
		// Move the turtle distance units in the current direction and draw
		// on the screen if the pen is down.
	}

	public void turn(double degrees) {
		// Add “degrees” to the current heading of the turtle.
		setDirection(getDirection() + degrees);
	}

	public double direction() {
		// Returns the current direction of the turtle.
		return getDirection();
	}

	public Point location() {
		// Returns the current location of the turtle
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
	public double getDirection() {
		return direction;
	}

	/**
	 * @param direction
	 *            the direction to set
	 */
	public void setDirection(double direction) {
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
