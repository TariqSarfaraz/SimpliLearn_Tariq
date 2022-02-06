package lesson3;

public class ThreadSynchronization {

	public static void main(String[] args) {

		MyRunnable task = new MyRunnable();

		Thread firstThread = new Thread(task);
		Thread secondThread = new Thread(task);
		Thread thirdThread = new Thread(task);

		firstThread.setName("Tariq");
		secondThread.setName("Shariq");
		thirdThread.setName("Shreyas");

		firstThread.start();
		secondThread.start();
		thirdThread.start();

	}

}

class MyRunnable implements Runnable {

	public synchronized void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println(Thread.currentThread().getName() + " running, i = " + i);
		}
	}
}
