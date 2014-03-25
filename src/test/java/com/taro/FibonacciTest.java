package com.taro;

import junit.framework.Assert;

import org.junit.Test;

import com.taro.fibonacci.Fibonacci;

public class FibonacciTest {

	@Test
	public void testFibonaci() {

		for (int i = 0; i < 20; i++) {
			System.out.print(Fibonacci.fib(i) + " ");
		}

		Assert.assertTrue(true);
	}

}
