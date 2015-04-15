package turtle.interpreterPattern;

import java.util.Map;

import turtle.interpreterPattern.command.Command;
import turtle.interpreterPattern.command.Move;

public class Evaluator implements IExpression {
	private String anExpression;

	public Evaluator(String expression) {
		this.anExpression = expression;
	}

	@Override
	public Command interpret(Map<String, IExpression> variables) {
		// TODO Implement all command constructions correctly
		Command aCommand;
		if (anExpression.contains("repeat")) {
			double distance = Double.parseDouble(anExpression.split(" ")[1]);
			aCommand = new Move(distance);
		} else if (anExpression.contains("end")) {
			double distance = Double.parseDouble(anExpression.split(" ")[1]);
			aCommand = new Move(distance);
		} else if (anExpression.contains("move")) {
			double distance = Double.parseDouble(anExpression.split(" ")[1]);
			aCommand = new Move(distance);
		} else if (anExpression.contains("turn")) {
			double distance = Double.parseDouble(anExpression.split(" ")[1]);
			aCommand = new Move(distance);
		} else {
			// condition -> anExpression.contains("$");
			double distance = Double.parseDouble(anExpression.split(" ")[1]);
			aCommand = new Move(distance);
		}
		return aCommand;
	}
}
