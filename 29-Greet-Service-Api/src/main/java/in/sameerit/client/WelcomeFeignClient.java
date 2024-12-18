package in.sameerit.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="28-WELCOME-SERVICE")
public interface WelcomeFeignClient {
    
	@GetMapping("/welcome")
	public String getWelcomeMsg();

}
