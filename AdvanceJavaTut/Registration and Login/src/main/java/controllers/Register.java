package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import connection.db.DbConnection;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/registrationForm")
public class Register extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		
		String name = req.getParameter("userName");
		String gender = req.getParameter("userGender");
		String city = req.getParameter("userCity");
		String email = req.getParameter("userEmail");
		String password = req.getParameter("userPassword");
		
		try {
			Class.forName("com.mysql.cj.jdcb.Driver");
			System.out.println("Hello");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/registerandlogin");
			
			String registrationData = "INSERT INTO registration VALUES(?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(registrationData);
			ps.setString(1, name);
			ps.setString(2, gender);
			ps.setString(3, city);
			ps.setString(4, email);
			ps.setString(5, password);
			
			int count = ps.executeUpdate();
			if (count > 0) {
				out.println("Successful.");
			} else {
				out.println("Unsuccessful.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
