package in.ashokit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import in.ashokit.entity.User;
import in.ashokit.service.UserService;
import jakarta.validation.Valid;

@Controller
public class UserController {

	@Autowired
	public UserService userService;

	@GetMapping("/")
	public String loadForm(Model model) {
		User userObj = new User();
		model.addAttribute("user", userObj);
		return "index";
	}
	
	@GetMapping("/edit-user")
	public String editUser(@RequestParam("uid") Integer uid, 
								Model model) {
		User userById = userService.getUserById(uid);
		model.addAttribute("user", userById);
		return "index";
		
	}

	@PostMapping("/user")
	public String handleSubmit(@Valid User user, 
									  BindingResult result, 
									  Model model) {
		if(result.hasErrors()) {
			return "index";
		}
		boolean isSaved = userService.saveUser(user);
		if (isSaved) {
			model.addAttribute("smsg", "User saved");
		} else {
			model.addAttribute("emsg", "User Not Saved");
		}
		return "index";
	}

	@GetMapping("/users")
	public String getUsers(Model model) {
		List<User> allUsers = userService.getAllUsers();
		model.addAttribute("users", allUsers);
		return "users";
	}
	
	@GetMapping("/delete-user")
	public String deleteUser(@RequestParam("uid") Integer uid, 
								Model model) {
		
		boolean status = userService.deleteUserById(uid);
		if(status) {
			model.addAttribute("smsg", "User Deleted");
			List<User> allUsers = userService.getAllUsers();
			model.addAttribute("users", allUsers);
		}else {
			model.addAttribute("emsg", "User Failed To Delete");
		}
		
		return "users";
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
