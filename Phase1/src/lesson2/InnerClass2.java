package lesson2;

abstract class AnonymousInner {

	abstract void display();
}

public class InnerClass2 {

	public static void main(String[] args) {

		AnonymousInner obj = new AnonymousInner() {

			@Override
			void display() {
				System.out.println("Displaying the message.");
			}

		};

		obj.display();
	}

}
