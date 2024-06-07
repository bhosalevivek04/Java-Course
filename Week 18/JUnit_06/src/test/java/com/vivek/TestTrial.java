package com.vivek;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestTrial {
	Shapes shape=new Shapes();
	@Test
	void test() {
		assertEquals(6, 6);
	}
	@Test
	void testcomputeCircleArea() {
		assertEquals(78.5,shape.computeCircleArea(5),"Area of Sq calculation is wrong");
	}
	@Test
	void testcomputeCircleArea_Suplier() {
		assertEquals(78.5,shape.computeCircleArea(5),()->"Area of Circle calculation is wrong");
	}

}
