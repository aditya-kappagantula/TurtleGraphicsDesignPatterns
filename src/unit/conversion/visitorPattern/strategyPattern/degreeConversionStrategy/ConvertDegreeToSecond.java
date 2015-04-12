package unit.conversion.visitorPattern.strategyPattern.degreeConversionStrategy;

public class ConvertDegreeToSecond implements IConversionBehaviour {
	@Override
	public double convert(double aValue) {
		// TODO Implement Correct Logic
		return aValue * 2;
	}
}
