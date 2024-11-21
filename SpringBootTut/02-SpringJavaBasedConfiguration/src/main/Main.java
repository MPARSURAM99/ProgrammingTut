package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import beans.Student;
import configuration.SpringJavaBaseConfiguration;

public class Main {
	public static void main(String[] args) {
		
//		Use AnnotationConfigApplicationContext, as it is java based configuration;
//		Provide the java base configuration class path as a class;
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringJavaBaseConfiguration.class);
		
		Student std1 = (Student) context.getBean("std1");
		std1.display();
		
		Student std2 = (Student) context.getBean("std2");
		std2.display();
	}
}
