package Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import oldClasses.Calculator;






class CalculatorTest {
	
	
	Calculator calculatorBurak;
	
	
	@BeforeEach
	void setUp() {
		calculatorBurak = new Calculator(); 
	}
	
	@Test 
	void testAdd() {
		
		assertEquals(5, calculatorBurak.add(2, 3), "2 + 3 should equal 5"); 
		
	}


}
