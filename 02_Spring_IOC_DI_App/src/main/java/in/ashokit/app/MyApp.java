package in.ashokit.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ashokit.beans.UserService;

public class MyApp {

	public static void main(String[] args) {

		ApplicationContext ctxt = 
				new ClassPathXmlApplicationContext("Spring-Beans.xml");

		UserService userService = ctxt.getBean(UserService.class);
		
		userService.saveUser("raju", "raju@123", 79797979l);
		
	
	}

}
