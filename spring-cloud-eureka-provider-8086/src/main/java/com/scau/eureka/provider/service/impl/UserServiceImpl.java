package com.scau.eureka.provider.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.scau.common.entity.User;
import com.scau.eureka.provider.mapper.UserMapper;
import com.scau.eureka.provider.service.UserService;

/**
 * 
 * @author chen
 *
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;

	@Override
	public User selectUserByName(String name) {
		User user = userMapper.selectUserByName(name);
		return user;
	}

}
