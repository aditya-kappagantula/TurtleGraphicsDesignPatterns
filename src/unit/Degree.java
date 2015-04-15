package unit;

import unit.conversion.visitorPattern.IUnit;
import unit.conversion.visitorPattern.IUnitVisitor;
import unit.conversion.visitorPattern.strategyPattern.degreeConversionStrategy.ConvertDegreeToRadian;
import unit.conversion.visitorPattern.strategyPattern.degreeConversionStrategy.IConversionBehaviour;

public class Degree extends Unit implements IUnit {
	public Degree() {
		super.setConversionBehaviour(new ConvertDegreeToRadian());
		setValue(0);
	}

	public Degree(IConversionBehaviour aConversionBehaviour) {
		super.setConversionBehaviour(aConversionBehaviour);
		setValue(0);
	}

	@Override
	public double accept(IUnitVisitor aVisitor) {
		return aVisitor.visit(this);
	}

	public String type() {
		return "DEGREE";
	}
}
