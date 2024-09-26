package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import db.connection.DbConnection;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/registrationForm")
public class Registration extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");
		
		String name = req.getParameter("userName");
		String gender = req.getParameter("userGender");
		String city = req.getParameter("userCity");
		String email = req.getParameter("userEmail");
		String password = req.getParameter("userPassword");
		
		try {
			Connection con = DbConnection.getConnection();
			
			String registrationData = "INSERT INTO registration VALUES(?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(registrationData);
			ps.setString(1, name);
			ps.setString(2, gender);
			ps.setString(3, city);
			ps.setString(4, email);
			ps.setString(5, password);
			
			int cout = ps.executeUpdate();
			
			if (cout > 0) {				
				out.println("<h3 style = 'color: green'>Registration successful.</h3>");
				RequestDispatcher rd = req.getRequestDispatcher("./login.jsp");
				rd.include(req, resp);
			} else {
				out.println("<h3 style = 'color: red'>Registration fail.</h3>");
				RequestDispatcher rd = req.getRequestDispatcher("./registration.jsp");
				rd.include(req, resp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
