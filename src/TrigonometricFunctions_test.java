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
 * 0, 45, -45, 90, 105, -105, 180, 190, -190, 270, 300, -300, 360
 * 
 */
public class TrigonometricFunctions_test {

	double PI = 3.14159;
	double decimalpoints = 0.0001;
	
	@Test
	public void testDegreeToRadian() {
		double degree = 45;
		assertEquals(Math.toRadians(degree), TrigonometricFunctions.degreeToRadian(degree), decimalpoints);
	}
	

	@Test
	public void testSin0() {
		double degree = 0;
		double radian = TrigonometricFunctions.degreeToRadian(degree);
		assertEquals(Math.sin(radian), TrigonometricFunctions.sin(radian), decimalpoints);
	}
	
	@Test
	public void testSin45() {
		double degree = 45;
		double radian = TrigonometricFunctions.degreeToRadian(degree);
		assertEquals(Math.sin(radian), TrigonometricFunctions.sin(radian), decimalpoints);
	}
	
	@Test
	public void testSina45() {
		double degree = -45;
		double radian = TrigonometricFunctions.degreeToRadian(degree);
		assertEquals(Math.sin(radian), TrigonometricFunctions.sin(radian), decimalpoints);
	}
	
	@Test
	public void testSin90() {
		double degree = 90;
		double radian = TrigonometricFunctions.degreeToRadian(degree);
		assertEquals(Math.sin(radian), TrigonometricFunctions.sin(radian), decimalpoints);
	}
	
	@Test
	public void testSin105() {
		double degree = 105;
		double radian = TrigonometricFunctions.degreeToRadian(degree);
		assertEquals(Math.sin(radian), TrigonometricFunctions.sin(radian), decimalpoints);
	}
	
	@Test
	public void testSina105() {
		double degree = -105;
		double radian = TrigonometricFunctions.degreeToRadian(degree);
		assertEquals(Math.sin(radian), TrigonometricFunctions.sin(radian), decimalpoints);
	}
	
	@Test
	public void testSin180() {
		double degree = 180;
		double radian = TrigonometricFunctions.degreeToRadian(degree);
		assertEquals(Math.sin(radian), TrigonometricFunctions.sin(radian), decimalpoints);
	}
	
	@Test
	public void testSin190() {
		double degree = 190;
		double radian = TrigonometricFunctions.degreeToRadian(degree);
		assertEquals(Math.sin(radian), TrigonometricFunctions.sin(radian), decimalpoints);
	}
	
	@Test
	public void testSina190() {
		double degree = -190;
		double radian = TrigonometricFunctions.degreeToRadian(degree);
		assertEquals(Math.sin(radian), TrigonometricFunctions.sin(radian), decimalpoints);
	}
	
	@Test
	public void testSin270() {
		double degree = 270;
		double radian = TrigonometricFunctions.degreeToRadian(degree);
		assertEquals(Math.sin(radian), TrigonometricFunctions.sin(radian), decimalpoints);
	}
	
	@Test
	public void testSin300() {
		double degree = 300;
		double radian = TrigonometricFunctions.degreeToRadian(degree);
		assertEquals(Math.sin(radian), TrigonometricFunctions.sin(radian), decimalpoints);
	}
	
	@Test
	public void testSina300() {
		double degree = -300;
		double radian = TrigonometricFunctions.degreeToRadian(degree);
		assertEquals(Math.sin(radian), TrigonometricFunctions.sin(radian), decimalpoints);
	}
	
	@Test
	public void testSin360() {
		double degree = 360;
		double radian = TrigonometricFunctions.degreeToRadian(degree);
		assertEquals(Math.sin(radian), TrigonometricFunctions.sin(radian), decimalpoints);
	}
//--------------------------------------------------------------------------------------------------------------------
	@Test
	public void testCos0() {
		double degree = 0;
		double radian = TrigonometricFunctions.degreeToRadian(degree);
		assertEquals(Math.cos(radian), TrigonometricFunctions.cos(radian), decimalpoints);
	}
	
	@Test
	public void testCos45() {
		double degree = 45;
		double radian = TrigonometricFunctions.degreeToRadian(degree);
		assertEquals(Math.cos(radian), TrigonometricFunctions.cos(radian), decimalpoints);
	}
	
	@Test
	public void testCosa45() {
		double degree = -45;
		double radian = TrigonometricFunctions.degreeToRadian(degree);
		assertEquals(Math.cos(radian), TrigonometricFunctions.cos(radian), decimalpoints);
	}
	
	@Test
	public void testCos90() {
		double degree = 90;
		double radian = TrigonometricFunctions.degreeToRadian(degree);
		assertEquals(Math.cos(radian), TrigonometricFunctions.cos(radian), decimalpoints);
	}
	
	@Test
	public void testCos105() {
		double degree = 105;
		double radian = TrigonometricFunctions.degreeToRadian(degree);
		assertEquals(Math.cos(radian), TrigonometricFunctions.cos(radian), decimalpoints);
	}
	
	@Test
	public void testCosa105() {
		double degree = -105;
		double radian = TrigonometricFunctions.degreeToRadian(degree);
		assertEquals(Math.cos(radian), TrigonometricFunctions.cos(radian), decimalpoints);
	}
	
	@Test
	public void testCos180() {
		double degree = 180;
		double radian = TrigonometricFunctions.degreeToRadian(degree);
		assertEquals(Math.cos(radian), TrigonometricFunctions.cos(radian), decimalpoints);
	}
	
	@Test
	public void testCos190() {
		double degree = 190;
		double radian = TrigonometricFunctions.degreeToRadian(degree);
		assertEquals(Math.cos(radian), TrigonometricFunctions.cos(radian), decimalpoints);
	}
	
	@Test
	public void testCosa190() {
		double degree = -190;
		double radian = TrigonometricFunctions.degreeToRadian(degree);
		assertEquals(Math.cos(radian), TrigonometricFunctions.cos(radian), decimalpoints);
	}
	
	@Test
	public void testCos270() {
		double degree = 270;
		double radian = TrigonometricFunctions.degreeToRadian(degree);
		assertEquals(Math.cos(radian), TrigonometricFunctions.cos(radian), decimalpoints);
	}
	
	@Test
	public void testCos300() {
		double degree = 300;
		double radian = TrigonometricFunctions.degreeToRadian(degree);
		assertEquals(Math.cos(radian), TrigonometricFunctions.cos(radian), decimalpoints);
	}
	
	@Test
	public void testCosa300() {
		double degree = -300;
		double radian = TrigonometricFunctions.degreeToRadian(degree);
		assertEquals(Math.cos(radian), TrigonometricFunctions.cos(radian), decimalpoints);
	}
	
	@Test
	public void testCos360() {
		double degree = 360;
		double radian = TrigonometricFunctions.degreeToRadian(degree);
		assertEquals(Math.cos(radian), TrigonometricFunctions.cos(radian), decimalpoints);
	}
//--------------------------------------------------------------------------------------------------------------------
	@Test
	public void testTan0() {
		double degree = 0;
		double radian = TrigonometricFunctions.degreeToRadian(degree);
		assertEquals(Math.tan(radian), TrigonometricFunctions.tan(radian), decimalpoints);
	}
	
	@Test
	public void testTan45() {
		double degree = 45;
		double radian = TrigonometricFunctions.degreeToRadian(degree);
		assertEquals(Math.tan(radian), TrigonometricFunctions.tan(radian), decimalpoints);
	}
	
	@Test
	public void testTana45() {
		double degree = -45;
		double radian = TrigonometricFunctions.degreeToRadian(degree);
		assertEquals(Math.tan(radian), TrigonometricFunctions.tan(radian), decimalpoints);
	}
	
	@Test
	public void testTan90() {
		double degree = 90;
		double radian = TrigonometricFunctions.degreeToRadian(degree);
		assertEquals(Math.tan(radian), TrigonometricFunctions.tan(radian), decimalpoints);
	}
	
	@Test
	public void testTan105() {
		double degree = 105;
		double radian = TrigonometricFunctions.degreeToRadian(degree);
		assertEquals(Math.tan(radian), TrigonometricFunctions.tan(radian), decimalpoints);
	}
	
	@Test
	public void testTana105() {
		double degree = -105;
		double radian = TrigonometricFunctions.degreeToRadian(degree);
		assertEquals(Math.tan(radian), TrigonometricFunctions.tan(radian), decimalpoints);
	}
	
	@Test
	public void testTan180() {
		double degree = 180;
		double radian = TrigonometricFunctions.degreeToRadian(degree);
		assertEquals(Math.tan(radian), TrigonometricFunctions.tan(radian), decimalpoints);
	}
	
	@Test
	public void testTan190() {
		double degree = 190;
		double radian = TrigonometricFunctions.degreeToRadian(degree);
		assertEquals(Math.tan(radian), TrigonometricFunctions.tan(radian), decimalpoints);
	}
	
	@Test
	public void testTana190() {
		double degree = -190;
		double radian = TrigonometricFunctions.degreeToRadian(degree);
		assertEquals(Math.tan(radian), TrigonometricFunctions.tan(radian), decimalpoints);
	}
	
	@Test
	public void testTan270() {
		double degree = 270;
		double radian = TrigonometricFunctions.degreeToRadian(degree);
		assertEquals(Math.tan(radian), TrigonometricFunctions.tan(radian), decimalpoints);
	}
	
	@Test
	public void testTan300() {
		double degree = 300;
		double radian = TrigonometricFunctions.degreeToRadian(degree);
		assertEquals(Math.tan(radian), TrigonometricFunctions.tan(radian), decimalpoints);
	}
	
	@Test
	public void testTana300() {
		double degree = -300;
		double radian = TrigonometricFunctions.degreeToRadian(degree);
		assertEquals(Math.tan(radian), TrigonometricFunctions.tan(radian), decimalpoints);
	}
	
	@Test
	public void testTan360() {
		double degree = 360;
		double radian = TrigonometricFunctions.degreeToRadian(degree);
		assertEquals(Math.tan(radian), TrigonometricFunctions.tan(radian), decimalpoints);
	}
}
