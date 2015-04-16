package turtle.interpreterPattern.visitorPattern;

import turtle.Turtle;
import turtle.interpreterPattern.command.Assignment;
import turtle.interpreterPattern.command.End;
import turtle.interpreterPattern.command.Move;
import turtle.interpreterPattern.command.Number;
import turtle.interpreterPattern.command.PenDown;
import turtle.interpreterPattern.command.PenUp;
import turtle.interpreterPattern.command.Repeat;
import turtle.interpreterPattern.command.Turn;
import turtle.interpreterPattern.command.Variable;

public class CommandTotalDistanceVisitor implements ICommandVisitor {
	@Override
	public void visit(Assignment anAssignment, Turtle aTurtle) {
		anAssignment.execute(aTurtle);
	}

	@Override
	public void visit(End anEnd, Turtle aTurtle) {
		anEnd.execute(aTurtle);
	}

	@Override
	public void visit(Move aMove, Turtle aTurtle) {
		aMove.customExecute(aTurtle);
	}

	@Override
	public void visit(Number aNumber, Turtle aTurtle) {
		aNumber.execute(aTurtle);
	}

	@Override
	public void visit(PenDown aPenDown, Turtle aTurtle) {
		aPenDown.execute(aTurtle);
	}

	@Override
	public void visit(PenUp aPenUp, Turtle aTurtle) {
		aPenUp.execute(aTurtle);
	}

	@Override
	public void visit(Repeat aRepeat, Turtle aTurtle) {
		aRepeat.execute(aTurtle);
	}

	@Override
	public void visit(Turn aTurn, Turtle aTurtle) {
		aTurn.execute(aTurtle);
	}

	@Override
	public void visit(Variable aVariable, Turtle aTurtle) {
		aTurtle.execute(aTurtle);
	}

	@Override
	public void visit(Turtle aTurtle, Turtle anotherTurtle) {
		aTurtle.execute(aTurtle);
	}
}
