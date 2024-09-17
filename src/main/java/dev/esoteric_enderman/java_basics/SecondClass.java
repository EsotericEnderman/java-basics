package dev.esoteric_enderman.java_basics;

import java.awt.*;
import java.util.*;

import java.util.List;
import java.util.LinkedList;

public class SecondClass {
	private static Object djObject;

	// public NameOfClass.
	public SecondClass(int number) {
		// Runs as soon as second class is created.

		System.out.println("Created new second class!");
		System.out.println(number);
	}

	// Private = can't be run outside the class.
	// Public = can be run anywhere.
	public void f() {
		System.out.println("Method f in second class has been run!");
	}

	// Protected = can only be run in this package.
	protected void g() {
		// Uninitialised variable of reference type.
		// Hence, it will store null in it.

		// null can only be assigned to reference types.
		System.out.println(djObject);
	}

	protected void h() {
		//                             0
		String[] array = new String[]{ "Value 1", "Value 2", "Value 3" };
		int[] luckNumbers = new int[]{ 3, 7, 13, 16, 17, 18, 19, 21, 22, 23, 27, 33, 36, 39, 44, 77 };

		Polygon[] bestPolygonsQuestionMark = new Polygon[]{};

		String valueOne = array[0];
		System.out.println(valueOne);

		// array[3]; will throw an ArrayIndexOutOfBoundsException.

		array[0] = "New value 1";

		System.out.println(Arrays.toString(array));

		List<String> arrayOnSteroids = new ArrayList<String>();
		arrayOnSteroids.add("Test 1");
		arrayOnSteroids.add("Test 2");

		System.out.println(arrayOnSteroids.get(0));
		System.out.println(arrayOnSteroids.get(1));

		// Keys and values can't be primitive.
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		// Keys and values can be anything.

		map.put(5, "Test");
		map.get(5);

		System.out.println(map.get(5));

		// Linked lists and hashmaps provide more methods.
		LinkedList<String> linkedList = new LinkedList<String>();

		// It also maintains order.

		LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<String, String>();

		linkedHashMap.put("Test", "Test");

		System.out.println(linkedHashMap.keySet().toArray()[0]);

		for (int i = 0; i < array.length; i++) {
			String value = array[i];

			System.out.println(value);
		}

		for (int i = 0; i < arrayOnSteroids.size(); i++) {
			String value = arrayOnSteroids.get(i);

			System.out.println(value);
		}

		for (int i = 0; i < map.size(); i++) {
			Object key = map.keySet().toArray()[i];
			Object value = map.values().toArray()[i];

			System.out.println(key);
			System.out.println(value);
			System.out.println(i);
		}

		// If `i` isn't needed. Can't do with maps.
		for(String string : array) {
			System.out.println(string);
		}

		int number = 0;
		while (number <= 10) {
			System.out.println(number);
			number++;
		}

		int[] luckyNumbers = {3, 7, 13, 16, 19, 21, 36, 39, 42};
		int luckiestNumber = luckyNumbers[luckyNumbers.length - 1];

		System.out.println(luckiestNumber);

		String[][] twoDimensionalArray = { { "Hi" }, { "Hi", "Hello" } };
	}
}
