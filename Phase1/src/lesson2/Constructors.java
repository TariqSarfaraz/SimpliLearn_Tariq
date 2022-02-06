package lesson2;

public class Constructors {

	public static void main(String[] args) {

		Student stu = new Student();
		
		stu.display();
		stu.display("Tariq", 10);
	}

}

class Student {

	String name;
	int id;

	// The default constructor assigns default values to the data members
	Student() {
	}
	
	void display() {
		System.out.println("Default values of Name and Id: " + name + " and " + id);
	}
	
	// Parameterized Constructors
	Student(String name, int id){
		this.name = name;
		this.id = id;
	}
	
	void display(String name, int id) {
		System.out.println("The values of Name and Id: " + name + " and " + id);
	}
}