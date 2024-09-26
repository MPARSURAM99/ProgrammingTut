package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class FetchDataDemo {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root", "123@Shriramsms");
		
		PreparedStatement ps = con.prepareStatement("select * from register");
		ResultSet rs = ps.executeQuery();
		
		while (rs.next()) {
			String name1 = rs.getString("name");
			System.out.println("Name is" + name1);
			
			String email1 = rs.getString("email");
			System.out.println("email id is" + email1);
			
			System.out.println("- - - - - - -");
			
		}
		con.close();
	}

}
