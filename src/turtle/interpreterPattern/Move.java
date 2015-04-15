package turtle.interpreterPattern;

import java.util.Map;

public class Move extends Command implements IExpression {
	IExpression anExpression;

	public Move(IExpression anExpression) {
		this.anExpression = anExpression;
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
