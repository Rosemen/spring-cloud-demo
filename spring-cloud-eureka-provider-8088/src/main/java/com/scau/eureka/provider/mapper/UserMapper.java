package com.scau.eureka.provider.mapper;

import com.scau.common.entity.User;

public interface UserMapper {
	Integer insert(User record);

	Integer insertSelective(User record);

	User selectUserByName(String name);
}