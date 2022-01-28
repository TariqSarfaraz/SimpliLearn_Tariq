package lesson3;

import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Division of Two numbers: ");

		System.out.println("Enter first number:");
		int firstNumber = scan.nextInt();

		System.out.println("Enter second number:");
		int secondNumber = scan.nextInt();

		TryCatch obj = new TryCatch();

		obj.division(firstNumber, secondNumber);
	}

	void division(int firstNumber, int secondNumber) {

		try {
			int result = firstNumber / secondNumber;
			System.out.println("The division of two numbers is:" + result);
		} catch (Exception e) {
			System.out.println("You have entered 0 as denominator.\n " + e);
		}

	}
}
