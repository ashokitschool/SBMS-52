package in.ashokit.main;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

import in.ashokit.bindings.Customer;

public class App {

	public static void main(String[] args) throws Exception {
		App a = new App();
		// a.convertJavaToJson();
		a.convertJsonToJava();
	}

	public void convertJsonToJava() throws Exception {
		File f = new File("customer.json");
		// de-serialization
		ObjectMapper mapper = new ObjectMapper();
		Customer cobj = mapper.readValue(f, Customer.class);
		System.out.println(cobj);
	}

	public void convertJavaToJson() throws Exception {

		File f = new File("customer.json");
		Customer cobj = new Customer();
		cobj.setCid(101);
		cobj.setName("Ram");
		cobj.setPhno(797979l);

		// serialization
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(f, cobj);

		System.out.println("Operation completed...");

	}

}
