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
    	assertEquals(0+1+2, Calculator.add("0,1n2"));
	}

}
    
