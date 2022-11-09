import static org.junit.Assert.*;

import org.junit.Test;

public class TrigonometricFunctions_test {

	double PI = 3.14159;
	double decimalpoints = 0.0001;
	// Not testing 0 and 90 as it causes infinity
	double[] degrees = {45, -45, 2, -2, 60, -60, 365, -365};

	@Test
	public void testSin() {
		double radian = 0;
		for (int i = 0; i < degrees.length; i++) {
			radian = TrigonometricFunctions.degreeToRadian(degrees[i]);
			assertEquals(Math.sin(radian), TrigonometricFunctions.sin(radian), decimalpoints);
		}
	}

	@Test
	public void testCos() {
		double radian = 0;
		for (int i = 0; i < degrees.length; i++) {
			radian = TrigonometricFunctions.degreeToRadian(degrees[i]);
			assertEquals(Math.cos(radian), TrigonometricFunctions.cos(radian), decimalpoints);
		}
	}

	@Test
	public void testTan() {
		double radian = 0;
		for (int i = 0; i < degrees.length; i++) {
			radian = TrigonometricFunctions.degreeToRadian(degrees[i]);
			assertEquals(Math.tan(radian), TrigonometricFunctions.tan(radian), decimalpoints);
		}
	}

	@Test
	public void testCosec() {
		double radian = 0;
		for (int i = 0; i < degrees.length; i++) {
			radian = TrigonometricFunctions.degreeToRadian(degrees[i]);
			assertEquals(1/Math.sin(radian), TrigonometricFunctions.cosec(radian), decimalpoints);
		}
	}

	@Test
	public void testSec() {
		double radian = 0;
		for (int i = 0; i < degrees.length; i++) {
			radian = TrigonometricFunctions.degreeToRadian(degrees[i]);
			assertEquals(1/Math.cos(radian), TrigonometricFunctions.sec(radian), decimalpoints);
		}
	}

	@Test
	public void testCot() {
		double radian = 0;
		for (int i = 0; i < degrees.length; i++) {
			radian = TrigonometricFunctions.degreeToRadian(degrees[i]);
			assertEquals(1/Math.tan(radian), TrigonometricFunctions.cot(radian), decimalpoints);
		}
	}
}
