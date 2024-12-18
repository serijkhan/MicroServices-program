package in.sameerit.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {
	
	@PostMapping("/msg")
	public ResponseEntity<String> saveMsg() {
		//logic
		String responseBody = "Msg Saves Successfully...";
		
		return new ResponseEntity<String>(responseBody,HttpStatus.CREATED);
	}
	
	@GetMapping("/welcome")
	public ResponseEntity<String> getWelcomeMsg() {
		String msg = "Welcome to rest api...";
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}
	@GetMapping("/greet")
	public String getGreetMsg() {
		return "Good Evening";
	}

}
