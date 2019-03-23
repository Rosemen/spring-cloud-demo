package com.scau.eureka.feign.consumer.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.scau.common.entity.User;

/**
 * 调用远程服务接口
 * 
 * @author chen
 *
 */
@FeignClient(value = "eureka-provider")
public interface UserService {
	@RequestMapping(value = "/user/selectUserByName/{name}", method = RequestMethod.GET)
	User selectUserByName(@PathVariable("name") String name);
}
