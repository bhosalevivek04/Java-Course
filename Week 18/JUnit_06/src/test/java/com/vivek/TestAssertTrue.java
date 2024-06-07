package com.vivek;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestAssertTrue {

	@Test
	void test() {
		String str = "Junit";
		assertTrue(str.equals("Junit"));

	}

	@Test
	void test1() {
		String str = "Junit";
		assertFalse(str.equals("JUNIT"));

	}

}
