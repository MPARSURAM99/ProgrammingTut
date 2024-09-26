package sis.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


import sis.model.Student;

public class StudentDao {

	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/department", "root", "123@Shriramsms");

	}

	public boolean addstudent(Student stud) throws SQLException {
		Connection connection =null;
		connection.setAutoCommit(false);
		PreparedStatement statement =null;
		boolean flag = false;
		try {
			connection = StudentDao.getConnection();
			statement = connection.prepareStatement("INSERT INTO login values(?,?)");
		     statement.setString(1, stud.getUserName());
		     statement.setString(2, stud.getPassward());
		     int value = statement.executeUpdate();
		     if(value==1) {
			statement = connection.prepareStatement("INSERT INTO student values(?,?,?,?,?)");
		    	 statement.setString(1, stud.getStudentId());
			     statement.setString(2, stud.getName());
			     statement.setString(3, stud.getEmail()); 
			     statement.setInt(4, stud.getAge());
			     if(statement.executeUpdate()==1) {
			    	 connection.commit();
			    	 flag = true;
			     }
		     }
		     
		     
		     
		} catch (Exception e) {
			// TODO: handle exception
			
			 connection.rollback();
		}finally {
			connection.close();
		}
		return false;
		// TODO Auto-generated method stub
		
	}

}
