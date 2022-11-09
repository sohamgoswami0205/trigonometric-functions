import java.text.DecimalFormat;

/**
 * 
 * @author ASE Section 4 Group 26
 * Soham Goswami (110093442)
 * Aman Chauhan (110094502)
 * 
 * @version 3.0.0
 *
 */
public class TrigonometricFunctions {

	// Value of PI limited to 5 places after decimal point
	static double PI = 3.14159;
	
	// Creation of a new Decimal Format which formats the value passed
	// into it to be limited upto 4 places after decimal
	private static final DecimalFormat decimalFormat = new DecimalFormat("0.0000");
	
	/**
	 * Method to format the double value 
	 * @param val: Value to be formatted
	 * @return (double): Formatted Value
	 */
	public static double ceilAndRound(double val) {
		return Double.parseDouble(decimalFormat.format(val));
	}
	
	/**
	 * Method to convert degree to radian
	 * @param degree: Value to be converted
	 * @return (double): Equivalent radian value
	 */
	public static double degreeToRadian (double degree) {
		degree = degree % 360;
		return degree * PI / 180;
	}
	
	/**
	 * Method to calculate sine value of the radian
	 * based on Taylor series
	 * sin(radian x): x - ((x^3) / 3!) + ((x^5) / 5!) - ...
	 * @param rad: Radian value for which sin needs
	 * to be calculated 
	 * @return (double): Sin(radian)
	 */
	public static double sin(double x) {
		double term = 1;
		double total = 0;
		for (int i = 1; term != 0; i++) {
			term *= (x / i);
			// For every alternate odd number, y, we need to
			// add and subtract its formed term (x ^ y)/y!
			// For every even number, we simply need to multiply
			// term with (x / i) for forming the factorial and
			// also continuing the powers of x
			if (i % 4 == 1) total += term;
			else if (i % 4 == 3) total -= term;
		}
		return total;
	}
	
	/**
	 * Method to calculate cosine value of the radian
	 * based on Taylor series
	 * cos(radian x): 1 - ((x^2) / 2!) + ((x^4) / 4!) - ...
	 * @param rad: Radian value for which cos needs
	 * to be calculated 
	 * @return (double): Cos(radian)
	 */
	public static double cos(double x) {
		double term = 1;
		// Keeping total = 1 as Taylor series for cos starts
		// with 1 - ((x ^ 2) / 2!) + ...
		double total = 1;
		for (int i = 1; term != 0; i++) {
			term *= (x / i);
			// For every alternate even number, y, we need to
			// add and subtract its formed term (x ^ y)/y!
			// For every odd number, we simply need to multiply
			// term with (x / i) for forming the factorial and
			// also continuing the powers of x
			if (i % 4 == 2) total -= term;
			else if (i % 4 == 0) total += term;
		}
		return total;
	}
	
	/**
	 * Method to calculate tangent value of the radian
	 * based on Taylor series
	 * tan (radian x) = sin(x) / cos(x)
	 * @param rad: Radian value for which tan needs
	 * to be calculated 
	 * @return (double): Tan(radian)
	 */
	public static double tan(double x) {
		double sineValue = sin(x);
		double cosineValue = cos(x);
		// Handling 1/0 = infinity scenario
		// by returning maximum or minimum
		// possible "double" values based on value of
		// cos(x) and x
		if (cosineValue == 0) {
			if (x >= 0) {
				return Double.MAX_VALUE;	
			} else {
				return Double.MIN_VALUE;
			}
		}
		return (sineValue / cosineValue);
	}
	
//-----ADDITIONAL METHODS RELATED TO THE IMPLEMENTED ONES MEANT FOR MATH LIBRARY------ 
	
	/**
	 * Method to calculate cosecant value of the radian
	 * based on Taylor series
	 * cosec (radian x) = 1 / sin(x)
	 * @param rad: Radian value for which cosec needs
	 * to be calculated 
	 * @return (double): Cosec(radian)
	 * If sin(x) value is 0, the cosec(x) becomes infinity
	 * To return a double value for infinity, we will
	 * return maximum possible double value
	 */
	public static double cosec(double x) {
		double sineValue = sin(x);
		// Handling 1/0 = infinity scenario
		// by returning maximum or minimum
		// possible "double" values based on value of
		// sin(x) and x
		if (sineValue == 0) {
			if (x >= 0) {
				return Double.MAX_VALUE;	
			} else {
				return Double.MIN_VALUE;
			}
		}
		return (1 / sineValue);
	}
	
	/**
	 * Method to calculate secant value of the radian
	 * based on Taylor series
	 * sec (radian x) = 1 / cos(x)
	 * @param rad: Radian value for which sec needs
	 * to be calculated 
	 * @return (double): Sec(radian)
	 * If cos(x) value is 0, the sec(x) becomes infinity
	 * To return a double value for infinity, we will
	 * return maximum possible double value
	 */
	public static double sec(double x) {
		double cosineValue = cos(x);
		// Handling 1/0 = infinity scenario
		// by returning maximum or minimum
		// possible "double" values based on value of
		// cos(x) and x
		if (cosineValue == 0) {
			if (x >= 0) {
				return Double.MAX_VALUE;	
			} else {
				return Double.MIN_VALUE;
			}
		}
		return (1 / cosineValue);
	}
	
	/**
	 * Method to calculate cotangent value of the radian
	 * based on Taylor series
	 * cot (radian x) = cos(x) / sin(x)
	 * @param rad: Radian value for which cot needs
	 * to be calculated 
	 * @return (double): Cot(radian)
	 * If sin(x) value is 0, the cot(x) becomes infinity
	 * To return a double value for infinity, we will
	 * return maximum possible double value
	 */
	public static double cot(double x) {
		double sineValue = sin(x);
		double cosineValue = cos(x);
		// Handling 1/0 = infinity scenario
		// by returning maximum or minimum
		// possible "double" values based on value of
		// sin(x) and x
		if (sineValue == 0) {
			if (x >= 0) {
				return Double.MAX_VALUE;	
			} else {
				return Double.MIN_VALUE;
			}
		}
		return (cosineValue / sineValue);
	}
	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		double degrees = 30;
//		double radian = degreeToRadian(degrees);
//		System.out.println("Radian of " + degrees + " degrees is: " + radian);
//		System.out.println("Sin is: " + ceilAndRound((radian)));
//		System.out.println("Cos is: " + ceilAndRound(cos(radian)));
//		System.out.println("Tan is: " + ceilAndRound(tan(radian)));
//		System.out.println("Cosec is: " + ceilAndRound(cosec(radian)));
//		System.out.println("Sec is: " + ceilAndRound(sec(radian)));
//		System.out.println("Cot is: " + ceilAndRound(cot(radian)));
//	}

}
