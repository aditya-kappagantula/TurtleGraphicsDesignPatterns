package unit;

import unit.conversion.visitorPattern.IUnit;
import unit.conversion.visitorPattern.strategyPattern.degreeConversionStrategy.IConversionBehaviour;

public abstract class Unit implements IUnit {
	private double value;
	protected IConversionBehaviour conversionBehaviour;

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

	/**
	 * @return the aConversionBehaviour
	 */
	public IConversionBehaviour getConversionBehaviour() {
		return conversionBehaviour;
	}

	/**
	 * @param aConversionBehaviour
	 *            the aConversionBehaviour to set
	 */
	public void setConversionBehaviour(IConversionBehaviour aConversionBehaviour) {
		this.conversionBehaviour = aConversionBehaviour;
	}
}
