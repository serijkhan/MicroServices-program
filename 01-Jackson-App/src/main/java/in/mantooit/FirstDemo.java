package in.mantooit;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FirstDemo {
	
	public static void main(String[] args) {

		Employee e1 = new Employee(1, "Robert", 26500.00, "USA");
		Employee e2 = new Employee(2, "Abraham", 46500.00, "INDIA");
		Employee e3 = new Employee(3, "Ching", 36500.00, "CHINA");
		Employee e4 = new Employee(4, "David", 16500.00, "INDIA");
		Employee e5 = new Employee(5, "Cathy", 25500.00, "USA") ;

		List<Employee> list = Arrays.asList(e1, e2, e3, e4, e5);
		
		Map<String, List<Employee>> data = list.stream()
			.collect(Collectors.groupingBy(e -> e.country));
		
		System.out.println(data);
	}

}
class Employee {
	int id;
	String name;
	double salary;
	String country;

	public Employee(int id, String name, double salary, String country) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.country = country;
	}
}


