package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import db.connection.DbConnection;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.User;

@SuppressWarnings("serial")
@WebServlet("/loginForm")
public class Login extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");
		
		String email = req.getParameter("userEmail");
		String password = req.getParameter("userPassword");
		
		try {
			Connection con = DbConnection.getConnection();
			
			String loginQuery = "SELECT * FROM registration WHERE email=? AND password=?";
			PreparedStatement ps = con.prepareStatement(loginQuery);
			ps.setString(1, email);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			
			if (rs.next() == true) {
				User user = new User();
				user.setName(rs.getString("name"));
				user.setGender(rs.getString("gender"));
				user.setCity(rs.getString("city"));
				user.setEmail(rs.getString("email"));
				
				HttpSession session = req.getSession();
				session.setAttribute("registeredUser", user);
				
				RequestDispatcher rd = req.getRequestDispatcher("/profile.jsp");
				rd.forward(req, resp);
			} else {
				out.println("<h3 style = 'color: red'> Invalid email ID or password. </h3>");
				RequestDispatcher rd = req.getRequestDispatcher("./login.jsp");
				rd.include(req, resp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
