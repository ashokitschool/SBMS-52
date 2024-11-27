package in.ashokit.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import in.ashokit.entity.User;
import in.ashokit.repo.UserRepository;

@Service
public class UserService {

	private UserRepository userRepo;

	public UserService(UserRepository userRepo) {
		this.userRepo = userRepo;
		System.out.println("Repo Impl class :" + userRepo.getClass().getName());
	}
	
	public void getAllUsersSQL() {
		List<User> hql = userRepo.getAllUsersSQL();
		hql.forEach(System.out::println);
	}

	public void getAllUsersHQL() {
		List<User> hql = userRepo.getAllUsersHQL();
		hql.forEach(System.out::println);
	}

	public void getUsersByCountry(String country) {
		List<User> byCountry = userRepo.findByCountry(country);
		byCountry.forEach(System.out::println);
	}

	public void getUsersByCountryAndGender(String country, String gender) {
		List<User> byCountry = userRepo.findByCountryAndGender(country, gender);
		byCountry.forEach(System.out::println);
	}

	public void getUserById(Integer uid) {

		Optional<User> byId = userRepo.findById(uid);

		if (byId.isPresent()) {
			System.out.println(byId.get());
		} else {
			System.out.println("No Record found");
		}
	}

	public void getAllUsers() {
		Iterable<User> all = userRepo.findAll();

		all.forEach(u -> {
			System.out.println(u);
		});
	}

	public void deleteAllUsers() {
		userRepo.deleteAll();
	}

	public void saveUsers() {

		User u1 = new User();
		u1.setId(101);
		u1.setName("Ashok");
		u1.setGender("Male");
		u1.setCountry("USA");

		User u2 = new User();
		u2.setId(103);
		u2.setName("John");
		u2.setGender("Male");
		u2.setCountry("UK");

		User u3 = new User();
		u3.setId(104);
		u3.setName("Sita");
		u3.setGender("Fe-Male");
		u3.setCountry("Japan");

		List<User> usersList = Arrays.asList(u1, u2, u3);

		userRepo.saveAll(usersList);

	}

	public void saveUser() {

		User u = new User();
		u.setId(102);
		u.setName("Sita Ram");
		u.setGender("Male");
		u.setCountry("USA");

		userRepo.save(u); // UPSERT
	}

}
