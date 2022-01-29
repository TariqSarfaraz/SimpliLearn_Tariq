import java.util.Scanner;

public class MethodToCheckNumberIsPowerOfTwoOrNot {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the number: ");

		int n = scan.nextInt();

		new MethodToCheckNumberIsPowerOfTwoOrNot().power(n);

	}

	void power(int n) {

		while (n % 2 == 0) {
			n = n / 2;
		}
		if (n == 1)
			System.out.println("Power of 2");
		else
			System.out.println("Not a power of 2");

	}
}
