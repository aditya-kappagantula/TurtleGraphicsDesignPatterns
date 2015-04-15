package turtle.interpreterPattern;

import java.util.Map;

public class Turn extends Command implements IExpression {
	IExpression rightOperand;

	public Turn(IExpression rightOperand) {
		this.rightOperand = rightOperand;
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
