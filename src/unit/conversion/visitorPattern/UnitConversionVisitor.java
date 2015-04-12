package unit.conversion.visitorPattern;

import unit.Degree;
import unit.Radian;
import unit.Second;
import unit.Unit;

public class UnitConversionVisitor implements IUnitVisitor {
	@Override
	public double visit(Degree aDegree, Unit aUnit) {
		return aUnit.getConversionBehaviour().convert(aDegree.getValue());
		// return new ConvertDegreeToRadian().convert(aDegree.getValue());
	}

	@Override
	public double visit(Radian aRadian, Unit aUnit) {
		return aUnit.getConversionBehaviour().convert(aRadian.getValue());
		// return new ConvertRadianToDegree().convert(aRadian.getValue());
	}

	@Override
	public double visit(Second aSecond, Unit aUnit) {
		return aUnit.getConversionBehaviour().convert(aSecond.getValue());
		// return new ConvertSecondToDegree().convert(aSecond.getValue());
	}
}
