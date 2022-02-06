package lesson2;

public class Strings {

	public static void main(String[] args) {

		System.out.println("There are two ways to create String.\n");

		// By String literal
		String s1 = "Tariq";
		String s2 = "Tariq"; // it doesn't create a new instance

		System.out.println("The value of s1: " + s1);

		// By new keyword
		String s4 = new String("Shariq"); // It creates two objects and one reference variable

		System.out.println("The value of s4: " + s4);

		// Conversion
		String s5 = "Shreyas";
		System.out.println("\nConverting string to string builder and string buffer:\n");
		
		// Converting from String to StringBuilder
		StringBuilder s6 = new StringBuilder(s5);

		System.out.println("The value of stringbuilder s6 : " + s6);

		// Converting from String to StringBuffer
		StringBuffer s7 = new StringBuffer(s5);
		
		System.out.println("The value of stringbuffer s7: " + s7);
	}
}