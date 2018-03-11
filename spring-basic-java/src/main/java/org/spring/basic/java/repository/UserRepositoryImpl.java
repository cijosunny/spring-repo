package org.spring.basic.java.repository;

import java.util.ArrayList;
import java.util.List;

import org.spring.basic.java.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryImpl implements UserRepository {
	/* (non-Javadoc)
	 * @see org.spring.basic.java.repository.UserService#findAll()
	 */
	@Override
	public List<User> findAll(){
		List<User> users = new ArrayList<>();
		User user = new User();
		user.setFirstname("Felix");
		user.setLastname("John");
		users.add(user);
		return users;
	}
}
