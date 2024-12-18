package in.sameerit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {
	
	@GetMapping("/logincheck")
	public String login() {
		return "login Page Loading";
	}
	
	@GetMapping("/contact")
	public String contact() {
		return "Call us :: +91 7007662526";
	}
	
	@GetMapping("/hi")
	public String sayHi() {
		return "Hii, How are you?";
	}
	
	@GetMapping("/hello")
	public String Hello() {
		return "Hello, Sameer khan";
	}

}
