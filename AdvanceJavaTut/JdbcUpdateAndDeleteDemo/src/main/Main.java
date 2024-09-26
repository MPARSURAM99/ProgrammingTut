package main;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Main {
	public static void main(String[] args) throws Exception {
		String city1 = "baripada";
		String email1 = "abinash@gmail.com";
		String email2 = "anshu@gmail.com";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root", "123@Shriramsms");
		
		PreparedStatement update = con.prepareStatement("update register set city=? where email=?");
		update.setString(1, city1);
		update.setString(2, email1);
		
		PreparedStatement del = con.prepareStatement("delete from register where email=?");
		del.setString(1, email2);
		
		int updateCount = update.executeUpdate();
		int deleteCount = del.executeUpdate();
		if (updateCount > 0 && deleteCount > 0) {
			System.out.println("Successfully updated.");
		} else {
			System.out.println("Updation failed.");
		}
		
		con.close();
	}

}
