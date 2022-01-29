import java.util.Scanner;

public class OddOrEven {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		
		double num = scan.nextDouble();
		
		if ( num%2 == 0)
			System.out.println("The number is even.");
		else
			System.out.println("The number is odd.");
	}
}
