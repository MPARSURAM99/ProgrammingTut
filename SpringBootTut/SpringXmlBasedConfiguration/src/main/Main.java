package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Student;

public class Main {
	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.println("========================");
		
		String configLocation = "configuration/applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(configLocation);
		
		Student std1 = (Student) context.getBean("std1");
		Student std2 = (Student) context.getBean("std2");
		std1.display();
		std2.display();
	}
}
