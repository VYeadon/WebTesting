package com.qa.myblackjack;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class paramaterTest {
	
	@Parameters
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][]{ {0, -10, -10}, {0, 10, -10}, {5,25,5} });
	}
	
	private int expected;
	private int input;
	private int input2;
	
	// These need to be made within the constructor 
	public paramaterTest(int expectedIn, int input1In, int input2In)
	{
		expected = expectedIn;
		input = input1In;
		input2 = input2In;
	}
	
	BlackJack b = new BlackJack();

	
	@Test
	public void test()
	{
		assertEquals(expected, b.play(input, input2));
	}
}
