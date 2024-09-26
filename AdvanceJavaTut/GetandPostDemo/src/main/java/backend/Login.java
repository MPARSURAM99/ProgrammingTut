package backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class Login extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String myEmail = (String) req.getParameter("email");
		String myPassword = (String) req.getParameter("password");
		
		PrintWriter out = res.getWriter();
		
		if (myEmail.equals("mparsuram99@gmail.com") && myPassword.equals("123@Parsu")) {
			out.println("Log in successful.");
		} else {
			out.println("Login failed");
		}
	}
}
