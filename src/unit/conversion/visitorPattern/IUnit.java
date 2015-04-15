package unit.conversion.visitorPattern;


public interface IUnit {
	double accept(IUnitVisitor aVisitor);
}
