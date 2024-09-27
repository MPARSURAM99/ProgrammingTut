package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.Student;

public class Main {
	public static void main(String[] args) {
		
		String configLocation = "/configuration/applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(configLocation);
		
		Student st1 = (Student) context.getBean("std1");
		st1.display();
	}
}
