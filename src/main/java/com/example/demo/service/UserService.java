package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.User;

public interface UserService {

	public List<User> getUserLists();

	public User findUserById(Long id);

	public void save(User user);

	public void edit(User user);

	public void delete(Long id);
}
