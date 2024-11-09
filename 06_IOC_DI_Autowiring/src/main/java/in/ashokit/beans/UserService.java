package in.ashokit.beans;

public class UserService {

	private IPwdService pwdService;

	private IUserDao userDao;

	private IEmailService emailService;
	
	public UserService(IPwdService pwdService, 
						IUserDao userDao, 
						IEmailService emailService) {
		
		this.pwdService = pwdService;
		this.userDao = userDao;
		this.emailService = emailService;
	}

	public void userRegistration() {

		pwdService.generatePwd();
		userDao.saveUser();
		emailService.sendEmail();

		System.out.println("**** user registration success **");

	}

}
