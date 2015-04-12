package unit.conversion.visitorPattern;

import unit.Degree;
import unit.Radian;
import unit.Second;
import unit.Unit;

public interface IUnitVisitor {
	public void visit(Degree aDegree, Unit aUnit);

	public void visit(Radian aRadian, Unit aUnit);

	public void visit(Second aSecond, Unit aUnit);
}
