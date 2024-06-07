package com.vivek;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ShapesTest {
	Shapes shape=new Shapes();
	@Test
	void testComputeSquareArea() {
		assertNotEquals(5765,shape.computeSquareArea(24) );
	}
	@Test
	void testComputeSquareArea_WithMessage() {
		assertNotEquals(576,shape.computeSquareArea(24),"Message to dev if test case failed");
	}
	@Test
	void testComputeSquareArea_Suplier() {
		assertNotEquals(576,shape.computeSquareArea(24),()->"Message to dev if test case failed");
	}

}
