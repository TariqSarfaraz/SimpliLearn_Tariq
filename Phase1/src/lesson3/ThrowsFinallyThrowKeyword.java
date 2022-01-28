package lesson3;

import java.util.Scanner;

public class ThrowsFinallyThrowKeyword {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter your age:");

		int age = scan.nextInt();
		
		ThrowsFinallyThrowKeyword obj = new ThrowsFinallyThrowKeyword();
		obj.toCheckAge(age);

	}

	void toCheckAge(int age) throws ArithmeticException{

		try {
			if (age < 18) {
				throw new ArithmeticException("You are under 18.");
			} else {
				System.out.println("Welcome!");
			}
		} catch (ArithmeticException e) {
			
			System.out.println(e.getMessage());
		} finally {

			System.out.println("finally block is always executed.");
		}
	}
}
