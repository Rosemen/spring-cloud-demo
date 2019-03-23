package com.scau.eureka.provider.config;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.druid.pool.DruidDataSource;

/**
 * 配置数据源
 * 
 * @author chen
 *
 */
@Configuration
public class DataSourceConfig {

	@ConfigurationProperties(prefix = "spring.dataSource")
	@Bean
	public DataSource dataSource() {
		return new DruidDataSource();
	}

}
