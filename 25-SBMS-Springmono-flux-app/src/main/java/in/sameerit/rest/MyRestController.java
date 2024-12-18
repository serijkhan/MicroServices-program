package in.sameerit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class MyRestController {
	
	@GetMapping("/single")
	public Mono<String> singleResponse(){
		return Mono.just("Hello World");
	}
	
	@GetMapping("/multiple")
	public Flux<Integer> multiResponses(){
		return Flux.range(1, 10);
	}

}
