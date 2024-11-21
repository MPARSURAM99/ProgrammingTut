package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Student;

public class Main {
	public static void main(String[] args) {
		
		String configLocation = "/configuration/applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(configLocation);
		
		Student std1 = (Student) context.getBean("std1");
		std1.display();
	}
}
