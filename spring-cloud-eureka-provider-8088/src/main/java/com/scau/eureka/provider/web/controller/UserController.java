package com.scau.eureka.provider.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.scau.common.entity.User;
import com.scau.eureka.provider.service.UserService;

/**
 * 
 * @author chen
 *
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {
	@Autowired
	private UserService userService;

	@RequestMapping(value = "/selectUserByName/{name}", method = RequestMethod.GET)
	public User selectUserByName(@PathVariable("name") String name) {
		User user = userService.selectUserByName(name);
		System.out.println("provider-8088");
		return user;
	}

}
