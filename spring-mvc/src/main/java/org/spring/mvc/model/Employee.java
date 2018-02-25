package org.spring.mvc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Employee {
	@Id
	@GeneratedValue
	@Column
	private Integer id;
	@Column
	@Size(max = 20, min = 3, message = "{employee.name.invalid}")
	@NotEmpty(message="Please Enter your name")
	private String name;
	@Column
	@Size(min=1,max=3,message="{employee.age.invalid}")
	@NotEmpty(message="Please Enter your age")
	private String age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
}
