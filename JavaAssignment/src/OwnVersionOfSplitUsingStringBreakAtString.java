import java.util.Scanner;
import java.util.StringTokenizer;

public class OwnVersionOfSplitUsingStringBreakAtString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the String: ");

		String inputString = sc.nextLine();

		System.out.println("Enter the String to breakat: ");

		String breakAt = sc.next();

		StringTokenizer st = new StringTokenizer(inputString, breakAt);

		System.out.println("Below is the splited String: ");

		while (st.hasMoreTokens()) {

			String word = st.nextToken();
			System.out.println(word);
		}
	}
}
