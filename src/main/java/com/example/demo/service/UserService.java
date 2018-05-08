package com.example.demo.service;

import com.example.demo.entity.User;

import java.util.List;

public interface UserService {

	public List<User> findByDao();

	public List<User> findByRepository();

	public List<User> findBySex(String sex);

	public List<User> findBySexAndAge(String sex, Integer age);

}
