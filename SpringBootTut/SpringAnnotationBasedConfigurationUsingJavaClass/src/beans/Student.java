package beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//	@Component annotation in spring is used to declare a class as a spring bean, 
//	which is a managed component in the spring application context;
//	It helps spring automatically detect and manage these beans during application startup, 
//	making them available for dependency injection and other spring feature;
@Component
public class Student {
	
//	@Value annotation in spring is used to inject values into Spring bean fields or methods;
//	@Value is mostly used to inject values from external sources (e.g, properties files or environment variables);
	@Value("Parsuram")
	private String name;
	
	@Value("284")
	private int rollNumber;
	
	@Value("mparsuram99@gmail.com")
	private String email;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void display() {
		System.out.println("Name is " + name);
		System.out.println("Roll number is " + rollNumber);
		System.out.println("Email id is " + email);
		System.out.println("=================================");
	}
	
}