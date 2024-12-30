package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.ashokit.model.User;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class UserController {

	@GetMapping("/")
	public String index(Model model) {
		User userObj = new User();
		model.addAttribute("user", userObj);
		return "index";
	}

	@GetMapping("/logout")
	public String logout(HttpServletRequest req, Model model) {
		User userObj = new User();
		model.addAttribute("user", userObj);

		HttpSession session = req.getSession(false);
		session.invalidate();

		return "index";
	}

	@GetMapping("/personal-details")
	public String getPersonalDetails(HttpServletRequest req, Model model) {

		HttpSession session = req.getSession(false);
		String email = (String) session.getAttribute("email");

		// get user personal data based on email

		return "persona-details-page";
	}

	@GetMapping("/edu-details")
	public String getEduDetails(HttpServletRequest req, Model model) {

		HttpSession session = req.getSession(false);
		String email = (String) session.getAttribute("email");

		// get user education data based on email

		return "edu-page";
	}

	@PostMapping("/login")
	public String login(HttpServletRequest req, User user, Model model) {
		String email = user.getEmail();
		String password = user.getPassword();

		if (email.equals("ashok@gmail.com") && password.equals("abc@123")) {

			// creating session object
			HttpSession session = req.getSession(true);
			session.setAttribute("email", email);

			return "dashboard";

		} else {
			// invalid login
			model.addAttribute("emsg", "Invalid Credentials");
		}
		return "index";
	}

}
