package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.ashokit.entity.Contact;
import in.ashokit.entity.Person;
import in.ashokit.repo.ContactRepo;
import in.ashokit.repo.PersonRepo;

@Service
public class TxService {

	@Autowired
	private ContactRepo contactRepo;

	@Autowired
	private PersonRepo personRepo;

	@Transactional(rollbackFor = Exception.class)
	public void savePersonWithContact() {

		Person p = new Person();
		p.setName("Raj");
		p.setGender("Male");
		p.setCountry("India");
		p.setAge(20);
		personRepo.save(p); 
		
		int i = 10/0;

		Contact c = new Contact();
		c.setName("Raj");
		c.setEmail("raj@gmail.com");
		c.setPhno(79797979l);
		contactRepo.save(c);

	}

}
