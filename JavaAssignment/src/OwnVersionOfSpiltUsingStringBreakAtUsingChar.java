import java.util.Scanner;

public class OwnVersionOfSpiltUsingStringBreakAtUsingChar {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a string:");

		String str = scan.next();

		System.out.println("Enter a character where to break at:");

		char breakAt = scan.next().charAt(0);

		new OwnVersionOfSpiltUsingStringBreakAtUsingChar().mySplit(str, breakAt);
	}

	void mySplit(String str, char breakAt) {

		int startIndex = 0;
		String[] res = new String[10]; // using array length as 10
		int index = 0;

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == breakAt) {

				res[index] = str.substring(startIndex, i);
				index++;
				startIndex = i + 1;
			}
			if ((str.length() == (i + 1))) {
				res[index] = str.substring(startIndex, i + 1);
			}
		}

		for (String val : res) {
			System.out.println(val);
		}
	}
}
