package unit.conversion.visitorPattern;

import unit.Degree;
import unit.Radian;
import unit.Second;

public interface IUnitVisitor {
	public double visit(Degree aDegree);

	public double visit(Radian aRadian);

	public double visit(Second aSecond);
}
