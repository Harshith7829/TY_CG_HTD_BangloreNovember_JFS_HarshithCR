package com.capgemini.retailer_db.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.retailer_db.dto.User;
import com.capgemini.retailer_db.dto.UserResponse;
import com.capgemini.retailer_db.service.ServiceUser;
@RestController
public class UserController {

	@Autowired
	private ServiceUser service;
	
	@PostMapping(path="/auth-user", produces=MediaType.APPLICATION_JSON_VALUE,
			consumes=MediaType.APPLICATION_JSON_VALUE)
	public  UserResponse auth(@RequestBody User bean) {
		User userBean= service.auth(bean.getEmail(), bean.getPassword());
	
		UserResponse response= new UserResponse();
		if(userBean!=null) {
			response.setStatusCode(201);
			response.setMessesge("success");
			response.setDiscription("Found");
			response.setBean(userBean);
		}else {
			response.setStatusCode(401);
			response.setMessesge("failure");
			response.setDiscription("invalid credntials");
		}
		return response;
	}
	@PostMapping(path="/register-user",produces=MediaType.APPLICATION_JSON_VALUE,
			consumes= MediaType.APPLICATION_JSON_VALUE)
	public UserResponse  register(@RequestBody User bean) {
		UserResponse response= new UserResponse();
		if(service.register(bean)) {
			response.setStatusCode(201);
			response.setMessesge("success");
			response.setDiscription("Registerd");
		}else {
			response.setStatusCode(401);
			response.setMessesge("failure");
			response.setDiscription("Email already exists");	
		}
		return response;
	}
	@GetMapping(path="/getall-users",produces=MediaType.APPLICATION_JSON_VALUE)
	public UserResponse searchUser(@RequestParam(name="key")String key) {
		UserResponse response= new UserResponse();
		List<User> beans = service.getAllUsers();
		if(beans.isEmpty()) {
			response.setStatusCode(401);
			response.setMessesge("failure");
			response.setDiscription("User deatils Not Found");	
			
		}else {
			response.setStatusCode(201);
			response.setMessesge("success");
			response.setDiscription("User Details Found");
			response.setBeans(beans);
		}
		return response;
	}
	@PutMapping(path="/changeuser-pass",produces=MediaType.APPLICATION_JSON_VALUE,
			consumes=MediaType.APPLICATION_JSON_VALUE)
	public UserResponse changePassword(@RequestBody User bean) {
		UserResponse response= new UserResponse();
		if(service.changeUserPassword(bean.getUserid(),bean.getPassword())) {
			response.setStatusCode(201);
			response.setMessesge("success");
			response.setDiscription("Password Changed");
		}else {
			response.setStatusCode(401);
			response.setMessesge("failure");
			response.setDiscription("Failed to change Password");	
		}
		return response;
	}
	@DeleteMapping(path="/deleteuser/{id}",produces=MediaType.APPLICATION_JSON_VALUE)
	public UserResponse deleteUser(@PathVariable("id")int id) {
		UserResponse response= new UserResponse();
		service.deleteUser(id);
		response.setStatusCode(201);
		response.setMessesge("success");
		response.setDiscription("User Deleted");	
		return response;
	}
	@GetMapping(path="/get-user/{id}",produces=MediaType.APPLICATION_JSON_VALUE)
	public UserResponse getCustomerDetails(@PathVariable("id")int key) {
		UserResponse response= new UserResponse();
		List<User> beans = service.getUser(key);
		if(beans.isEmpty()) {
			response.setStatusCode(401);
			response.setMessesge("failure");
			response.setDiscription("No such User found");	
			
		}else {
			response.setStatusCode(201);
			response.setMessesge("success");
			response.setDiscription("Customer Details Found");
			response.setBeans(beans);
		}
		return response;
	}
}
