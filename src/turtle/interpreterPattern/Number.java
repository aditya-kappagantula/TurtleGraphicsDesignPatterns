package turtle.interpreterPattern;

import java.util.Map;

public class Number extends Command implements IExpression {
	private int number;

	public Number(int number) {
		this.number = number;
	}

	@Override
	public Command interpret(Map<String, IExpression> variables) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
	}
}
