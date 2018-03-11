package org.spring.basic.xmlanno.repository;

import java.util.ArrayList;
import java.util.List;

import org.spring.basic.xmlanno.model.Customer;
import org.springframework.stereotype.Repository;

@Repository("customerRepository")
public class CustomerRepositoryImpl implements CustomerRepository {
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
