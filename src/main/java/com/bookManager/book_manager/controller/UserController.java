package com.bookManager.book_manager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bookManager.book_manager.model.User;
import com.bookManager.book_manager.repo.UserRepo;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class UserController {
	
	@Autowired
	private UserRepo repo;
	
	@GetMapping("/getUsers")
	public List<User> getUser() {
		return repo.findAll();
	}
	
	
	@PostMapping("/addUser")
	public User addUser(@RequestBody User user) {
		return repo.save(user);
	}
	
	@PutMapping("/updateUser/{id}")
	public User updateUser(@RequestBody User user) {
		return repo.save(user);
	}

	@DeleteMapping("deleteUser/{id}")
	public void deleteUser(@PathVariable int id) {
		repo.deleteById(id);
	}
	
}
