package in.ashokit.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "WELCOME-MS")
public interface WelcomeFeignClient {

	@GetMapping("/welcome")
	public String invokeWelcomeMsg();

}
