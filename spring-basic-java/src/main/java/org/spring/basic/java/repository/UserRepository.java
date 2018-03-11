package org.spring.basic.java.repository;

import java.util.List;

import org.spring.basic.java.model.User;

public interface UserRepository {

	List<User> findAll();

}