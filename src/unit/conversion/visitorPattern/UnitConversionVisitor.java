package unit.conversion.visitorPattern;

import unit.Degree;
import unit.Radian;
import unit.Second;
import unit.Unit;

public class UnitConversionVisitor implements IUnitVisitor {
	@Override
	public void visit(Degree aDegree, Unit aUnit) {
		// TODO Auto-generated method stub
		// return new Radian();
	}

	@Override
	public void visit(Radian aRadian, Unit aUnit) {
		// TODO Auto-generated method stub
		// return new Degree();
	}

	@Override
	public void visit(Second aSecond, Unit aUnit) {
		// TODO Auto-generated method stub
		// return new Radian();
	}
}
