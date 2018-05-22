package com.example.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
/**
 * 自定义ribbon
 * @author guodong
 *
 */
@Configuration
public class TestConfiguration {

	@Autowired
	IClientConfig config;
	/**
	 * 定义一个随机的rule
	 * @param config
	 * @return
	 */
	@Bean
	public IRule ribbonRule(IClientConfig config) {
		return new RandomRule();
	}
}
