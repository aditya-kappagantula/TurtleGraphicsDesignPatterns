package unit.conversion.visitorPattern.strategyPattern.degreeConversionStrategy;

public class ConvertRadianToDegree implements IConversionBehaviour {
	@Override
	public double convert(double aValue) {
		return (aValue * 180) / Math.PI;
	}
}
