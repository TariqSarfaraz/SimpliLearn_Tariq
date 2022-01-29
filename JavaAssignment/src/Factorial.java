import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		int i = 1, fact = 1;

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a number: ");

		int val = scan.nextInt();

//		while ( i < val) {
//
//			fact = fact * i;
//			i++;
//
//		}

		for ( i = 1; i <= val; i++) {
			
			fact = fact * i;
		}

		System.out.println("The factorial of " + val + " is: " + fact);
	}

}
