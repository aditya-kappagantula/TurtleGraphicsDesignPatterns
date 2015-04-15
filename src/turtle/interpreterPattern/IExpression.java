package turtle.interpreterPattern;

import java.util.ArrayList;
import java.util.Map;

import turtle.interpreterPattern.command.Command;

public interface IExpression {
	public ArrayList<Command> interpret(Map<String, Double> variables);
}
