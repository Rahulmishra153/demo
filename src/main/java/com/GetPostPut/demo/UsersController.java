package com.GetPostPut.demo;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UsersController {
	
	@GetMapping
	public String getUsers() {
		return "Http Get request on send";
	}
	@PostMapping
	public String createUsers() {
		return "Http Post request on send";
	}
	@DeleteMapping
	public String deleteUsers() {
		return "Http Delete request on send";
	}
	@PutMapping
	public String putUsers() {
		return "Http Put request on send";
	}
}
