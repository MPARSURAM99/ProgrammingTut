package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import beans.Student;
import configuration.SpringJavaBasedConfiguration;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringJavaBasedConfiguration.class);
		
		Student std1 = (Student) context.getBean("std1");
		std1.display();
	}
}
