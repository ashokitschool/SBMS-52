package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.service.UserService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = SpringApplication.run(Application.class, args);

		UserService userService = ctxt.getBean(UserService.class);

		// userService.deleteAllUsers();

		// userService.saveUser();

		// userService.saveUsers();

		//userService.getAllUsers();
		
		//userService.getUserById(201);
		
		//userService.getUsersByCountry("USA");
		
		// userService.getUsersByCountryAndGender("UK", "Male");
		
		//userService.getAllUsersHQL();
		
		userService.getAllUsersSQL();
		
		
	}
}
