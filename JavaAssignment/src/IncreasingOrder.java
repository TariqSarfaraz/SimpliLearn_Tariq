import java.util.Scanner;

public class IncreasingOrder {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the number:");

		int num = scan.nextInt();

		new IncreasingOrder().isIncreasingOrder(num);
	}

	void isIncreasingOrder(int num) {

		int lastDigit = num % 10;
		boolean flag = true;
		num = num / 10;

		while (num > 0) {

			if (lastDigit <= num % 10) {
				
				flag = false;
				break;
			}
			
			lastDigit = num % 10;
			num = num / 10;
		}
		
		if (flag)
			System.out.println("The number is in increasing order.");
		else
			System.out.println("The number is not in increasing order.");
	}
}
