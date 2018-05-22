package com.example.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableHystrixDashboard //开启hystrix 的仪表盘
public class MicorserviceSimpleConsumerMovieApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicorserviceSimpleConsumerMovieApplication.class, args);
	}
}
