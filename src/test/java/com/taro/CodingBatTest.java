package com.taro;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class CodingBatTest {

	@Test
	public void testWarmup1() {

		Assert.assertEquals(3, sumDouble(1, 2));
		Assert.assertEquals(5, sumDouble(3, 2));
		Assert.assertEquals(8, sumDouble(2, 2));

		Assert.assertTrue(nearHundred(93));
		Assert.assertTrue(nearHundred(90));
		Assert.assertFalse(nearHundred(89));
		Assert.assertFalse(nearHundred(111));

		Assert.assertEquals("ktten", missingChar("kitten", 1));
		Assert.assertEquals("itten", missingChar("kitten", 0));
		Assert.assertEquals("kittn", missingChar("kitten", 4));

		Assert.assertTrue(makes10(9, 10));
		Assert.assertFalse(makes10(9, 9));
		Assert.assertTrue(makes10(1, 9));
	}

	@Test
	public void testWarmup2() {

		Assert.assertEquals("ChoCho", frontTimes("Chocolate", 2));
		Assert.assertEquals("ChoChoCho", frontTimes("Chocolate", 3));
		Assert.assertEquals("AbcAbcAbc", frontTimes("Abc", 3));
	}

	@Test
	public void testArray1() {

		Assert.assertTrue(firstLast6(new int[] { 1, 2, 6 }));
		Assert.assertTrue(firstLast6(new int[] { 6, 1, 2, 3 }));
		Assert.assertFalse(firstLast6(new int[] { 13, 6, 1, 2, 3 }));

		Assert.assertArrayEquals(new int[] { 1, 7 },
				front11(new int[] { 1, 2, 3 }, new int[] { 7, 9, 8 }));
		Assert.assertArrayEquals(new int[] { 1, 2 },
				front11(new int[] { 1 }, new int[] { 2 }));
		Assert.assertArrayEquals(new int[] { 1 },
				front11(new int[] { 1, 7 }, new int[] {}));

		Assert.assertArrayEquals(new int[] { 0, 0, 0, 0, 0, 6 },
				makeLast(new int[] { 4, 5, 6 }));
		Assert.assertArrayEquals(new int[] { 0, 0, 0, 2 }, makeLast(new int[] {
				1, 2 }));
		Assert.assertArrayEquals(new int[] { 0, 3 }, makeLast(new int[] { 3 }));

		Assert.assertFalse(sameFirstLast(new int[] { 1, 2, 3 }));
		Assert.assertTrue(sameFirstLast(new int[] { 1, 2, 3, 1 }));
		Assert.assertTrue(sameFirstLast(new int[] { 1, 2, 1 }));

		Assert.assertTrue(commonEnd(new int[] { 1, 2, 3 }, new int[] { 7, 3 }));
		Assert.assertFalse(commonEnd(new int[] { 1, 2, 3 },
				new int[] { 7, 3, 2 }));
		Assert.assertTrue(commonEnd(new int[] { 1, 2, 3 }, new int[] { 1, 3 }));
	}

	@Test
	public void testSttring1() {
		Assert.assertEquals("and", middleThree("Candy"));
		Assert.assertEquals("and", middleThree("and"));
		Assert.assertEquals("lvi", middleThree("solving"));
		Assert.assertEquals("yet", middleThree("yet"));
		Assert.assertEquals("yet", middleThree("java yet java"));
		Assert.assertEquals("col", middleThree("Chocolae"));
		Assert.assertEquals("xyz", middleThree("XabcxyzabcX"));

		Assert.assertTrue(endsLy("oddly"));
		Assert.assertFalse(endsLy("y"));
		Assert.assertFalse(endsLy("oddy"));
		Assert.assertFalse(endsLy("oddl"));
		Assert.assertFalse(endsLy("olydd"));
		Assert.assertTrue(endsLy("ly"));
		Assert.assertFalse(endsLy(""));
		Assert.assertFalse(endsLy("falsey"));
		Assert.assertTrue(endsLy("evenly"));

		Assert.assertEquals("ja", twoChar("java", 0));
		Assert.assertEquals("va", twoChar("java", 2));
		Assert.assertEquals("ja", twoChar("java", 3));
		Assert.assertEquals("ja", twoChar("java", 4));
		Assert.assertEquals("He", twoChar("Hello", 0));

		Assert.assertEquals("HiByeByeHi", makeAbba("Hi", "Bye"));
		Assert.assertEquals("YoAliceAliceYo", makeAbba("Yo", "Alice"));
		Assert.assertEquals("WhatUpUpWhat", makeAbba("What", "Up"));

		Assert.assertEquals("<i>Yay</i>", makeTags("i", "Yay"));
		Assert.assertEquals("<i>Hello</i>", makeTags("i", "Hello"));
		Assert.assertEquals("<cite>Yay</cite>", makeTags("cite", "Yay"));
	}

	@Test
	public void testLogic1() {

		Assert.assertEquals(0, caughtSpeeding(60, false));
		Assert.assertEquals(1, caughtSpeeding(65, false));
		Assert.assertEquals(0, caughtSpeeding(65, true));

		Assert.assertTrue(love6(6, 4));
		Assert.assertFalse(love6(4, 5));
		Assert.assertTrue(love6(1, 5));

		Assert.assertFalse(cigarParty(30, false));
		Assert.assertTrue(cigarParty(50, false));
		Assert.assertTrue(cigarParty(70, true));

		Assert.assertEquals(2, dateFashion(5, 10));
		Assert.assertEquals(0, dateFashion(5, 2));
		Assert.assertEquals(1, dateFashion(5, 5));

		Assert.assertTrue(squirrelPlay(70, false));
		Assert.assertFalse(squirrelPlay(95, false));
		Assert.assertTrue(squirrelPlay(95, true));

		Assert.assertEquals(7, sortaSum(3, 4));
		Assert.assertEquals(20, sortaSum(9, 4));
		Assert.assertEquals(21, sortaSum(10, 11));
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

	public String missingChar(String str, int n) {
		String ret = "";

		char[] strArray = str.toCharArray();

		for (int i = 0; i < strArray.length; i++) {
			if (i != n) {
				ret += strArray[i];
			}
		}
		return ret;
	}

	public boolean makes10(int a, int b) {
		if (a == 10 || b == 10) {
			return true;
		} else if (a + b == 10) {
			return true;
		}
		return false;

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

	public boolean sameFirstLast(int[] nums) {
		return ((nums.length >= 1) && (nums[0] == nums[nums.length - 1]));
	}

	public int sum3(int[] nums) {
		int sum = 0;

		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		return sum;
	}

	public boolean commonEnd(int[] a, int[] b) {
		if (a[0] == b[0]) {
			return true;
		} else if (a[a.length - 1] == b[b.length - 1]) {
			return true;
		}
		return false;
	}

	// //////////////////////// Logic-1 //////////////////////
	public boolean cigarParty(int cigars, boolean isWeekend) {
		if (cigars >= 40) {
			if (!isWeekend && cigars <= 60) {
				return true;
			} else if (isWeekend) {
				return true;
			}
		}
		return false;
	}

	// Had trouble with the second condition, but figured it out
	public int caughtSpeeding(int speed, boolean isBirthday) {
		int minSpeedLimit = isBirthday ? 65 : 60;
		int maxSpeedLimit = isBirthday ? 85 : 80;

		if (speed <= minSpeedLimit) {
			return 0;
		} else if (speed <= maxSpeedLimit) {
			return 1;
		} else {
			return 2;
		}
	}

	// Not sure how to use Math.abs()
	public boolean love6(int a, int b) {
		if (a == 6 || b == 6) {
			return true;
		} else if (a + b == 6) {
			return true;
		} else if (a - b == 6) {
			return true;
		} else if (b - a == 6) {
			return true;
		}

		return false;
	}

	public int dateFashion(int you, int date) {

		if (you <= 2 || date <= 2) {
			return 0;
		} else if (you >= 8 || date >= 8) {
			return 2;
		}
		return 1;
	}

	public boolean squirrelPlay(int temp, boolean isSummer) {
		int upperLimit = isSummer ? 100 : 90;

		return (temp >= 60 && temp <= upperLimit);
	}

	public int sortaSum(int a, int b) {

		int sum = a + b;

		if (sum >= 10 && sum <= 19) {
			return 20;
		}
		return sum;
	}

	// //////////////////////// Warmup-2 //////////////////////
	public String frontTimes(String str, int n) {
		int length = str.length();

		String s = str.substring(0, length < 3 ? length : 3);

		String ret = "";

		for (int i = 0; i < n; i++) {
			ret += s;
		}
		return ret;
	}

}
