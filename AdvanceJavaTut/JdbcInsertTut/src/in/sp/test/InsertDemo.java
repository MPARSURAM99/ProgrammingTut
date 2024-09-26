package in.sp.test;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.*;

public class InsertDemo {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name.");
		String name1 = sc.nextLine();
		
		System.out.println("Enter your email ID.");
		String email1 = sc.nextLine();
		
		System.out.println("Enter your password");
		String password1 = sc.nextLine();
		
		System.out.println("Enter your gender.");
		String gender1 = sc.nextLine();
		
		System.out.println("Enter your city name.");
		String city1 = sc.nextLine();
		
//		1. Creating or registering driver;
		Class.forName("com.mysql.cj.jdbc.Driver");

//		2. Creating connection;
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root", "123@Shriramsms");

//		3. Creating statement;
		PreparedStatement ps = con.prepareStatement("insert into register values(?,?,?,?,?)");
		ps.setString(1, name1);
		ps.setString(2, email1);
		ps.setString(3, password1);
		ps.setString(4, gender1);
		ps.setString(5, city1);
		
//		4. Executing statement;
		int ex = ps.executeUpdate();
		if (ex > 0) {
			System.out.println("Data insertion is successful.");
		} else {
			System.out.println("Fail to insert.");
		}
	}
}
