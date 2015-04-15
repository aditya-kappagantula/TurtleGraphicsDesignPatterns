package unit.conversion.visitorPattern.strategyPattern.degreeConversionStrategy;

public class ConvertDegreeToRadian implements IConversionBehaviour {
	@Override
	public double convert(double aValue) {
		return (aValue * Math.PI) / 180;
	}
}
