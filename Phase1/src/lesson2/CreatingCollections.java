package lesson2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class CreatingCollections {

	public static void main(String[] args) {

		System.out.println("Working on Arraylist: \n");

		ArrayList<String> arraylist = new ArrayList<String>();

		// Can add duplicate values
		arraylist.add("Tariq");
		arraylist.add("Tariq");
		arraylist.add("Bangalore");

		for (Object val : arraylist)
			System.out.println(val);

		System.out.println("\n----------------\n");

		System.out.println("Working on Linkedlist:\n");

		LinkedList<String> linkedList = new LinkedList<String>();

		linkedList.add("Shariq");
		linkedList.add("Shariq");
		linkedList.addFirst("Bangalore");

		for (Object val : linkedList)
			System.out.println(val);

		System.out.println("\n----------------\n");

		System.out.println("Working on Hashset:\n");

		HashSet<String> hashSet = new HashSet<String>();

		// Hashset contains unique elements and doesn't maintain insertion order
		hashSet.add("Shreyas");
		hashSet.add("Shreyas");
		hashSet.add("bangalore");

		for (Object val : hashSet)
			System.out.println(val);

		System.out.println("\n----------------\n");

		System.out.println("Working on LinkedHashSet:\n");

		LinkedHashSet<String> linkedHashset = new LinkedHashSet<String>();

		// LinkedHashset contains unique elements and maintains insertion order
		linkedHashset.add("tariq");
		linkedHashset.add("tariq");
		linkedHashset.add("Bangalore");

		for (Object val : linkedHashset)
			System.out.println(val);

		System.out.println("\n----------------\n");

		System.out.println("Working on TreeSet:\n");

		// Contains unique elements and maintains ascending order
		TreeSet<String> treeSet = new TreeSet<String>();
		
		treeSet.add("tariq");
		treeSet.add("Shariq");
		treeSet.add("Bangalore");
		
		for (Object val : treeSet)
			System.out.println(val);
	}
}
