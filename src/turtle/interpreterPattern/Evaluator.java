package turtle.interpreterPattern;

import java.util.Map;

import turtle.interpreterPattern.command.Assignment;
import turtle.interpreterPattern.command.Command;
import turtle.interpreterPattern.command.End;
import turtle.interpreterPattern.command.Move;
import turtle.interpreterPattern.command.PenDown;
import turtle.interpreterPattern.command.PenUp;
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
		if (anExpression.contains("=")) {
			variables.put(anExpression.split(" ")[0],
					Double.parseDouble(anExpression.split(" ")[2]));
			aCommand = new Assignment(anExpression.split(" ")[0],
					Double.parseDouble(anExpression.split(" ")[2]));
		} else if (anExpression.contains("repeat")) {
			int count = Integer.parseInt(anExpression.split(" ")[1]);
			aCommand = new Repeat(count);
		} else if (anExpression.contains("end")) {
			aCommand = new End();
		} else if (anExpression.contains("penDown")) {
			aCommand = new PenDown();
		} else if (anExpression.contains("penUp")) {
			aCommand = new PenUp();
		} else if (anExpression.contains("move")) {
			double distance;
			if (anExpression.contains("$")) {
				distance = variables.get(anExpression.split(" ")[1]);
			} else {
				distance = Double.parseDouble(anExpression.split(" ")[1]);
			}
			aCommand = new Move(distance);
		} else {
			// Expression contains "turn"
			double degrees;
			if (anExpression.contains("$")) {
				degrees = variables.get(anExpression.split(" ")[1]);
			} else {
				degrees = Double.parseDouble(anExpression.split(" ")[1]);
			}
			aCommand = new Turn(degrees);
		}
		return aCommand;
	}
}
