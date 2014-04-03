package com.taro;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class CodingBatTest {

	/*
	 * Given two int values, return their sum. Unless the two values are the
	 * same, then return double their sum.
	 * 
	 * sumDouble(1, 2) -> 3 sumDouble(3, 2) -> 5 sumDouble(2, 2) -> 8
	 */
	@Test
	public void testSumDouble() {

		Assert.assertEquals(3, sumDouble(1, 2));
		Assert.assertEquals(5, sumDouble(3, 2));
		Assert.assertEquals(8, sumDouble(2, 2));

	}

	@Test
	public void testMiddleThree() {
		Assert.assertEquals("and", middleThree("Candy"));
		Assert.assertEquals("and", middleThree("and"));
		Assert.assertEquals("lvi", middleThree("solving"));
		Assert.assertEquals("yet", middleThree("yet"));
		Assert.assertEquals("yet", middleThree("java yet java"));
		Assert.assertEquals("col", middleThree("Chocolae"));
		Assert.assertEquals("xyz", middleThree("XabcxyzabcX"));
	}

	/*
	 * Given a string, return true if it ends in "ly".
	 * 
	 * endsLy("oddly") → true endsLy("y") → false endsLy("oddy") → false
	 */
	@Test
	public void testEndsLy() {
		Assert.assertTrue(endsLy("oddly"));
		Assert.assertFalse(endsLy("y"));
		Assert.assertFalse(endsLy("oddy"));
		Assert.assertFalse(endsLy("oddl"));
		Assert.assertFalse(endsLy("olydd"));
		Assert.assertTrue(endsLy("ly"));
		Assert.assertFalse(endsLy(""));
		Assert.assertFalse(endsLy("falsey"));
		Assert.assertTrue(endsLy("evenly"));
	}

	@Test
	public void testTwoChar() {
		Assert.assertEquals("ja", twoChar("java", 0));
		Assert.assertEquals("va", twoChar("java", 2));
		Assert.assertEquals("ja", twoChar("java", 3));
		Assert.assertEquals("ja", twoChar("java", 4));
		Assert.assertEquals("He", twoChar("Hello", 0));
	}

	@Test
	public void testAbba() {
		Assert.assertEquals("HiByeByeHi", makeAbba("Hi", "Bye"));
		Assert.assertEquals("YoAliceAliceYo", makeAbba("Yo", "Alice"));
		Assert.assertEquals("WhatUpUpWhat", makeAbba("What", "Up"));
	}

	@Test
	public void testMakeTags() {
		Assert.assertEquals("<i>Yay</i>", makeTags("i", "Yay"));
		Assert.assertEquals("<i>Hello</i>", makeTags("i", "Hello"));
		Assert.assertEquals("<cite>Yay</cite>", makeTags("cite", "Yay"));
	}

	@Test
	public void testNearHundred() {
		Assert.assertTrue(nearHundred(93));
		Assert.assertTrue(nearHundred(90));
		Assert.assertFalse(nearHundred(89));
		Assert.assertFalse(nearHundred(111));
	}

	@Test
	public void testFirstLast6() {
		Assert.assertTrue(firstLast6(new int[] { 1, 2, 6 }));
		Assert.assertTrue(firstLast6(new int[] { 6, 1, 2, 3 }));
		Assert.assertFalse(firstLast6(new int[] { 13, 6, 1, 2, 3 }));
	}

	@Test
	public void testFront11() {

		Assert.assertArrayEquals(new int[] { 1, 7 },
				front11(new int[] { 1, 2, 3 }, new int[] { 7, 9, 8 }));
		Assert.assertArrayEquals(new int[] { 1, 2 },
				front11(new int[] { 1 }, new int[] { 2 }));
		Assert.assertArrayEquals(new int[] { 1 },
				front11(new int[] { 1, 7 }, new int[] {}));
	}

	@Test
	public void testMakeLast() {
		Assert.assertArrayEquals(new int[] { 0, 0, 0, 0, 0, 6 },
				makeLast(new int[] { 4, 5, 6 }));
		Assert.assertArrayEquals(new int[] { 0, 0, 0, 2 }, makeLast(new int[] {
				1, 2 }));
		Assert.assertArrayEquals(new int[] { 0, 3 }, makeLast(new int[] { 3 }));
	}

	// //////////////////////// Warmup-1 //////////////////////
	static int sumDouble(int a, int b) {

		int result = a + b;

		if (a == b) {
			result *= 2;
		}

		return result;
	}

	public boolean nearHundred(int n) {
		if (90 <= n && n <= 110) {
			return true;
		} else if (190 <= n && n <= 210) {
			return true;
		}
		return false;

		// Alternative approach using Math.abs()
		// return ((Math.abs(100 - n) <= 10) || (Math.abs(200 - n) <= 10));
	}

	// //////////////////////// String-1 //////////////////////
	static boolean endsLy(String str) {

		if (str == null || str.length() < 2) {
			return false;
		}
		int startIndex = str.length() - 2;

		if (str.substring(startIndex).equals("ly")) {
			return true;
		}
		return false;
	}

	public static String middleThree(String str) {

		if (str == null || str.length() < 3) {
			return str;
		}

		int mid = str.length() / 2 - 1;

		return str.substring(mid, mid + 3);
	}

	// This is a good problem
	public String twoChar(String str, int index) {

		if (str.length() < 2) {
			return str;
		}

		int length = str.length();

		if ((index >= length - 1) || (index < 0)) {
			return str.substring(0, 2);
		}
		return (str.substring(index, index + 2));
	}

	public String makeAbba(String a, String b) {
		return a + b + b + a;
	}

	public String makeTags(String tag, String word) {
		return "<" + tag + ">" + word + "</" + tag + ">";
	}

	// //////////////////////// Array-1 //////////////////////
	public static boolean firstLast6(int[] nums) {
		return (nums[0] == 6 || nums[nums.length - 1] == 6);
	}

	public static int[] front11(int[] a, int[] b) {
		boolean inA = a.length > 0;
		boolean inB = b.length > 0;

		if (inA && inB) {
			return new int[] { a[0], b[0] };
		} else if (inA) {
			return new int[] { a[0] };
		} else if (inB) {
			return new int[] { b[0] };
		} else {
			return new int[] {};
		}
	}

	public int[] makeLast(int[] nums) {
		int length = nums.length;

		int[] ret = new int[length * 2];

		Arrays.fill(ret, 0);

		ret[ret.length - 1] = nums[nums.length - 1];

		return ret;
	}

}
