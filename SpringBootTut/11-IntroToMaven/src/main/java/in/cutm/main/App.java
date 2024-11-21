package in.cutm.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.cutm.beans.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	String configLocation = "/in/cutm/configuration/applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(configLocation);
        
        Student std1 = (Student) context.getBean("std1");
        std1.display();
    }
}
