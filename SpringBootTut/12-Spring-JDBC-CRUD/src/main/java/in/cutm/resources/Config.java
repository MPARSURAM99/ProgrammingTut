package in.cutm.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class Config {
	
	@Bean
	public DriverManagerDataSource myDataSource() {
      DriverManagerDataSource dataSource = new DriverManagerDataSource();
      dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
      dataSource.setUrl("jdbc:mysql://localhost:3306/spring-jdbc-db");
      dataSource.setUsername("root");
      dataSource.setPassword("123@Shriramsms");
      
      return dataSource;
	}
	
	@Bean
	public JdbcTemplate myTemplate() {
		JdbcTemplate template = new JdbcTemplate();
		
		template.setDataSource(myDataSource());
		
		return template;
	}
}
