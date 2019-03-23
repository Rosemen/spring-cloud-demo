package com.scau.eureka.provider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * eureka服务提供者
 * 
 * @author chen
 *
 */
@MapperScan(basePackages = "com.scau.eureka.provider.mapper")
@EnableEurekaClient
@SpringBootApplication
public class EurekaProviderApplication {
	public static void main(String[] args) {
		SpringApplication.run(EurekaProviderApplication.class, args);
	}
}
