package backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/submit")
public class MyServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
//		Getting input by request method;
		String myName = req.getParameter("firstName");
		String myEmail = req.getParameter("email");
		
//		Responding to the submit by respond method;
		PrintWriter out = res.getWriter();
		out.println("Your Name is " + myName);
		out.println("Your Name is " + myEmail);
		
	}
}
