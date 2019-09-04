package com.java.springbootrestfulservices.user;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.java.springbootrestfulservices.exception.UserNotFoundException;

@RestController
public class UserController {

	@Autowired
	private UserDaoService daoSevice;

	@GetMapping("/users")
	public List<User> retriveAllUsers() {
		return daoSevice.findAll();
	}

	@GetMapping("/users/{userId}")
	public User retriveUser(@PathVariable int userId) {
		User user = daoSevice.findUser(userId);
		if (user == null) {
			throw new UserNotFoundException("id- " + userId);
		}
		return user;
	}

	@PostMapping("/users")
	public ResponseEntity<Object> saveUser(@Valid @RequestBody User user) {
		User savedUser = daoSevice.saveUser(user);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedUser.getId())
				.toUri();
		return ResponseEntity.created(location).build();
	}

	@DeleteMapping("/users/{userId}")
	public void deleteUser(@PathVariable int userId) {
		User user = daoSevice.deleteUser(userId);
		if (user == null) {
			throw new UserNotFoundException("id-" + userId);
		}
	}
}
