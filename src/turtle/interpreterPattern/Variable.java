package turtle.interpreterPattern;

import java.util.Map;

public class Variable implements IExpression {
	private String name;

	public Variable(String name) {
		this.name = name;
	}

	@Override
	public Command interpret(Map<String, IExpression> variables) {
		// TODO Auto-generated method stub
		return null;
	}
}
