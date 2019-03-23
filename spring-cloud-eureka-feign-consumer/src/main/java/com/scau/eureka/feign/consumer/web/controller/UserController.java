package com.scau.eureka.feign.consumer.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.scau.common.entity.User;
import com.scau.eureka.feign.consumer.service.UserService;

/**
 * 
 * @author chen
 *
 */
@RestController
public class UserController {
	@Autowired
	private UserService userService;

	@RequestMapping(value = "/get/{name}")
	public User get(@PathVariable("name") String name) {
		User user = userService.selectUserByName(name);
		return user;
	}

}
