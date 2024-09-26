package backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.websocket.Session;

@WebServlet("/login")
public class Login  extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String myEmail = req.getParameter("email");
		String myPassword = req.getParameter("password");
		String myName = req.getParameter("name");

		PrintWriter out = resp.getWriter();
		
		if (myEmail.equals("mparsuram99@gmail.com") && myPassword.equals("123@Parsu")) {
//			Setting attribute to a variable "nameKey";
//			req.setAttribute("nameKey", myName);
			
//			Creating a session;
			HttpSession sess = req.getSession();
			sess.setAttribute("nameKey", myName);
//			If login is successful then dispatch the profile page;
			RequestDispatcher rd = req.getRequestDispatcher("./profile.jsp");
			rd.forward(req, resp);
		} else {
//			Convert text to html;
			resp.setContentType("text/html");
//			Print Error on web page;
			out.println("Invalid Login.");
//			Dispatching a jsp page including the Error;
			RequestDispatcher rd = req.getRequestDispatcher("./index.html");
			rd.include(req, resp);
		}
 	}

}
