package lesson2;

public class CallingMethods {

	public static void main(String[] args) {

		CallingMethods callingMethods = new CallingMethods();

		callingMethods.display();
		callingMethods.add(10, 20);
		callingMethods.add(10, 20, 30);
	}

	// Method display
	void display() {
		System.out.println("Displaying the Method.");
	}

	// passing input to the parameters of method
	void add(int firstNumber, int secondNumber) {

		System.out.println("The Addition of two numbers is : " + (firstNumber + secondNumber));
	}

	// method overloading
	void add(int firstNumber, int secondNumber, int thirdNumber) {

		System.out.println("The Addition of three numbers is : " + (firstNumber + secondNumber +thirdNumber));
	}
}
