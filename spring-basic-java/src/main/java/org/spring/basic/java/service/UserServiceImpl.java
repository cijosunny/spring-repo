package org.spring.basic.java.service;

import java.util.List;

import org.spring.basic.java.model.User;
import org.spring.basic.java.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service("userService")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;
	
	/* (non-Javadoc)
	 * @see org.spring.basic.java.service.EmployeeService#findAllEmployees()
	 */
	@Override
	public List<User> findAllUsers(){
		return userRepository.findAll();
	}
}
