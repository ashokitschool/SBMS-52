package in.ashokit.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import in.ashokit.entity.User;

public interface UserRepository extends CrudRepository<User, Integer> {

	@Query("From User")
	public List<User> getAllUsersHQL();

	@Query(value = "select * from user_info", nativeQuery = true)
	public List<User> getAllUsersSQL();

	// select * from user_info where country=?
	public List<User> findByCountry(String country);

	// select * from user_info where country=? and gender=?
	public List<User> findByCountryAndGender(String country, String gender);

}