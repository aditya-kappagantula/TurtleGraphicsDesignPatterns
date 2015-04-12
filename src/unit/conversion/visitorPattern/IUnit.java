package unit.conversion.visitorPattern;

import unit.Unit;

public interface IUnit {
	double accept(IUnitVisitor aVisitor, Unit aUnit);
}
