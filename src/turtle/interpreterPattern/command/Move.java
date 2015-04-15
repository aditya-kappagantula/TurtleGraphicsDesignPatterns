package turtle.interpreterPattern.command;

import turtle.Turtle;
import unit.Degree;
import unit.Unit;
import unit.conversion.visitorPattern.UnitConversionVisitor;
import coordinateSystem.Point;

public class Move extends Command {
	private double distance;

	public Move(double distance) {
		this.distance = distance;
	}

	@Override
	public void execute(Turtle aTurtle) {
		double x = aTurtle.getLocation().getX();
		double y = aTurtle.getLocation().getY();
		Unit aDegree = new Degree();
		aDegree.setValue(aTurtle.getDirection());
		double radians = aDegree.accept(new UnitConversionVisitor());
		double deltaX = Math.sin(radians) * distance;
		double deltaY = Math.cos(radians) * distance;
		Point destination = new Point();
		destination.setX(x + deltaX);
		destination.setY(y + deltaY);
		aTurtle.setLocation(destination);
	}
}
