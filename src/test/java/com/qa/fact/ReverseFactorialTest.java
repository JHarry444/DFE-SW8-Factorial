package com.qa.fact;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReverseFactorialTest {

	private ReverseFactorial fact = new ReverseFactorial();

	@Test
	public void test1Factorial() {
		assertEquals("1!", this.fact.reverse(1));
	}

	@Test
	public void test2Factorial() {
		assertEquals("2!", this.fact.reverse(2));
	}

	@Test
	public void test3Factorial() {
		assertEquals("3!", this.fact.reverse(6));
	}

	@Test
	public void test4Factorial() {
		assertEquals("4!", this.fact.reverse(24));
	}

	@Test
	public void test5Factorial() {
		assertEquals("5!", this.fact.reverse(120));
	}

	@Test
	public void testNoneFactorial() {
		assertEquals("NONE", this.fact.reverse(99));
	}
}
