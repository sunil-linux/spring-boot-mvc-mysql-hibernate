package com.agilent.earray8.springboot.service;

import java.util.List;

import com.agilent.earray8.springboot.beans.User;

public interface UserService {

	public void saveUser(User user);

	public void deleteUser(User user);

	public List<User> getAllUsers();

	public User getUserByEmail(String email);

	public User getUserById(long id);

	public void updateUser(User user);
  
}
