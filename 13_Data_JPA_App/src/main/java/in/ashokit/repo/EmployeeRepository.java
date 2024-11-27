package in.ashokit.repo;

import org.springframework.data.repository.CrudRepository;

import in.ashokit.entity.Employee;

public interface EmployeeRepository 
				extends CrudRepository<Employee, Integer> {

}
