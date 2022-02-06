package lesson1;

import java.util.Scanner;

public class ArithmeticCalculator {

	public static void main(String[] args) {

		double number1 = 0.0;
		double number2 = 0.0;
		double result;
		int input;

		System.out.println("Arithmetic Operations: \n");

		System.out.println("1. Addition.\n2. Subtraction. \n3. Multiplication. \n4. Division. \n");

		System.out.println("Enter your choice: ");

		Scanner scan = new Scanner(System.in);

		input = scan.nextInt();

		if (input >= 1 && input <= 4) {

			System.out.println("Enter First Number:");

			number1 = scan.nextDouble();

			System.out.println("Enter Second Number:");

			number2 = scan.nextDouble();
		}

		switch (input) {

		case 1:
			result = number1 + number2;
			System.out.println("The Addition is: " + result);
			break;

		case 2:
			result = number1 - number2;
			System.out.println("The Subtraction is: " + result);
			break;

		case 3:
			result = number1 * number2;
			System.out.println("The Multiplication is: " + result);
			break;

		case 4:
			result = number1 / number2;
			System.out.println("The Division is: " + result);
			break;

		default:
			System.out.println("You have entered the wrong choice.");

		}
	}
}
