package com.springboot.application.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.application.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		List<User> userList = new ArrayList<>();
		userList.add(new User(1L, "Ivo", "test", "1234"));
		userList.add(new User(2L, "Mafalda", "test", "1234"));

		return ResponseEntity.ok().body(userList);
	}
}
