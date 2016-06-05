package calc.tests;
import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import calc.Calculator;


public class TestCalculator {

	private final static double delta = 0.00001;
	
	@Test
	public void test1() {
		Assert.assertEquals(1.0, Calculator.calc("1"), delta);
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(11.0, Calculator.calc("11"), delta);
	}

	@Test
	public void test3() {
		Assert.assertEquals(2.0, Calculator.calc("1+1"), delta);
	}
}
