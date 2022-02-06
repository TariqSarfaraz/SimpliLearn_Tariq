package lesson3;

public class ThreadCreation extends Thread {

	public static void main(String[] args) {
		
		ThreadCreation obj = new ThreadCreation();
		obj.start();
		
	}
	
	public void run() {
		
		System.out.println("Displaying the Thread");
	}
}
