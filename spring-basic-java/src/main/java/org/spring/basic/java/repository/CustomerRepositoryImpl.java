package org.spring.basic.java.repository;

import java.util.ArrayList;
import java.util.List;

import org.spring.basic.java.model.Customer;

public class CustomerRepositoryImpl implements CustomerRepository {
	public CustomerRepositoryImpl() {
		System.out.println("Default Constructor #CustomerRepositoryImpl");
	}

	/* (non-Javadoc)
	 * @see org.spring.basic.xmlanno.repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll(){
		List<Customer> customers = new ArrayList<>();
		Customer customer = new Customer();
		customer.setFirstname("Sneha");
		customer.setLastname("Sunny");
		customers.add(customer);
		return customers;
	}
}
