package javaPackage;

public class MethodManipulation {

	public int qualityPoints(int average)

	{
		if (average >= 90)
			return 4;
		else if (average >= 80)
			return 3;
		else if (average >= 70)
			return 2;
		else if (average >= 60)
			return 1;
		else
			return 0;

	}
	
	public double celsius (double fahrenheit)
	{
		double celsius;
		celsius = 5.0 / 9.0 * ( fahrenheit - 32 );
		return celsius;
	}
	
	public double fahrenheit (double celsius)
	{
		double fahrenheit;
		fahrenheit = 9.0 / 5.0 * celsius + 32;
		return fahrenheit;
	}
	
	

}
