package turtle.interpreterPattern;

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
	public Command interpret(Map<String, Double> variables) {
		Command aCommand;
		if (anExpression.contains("repeat")) {
			int count = Integer.parseInt(anExpression.split(" ")[1]);
			aCommand = new Repeat(count);
		} else if (anExpression.contains("end")) {
			aCommand = new End();
		} else if (anExpression.contains("move")) {
			double distance = Double.parseDouble(anExpression.split(" ")[1]);
			aCommand = new Move(distance);
		} else if (anExpression.contains("turn")) {
			double degrees = Double.parseDouble(anExpression.split(" ")[1]);
			aCommand = new Turn(degrees);
		} else {
			// condition -> anExpression.contains("$");
			double distance = Double.parseDouble(anExpression.split(" ")[1]);
			aCommand = new Move(distance);
		}
		return aCommand;
	}
}
