package unit;

import unit.conversion.visitorPattern.IUnit;
import unit.conversion.visitorPattern.IUnitVisitor;

public class Degree extends Unit implements IUnit {
	public Degree() {
		this.setValue(0);
	}

	@Override
	public void accept(IUnitVisitor aVisitor, Unit aUnit) {
		aVisitor.visit(this, aUnit);
	}

	public String type() {
		return "DEGREE";
	}
}
