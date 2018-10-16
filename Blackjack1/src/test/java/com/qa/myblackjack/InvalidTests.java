package com.qa.myblackjack;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class InvalidTests {

	BlackJack b = new BlackJack();
	
	@Test
	public void test() {
		assertEquals("2 low invalid entries" ,0, b.play(-10,-10));
	}
	@Test
	public void test2() {
		assertEquals("1 low invalid entries", 0, b.play(10, -10));
	}
	@Test
	public void test3() {
		assertEquals("1 low invalid entries", 0, b.play(-10, 30));
	}
	@Test
	public void test4() {
		assertEquals("1 low invalid 1 high invalid entries", 0, b.play(-10, 50));
	}
}
