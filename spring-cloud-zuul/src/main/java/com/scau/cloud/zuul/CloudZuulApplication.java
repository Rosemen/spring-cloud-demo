package com.scau.cloud.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 
 * @author chen
 *
 */
@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class CloudZuulApplication {
	public static void main(String[] args) {
		SpringApplication.run(CloudZuulApplication.class, args);
	}
}
