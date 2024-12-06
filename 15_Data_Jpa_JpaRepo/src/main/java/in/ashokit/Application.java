package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.service.ContactService;
import in.ashokit.service.PersonService;
import in.ashokit.service.TxService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		//PersonService bean = context.getBean(PersonService.class);
		// bean.savePersons();
		// bean.getPersonsSort();
		// bean.getPersonsPagination();
		//bean.getPersonsQBE("Male", "India");
		
		ContactService contactService =
				context.getBean(ContactService.class);
		
		//contactService.saveContact();
		
		
		TxService txService = context.getBean(TxService.class);
		
		txService.savePersonWithContact();
		
	}

}






