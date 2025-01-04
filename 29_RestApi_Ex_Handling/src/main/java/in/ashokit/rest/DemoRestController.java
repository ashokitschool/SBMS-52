package in.ashokit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {

	@GetMapping("/demo")
	public String getDemoMsg() {

		int i = 10 / 0; // AE

		String msg = "This is demo msg";
		return msg;
	}

}
