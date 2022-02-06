package lesson2;

public class InnerClass1 {
	
	private int number = 10;

	public static void main(String[] args) {
		
		InnerClass1 obj = new InnerClass1();
		InnerClass1.Inner obj1 = obj.new Inner();
		obj1.method();
		
	}
	
	class Inner {
		
		void method() {
			System.out.println("Accessing the private member of outer class: " + number);
		}
	}
}
