package in.sameerit;

import java.util.Optional;
import java.util.Scanner;

public class MsgService {
	
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter User ID");
		int userId = s.nextInt();

		User u = new User();
		/*String userName = u.getUsernameById(userId);
		String msg = userName.toUpperCase() + ", Hello"; 
		System.out.println(msg);*/
		
		Optional<String> username = u.getUsername(userId);
		
		if(username.isPresent()) {
			String name = username.get();
			System.out.println(name.toUpperCase()+", Hello");
		}else {
			System.out.println("No Data Found");
		}
	}

}
