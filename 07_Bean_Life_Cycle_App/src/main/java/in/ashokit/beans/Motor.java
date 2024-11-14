package in.ashokit.beans;

public class Motor {

	public Motor() {
		System.out.println("Motor:: Constructor");
	}

	// init() method
	public void start() {
		System.out.println("Motor started...");
	}

	public void doWork() {
		System.out.println("Motor is running....");
	}

	// destory() method
	public void stop() {
		System.out.println("Motor stopped...");
	}

}
