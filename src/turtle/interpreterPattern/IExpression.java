package turtle.interpreterPattern;

import java.util.Map;

public interface IExpression {
	public Command interpret(Map<String, IExpression> variables);
}
