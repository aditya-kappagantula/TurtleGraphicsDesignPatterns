package turtle.interpreterPattern;

import java.util.ArrayList;
import java.util.Map;

import turtle.interpreterPattern.command.Command;
import turtle.interpreterPattern.command.End;
import turtle.interpreterPattern.command.Move;
import turtle.interpreterPattern.command.Repeat;
import turtle.interpreterPattern.command.Turn;

public class Evaluator implements IExpression {
	private String anExpression;

	public Evaluator(String expression) {
		this.anExpression = expression;
	}

	@Override
	public ArrayList<Command> interpret(Map<String, Double> variables) {
		ArrayList<Command> aCommandList = new ArrayList<Command>();
		if (anExpression.contains("repeat")) {
			int count = Integer.parseInt(anExpression.split(" ")[1]);
			aCommandList.add(new Repeat(count));
		} else if (anExpression.contains("end")) {
			aCommandList.add(new End());
		} else if (anExpression.contains("move")) {
			double distance = Double.parseDouble(anExpression.split(" ")[1]);
			aCommandList.add(new Move(distance));
		} else if (anExpression.contains("turn")) {
			double degrees = Double.parseDouble(anExpression.split(" ")[1]);
			aCommandList.add(new Turn(degrees));
		} else {
			// TODO Implement this correctly
			// condition -> anExpression.contains("$");
			double distance = Double.parseDouble(anExpression.split(" ")[1]);
			aCommandList.add(new Move(distance));
		}
		return aCommandList;
	}
}
