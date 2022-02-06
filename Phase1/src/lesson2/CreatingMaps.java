package lesson2;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class CreatingMaps {

	public static void main(String[] args) {

		System.out.println("Working on HashMap:\n");

		HashMap<Integer, String> list1 = new HashMap<>();

		list1.put(1, "Tariq");
		list1.put(2, "Shariq");
		list1.put(null, null);

		for (Map.Entry val : list1.entrySet())
			System.out.println(val.getKey() + " " + val.getValue());

		System.out.println("\n---------------------------\n");
		System.out.println("Working on LinkedHashMap:\n");

		LinkedHashMap<Integer, String> list2 = new LinkedHashMap<>();

		list2.put(1, "Tariq");
		list2.put(3, "Bangalore");
		list2.put(2, "Shariq");

		for (Map.Entry val : list2.entrySet())
			System.out.println(val.getKey() + " " + val.getValue());

		System.out.println("\n---------------------------\n");
		System.out.println("Working on TreeMap:\n");

		TreeMap<Integer, String> list3 = new TreeMap<>();

		list3.put(1, "Tariq");
		list3.put(3, "Bangalore");
		list3.put(2, "Shariq");

		for (Map.Entry val : list3.entrySet())
			System.out.println(val.getKey() + " " + val.getValue());
		
		System.out.println("\n---------------------------\n");
		System.out.println("Working on HashTable:\n");
		
		Hashtable<Integer, String> list4 = new Hashtable<>();
		
		list4.put(1, "Tariq");
		list4.put(3, "Bangalore");
		list4.put(2, "Shariq");
		
		for (Map.Entry val : list4.entrySet())
			System.out.println(val.getKey() + " " + val.getValue());
	}
}
