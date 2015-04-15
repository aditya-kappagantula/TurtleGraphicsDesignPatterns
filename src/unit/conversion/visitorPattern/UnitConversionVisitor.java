package unit.conversion.visitorPattern;

import unit.Degree;
import unit.Radian;
import unit.Second;

public class UnitConversionVisitor implements IUnitVisitor {
	@Override
	public double visit(Degree aDegree) {
		return aDegree.getConversionBehaviour().convert(aDegree.getValue());
		// return new ConvertDegreeToRadian().convert(aDegree.getValue());
	}

	@Override
	public double visit(Radian aRadian) {
		return aRadian.getConversionBehaviour().convert(aRadian.getValue());
		// return new ConvertRadianToDegree().convert(aRadian.getValue());
	}

	@Override
	public double visit(Second aSecond) {
		return aSecond.getConversionBehaviour().convert(aSecond.getValue());
		// return new ConvertSecondToDegree().convert(aSecond.getValue());
	}
}
