import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a String:");

		String str = scan.next();

		new StringPalindrome().checkPalindrom(str);
	}

	void checkPalindrom(String str) {

		int i = 0, j = str.length() - 1;
		boolean flag = true;

		for (i = 0; i < j / 2; i++) {

			if (str.charAt(i) != str.charAt(j)) {
				flag = false;
				break;
			}

			j--;
		}

		if (flag)
			System.out.println("the given string is palindrom.");
		else
			System.out.println("the given string is not palindrom.");
	}
}
