package com.example.demo.controller;

import com.example.demo.dao.UserDao;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DemoRestController {

	@Autowired
	private UserService userService;

	@GetMapping("/doGet")
	public String query() {
		System.out.println("------ NamedJdbcTemplate ------");
		userService.findByDao().stream().forEach(System.out::println);
		System.out.println("------ JpaRepository ------");
		userService.findByRepository().stream().forEach(System.out::println);
		System.out.println("------ create query ------");
		userService.findBySex("boy").stream().forEach(System.out::println);
		System.out.println("------ ------");
		userService.findBySexAndAge("boy", 10).stream().forEach(System.out::println);
		return "Query Data";
	}

	@PostMapping("/doPost")
	public String save() {
		return "Insert Data";
	}

	@PutMapping("/doPut")
	public String update() {
		return "Update Data";
	}

	@DeleteMapping("/doDelete")
	public String delete() {
		return "Delete Data";
	}

}
