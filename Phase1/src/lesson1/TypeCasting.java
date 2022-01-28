package lesson1;

public class TypeCasting {

	public static void main(String[] args) {

		System.out.println("Implicit type casting: \n");

		char charReference = 'a';
		System.out.println("Type Casted charRef: " + charReference);

		int intReference = charReference;
		System.out.println("Type Casted intRef: " + intReference);

		float floatReference = charReference;
		System.out.println("Type Casted floatRef: " + floatReference);

		double doubleReference = charReference;
		System.out.println("Type Casted doubleRef: " + doubleReference);

		long longReference = charReference;
		System.out.println("Type Casted longRef: " + longReference);
		
		
		System.out.println("\n----------------------\n");
		
		System.out.println("Explicit type casting: \n");
		
		double doubleReference1 = 100.9;
		System.out.println("Type Casted doubleRef1: " + doubleReference1);
		
		long longReference1 = (long) doubleReference1;
		System.out.println("Type Casted longRef1: " + longReference1);
		
		float floatReference1 = (float) doubleReference1;
		System.out.println("Type Casted floatRef1: " + floatReference1);
		
		int intReference1 = (int) doubleReference1;
		System.out.println("Type Casted intRef1: " + intReference1);
		
		char charReference1 = (char) doubleReference1;
		System.out.println("Type Casted charRef1: " + charReference1);
		

	}
}
