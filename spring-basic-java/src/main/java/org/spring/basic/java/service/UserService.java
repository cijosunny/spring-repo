package org.spring.basic.java.service;

import java.util.List;

import org.spring.basic.java.model.Employee;
import org.spring.basic.java.model.User;

public interface UserService {

	List<User> findAllUsers();

}