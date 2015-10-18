package is.ru.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import is.ru.stringcalculator.Calculator; // Hlynur told me
import org.junit.Rule; 
import org.junit.rules.ExpectedException;

public class CalculatorTest {

	public static void main(String args[]) {
      org.junit.runner.JUnitCore.main("is.ru.stringcalculator.CalculatorTest");
    }

	@Test
	public void testEmptyString() {
		assertEquals(0, Calculator.add(""));
	}
	
	@Test
	public void testOneNumber() {
		assertEquals(1, Calculator.add("1"));
	}

	@Test
	public void testTwoNumbers() {
		assertEquals(3, Calculator.add("1,2"));
	}	

	@Test
    public void testThreeNumbers(){
    	assertEquals(3, Calculator.add("1,2,3"));
    }
 
    @Test
	public void testNewLinesBetweenNumbers() {
    	assertEquals(6, Calculator.add("1\n2,3"));
	}
/*
	@Test
	public void testDifferentDelimiter(){
    	assertEquals(3, Calculator.add("//;\n1;2"));
	}

	@Test(expected = RuntimeException.class)
	public  void testOneNegativeNumberThrowAnException() {
    	Calculator.add("-1,2");
		}
	@Test
	public  void testMultipleNegativeNumbersThrowAnException() {
    	RuntimeException exception = null;
    	try {
    		Calculator.add("2,-4,3,-5");
    	} 
    	catch (RuntimeException e) {
        	exception = e;
    	}
     		assertEquals("Negatives not allowed: [-1,-4,-5]", exception.getMessage());
	}
	@Test
	public  void testBiggerThan1000Ignored() {
    	assertEquals(2, Calculator.add("1001,2"));
	}
*/

}
    
