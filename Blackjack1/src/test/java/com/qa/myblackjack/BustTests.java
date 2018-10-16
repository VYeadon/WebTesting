package com.qa.myblackjack;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BustTests {

	BlackJack b = new BlackJack();
	
	@Test
	public void test() {
		assertEquals("1 bust 1 valid" ,4, b.play(22,4));
	}
	@Test
	public void test2() {
		assertEquals("1 valid 1 bust", 4, b.play(4, 25));
	}
	@Test
	public void test3() {
		assertEquals("1 valid 1 bust", 3, b.play(3, 30));
	}
	@Test
	public void test4() {
		assertEquals("1 valid 1 bust", 1, b.play(1, 28));
	}
}
