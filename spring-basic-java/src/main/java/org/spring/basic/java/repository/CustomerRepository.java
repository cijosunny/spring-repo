package org.spring.basic.java.repository;

import java.util.List;

import org.spring.basic.java.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}