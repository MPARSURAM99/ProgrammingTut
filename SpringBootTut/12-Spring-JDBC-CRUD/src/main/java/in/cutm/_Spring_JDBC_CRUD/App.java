package in.cutm._Spring_JDBC_CRUD;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import in.cutm.beans.Student;
import in.cutm.resources.Config;
import in.cutm.rowmapper.StudentRowMapper;

public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
    	JdbcTemplate template = context.getBean(JdbcTemplate.class);
    	
    	
//    	============== INSERT ======================
//        int rollNo = 284;
//        String name = "Parsu";
//        String markString = "250";
//    	
//    	String insertQuery = "INSERT INTO student VALUES(?, ?, ?)";
//    	int i = template.update(insertQuery, rollNo, name, markString);
//    	if(i > 0) {
//    		System.out.println("Data inserted successfully");    		
//    	} else {
//			System.out.println("Insertion fail");
//		}
    	
    	
    	
//    	============ UPDATE =========================
//    	String name = "Parsu";
//    	String Mark = "250";
//    	
//    	String updateQuery = "UPDATE student SET std_mark = ? WHERE std_name = ?";
//    	int i = template.update(updateQuery, Mark, name);
//    	
//    	if (i > 0) {
//			System.out.println("Update successfully");
//		} else {
//			System.out.println("Update fail");
//		}
    	
    
//    =================== DELETE ======================
//    String name = "Rojalin";
//    
//    String deleteQuery = "DELETE FROM student WHERE std_name = ?";
//    int i = template.update(deleteQuery, name);
//    
//    if (i > 0) {
//		System.out.println("Deleted successfully");
//	} else {
//		System.out.println("Deletion Fail");
//	}
    	
    	
//    	================ SELECT =================
    	String selectQuery = "SELECT * FROM student";
    	List<Student> studentList = template.query(selectQuery, new StudentRowMapper());
    	for(Student std : studentList) {
    		System.out.println("Roll Number " + std.getRollNo());
    		System.out.println("Name is " + std.getNameString());
    		System.out.println("Mark is " + std.getMarkString());
    		System.out.println(" ");
    		System.out.println("==========================");
    		System.out.println(" ");
    	}
    	
    }
}
