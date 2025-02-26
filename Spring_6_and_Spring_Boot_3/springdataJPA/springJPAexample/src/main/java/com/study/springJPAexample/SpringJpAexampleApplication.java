package com.study.springJPAexample;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.study.springJPAexample.model.Student;

@SpringBootApplication
public class SpringJpAexampleApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringJpAexampleApplication.class, args);
		
		StudentRepository repo = context.getBean(StudentRepository.class);
		
		Student s1 = context.getBean(Student.class);
		Student s2 = context.getBean(Student.class);
		Student s3 = context.getBean(Student.class);
		
//		s1.setRollno(44);
//		s1.setName("nikhil");
//		s1.setMarks(100);
//		
//		s2.setRollno(60);
//		s2.setName("ankit");
//		s2.setMarks(98);
//		
//		s3.setRollno(59);
//		s3.setName("sahil");
//		s3.setMarks(100);
//		
//		repo.save(s1);
//		repo.save(s2);
//		repo.save(s3);
//		
//		Optional<Student> s = repo.findById(10);
//		System.out.println(s.orElse(new Student()));
		
		System.out.println(repo.findByName("nikhil"));
		System.out.println(repo.findByMarksGreaterThan(98));
		
//		repo.save(s3);
//		repo.delete(s3);
}

		
}
