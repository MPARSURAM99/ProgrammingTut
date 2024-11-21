package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Student;

public class Main {
	public static void main(String[] args) {
		
		String configLocation = "configurationXmlResources/applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(configLocation);
		
//		Here is in the getBean we have to provide bean class name in small letter which is defined under @Component annotation;
		Student std1 = (Student) context.getBean("student");
		std1.display();
	}
}
