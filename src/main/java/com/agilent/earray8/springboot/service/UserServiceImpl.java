package com.agilent.earray8.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agilent.earray8.springboot.beans.User;
import com.agilent.earray8.springboot.dao.UserDao;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	public void saveUser(User user) {
		userDao.save(user);

	}

	@Override
	public void deleteUser(User user) {
		userDao.delete(user);

	}

	@Override
	public List<User> getAllUsers() {
		return userDao.getAll();
	}

	@Override
	public User getUserByEmail(String email) {
		return userDao.getByEmail(email);
	}

	@Override
	public User getUserById(long id) {
		return userDao.getById(id);
	}

	@Override
	public void updateUser(User user) {
		userDao.update(user);
	}

}
