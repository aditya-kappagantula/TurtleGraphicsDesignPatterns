import unit.Degree;
import unit.Unit;
import unit.conversion.visitorPattern.UnitConversionVisitor;
import unit.conversion.visitorPattern.strategyPattern.degreeConversionStrategy.ConvertDegreeToSecond;

public class Lab {
	public static void main(String[] args) {
		// TODO Auto-generated method
		Unit aDegree = new Degree();
		aDegree.setValue(30);
		System.out.println(aDegree.accept(new UnitConversionVisitor(),
				new Degree(new ConvertDegreeToSecond())));
	}
}
