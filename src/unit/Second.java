package unit;

import unit.conversion.visitorPattern.IUnitVisitor;
import unit.conversion.visitorPattern.strategyPattern.degreeConversionStrategy.IConversionBehaviour;

public class Second extends Unit {
	// private IConversionBehaviour conversionBehaviour;
	public Second() {
		setValue(0);
	}

	public Second(IConversionBehaviour aConversionBehaviour) {
		setValue(0);
		setConversionBehaviour(aConversionBehaviour);
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

	@Override
	public double accept(IUnitVisitor aVisitor) {
		return aVisitor.visit(this);
	}

	public String type() {
		return "SECOND";
	}
}
