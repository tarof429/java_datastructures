package com.taro;

import org.junit.Test;

public class MysteryTest {

	@Test
	public void testMystery() {

		// System.out.println(mystery(2, 4));

		// System.out.println(mystery(5));

		// System.out.println(exR1(6));

		// System.out.println(reverse("hello"));

		// reverseRecursive("hello");

		// swap("friends");

		// swapRecursive("friends");

		countRecursive("chocolate", "o");
	}

	public static int mystery(int a, int b) {
		if (b == 0)
			return 0;
		if (b % 2 == 0)
			return mystery(a + a, b / 2);

		return a + mystery(a + a, b / 2);

	}

	public static int mystery(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n * mystery(n - 1);
		}
	}

	public static String exR1(int n) {
		if (n <= 0)
			return "";

		return exR1(n - 3) + exR1(n - 2) + n;
	}

	public static String reverse(String s) {
		String ret = "";

		int index = s.length() - 1;

		while (index >= 0) {
			ret += s.substring(index, index + 1);
			index--;
		}
		return ret;
	}

	public static void reverseRecursive(String s) {

		if (!s.equals("")) {
			System.out.print(s.substring(s.length() - 1));
			reverseRecursive(s.substring(0, s.length() - 1));
		}
	}

	public static void swap(String s) {

		for (int i = 1; i < s.length(); i += 2) {
			System.out.print(s.substring(i, i + 1));
			System.out.print(s.substring(i - 1, i));
			if (i + 2 == s.length()) {
				System.out.print(s.substring(i + 1, i + 2));
			}
		}
	}

	public static void swapRecursive(String s) {
		swapRecursive(1, s);
	}

	public static void swapRecursive(int index, String s) {
		if (index == s.length()) {
			System.out.print(s);
			return;
		}
		System.out.print(s.substring(index, index + 1));
		System.out.print(s.substring(index - 1, index));
		swapRecursive(1, s.substring(index + 1, s.length()));

	}

	public static void count(String s, String key) {
		int count = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.substring(i, i + 1).equals(key)) {
				count++;
			}

		}

		System.out.println(count);
	}

	public static void countRecursive(String s, String key) {

		int counter = 0;
		counter = countRecursive(s);

		System.out.println(counter);
	}

	public static int countRecursive(String s) {

		if (s.equals("")) {
			return 0;
		} else {
			int counter = 0;

			if (s.subSequence(0, 1).equals("o")) {
				counter++;
			}

			counter += countRecursive(s.substring(1));

			return counter;
		}
	}
}
