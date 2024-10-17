package in.cutm.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.cutm.models.Student;

@SuppressWarnings("serial")
@WebServlet("/register")
public class AddStudent extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int id = 1;
		String fullName = req.getParameter("studentName");
		String dob = req.getParameter("studentDob");
		String address = req.getParameter("studentAddress");
		String qualification = req.getParameter("studentQul");
		String email = req.getParameter("studentEmail");
		
		Student student = new Student(id, fullName, dob, address, qualification, email);
		System.out.println(student);
	}
}
