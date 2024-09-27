package configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import beans.Address;
import beans.Student;

@Configuration
public class SpringJavaBasedConfiguration {
	@Bean("stdAddress")
	public Address createAddress() {
		Address add1 = new Address();
		
		add1.setState("Odisha");
		add1.setDistrict("Cuttack");
		add1.setVillage("Lalitagiri");
		
		return add1;
	}
	
	@Bean("std1")
	public Student creStudent() {
		Student std1 = new Student();
		
		std1.setName("Parsuram");
		std1.setRollNumber(284);
		
//		Here we don't need to set address manually.
//		std1.setAddress("createAddress()");
//		Use auto wiring annotation at the address.
		
		return std1;
	}
}
