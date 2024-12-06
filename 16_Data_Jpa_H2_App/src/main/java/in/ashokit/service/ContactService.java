package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Contact;
import in.ashokit.repo.ContactRepo;

@Service
public class ContactService {

	@Autowired
	private ContactRepo contactRepo;

	public void saveContact() {

		Contact c = new Contact();
		c.setName("Raju");
		c.setEmail("raju@gmail.com");
		c.setPhno(168688l);

		System.out.println("Before saving : " + c);

		Contact savedEntity = contactRepo.save(c);

		System.out.println("After saving:" + savedEntity);
	}

}
