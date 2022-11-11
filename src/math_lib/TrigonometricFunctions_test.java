package math_lib;
import static org.junit.Assert.*;

import org.junit.Test;


/**
 * 
 * @author ASE Section 4 Group 26
 * Soham Goswami (110093442)
 * Aman Chauhan (110094502)
 * 
 * @version 3.0.0
 *
 * Test cases for sin, cos and tan using the TrigonometricFunctions.java
 * Angles used for each test:
 * (0, 45, -45, 90, 105, -105, 180, 190, -190, 270, 300, -300, 360)
 * Base Axis Values: 0, 90, 180, 270, 360
 * First Quadrant: 45
 * Second Quadrant: 105
 * Third Quadrant: 190
 * Fourth Quadrant: 300
 * Negatives: -45, -105, -190, -300 
 * 
 */
public class TrigonometricFunctions_test {

	double PI = 3.14159;
	double decimalPlaces = 0.0001;
	
	@Test
	public void testDegreeToRadian() {
		double degree = 45;
		assertEquals(Math.toRadians(degree), TrigonometricFunctions.degreeToRadian(degree), decimalPlaces);
	}
	
	@Test
	public void testHandleRadian() {
		double radian = 483.1859;
		assertEquals(5.66421, TrigonometricFunctions.handleRadian(radian), 0.01);
	}
	

	@Test
	public void testSin0() {
		double degree = 0;
		double radian = TrigonometricFunctions.degreeToRadian(degree);
		assertEquals(Math.sin(radian), TrigonometricFunctions.sin(radian), decimalPlaces);
	}
	
	@Test
	public void testSin45() {
		double degree = 45;
		double radian = TrigonometricFunctions.degreeToRadian(degree);
		assertEquals(Math.sin(radian), TrigonometricFunctions.sin(radian), decimalPlaces);
	}
	
	@Test
	public void testSinN45() {
		double degree = -45;
		double radian = TrigonometricFunctions.degreeToRadian(degree);
		assertEquals(Math.sin(radian), TrigonometricFunctions.sin(radian), decimalPlaces);
	}
	
	@Test
	public void testSin90() {
		double degree = 90;
		double radian = TrigonometricFunctions.degreeToRadian(degree);
		assertEquals(Math.sin(radian), TrigonometricFunctions.sin(radian), decimalPlaces);
	}
	
	@Test
	public void testSin105() {
		double degree = 105;
		double radian = TrigonometricFunctions.degreeToRadian(degree);
		assertEquals(Math.sin(radian), TrigonometricFunctions.sin(radian), decimalPlaces);
	}
	
	@Test
	public void testSinN105() {
		double degree = -105;
		double radian = TrigonometricFunctions.degreeToRadian(degree);
		assertEquals(Math.sin(radian), TrigonometricFunctions.sin(radian), decimalPlaces);
	}
	
	@Test
	public void testSin180() {
		double degree = 180;
		double radian = TrigonometricFunctions.degreeToRadian(degree);
		assertEquals(Math.sin(radian), TrigonometricFunctions.sin(radian), decimalPlaces);
	}
	
	@Test
	public void testSin190() {
		double degree = 190;
		double radian = TrigonometricFunctions.degreeToRadian(degree);
		assertEquals(Math.sin(radian), TrigonometricFunctions.sin(radian), decimalPlaces);
	}
	
	@Test
	public void testSinN190() {
		double degree = -190;
		double radian = TrigonometricFunctions.degreeToRadian(degree);
		assertEquals(Math.sin(radian), TrigonometricFunctions.sin(radian), decimalPlaces);
	}
	
	@Test
	public void testSin270() {
		double degree = 270;
		double radian = TrigonometricFunctions.degreeToRadian(degree);
		assertEquals(Math.sin(radian), TrigonometricFunctions.sin(radian), decimalPlaces);
	}
	
	@Test
	public void testSin300() {
		double degree = 300;
		double radian = TrigonometricFunctions.degreeToRadian(degree);
		assertEquals(Math.sin(radian), TrigonometricFunctions.sin(radian), decimalPlaces);
	}
	
	@Test
	public void testSinN300() {
		double degree = -300;
		double radian = TrigonometricFunctions.degreeToRadian(degree);
		assertEquals(Math.sin(radian), TrigonometricFunctions.sin(radian), decimalPlaces);
	}
	
	@Test
	public void testSin360() {
		double degree = 360;
		double radian = TrigonometricFunctions.degreeToRadian(degree);
		assertEquals(Math.sin(radian), TrigonometricFunctions.sin(radian), decimalPlaces);
	}
//--------------------------------------------------------------------------------------------------------------------
	@Test
	public void testCos0() {
		double degree = 0;
		double radian = TrigonometricFunctions.degreeToRadian(degree);
		assertEquals(Math.cos(radian), TrigonometricFunctions.cos(radian), decimalPlaces);
	}
	
	@Test
	public void testCos45() {
		double degree = 45;
		double radian = TrigonometricFunctions.degreeToRadian(degree);
		assertEquals(Math.cos(radian), TrigonometricFunctions.cos(radian), decimalPlaces);
	}
	
	@Test
	public void testCosN45() {
		double degree = -45;
		double radian = TrigonometricFunctions.degreeToRadian(degree);
		assertEquals(Math.cos(radian), TrigonometricFunctions.cos(radian), decimalPlaces);
	}
	
	@Test
	public void testCos90() {
		double degree = 90;
		double radian = TrigonometricFunctions.degreeToRadian(degree);
		assertEquals(Math.cos(radian), TrigonometricFunctions.cos(radian), decimalPlaces);
	}
	
	@Test
	public void testCos105() {
		double degree = 105;
		double radian = TrigonometricFunctions.degreeToRadian(degree);
		assertEquals(Math.cos(radian), TrigonometricFunctions.cos(radian), decimalPlaces);
	}
	
	@Test
	public void testCosN105() {
		double degree = -105;
		double radian = TrigonometricFunctions.degreeToRadian(degree);
		assertEquals(Math.cos(radian), TrigonometricFunctions.cos(radian), decimalPlaces);
	}
	
	@Test
	public void testCos180() {
		double degree = 180;
		double radian = TrigonometricFunctions.degreeToRadian(degree);
		assertEquals(Math.cos(radian), TrigonometricFunctions.cos(radian), decimalPlaces);
	}
	
	@Test
	public void testCos190() {
		double degree = 190;
		double radian = TrigonometricFunctions.degreeToRadian(degree);
		assertEquals(Math.cos(radian), TrigonometricFunctions.cos(radian), decimalPlaces);
	}
	
	@Test
	public void testCosN190() {
		double degree = -190;
		double radian = TrigonometricFunctions.degreeToRadian(degree);
		assertEquals(Math.cos(radian), TrigonometricFunctions.cos(radian), decimalPlaces);
	}
	
	@Test
	public void testCos270() {
		double degree = 270;
		double radian = TrigonometricFunctions.degreeToRadian(degree);
		assertEquals(Math.cos(radian), TrigonometricFunctions.cos(radian), decimalPlaces);
	}
	
	@Test
	public void testCos300() {
		double degree = 300;
		double radian = TrigonometricFunctions.degreeToRadian(degree);
		assertEquals(Math.cos(radian), TrigonometricFunctions.cos(radian), decimalPlaces);
	}
	
	@Test
	public void testCosN300() {
		double degree = -300;
		double radian = TrigonometricFunctions.degreeToRadian(degree);
		assertEquals(Math.cos(radian), TrigonometricFunctions.cos(radian), decimalPlaces);
	}
	
	@Test
	public void testCos360() {
		double degree = 360;
		double radian = TrigonometricFunctions.degreeToRadian(degree);
		assertEquals(Math.cos(radian), TrigonometricFunctions.cos(radian), decimalPlaces);
	}
//--------------------------------------------------------------------------------------------------------------------
	@Test
	public void testTan0() {
		double degree = 0;
		double radian = TrigonometricFunctions.degreeToRadian(degree);
		assertEquals(Math.tan(radian), TrigonometricFunctions.tan(radian), decimalPlaces);
	}
	
	@Test
	public void testTan45() {
		double degree = 45;
		double radian = TrigonometricFunctions.degreeToRadian(degree);
		assertEquals(Math.tan(radian), TrigonometricFunctions.tan(radian), decimalPlaces);
	}
	
	@Test
	public void testTanN45() {
		double degree = -45;
		double radian = TrigonometricFunctions.degreeToRadian(degree);
		assertEquals(Math.tan(radian), TrigonometricFunctions.tan(radian), decimalPlaces);
	}
	
	@Test
	public void testTan90() {
		double degree = 90;
		double radian = TrigonometricFunctions.degreeToRadian(degree);
		assertEquals(Math.tan(radian), TrigonometricFunctions.tan(radian), decimalPlaces);
	}
	
	@Test
	public void testTan105() {
		double degree = 105;
		double radian = TrigonometricFunctions.degreeToRadian(degree);
		assertEquals(Math.tan(radian), TrigonometricFunctions.tan(radian), decimalPlaces);
	}
	
	@Test
	public void testTanN105() {
		double degree = -105;
		double radian = TrigonometricFunctions.degreeToRadian(degree);
		assertEquals(Math.tan(radian), TrigonometricFunctions.tan(radian), decimalPlaces);
	}
	
	@Test
	public void testTan180() {
		double degree = 180;
		double radian = TrigonometricFunctions.degreeToRadian(degree);
		assertEquals(Math.tan(radian), TrigonometricFunctions.tan(radian), decimalPlaces);
	}
	
	@Test
	public void testTan190() {
		double degree = 190;
		double radian = TrigonometricFunctions.degreeToRadian(degree);
		assertEquals(Math.tan(radian), TrigonometricFunctions.tan(radian), decimalPlaces);
	}
	
	@Test
	public void testTanN190() {
		double degree = -190;
		double radian = TrigonometricFunctions.degreeToRadian(degree);
		assertEquals(Math.tan(radian), TrigonometricFunctions.tan(radian), decimalPlaces);
	}
	
	@Test
	public void testTan270() {
		double degree = 270;
		double radian = TrigonometricFunctions.degreeToRadian(degree);
		assertEquals(Math.tan(radian), TrigonometricFunctions.tan(radian), decimalPlaces);
	}
	
	@Test
	public void testTan300() {
		double degree = 300;
		double radian = TrigonometricFunctions.degreeToRadian(degree);
		assertEquals(Math.tan(radian), TrigonometricFunctions.tan(radian), decimalPlaces);
	}
	
	@Test
	public void testTanN300() {
		double degree = -300;
		double radian = TrigonometricFunctions.degreeToRadian(degree);
		assertEquals(Math.tan(radian), TrigonometricFunctions.tan(radian), decimalPlaces);
	}
	
	@Test
	public void testTan360() {
		double degree = 360;
		double radian = TrigonometricFunctions.degreeToRadian(degree);
		assertEquals(Math.tan(radian), TrigonometricFunctions.tan(radian), decimalPlaces);
	}
}
