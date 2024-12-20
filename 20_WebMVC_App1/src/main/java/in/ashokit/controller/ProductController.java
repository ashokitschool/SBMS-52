package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {
	
	@GetMapping("/product")
	public String getProduct(Model model) {
		
		model.addAttribute("msg", "Apple Mobile price is 1 lakh");
		
		return "index";
	}

}
