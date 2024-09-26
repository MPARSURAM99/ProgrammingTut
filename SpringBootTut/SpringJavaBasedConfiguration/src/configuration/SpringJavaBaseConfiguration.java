package configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import beans.Student;

//	Use configuration to make the class spring configuration file;
@Configuration
public class SpringJavaBaseConfiguration {
	
//	Create bean configuration method with return type of that class name e.g Student;
//	By using bean annotation;
	@Bean("std1")
	public Student std1CreateObject() {
		
//		Creating a new student object;
		Student std1 = new Student();
		
//		Declaring the bean property;
		std1.setName("Parsuram");
		std1.setRollNumber(284);
		std1.setEmail("mparsuram99@gmail.com");
		
//		Returning the std object;
		return std1;
	}
	
//	Declaring another bean object;
	@Bean("std2")
	public Student std2CreateObject() {
		Student std2 = new Student();
		
		std2.setName("Rojalin Shaw");
		std2.setRollNumber(293);
		std2.setEmail("rojalin@gmail.com");
		
		return std2;
	}
}
