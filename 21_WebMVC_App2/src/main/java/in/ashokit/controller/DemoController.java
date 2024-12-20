package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {

	@GetMapping("/greet/{name}")
	@ResponseBody
	public String greetMsg(@PathVariable String name) {
		return name + ", This is greet msg";
	}

}


