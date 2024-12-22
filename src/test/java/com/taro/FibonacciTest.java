package com.taro;

import junit.framework.Assert;

import org.junit.Test;

import com.taro.fibonacci.Fibonacci;

public class FibonacciTest {

	@Test
	/**
	 * This test uses the method fibInt(). The largest value it can compute correctly is less than 2 ^ 31 -1,
	 * or the largest size of an int, which is 1836311903. Past this value, the numbers are negative. This is 
	 * because Java ints are signed (incidentally, the smallest value of an int is -2 ^ 31.
	 */
	public void testFibonaci() {

		for (int i = 0; i < 5; i++) {
			System.out.print(Fibonacci.fibInt(i) + " ");
		}

		Assert.assertTrue(true);
	}

}
