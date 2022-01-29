import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the number: ");

		int num = scan.nextInt();
		boolean flag = true;
		
		if (num <= 1) {
			System.out.println("Not Prime.");
		} else {
			for (int i = 2; i < num ; i++) {

				if (num % i == 0) {

					flag = false;
					break;
				}
			}

			if (flag)
				System.out.println("Prime.");
			else
				System.out.println("Not Prime.");
		}
	}

}
