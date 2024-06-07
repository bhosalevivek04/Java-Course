package com.vivek;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ShapesTest {
	Shapes shape = new Shapes();

	@Test
	void testComputeSquareArea() {
		assertEquals(400, shape.computeSquareArea(20));
	}

	@Test
	void testComputeCircleArea() {
		assertEquals(12.56, shape.computeCircleArea(2));
	}

}
