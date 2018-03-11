package org.spring.basic.xmlanno.repository;

import java.util.List;

import org.spring.basic.xmlanno.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}