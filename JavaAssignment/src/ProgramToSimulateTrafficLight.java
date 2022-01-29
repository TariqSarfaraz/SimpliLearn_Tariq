import java.util.Scanner;

public class ProgramToSimulateTrafficLight {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter Colour: ");

		String color = scan.nextLine();

		switch (color) {

		case "red":
		case "RED":
			System.out.println("STOP");
			break;

		case "yellow":
		case "YELLOW":
			System.out.println("READY");
			break;

		case "green":
		case "GREEN":
			System.out.println("GO");
			break;

		default:
			System.out.println("invalid color");
		}
	}
}
