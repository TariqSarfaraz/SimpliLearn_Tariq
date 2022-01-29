import java.util.Scanner;

public class FindPrimeNumbersUptoGivenNumber {

	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a number:  ");

		int num = scan.nextInt();

		System.out.println("\nPrimenumbers are : ");

		new FindPrimeNumbersUptoGivenNumber().prime(num);
	}

	void prime(int num) {

		for (int i = 2; i <= num; i++) {
			int flag = 0;
			for (int j = 2; j <= i / 2; j++)
				if (i % j == 0) {
					flag = 1;
					break;
				}
			if (flag == 0)
				System.out.print(i + "   ");
		}
	}
}
