package in.ashokit.beans;

public class PwdServiceImpl implements IPwdService {

	@Override
	public String generatePwd() {
		// logic
		System.out.println("pwd generated for user...");

		return "abc@123";
	}

}
