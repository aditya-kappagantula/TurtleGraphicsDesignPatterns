package unit.conversion.visitorPattern;

import unit.Unit;

public interface IUnit {
	void accept(IUnitVisitor aVisitor, Unit aUnit);
}
