package in.sameerit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfigurer {
	
	@Bean
	public SecurityFilterChain securityFilter(HttpSecurity http) throws Exception{
		
		System.out.println("security method will called..");
		
		http.authorizeHttpRequests((req)-> req.antMatchers("/contact","/swagger-ui.html")
				.permitAll()
				.anyRequest()
				.authenticated())
		.formLogin();
		
		return http.build();
	}

}
