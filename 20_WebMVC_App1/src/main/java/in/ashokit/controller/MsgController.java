package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/msg")
public class MsgController {
	
	@GetMapping("/demo")
	@ResponseBody
	public String getDemoMsg() {
		return "This is my demo msg";
	}
	
	@GetMapping("/greet")
	public String getGreetMsg(Model model) {
		
		String msgTxt  = "Good Morning";
		model.addAttribute("msg", msgTxt);
		
		return "index";
	}

	@GetMapping("/welcome")
	public ModelAndView getWelcomeMsg() {
		
		ModelAndView mav = new ModelAndView();

		// setting response data in K-V
		mav.addObject("msg", "Welcome to Ashok IT");

		// setting view page name
		mav.setViewName("index");

		return mav;
	}
}
