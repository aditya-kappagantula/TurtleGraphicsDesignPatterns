package unit.conversion.visitorPattern;

import unit.Degree;
import unit.Radian;
import unit.Second;
import unit.Unit;

public interface IUnitVisitor {
	public double visit(Degree aDegree, Unit aUnit);

	public double visit(Radian aRadian, Unit aUnit);

	public double visit(Second aSecond, Unit aUnit);
}
