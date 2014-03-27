package com.taro.fibonacci;

public class Fibonacci {

	public static int fibInt(int n) {
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;

		return (fibInt(n - 1) + fibInt(n - 2));
	}
}
