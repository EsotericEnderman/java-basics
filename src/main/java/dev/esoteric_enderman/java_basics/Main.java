package dev.esoteric_enderman.java_basics;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.*;

import dev.esoteric_enderman.java_basics.classes.SecondClass;
import dev.esoteric_enderman.java_basics.classes.ThirdClass;
import dev.esoteric_enderman.java_basics.classes.abstraction.abstract_classes.Vehicle;
import dev.esoteric_enderman.java_basics.classes.abstraction.subclasses.vehicles.Car;
import dev.esoteric_enderman.java_basics.classes.abstraction.subclasses.vehicles.Motorbike;
import dev.esoteric_enderman.java_basics.classes.statics.Utility;
import dev.esoteric_enderman.java_basics.enums.CoffeeSize;
import dev.esoteric_enderman.java_basics.enums.Dessert;

public class Main {

	private static SecondClass secondClass;

	public static void main(String[] args) {
		String sentence = "This is a string."; // Can also have a blank string. String sentence;
		System.out.println(sentence);
		System.out.println(sentence.toUpperCase());

		String str1;
		String str2 = "";

		// The following will error:
		// System.out.println(str1 == str2);
		// Because str1 isn't initialised. => You can declare a variable, and assign the value later in the code.

		// You can change variables, as long as they are not marked as final.

		int luckyNumber = 7;
		luckyNumber = 16;

		final int luckiestNumber = 42;
		// Can't change variable luckiestNumber because of the "final" keyword.
		// Basically like const in JS.

		// You can also declare multiple variables at the same time.
		int x = 1, y = 2, z = 3;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);

		// Bytes go from -128 to 127 because they are 8 bits. 1 bit is used for the sign (I think).
		byte w = -128;
		byte t = 127;

		// Ints can't be decimal. They are whole numbers. (positive or negative)
		int number = 13;
		// Number has no methods, while sentence does.

		double decimalNumber = 3.2;

		boolean hasLearnedJava = false;

		// Use single quotes. Char = character.
		char letter = 'Z';

		// Really long numbers.
		long reallyLongNumber = (long) 1.54259205260356542069024699;
		short shortNumber = (short) 1.5532958295092045;

		// Add F at the end of the number to convert to float.
		float floatingPointNumber = 1.000014444522222F;

		String nonPrimitive = "Strings are not primitive, while the other data types mentioned so far, are.";
		Integer otherNumber = 1; // Integer is a class, so it has methods.

		System.out.println(otherNumber);

		// Add D (or d) to make it a double.
		Double nonPrimitiveDouble = 4.5D;

		// Probably not going to use this a lot.
		Boolean nonPrimitiveBoolean = true;

		Character nonPrimitiveCharacter = 'W';

		// Always use non-primitive String.
		// Most of the time use primitives.

		System.out.println(Integer.parseInt("5"));

		// The method needs to be static.
		printMessage("Does this method work?");
		printMessage("Yes, it does!");
		int returnValue = printMessage("This method works!");

		System.out.println(returnValue);

		// Press Alt+Enter with your caret at the highlighted text to see how
		// IntelliJ IDEA suggests fixing it.
		System.out.println("Hello and welcome!");

		// Press Shift+F10 or click the green arrow button in the gutter to run the code.
		for (int i = 1; i <= 5; i++) {

			// Press Shift+F9 to start debugging your code. We have set one breakpoint
			// for you, but you can always add more by pressing Ctrl+F8.
			System.out.println("i = " + i);
		}

		int exampleNumber = 5;

		if (exampleNumber > 3) {
			// 5 > 3 so this code is run.
		} else if (exampleNumber < 1) {
			// If the number is less than 1, this code is run.
		} else {
			// If the number is equal to 1, 2, or 3, this code will run.
		}

		boolean condition = true;
		if (condition) { // Shorthand for condition == true.
			System.out.println("True!");
		}

		/*
		> Greater than.
		< Less than.
		>= Greater than or equal to.
		<= Less than or equal to.
		== Equal to.
		!= Not equal to.
		&& And.
		|| Or.
		 */

		if (10 < 5) {
			// This will never run.
		} else if (15 <= 15) {
			// This will run...
		}

		if (14 != 14) {
			// This won't run!
		}

		if (15 == 5 && 20 == 20) {
			// Won't run.
		}

		if (15 == 5 || 20 == 20) {
			// This will run!
		}

		String someString = null; // The variable does not point to any value in memory.

		try {
			System.out.println(someString.substring(0));
		} catch (NullPointerException exception) {
			System.out.println("String does not exist!");
			exception.printStackTrace(); // Prints where the error occurred, similar to throw.
			// Previously, all code executing stopped, now it continues after the catch statement.
		} finally {
			System.out.println("This will always run, even if the above code has error-ed!");
		}

		String someString2 = "Whatever";
		// String is a class. EVERYTHING, is a class. (except null)
		someString2.toLowerCase();

		secondClass = new SecondClass(2); // Can be accessed in other methods too.
		secondClass.f();
		secondClass.h();

		System.out.println("End of program!");

		List<Vehicle> vehicles = new ArrayList<Vehicle>();
		vehicles.add(new Car(4, "Green"));
		vehicles.add(new Motorbike("Blue", 4));

		System.out.println(vehicles.get(1).getWheels());

		for (Vehicle vehicle : vehicles ) {
			vehicle.activateBreaks();
		}

		System.out.println(CoffeeSize.LARGE.getPrice());
		CoffeeSize ordered = CoffeeSize.MEDIUM;

		System.out.println("A customer has just order a " + ordered.getName() + " coffee for $" + ordered.getPrice());
		System.out.println(Dessert.CAKE.getName());

		ThirdClass thirdClass = new ThirdClass();
		thirdClass.test();
		System.out.println(thirdClass.notStaticNumber);

		ThirdClass.test2();
		System.out.println(ThirdClass.someNumber);

		System.out.println(Utility.calculate(4, 2));

		String input = "Apple";

		switch (input) {
			case "Banana":
				System.out.println("The word is 'Banana'!");
				break;
			case "Apple":
				System.out.println("The word is 'Apple'!");
				break;
			default:
				System.out.println("The word is unknown...");
				break;
		}

		switch (input) {
			case "Banana":
				System.out.println("The word is 'Banana'!");
				return;
			case "Apple":
				System.out.println("Not 'Apple'!");
				break;
			default:
				System.out.println("Nope! Not that!");
				break;
		}

		System.out.println("Test");

		Calendar calendar = Calendar.getInstance();

		System.out.println(calendar.get(Calendar.DAY_OF_MONTH) + "/" + (calendar.get(Calendar.MONTH) + 1) + "/" + calendar.get(Calendar.YEAR));

		calendar.add(Calendar.DAY_OF_YEAR, 1);

		System.out.println(calendar.get(Calendar.DAY_OF_MONTH) + "/" + (calendar.get(Calendar.MONTH) + 1) + "/" + calendar.get(Calendar.YEAR));

		calendar.add(Calendar.DAY_OF_YEAR, -1);

		Random random = new Random();
		System.out.println(random.nextInt(0, 11));

		for (int i = 0; i < 100; i++) {
			System.out.println(random.nextInt(0, 11));
		}

		List<String> list = new ArrayList<>();
		list.add("Option 1");
		list.add("Option 2");
		list.add("Option 3");

		System.out.println(list.get(random.nextInt(list.size())));
	}

	private static int printMessage(String message) {
		System.out.println(message);
		return message.length();
	}

	// METHOD OVERLOADING.
	// For integers.
	public static int minFunction(int n1, int n2) {
		int min;
		if (n1 > n2)
			min = n2;
		else
			min = n1;

		return min;
	}

	// For doubles.
	public static double minFunction(double n1, double n2) {
		double min;
		if (n1 > n2)
			min = n2;
		else
			min = n1;

		return min;
	}

	// Basically spread operator.
	private static void doSomething(double... test) {
		System.out.println(Arrays.toString(test));
	}
}
