package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import beans.Student;
import configuration.JavaBasedConfigurationFile;

public class Main {
	public static void main(String[] args) {
		
//	Use AnnotationConfigApplicationContext & Provide the java class name;
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaBasedConfigurationFile.class);
		
//		Here is in the getBean we have to provide bean class name in small letter which is defined under @Component annotation;
		Student std1 = (Student) context.getBean("student");
		std1.display();
	}
}
