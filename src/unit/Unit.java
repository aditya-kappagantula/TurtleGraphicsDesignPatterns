package unit;

public abstract class Unit {
	private double value;

	public Unit() {
		setValue(0.0);
	}

	/**
	 * @return the value
	 */
	public double getValue() {
		return value;
	}

	/**
	 * @param value
	 *            the value to set
	 */
	public void setValue(double value) {
		this.value = value;
	}
}
