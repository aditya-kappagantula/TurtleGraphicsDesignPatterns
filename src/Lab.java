import turtle.Turtle;
import turtle.interpreterPattern.visitorPattern.CommandTotalDistanceVisitor;

public class Lab {
	public static void main(String[] args) {
		// TODO Auto-generated method
		Turtle aTurtle = new Turtle();
		// aTurtle.execute();
		// System.out.println(aTurtle.getLocation().getY());
		// System.out.println(aTurtle.getLocation().getX());
		// System.out.println(aTurtle.getDirection());
		// Unit aDegree = new Degree();
		aTurtle.accept(new CommandTotalDistanceVisitor(), aTurtle);
		System.out.println(aTurtle.getLocation().getX());
		System.out.println(aTurtle.getLocation().getY());
		// aDegree.setValue(30);
		// aDegree.setConversionBehaviour(new ConvertDegreeToSecond());
		// System.out.println(aDegree.accept(new UnitConversionVisitor()));
	}
}
