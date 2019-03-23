package com.scau.ribbon.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;

/**
 * Ribbon配置类
 * 
 * @author chen
 *
 */
@Configuration
public class MyRibbonConfiguration {
    @Bean
    public IRule iRule() {
    	return new RandomRule();
    }
}
