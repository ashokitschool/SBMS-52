package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entity.Employee;
import in.ashokit.repo.EmployeeRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		EmployeeRepository empRepo = context.getBean(EmployeeRepository.class);

		System.out.println("Impl class :: " + empRepo.getClass().getName());

		Employee e = new Employee();
		e.setEmpId(103);
		e.setEmpName("Rani Mukharjee");
		e.setEmpSalary(3000.00);

		empRepo.save(e);
	}
}
