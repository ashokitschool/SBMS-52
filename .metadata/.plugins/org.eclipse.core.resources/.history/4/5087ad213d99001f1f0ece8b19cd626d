package in.ashokit.beans;

public class UserService {

	private PwdService pwdService;

	public UserService() {
		System.out.println("UserService :: 0-param Constructor");
	}

	// CI
	public UserService(PwdService pwdService) {
		System.out.println("UserService :: param - Constructor");
		this.pwdService = pwdService;
	}

	public void setPwdService(PwdService pwdService) {
		System.out.println("setPwdService() -- called..");
		this.pwdService = pwdService;
	}

	public void saveUser(String uname, String pwd, Long phno) {

		String encodePwd = pwdService.encodePwd(pwd);

		System.out.println("Encoded pwd :: " + encodePwd);

		// TODO:: insert into db
		System.out.println("Record inserted in DB...");
	}

}
