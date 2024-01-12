package week4text;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class collectionsWk4 {

	public static void main(String[] args) {

		//List - allows duplicates; keeps elements ordered by index; commonly used for: ArrayList, LinkedList, Vector, etc. (ArrayList is most common)
		List<String> str = new ArrayList<>();

		str.add("Nick");
		str.add("Joe");
		str.add("Michael");
		str.add("Tyler");
		str.add("Mike");

		System.out.println(str.get(3));
		
		
		
		
		//Set -  - no duplicates, unordered, allows null value once, common implementations: HashSet, LinkedHashSet, TreeSet (HashSet most common)

		Set<String> vegetables = new HashSet<String>();
		vegetables.add("Carrot");
		System.out.println(vegetables);
		vegetables.add("Onion");
		System.out.println(vegetables);
		vegetables.add("Broccoli");
		System.out.println(vegetables);
		vegetables.add("Asparagus");
		System.out.println(vegetables);
		
		vegetables.add("Carrot");
		System.out.println(vegetables);

		vegetables.add(null);
		System.out.println(vegetables);

		vegetables.add(null);
		System.out.println(vegetables);

		System.out.println("The size of our set is: " + vegetables.size());
		
		//Map
		
		HashSet<String> theKliq2 = new HashSet<String>();

		theKliq2.add("Razor");
		theKliq2.add("Shawn");
		theKliq2.add("Diesel");
		theKliq2.add("Syxx");
		theKliq2.add("Hunter");

		System.out.println(theKliq2);
		
		HashMap<String, String> theKliqMap = new HashMap<String, String>();
		
		theKliqMap.put("Hunter", "1");
		theKliqMap.put("Syxx", "2");
		theKliqMap.put("Diesel", "3");
		theKliqMap.put("Shawn", "4");
		theKliqMap.put("Razor", "5");
		
		System.out.println(theKliqMap);
		
		
	}

}
