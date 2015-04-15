package turtle.interpreterPattern;

import java.util.Map;

import turtle.interpreterPattern.command.Command;

public interface IExpression {
	public Command interpret(Map<String, IExpression> variables);
}
