package com.vivek;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalcTest {

	@Test
	public void test() {
		Calc calc=new Calc();
		int actual=calc.divide(10,5);
		int expectedResult=2;
		assertEquals(expectedResult,actual);
	}

}
