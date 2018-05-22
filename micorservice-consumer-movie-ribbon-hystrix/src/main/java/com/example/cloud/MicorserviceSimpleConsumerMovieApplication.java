package com.example.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
/**
 * <dl>
 * <dd>描述: ~节点业务逻辑实现</dd>
 * <dd>创建时间：  2018年3月20日 上午9:12:05</dd>
 * <dd>创建人： guodong</dd>
 * <dt>版本历史: </dt>
 * <pre>
 * Date         Author      Version     Description
 * ------------------------------------------------------------------
 * 2018年3月20日     guodong       1.0        1.0 Version
 * </pre>
 * </dl>
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix // 添加对hystrix 的支持
@EnableHystrixDashboard // 开启 hystrix 仪表盘
public class MicorserviceSimpleConsumerMovieApplication {

	@Bean
	@LoadBalanced  /*轮询*/
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}
	public static void main(String[] args) {
		SpringApplication.run(MicorserviceSimpleConsumerMovieApplication.class, args);
	}
}
