package com.learning.spring.jdbc.spring_DAO;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.learning.spring.jdbc.spring_DAO_Entity.Student;

public class StudentDaoImpl implements StudentDao {
	private JdbcTemplate jdbcTemplate;

	@Override
	public int insert(Student student) {
		String query = "INSERT INTO student(id,name,city) values(?,?,?)";
		int r = this.jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());
		return r;
	}

	@Override
	public int update(Student student) {
		String query = "UPDATE Student SET name=? , city=? WHERE id=?";
		int result = this.jdbcTemplate.update(query, student.getName(), student.getCity(), student.getId());

		return result;
	}

	@Override
	public int delete(int studentId) {
		String query="DELETE FROM student WHERE id=?";
		int result=this.jdbcTemplate.update(query,studentId);
		return result;
	}
	@Override
	public Student getSingleRow(int studentId) {
		String query="SELECT * FROM student WHERE Id=?";
		RowMapper<Student> rowMapper=new rowMapperimp();
		Student student =this.jdbcTemplate.queryForObject(query, rowMapper,studentId);
		return student;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public List<Student> getMultipleStudent() {
		String queryString="SELECT * FROM STUDENT";
		List <Student> students=this.jdbcTemplate.query(queryString, new rowMapperimp());
		return students;
	}

	
	
	
	
}
