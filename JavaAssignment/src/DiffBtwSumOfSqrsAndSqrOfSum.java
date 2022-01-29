import java.util.Scanner;
import java.lang.*;
public class DiffBtwSumOfSqrsAndSqrOfSum {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the number: ");

		int num = scan.nextInt();

		new DiffBtwSumOfSqrsAndSqrOfSum().diff(num);
	}

	void diff(int num) {
		int diff = 0, result1 = 0, result2 = 0;

		for (int i = 1; i <= num; i++) {
			result1 = result1 + (i * i);
			result2 = result2 + i;
		}

		diff = (result1) - (result2 * result2);
		// diff = Math.abs((result1) - (result2 * result2)); // For absolute difference.
		
		System.out.println(diff);
	}

}
