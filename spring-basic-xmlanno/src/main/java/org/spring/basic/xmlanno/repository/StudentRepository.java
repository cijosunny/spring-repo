package org.spring.basic.xmlanno.repository;

import java.util.List;

import org.spring.basic.xmlanno.model.Student;

public interface StudentRepository {

	List<Student> findAll();

}