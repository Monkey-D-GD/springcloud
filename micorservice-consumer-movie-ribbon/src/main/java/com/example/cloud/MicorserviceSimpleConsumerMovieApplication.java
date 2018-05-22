package com.example.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.example.config.TestConfiguration;
/**
 * 
 * <dl>
 * <dd>描述: ~自定义类 对服务 micorservice-provider-user2 是随机的，不会影响别的服务，前提是配置不会被扫描到</dd>
 * <dd>创建时间：  2018年3月16日 下午5:06:29</dd>
 * <dd>创建人： guodong</dd>
 * <dt>版本历史: </dt>
 * 
 * <pre>
 * Date         Author      Version     Description
 * ------------------------------------------------------------------
 * 2018年3月16日     guodong       1.0        1.0 Version
 * </pre>
 * </dl>
 */
@SpringBootApplication
@EnableDiscoveryClient
@RibbonClient(name="micorservice-provider-user2", configuration = TestConfiguration.class)
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
