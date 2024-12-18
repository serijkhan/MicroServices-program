package in.sameerit;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ThirdDemo {
	public static void main(String[] args) {

		Personp p1 = new Personp("John", "USA");
		Personp p2 = new Personp("Steve", "JAPAN");
		Personp p3 = new Personp("Ashok", "INDIA");
		Personp p4 = new Personp("Ching", "CHINA");
		Personp p5 = new Personp("Kumar", "INDIA");

		List<Personp> persons = Arrays.asList(p1, p2, p3, p4, p5);
		
		List<Personp> indians = persons.stream()
									  .filter(p -> p.country.equals("INDIA"))
									  .collect(Collectors.toList());
		
		indians.forEach(i -> System.out.println(i));

	}

}
