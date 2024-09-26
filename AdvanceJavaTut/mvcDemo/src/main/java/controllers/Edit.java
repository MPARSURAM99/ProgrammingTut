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
@WebServlet("/editDetails")
public class Edit extends HttpServlet{
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
			String editQuery = "UPDATE registration SET gender = ? , city = ?, email = ?, password = ? WHERE name = ?";
			PreparedStatement ps = con.prepareStatement(editQuery);
			ps.setString(1, gender);
			ps.setString(2, city);
			ps.setString(3, email);
			ps.setString(4, password);
			ps.setString(5, name);
			
			int count = ps.executeUpdate();
			if (count > 0) {
				out.println("<h3 style = 'color: green'> Edit Successful </h3>");
				RequestDispatcher rd = req.getRequestDispatcher("./login.jsp");
				rd.include(req, resp);
			} else {
				out.println("<h3 style = 'color: red'> Edit Failed </h3>");
				RequestDispatcher rd = req.getRequestDispatcher("./edit.jsp");
				rd.include(req, resp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
