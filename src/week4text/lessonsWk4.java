package week4text;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lessonsWk4 {

	public static void main(String[] args) {

		//Java 4.1 String Builder - text
		String name = "Shayna Baszler";
		System.out.println(name);
		name = "Nia Jax";
		System.out.println(name);
	
	String firstName = "Patrick";
	String lastName = "Roy";
	String middleInitial = "J.";
	String space = " ";

	System.out.println(firstName);
	System.out.println(lastName);

	StringBuilder sb = new StringBuilder();

	// use append() to dynamically create a String using StringBuilder 
	sb.append(firstName);
	sb.append(space);
	sb.append(lastName);
	System.out.println(sb.toString());

	// Add a middle Initial
	// the command .insert(firstName.length()+1 puts the following info one space after the first name
	sb.insert(firstName.length()+1, middleInitial + space);
	System.out.println(sb.toString());


	//Java 4.1 String Builder - video
		String firstName2 = "Patrick";
		String lastName2 = "Roy";
		System.out.println(firstName2 + space + lastName2);

		String tripleHi = multiplyString("Hi", 3);
		System.out.println(tripleHi);
		
		
	//Java 4.2 Lists - text
		//Arrays are immutable and you must know the number of objects within an array and keep them (plus, Arrays must be constructed)
		//String[] theKliq = new String[5];
		//theKliq[0] = "Razor";
		//theKliq[1] = "Shawn";
		//theKliq[2] = "Diesel";
		//theKliq[3] = "Kid";
		//theKliq[4] = "Hunter";
		
		//**OR**
		
		String[] theKliq2 = {"Razor", "Shawn", "Diesel", "Kid", "Hunter"};
			System.out.println(Arrays.toString(theKliq2));

		//Lists in Java are an interface, so they are mutable and dynamic (plus, Lists must be constructed)
		//List<E> reads as "List of E(s)" where E is the generic of the type to be used
		List<String> damageCTRL = new ArrayList<String>();
		damageCTRL.add("Bayley");
		damageCTRL.add("Dakota");
		damageCTRL.add("Iyo");
		damageCTRL.add("Kairi");
		damageCTRL.add("Asuka");
		
		for(int i = 0; i < damageCTRL.size(); i++) {
			System.out.println(damageCTRL.get(i));
		}
		
		for(String girl : damageCTRL) {
			System.out.println(girl);
		}

		//List<int> numbers = new ArrayList<int>() - we cannot use Primitives for Lists/ArrayLists (but use "Integer" instead, and it is OK) 
		
	}

	private static String multiplyString(String str, int num) {
		String result = "";
		for (int i = 0; i < num; i++) {
			result += str;
		}
		return result;
	}
}
