package com.scau.eureka.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.scau.common.entity.User;
import com.scau.eureka.consumer.service.ConsumerService;

/**
 * 
 * @author chen
 *
 */
@RestController
@RequestMapping(value = "/consumer")
public class ConsumerController {
	@Autowired
	private ConsumerService consumerService;

	@RequestMapping(value = "/get/{name}", method = RequestMethod.GET)
	public User get(@PathVariable("name") String name) {
		User user = consumerService.get(name);
		return user;
	}
}
