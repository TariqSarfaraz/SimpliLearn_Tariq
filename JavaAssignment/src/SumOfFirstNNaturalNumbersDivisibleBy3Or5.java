import java.util.Scanner;

public class SumOfFirstNNaturalNumbersDivisibleBy3Or5 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the number:");

		int num = scan.nextInt();

		new SumOfFirstNNaturalNumbersDivisibleBy3Or5().sum(num);
	}

	void sum(int num) {
		
		int sum = 0;
		
		for (int i = 1; i <= num; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum = sum + i;
			}
		}
		System.out.println("The sum of natural numbers divisible by 3 or 5 upto " + num + " is: " + sum);
	}
}
