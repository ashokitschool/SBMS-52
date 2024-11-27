package in.ashokit.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyCmdRunner implements CommandLineRunner {

	public MyCmdRunner() {
		System.out.println("MyCmdRunner::Constructor");
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("cmdRunner - run() called........");
		// read countries table data and store into cache memory
	}
}
