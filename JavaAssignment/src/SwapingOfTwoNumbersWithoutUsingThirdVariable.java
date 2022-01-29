import java.util.Scanner;

public class SwapingOfTwoNumbersWithoutUsingThirdVariable {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the first number:");
		int first = scan.nextInt();

		System.out.println("Enter the second number:");
		int second = scan.nextInt();

		System.out.println("Before swapping: " + first + " " + second);
		
		first = first + second;
		second = first - second;
		first = first - second;
		
		System.out.println("After swapping: " + first + " " + second);
	}
}
