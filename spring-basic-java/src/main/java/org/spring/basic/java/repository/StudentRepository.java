package org.spring.basic.java.repository;

import java.util.List;

import org.spring.basic.java.model.Student;

public interface StudentRepository {

	List<Student> findAll();

}