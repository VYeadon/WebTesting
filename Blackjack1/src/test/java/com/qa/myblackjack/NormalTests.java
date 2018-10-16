package com.qa.myblackjack;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

	public class NormalTests {
	BlackJack b = new BlackJack();
	
	@Test
	public void test() {
		assertEquals("1 low 1 high both valid" ,11, b.play(10,11));
	}
	@Test
	public void test2() {
		assertEquals("both valid", 10, b.play(10, 10));
	}
	@Test
	public void test3() {
		assertEquals("1 high 1 low both valid", 10, b.play(10, 3));
	}
	@Test
	public void test4() {
		assertEquals("1 high 1 low both valid", 12, b.play(12, 5));
	}
}
