package week4text;

import java.util.Arrays;

public class codingProjectWeek4 {

	public static void main(String[] args) {

		// 1. Create an array of int called ages that contains the following values: 3,
		// 9, 23, 64, 2, 8, 28, 93.
		// a. Programmatically subtract the value of the first element in the array from
		// the value in the last element
		// of the array (i.e., do not use ages[7] in your code). Print the result to the
		// console.

		int[] ages = { 3, 9, 23, 64, 2, 8, 28, 93 };
		int firstNumber = ages[0];
		int answer = ages[ages.length - 1] - firstNumber;
		System.out.println(answer);

		// 1.b. Create a new array of int called ages2 with 9 elements (ages2 will be
		// longer than the ages array, and have more elements).
		// 1.b.i. Make sure that there are 9 elements of type int in this new array.

		int[] ages2 = { 3, 6, 9, 12, 15, 18, 21, 24, 27 };

		// 1.b.ii. Repeat the subtraction from Step 1.a. (Programmatically subtract the
		// value of the first element in the new array ages2 from the last element of
		// ages2).

		int firstNumber2 = ages2[0];
		int answer2 = ages2[ages2.length - 1] - firstNumber2;
		System.out.println(answer2);

		// 1.b.iii. Show that using the index values for the elements is dynamic (works
		// for arrays of different lengths).

		System.out.println((ages[7]) - (ages[0]));
		System.out.println((ages2[7]) - (ages2[0]));
		// Using the .length extension instead of pulling the index allowed us to
		// complete the same request on arrays of different lengths with nearly
		// identical code.
		// The above printouts show that simply subtracting the eighth number from the
		// first number would not work

		// 1.c. Use a loop to iterate through the array and calculate the average age.
		// Print the result to the console.

		int sum1c = 0;
		for (int i = 0; i < ages.length; i++) {
			sum1c += ages[i];
		}
		System.out.println(sum1c / ages.length);

		/*
		 * /2.a. Create an array of String called names that contains the following
		 * 		 values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”. a. Use a loop to
		 * 		 iterate through the array and calculate the average number of letters per
		 * 		 name. Print the result to the console.
		 */

		String[] names = { "Sam", "Tommy", "Tim", "Sally", "Buck", "Bob" };
		double letters = 0.00;
		for (String name : names) {
			letters += name.length();
		}
		double result2a = letters / names.length;
		System.out.println(result2a);

		/*
		 * /2.b. Create an array of String called names that contains the following
		 * 		 values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”. b. Use a loop to
		 * 		 iterate through the array again and concatenate all the names together,
		 * 		 separated by spaces, and print the result to the console.
		 */

		StringBuilder sb = new StringBuilder();
		String space = " ";
		for (String name : names) {
			sb.append(name);
			sb.append(space);
		}
		String allNames = sb.toString();
		System.out.println(allNames);

		/*
		 * / 3. How do you access the last element of any array?
		 */

		System.out.println(ages[ages.length - 1]);
		System.out.println(names[names.length - 1]);
		// Arrays are zero-indexed, so if an array (such as "ages" in 1.a.) has 8
		// elements, then we access the last element of an array by using the .length
		// extension method and subtracting one. The value connected to ages.length is
		// 8, but coding ages[ages.length] results in an out-of-bound error because
		// there is nothing in index [8]. The last element in this array was indexed
		// [7], so we need [Array.length - 1] to return [7] and access the correct
		// element of any array.

		/*
		 * / 4. How do you access the first element of any array?
		 */

		System.out.println(ages[0]);
		System.out.println(names[0]);
		// Arrays are zero-indexed, so the first element of any array is indexed to
		// Array[0] and accessed accordingly.

		/*
		 * 5. Create a new array of int called nameLengths. Write a loop to iterate over
		 * the previously created names array and add the length of each name to the
		 * nameLengths array.
		 */

		int[] nameLengths = new int[names.length];

		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
		}

		System.out.println(Arrays.toString(nameLengths));

		// int[] nameLengths established the number of elements by pulling the number of
		// elements in String[] names array via .length extension. Then, we had
		// a for loop to iterate through the String[] names array and fill the int[]
		// nameLengths array with the corresponding number of letters in each of the
		// elements in String[] names. Finally, the 'Sysout' can print the lengths of
		// each name in the nameLengths array.

		/*
		 * / 6. Write a loop to iterate over the nameLengths array and calculate the sum
		 * of all the elements in the array. Print the result to the console.
		 */

		int sum6 = 0;
		for (int i = 0; i < nameLengths.length; i++) {
			sum6 += nameLengths[i];
		}
		System.out.println(sum6);

		/*
		 * / 7. Write a method that takes a String, word, and an int, n, as arguments
		 * and returns the word concatenated to itself n number of times (i.e., if I
		 * pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
		 */

		String tripleHello = multiplyString("Hello", 3);
		System.out.println(tripleHello);
		// This required the creation of our own method, instead of a built-in method.
		// Below the end of Main, I started a public static String multiplyString
		// method to accomplish this task quickly above. Therein, I created String
		// method to take a String (named str) and an int (named num) to use in the
		// for loop to garner a result of the variable str being repeated the number of
		// times in the variable num. Note that the first line "String result7 = "";
		// was a blank variable, to receive this info. If I had done String result7 = "
		// "; instead, then my code would have started with that blank space.

		/*
		 * / 8. Write a method that takes two Strings, firstName and lastName, and
		 * returns a full name (the full name should be the first and the last name as a
		 * String separated by a space).
		 */

		String firstName = "Hana";
		String lastName = "Kimura";
		System.out.println(firstName + " " + lastName);
		System.out.println(lastName + " " + firstName);
		// Creating separate Strings for a person's first and last names can be printed
		// to the console. In the case of cultures that use surnames first, we can
		// easily swap the order on the 'sysout' without changing the variables.

		/*
		 * / 9. Write a method that takes an array of int and returns true if the sum of
		 * 		all the ints in the array is greater than 100.
		 */

		int[] reviewNine = {7, 34, 50};
		boolean result9 = greaterThan100(reviewNine);
		System.out.println(result9);
		boolean result9a = greaterThan100(ages);
		System.out.println(result9a);
		boolean result9b = greaterThan100(ages2);
		System.out.println(result9b);

		/*
		 * / 10. Write a method that takes an array of double and returns the average of
		 * 		 all the elements in the array.
		 */
		
		double[] reviewTen = {19.95, 19.97, 19.99, 20.12, 20.19, 20.24};
		double result10 = averageOfArray(reviewTen);
		System.out.println(result10);

		/*
		 * / 11. Write a method that takes two arrays of double and returns true if the
		 * 		 average of the elements in the first array is greater than the average of the
		 * 		 elements in the second array.
		 */
		
		double[] reviewElevenA = {19.95, 19.97, 19.99, 20.12, 20.19, 20.24};
		double[] reviewElevenB = {19.94, 19.98, 20.00, 20.02, 20.11, 20.12, 20.13, 20.15};
		boolean result11 = firstGreaterThanSecond(reviewElevenA, reviewElevenB);
		System.out.println(result11);

		/*
		 * / 12. Write a method called willBuyDrink that takes a boolean isHotOutside,
		 * and a double moneyInPocket, and returns true if it is hot outside and if
		 * moneyInPocket is greater than 10.50.
		 */
		
		boolean isHotOutside = true;
		double moneyInPocket = 10.50;
		boolean result12 = willBuyDrink(isHotOutside, moneyInPocket);
		System.out.println(result12);

		/*
		 * / 13. Create a method of your own that solves a problem. In comments, write
		 * what the method does and why you created it.
		 */
		
		boolean emergencyFundIsFull = true;
		int fundsSetAside = 10000;
		boolean result13 = openInvestmentAccount(emergencyFundIsFull, fundsSetAside);
		System.out.println(result13);
		// My interests will often center around investing being a self-described
		// "personal finance hobbyist" myself. This method is
		// designed to help direct young professionals when it is time to start
		// investing by assessing if they have enough money, and
		// they have a 'full funded' emergency fund

	} // end of Main

	public static String multiplyString(String str, int num) {
		String result7 = "";
		for (int i = 0; i < num; i++) {
			result7 += str;
		}
		return result7;
	}

	public static boolean greaterThan100(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum > 100;
	}

	public static double averageOfArray(double[] arr) {
		double sum = 0.00;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum / (double) arr.length;
	}

	public static boolean firstGreaterThanSecond(double[] first, double[] second) {
		double sumFirst = 0.00;
		for (int i = 0; i < first.length; i++) {
			sumFirst += first[i];
		}
		double sumSecond = 0.00;
		for (int i = 0; i < second.length; i++) {
			sumSecond += second[i];
		}
		return sumFirst > sumSecond;
	}

	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		return isHotOutside && moneyInPocket >= 10.50;
	}

	public static boolean openInvestmentAccount(boolean emergencyFundIsFull, int fundsSetAside) {
		return emergencyFundIsFull && fundsSetAside >= 1000;
	}

} // end of class
