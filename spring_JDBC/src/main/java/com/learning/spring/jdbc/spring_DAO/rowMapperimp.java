package com.learning.spring.jdbc.spring_DAO;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.learning.spring.jdbc.spring_DAO_Entity.Student;

public class rowMapperimp implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student student = new Student();
		student.setId(rs.getInt(1));
		student.setCity(rs.getString(3));
		student.setName(rs.getString(2));
		return student;
	}

}
