import unit.Degree;
import unit.Unit;
import unit.conversion.visitorPattern.UnitConversionVisitor;
import unit.conversion.visitorPattern.strategyPattern.degreeConversionStrategy.ConvertDegreeToRadian;

public class Lab {
	public static void main(String[] args) {
		// TODO Auto-generated method
		// Turtle aTurtle = new Turtle();
		Unit aDegree = new Degree();
		aDegree.setValue(30);
		aDegree.setConversionBehaviour(new ConvertDegreeToRadian());
		System.out.println(aDegree.accept(new UnitConversionVisitor(),
				new Degree()));
	}
}
