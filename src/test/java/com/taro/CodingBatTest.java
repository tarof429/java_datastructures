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

		Assert.assertTrue(parrotTrouble(true, 6));
		Assert.assertFalse(parrotTrouble(true, 7));
		Assert.assertFalse(parrotTrouble(false, 6));

		Assert.assertTrue(monkeyTrouble(true, true));
		Assert.assertTrue(monkeyTrouble(false, false));
		Assert.assertFalse(monkeyTrouble(true, false));

		Assert.assertTrue(posNeg(1, -1, false));
		Assert.assertTrue(posNeg(-1, 1, false));
		Assert.assertTrue(posNeg(-4, -5, true));

		Assert.assertEquals("not candy", notString("candy"));
		Assert.assertEquals("not x", notString("x"));
		Assert.assertEquals("not bad", notString("not bad"));

		Assert.assertEquals("eodc", frontBack("code"));
		Assert.assertEquals("a", frontBack("a"));
		Assert.assertEquals("ba", frontBack("ab"));

		Assert.assertTrue(or35(3));
		Assert.assertTrue(or35(10));
		Assert.assertFalse(or35(8));

		Assert.assertEquals("JavJavJav", front3("Java"));
		Assert.assertEquals("ChoChoCho", front3("Chocolate"));
		Assert.assertEquals("abcabcabc", front3("abc"));

		Assert.assertEquals("kikittenki", front22("kitten"));
		Assert.assertEquals("HaHaHa", front22("Ha"));
		Assert.assertEquals("ababcab", front22("abc"));
	}

	@Test
	public void testWarmup2() {

		Assert.assertEquals("HiHi", stringTimes("Hi", 2));
		Assert.assertEquals("HiHiHi", stringTimes("Hi", 3));
		Assert.assertEquals("Hi", stringTimes("Hi", 1));

		Assert.assertEquals("ChoCho", frontTimes("Chocolate", 2));
		Assert.assertEquals("ChoChoCho", frontTimes("Chocolate", 3));
		Assert.assertEquals("AbcAbcAbc", frontTimes("Abc", 3));

		Assert.assertEquals(1, countXX("abcxx"));
		Assert.assertEquals(2, countXX("xxx"));
		Assert.assertEquals(3, countXX("xxxx"));

		Assert.assertTrue(doubleX("axxbb"));
		Assert.assertFalse(doubleX("axaxax"));
		Assert.assertTrue(doubleX("xxxxx"));

		Assert.assertEquals("Hlo", stringBits("Hello"));
		Assert.assertEquals("H", stringBits("Hi"));
		Assert.assertEquals("Hello", stringBits("Heeololeo"));
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

		Assert.assertArrayEquals(new int[] { 2, 3, 1 }, rotateLeft3(new int[] {
				1, 2, 3 }));
		Assert.assertArrayEquals(new int[] { 11, 9, 5 }, rotateLeft3(new int[] {
				5, 11, 9 }));
		Assert.assertArrayEquals(new int[] { 0, 0, 7 }, rotateLeft3(new int[] {
				7, 0, 0 }));

		Assert.assertArrayEquals(new int[] { 3, 3, 3 }, maxEnd3(new int[] { 1,
				2, 3 }));
		Assert.assertArrayEquals(new int[] { 11, 11, 11 }, maxEnd3(new int[] {
				11, 5, 9 }));
		Assert.assertArrayEquals(new int[] { 3, 3, 3 }, maxEnd3(new int[] { 2,
				11, 3 }));

		Assert.assertEquals(3, sum2(new int[] { 1, 2, 3 }));
		Assert.assertEquals(2, sum2(new int[] { 1, 1 }));
		Assert.assertEquals(2, sum2(new int[] { 1, 1, 1, 1 }));
	}

	@Test
	public void testString1() {
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

		Assert.assertTrue(in1To10(5, false));
		Assert.assertFalse(in1To10(11, false));
		Assert.assertTrue(in1To10(11, true));

		Assert.assertEquals("7:00", alarmClock(1, false));
		Assert.assertEquals("7:00", alarmClock(5, false));
		Assert.assertEquals("10:00", alarmClock(0, false));

		Assert.assertTrue(specialEleven(22));
		Assert.assertTrue(specialEleven(23));
		Assert.assertFalse(specialEleven(24));
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

	public boolean parrotTrouble(boolean talking, int hour) {
		if (talking) {
			if (hour < 7 || hour > 20) {
				return true;
			}
		}
		return false;
	}

	public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
		return (aSmile == bSmile);
	}

	public boolean posNeg(int a, int b, boolean negative) {
		if (negative) {
			return a < 0 && b < 0;
		} else {
			return a > 0 && b < 0 || b > 0 && a < 0;
		}
	}

	public String notString(String str) {
		if (str.length() >= 3) {
			if (str.substring(0, 3).equals("not")) {
				return str;
			} else {
				return "not " + str;
			}
		} else {
			return "not " + str;
		}
	}

	public String frontBack(String str) {
		if (str.length() <= 1) {
			return str;
		}

		char first = str.charAt(0);
		char last = str.charAt(str.length() - 1);
		String middle = str.substring(1, str.length() - 1);

		return last + middle + first;

	}

	public boolean or35(int n) {
		return n % 3 == 0 || n % 5 == 0;
	}

	public String front3(String str) {
		if (str.length() < 3) {
			return str + str + str;
		}
		String s = str.substring(0, 3);

		return s + s + s;
	}

	public String front22(String str) {
		String s = "";

		if (str.length() < 2) {
			s = str;
		} else {
			s = str.substring(0, 2);
		}

		return s + str + s;
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

	public int[] rotateLeft3(int[] nums) {

		int[] ret = new int[3];

		ret[0] = nums[1];
		ret[1] = nums[2];
		ret[2] = nums[0];

		return ret;
	}

	public int[] maxEnd3(int[] nums) {

		int max = nums[0] > nums[nums.length - 1] ? nums[0]
				: nums[nums.length - 1];

		int[] ret = new int[3];

		Arrays.fill(ret, max);

		return ret;
	}

	public int sum2(int[] nums) {
		if (nums.length == 0) {
			return 0;
		}

		else if (nums.length == 1) {
			return nums[0];
		}

		else {
			return nums[0] + nums[1];
		}
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

	public boolean in1To10(int n, boolean outsideMode) {
		if (outsideMode) {
			return n <= 1 || n >= 10;
		} else {
			return n >= 1 && n <= 10;
		}
	}

	public String alarmClock(int day, boolean vacation) {
		if (vacation) {
			if (day == 0 || day == 6) {
				return "off";
			} else {
				return "10:00";
			}
		} else {
			if (day == 0 || day == 6) {
				return "10:00";
			} else {
				return "7:00";
			}
		}
	}

	public boolean specialEleven(int n) {
		return (n % 11 == 0 || (n - 1) % 11 == 0);
	}

	// //////////////////////// Warmup-2 //////////////////////

	public String stringTimes(String str, int n) {
		String s = "";

		for (int i = 0; i < n; i++) {
			s += str;
		}
		return s;
	}

	public String frontTimes(String str, int n) {
		int length = str.length();

		String s = str.substring(0, length < 3 ? length : 3);

		String ret = "";

		for (int i = 0; i < n; i++) {
			ret += s;
		}
		return ret;
	}

	int countXX(String str) {

		int counter = 0;

		if (str.length() <= 1) {
			return counter;
		}

		char[] c = str.toCharArray();

		for (int i = 0; i < c.length - 1; i++) {
			if (str.substring(i, i + 2).equals("xx")) {
				counter++;
			}
		}

		return counter;
	}

	boolean doubleX(String str) {
		if (str.length() < 2) {
			return false;
		}

		int index = str.indexOf('x');

		if (index == str.length() - 1) {
			return false;
		}

		return str.charAt(index + 1) == 'x';
	}

	public String stringBits(String str) {
		if (str.length() < 1) {
			return str;
		} else if (str.length() == 2) {
			return str.substring(0, 1);
		} else {
			char[] c = str.toCharArray();

			String s = "";

			for (int i = 0; i < c.length; i += 2) {
				s += c[i];
			}

			return s;
		}
	}

}
