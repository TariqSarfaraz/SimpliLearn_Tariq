
public class TimerUsingSleep extends Thread {

	public static void main(String[] args) {

		TimerUsingSleep obj = new TimerUsingSleep();

		obj.run();

	}

	@Override
	public void run() {

		try {
			
			System.out.println("Timer:");
			for (int i = 0; i >= 0; i++) {

				System.out.print(i + "\r");
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}
}
