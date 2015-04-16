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

public interface ICommandVisitor {
	public void visit(Assignment anAssignment, Turtle aTurtle);

	public void visit(End anEnd, Turtle aTurtle);

	public void visit(Move aMove, Turtle aTurtle);

	public void visit(Number aNumber, Turtle aTurtle);

	public void visit(PenDown aPenDown, Turtle aTurtle);

	public void visit(PenUp aPenUp, Turtle aTurtle);

	public void visit(Repeat aRepeat, Turtle aTurtle);

	public void visit(Turn aTurn, Turtle aTurtle);

	public void visit(Variable aVariable, Turtle aTurtle);

	public void visit(Turtle aTurtle, Turtle anotherTurtle);
}
