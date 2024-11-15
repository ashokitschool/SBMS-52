package in.ashokit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ashokit.beans.BookService;

public class App {

	public static void main(String[] args) throws Exception {

		ApplicationContext ctxt = new ClassPathXmlApplicationContext("Beans.xml");

		BookService service = ctxt.getBean(BookService.class);

		// service.storeBookData();

		service.getBooks();
	}

}
