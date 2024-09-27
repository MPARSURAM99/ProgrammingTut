package configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import beans.Address;
import beans.Student;

@Configuration
public class SpringJavaBasedConfiguration {
	
	@Bean("std1Address")
	public Address createStuAddress() {
//		Here we have to pass the argument while creating any bean Object;
		Address add1 = new Address("Odisha", "Cuttack", "Lalitagiri");
		
		return add1;
	}
	
	@Bean("std1")
	public Student createStudent() {
		Student std1 = new Student("Parsuram", 284, createStuAddress());
		return std1;
	}
	
}
