package org.spring.basic.xmlanno.repository;

import java.util.ArrayList;
import java.util.List;

import org.spring.basic.xmlanno.model.Student;
import org.springframework.stereotype.Repository;
@Repository("studentRepository")
public class StudentRepositoryImpl implements StudentRepository {
	/* (non-Javadoc)
	 * @see org.spring.basic.xmlanno.repository.StudentRepository#findAll()
	 */
	@Override
	public List<Student> findAll(){
		List<Student> students = new ArrayList<>();
		Student student = new Student();
		student.setFirstname("Jim");
		student.setLastname("Joy");
		students.add(student);
		return students;
	}
}
