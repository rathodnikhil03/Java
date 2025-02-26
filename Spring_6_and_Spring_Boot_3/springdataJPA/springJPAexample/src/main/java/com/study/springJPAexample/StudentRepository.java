package com.study.springJPAexample;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.study.springJPAexample.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

	//@Query("select s from Student s where s.name = ?1")
	List<Student> findByName(String name);
	List<Student> findByMarksGreaterThan(int marks);
}