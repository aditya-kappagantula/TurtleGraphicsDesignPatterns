package unit;

import unit.conversion.visitorPattern.IUnitVisitor;
import unit.conversion.visitorPattern.strategyPattern.degreeConversionStrategy.ConvertRadianToDegree;
import unit.conversion.visitorPattern.strategyPattern.degreeConversionStrategy.IConversionBehaviour;

public class Radian extends Unit {
	// private IConversionBehaviour conversionBehaviour;
	public Radian() {
		super.setConversionBehaviour(new ConvertRadianToDegree());
		setValue(0);
	}

	public Radian(IConversionBehaviour aConversionBehaviour) {
		super.setConversionBehaviour(aConversionBehaviour);
		setValue(0);
	}

	@Override
	public double accept(IUnitVisitor aVisitor, Unit aUnit) {
		return aVisitor.visit(this, aUnit);
	}

	public String type() {
		return "RADIAN";
	}
}
