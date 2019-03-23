package com.scau.eureka.provider.service;

import com.scau.common.entity.User;

/**
 * 
 * @author chen
 *
 */
public interface UserService {
	User selectUserByName(String name);
}
