package com.study.SpringJDBCExample;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.study.SpringJDBCExample.model.Student;
import com.study.SpringJDBCExample.service.StudentService;

@SpringBootApplication
public class SpringJdbcExampleApplication {

	public static void main(String[] args) {
		
		

		ConfigurableApplicationContext context  = SpringApplication.run(SpringJdbcExampleApplication.class, args);
		
		Student s= context.getBean(Student.class);
		s.setName("nikhil");
		s.setRollno(44);
		s.setMarks(100);
		

		StudentService service =context.getBean(StudentService.class);
		
		service.addStudent(s);
		
		List<Student> student = service.getStudents();
		System.out.println(student);
}
}
