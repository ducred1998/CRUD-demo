package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public List<User> getUserLists() {
		return userRepository.findAll();
	}

	@Override
	public User findUserById(Long id) {
		return userRepository.findById(id).get();
	}

	@Override
	public void save(User user) {
		userRepository.save(user);
	}

	@Override
	public void edit(User user) {
		userRepository.save(user);
	}

	@Override
	public void delete(Long id) {
		userRepository.deleteById(id);
	}

}
