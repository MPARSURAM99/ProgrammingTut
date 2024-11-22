package in.cutm.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import in.cutm.beans.Student;

public class StudentRowMapper implements RowMapper<Student>{
	
	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student st = new Student();
		
		st.setRollNo(rs.getInt("std_roll"));
		st.setNameString(rs.getString("std_name"));
		st.setMarkString(rs.getString("std_mark"));
		return st;
	}
}
