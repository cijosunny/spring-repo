package org.spring.basic.java.model;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee implements InitializingBean, DisposableBean{
	
	private String firstname;
	private String lastname;

	@Override
	public void afterPropertiesSet() throws Exception {
		setFirstname("FFF");
		setLastname("LLL");
	}

	@Override
	public void destroy() throws Exception {
		setFirstname("Xyz");
		setLastname("Abc");
	}

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	@Override
	public String toString() {
		return "Employee [firstname=" + firstname + ", lastname=" + lastname + "]";
	}

}
