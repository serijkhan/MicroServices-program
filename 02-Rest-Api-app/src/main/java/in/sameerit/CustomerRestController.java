package in.sameerit;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerRestController {
	
	@GetMapping("/")
	public Customer getCustomer() {
		Customer c = new Customer();
		c.setId(1);
		c.setName("sameer");
		c.setEmail("myfatherserij@gmail.com");
		c.setPhno(711762);
		
		return c;
	}

}
