package in.ashokit.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.feign.WelcomeFeignClient;

@RestController
public class GreetRestController {
	
	@Autowired
	private WelcomeFeignClient welcomeFeign;

	@GetMapping("/greet")
	public String getGreetMsg() {
		
		String greetMsg = "Good Morning";
		
		String welcomeMsg = welcomeFeign.invokeWelcomeMsg();

		return greetMsg + ", " + welcomeMsg;
	}

}



