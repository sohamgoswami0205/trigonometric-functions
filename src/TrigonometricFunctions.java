import java.text.DecimalFormat;

/**
 * 
 * @author ASE Section 4 Group 26
 * Soham Goswami (110093442)
 * Aman Chauhan (110094502)
 * 
 * @version 2.0.0
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
		return (2 * degree * PI) / 360;
	}
	
	/**
	 * Method to calculate sine value of the radian
	 * based on Taylor series
	 * sin(radian x): x - ((x^3) / 3!) + ((x^5) / 5!) - ...
	 * @param rad: Radian value for which sin needs
	 * to be calculated 
	 * @return (double): Sin(radian)
	 */
	public static double sin(double rad) {
		double x = rad;
		double term = 1;
		double sum = 0;
		for (int i = 1; term != 0; i++) {
			term *= (x / i);
			if (i % 4 == 1) sum += term;
			if (i % 4 == 3) sum -= term;
		}
		return sum;
	}
	
	/**
	 * Method to calculate cosine value of the radian
	 * based on Taylor series
	 * cos(radian x): 1 - ((x^2) / 2!) + ((x^4) / 4!) - ...
	 * @param rad: Radian value for which cos needs
	 * to be calculated 
	 * @return (double): Cos(radian)
	 */
	public static double cos(double rad) {
		double x = rad;
		double term = 1;
		double sum = 1;
		for (int i = 1; term != 0; i++) {
			term *= (x / i);
			if (i % 4 == 2) sum -= term;
			if (i % 4 == 0) sum += term;
		}
		return sum;
	}
	
	/**
	 * Method to calculate tangent value of the radian
	 * based on Taylor series
	 * tan (radian x) = sin(x) / cos(x)
	 * @param rad: Radian value for which tan needs
	 * to be calculated 
	 * @return (double): Tan(radian)
	 */
	public static double tan(double rad) {
		double sineValue = sin(rad);
		double cosineValue = cos(rad);
		if (cosineValue == 0) {
			if (rad >= 0) {
				return Double.MAX_VALUE;	
			} else {
				return Double.MIN_VALUE;
			}
		}
		return (sineValue / cosineValue);
	}
	
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
	public static double cosec(double rad) {
		double sineValue = sin(rad);
		if (sineValue == 0) {
			if (rad >= 0) {
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
	public static double sec(double rad) {
		double cosineValue = cos(rad);
		if (cosineValue == 0) {
			if (rad >= 0) {
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
	public static double cot(double rad) {
		double sineValue = sin(rad);
		double cosineValue = cos(rad);
		if (sineValue == 0) {
			if (rad >= 0) {
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
