package org.spring.basic.java.repository;

import java.util.ArrayList;
import java.util.List;

import org.spring.basic.java.model.Student;
import org.springframework.stereotype.Repository;

@Repository("studentRepository3")	//Either bean or @Repository
public class StudentRepositoryImpl implements StudentRepository {
	
	private String type;

	public StudentRepositoryImpl() {
	}

	public StudentRepositoryImpl(String type) {
		this.type = type;
	}
	
	/* (non-Javadoc)
	 * @see org.spring.basic.java.repository.StudentRepository#findAll()
	 */
	@Override
	public List<Student> findAll(){
		List<Student> students = new ArrayList<>();
		Student student = new Student();
		student.setFirstname("Samuel");
		student.setLastname("Tarly");
		students.add(student);
		return students;
	}

	@Override
	public String toString() {
		return "StudentRepositoryImpl [type=" + type + "]";
	}
}
