package in.sameerit;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class javaToJasonConverter {
	
	public static void main(String[] args) throws Exception{
		
		Address addr = new Address();
		addr.setCity("Hyd");
		addr.setState("Telegana");
		addr.setCountry("India");
		
		Customer c = new Customer();
		c.setId(1);
		c.setName("sameer");
		c.setEmail("myfatherserij@gmail.com");
		c.setPhno(711762);
		c.setAddr(addr);
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(new File("customer.json"), c);
		System.out.println("Json file created");
		
	}

}
