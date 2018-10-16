package com.qa.myblackjack;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BlackJackTest {
	static int count;
	
	@BeforeClass
	static public void preTests() {
		count = 1;
		System.out.println("Welcome to my tests");
	}
	
	@Before
	public void setup(){
		System.out.println("Starting test " + count + "/17");

	}
	@After
	public void teardown(){
		System.out.println("Test " + count + "/17 Finished");
		count++;
	}
	
	@AfterClass
	static public void postClass()
	{
		System.out.println("Your tests are finsihed bitch");
	}
	
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
	@Test
	public void test5() {
		assertEquals("1 low invalid entries", 0, b.play(-10, 10));
	}
	@Test
	public void test6() {
		assertEquals("Dealer Bust", 10, b.play(10, 30));
	}
	@Test
	public void test7() {
		assertEquals("Dealer Invalid", 0, b.play(50,  10));
	}
	@Test
	public void test8() {
		assertEquals("Player Bust", 0, b.play(30,-10));
	}
	@Test
	public void test9() {
		assertEquals("Player Bust", 10, b.play(30, 10));
	}
	@Test
	public void test10() {
		assertEquals("Both Bust", 0, b.play(30, 30));
	}
	@Test
	public void test11() {
		assertEquals("1 Bust 1 high invalid", 0, b.play(30, 50));
	}
	@Test
	public void test12() {
		assertEquals("1 low invalid 1 high invalid entries", 0, b.play(50,-10));
	}
	@Test
	public void test13() {
		assertEquals("1 Bust 1 high invalid", 0, b.play(50, 10));
	}
	@Test
	public void test14() {
		assertEquals("1 Bust 1 high invalid", 0, b.play(50, 30));
	}
	@Test
	public void test15() {
		assertEquals("2 high invalid entries", 0, b.play(50, 50));
	}
	@Test
	public void test16() {
		assertEquals("Dealer Wins", 11, b.play(10, 11));
	}
	@Test
	public void test17() {
		assertEquals("Player Wins", 11, b.play(11, 10));
	}	
}
