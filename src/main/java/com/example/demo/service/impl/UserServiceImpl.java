package com.example.demo.service.impl;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Autowired
	private UserRepository userRepository;

	@Override
	public List<User> findByDao() {
		return userDao.findAll();
	}

	@Override
	public List<User> findByRepository() {
		return userRepository.findAll();
	}

	@Override
	public List<User> findBySex(String sex) {
		return userRepository.findByUserSexOrderByUserAge(sex);
	}

	@Override
	public List<User> findBySexAndAge(String sex, Integer age) {
		return userRepository.findByUserSexAndUserAge(sex, age);
	}

}
