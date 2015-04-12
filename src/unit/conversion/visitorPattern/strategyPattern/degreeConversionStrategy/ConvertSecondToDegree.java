package unit.conversion.visitorPattern.strategyPattern.degreeConversionStrategy;

public class ConvertSecondToDegree implements IConversionBehaviour {
	@Override
	public double convert(double aValue) {
		// TODO Implement correct logic
		return aValue * 2;
	}
}
