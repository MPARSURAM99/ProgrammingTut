package in.cutm.spring_named_parameter;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import in.cutm.resources.Config;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        
        NamedParameterJdbcTemplate template = context.getBean(NamedParameterJdbcTemplate.class);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("key_rollno", 410);
        map.put("key_name", "Asutosh");
        map.put("key_marks", "500");
        
        String insertSqlQuery = "INSERT INTO student VALUES(:key_rollno, :key_name, :key_marks)";
        
        int i = template.update(insertSqlQuery, map);
        if(i > 0) {
        	System.out.println("Insertion Successful");
        } else {
			System.out.println("Insertion Fail");
		}
    }
}
