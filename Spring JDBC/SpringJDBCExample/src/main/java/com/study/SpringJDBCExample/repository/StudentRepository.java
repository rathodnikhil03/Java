package com.study.SpringJDBCExample.repository;

//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.core.RowMapper;
//import org.springframework.jdbc.core.RowMapperResultSetExtractor;
//import org.springframework.jdbc.support.SQLExceptionSubclassTranslator;
import org.springframework.stereotype.Repository;

import com.study.SpringJDBCExample.model.Student;

@Repository
public class StudentRepository {

	
	private JdbcTemplate jdbc;
	
	
	public JdbcTemplate getJdbc() {
		return jdbc;
	}
    
	@Autowired
	public void setJdbc(JdbcTemplate jdbc) {
		this.jdbc = jdbc;
	}

	public void save(Student s) {
      
		String sql = "insert into student (rollno, name, marks) values(?,?,?)";
		
		int rows = jdbc.update(sql,s.getRollno(),s.getName(),s.getMarks());
		System.out.println(rows +" "+ "effected");
		
	}

	public List<Student> findAll() {
		
	String sql = "select * from student";
	

	
	
	return jdbc.query(sql,	(rs,rowNum) -> {
		
		
		
		Student s = new Student();
		s.setRollno(rs.getInt("rollno"));
		s.setName(rs.getString("name"));
		s.setMarks(rs.getInt("marks"));
		return s;
	});
	}

	
}