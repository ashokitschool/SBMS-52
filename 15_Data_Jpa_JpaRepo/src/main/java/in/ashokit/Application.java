package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.service.PersonService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		// IOC will start
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		// get bean obj
		PersonService bean = context.getBean(PersonService.class);

		// bean.savePersons();

		// bean.getPersonsSort();

		// bean.getPersonsPagination();
		
		bean.getPersonsQBE("Male", "India");
		
		
		
	}

}






