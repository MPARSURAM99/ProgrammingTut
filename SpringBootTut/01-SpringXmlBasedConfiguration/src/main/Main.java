package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Student;

public class Main {
	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.println("========================");
		
//		Declaring configuration file location;
		String configLocation = "configuration/applicationContext.xml";
		
//		Add Spring jar files to use application context;
//		1. Spring core;
//		2. Spring beans;
//		3. Spring context;
//		4. Spring expression;
//		5. Spring AOP;
//		6. Common login;
		ApplicationContext context = new ClassPathXmlApplicationContext(configLocation);
		
		Student std1 = (Student) context.getBean("std1");
		Student std2 = (Student) context.getBean("std2");
		std1.display();
		std2.display();
	}
}
