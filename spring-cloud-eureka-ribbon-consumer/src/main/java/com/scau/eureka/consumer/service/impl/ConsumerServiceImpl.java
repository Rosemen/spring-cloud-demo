package com.scau.eureka.consumer.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.scau.common.entity.User;
import com.scau.eureka.consumer.service.ConsumerService;

/**
 * 通过restTemplate调用服务
 * 
 * @author Administrator
 *
 */
@Service
public class ConsumerServiceImpl implements ConsumerService {

	@Autowired
	private RestTemplate restTemplate;

	@Override
	@HystrixCommand(fallbackMethod = "error")
	public User get(String name) {
		User user = restTemplate.getForObject("http://eureka-provider/user/selectUserByName/" + name, User.class);
		return user;
	}

	public User error(String name) {
		User user = new User();
		user.setName("CHEN");
		return user;
	}

}
