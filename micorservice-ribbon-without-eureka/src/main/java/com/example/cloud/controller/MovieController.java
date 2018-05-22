package com.example.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.cloud.entity.User;

/**
 * <dl>
 * <dd>描述: ~节点业务逻辑实现</dd>
 * <dd>创建时间： 2018/1/25 13:53</dd>
 * <dd>创建人： GuoDong</dd>
 * <dt>版本历史: </dt>
 * <pre>
 * Date         Author      Version     Description
 * ------------------------------------------------------------------
 * 2018/1/25 13:53    GuoDong       1.0        1.0 Version
 * </pre>
 * </dl>
 */
@RestController
public class MovieController {

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private LoadBalancerClient loadBalancerClient;
    
    @GetMapping("/movie/{id}")
    public User findById(@PathVariable Long id){
    	//将URl 改成VIP 
    	
    	ServiceInstance choose = loadBalancerClient.choose("micorservice-provider-user");
    	System.out.println(choose.getServiceId() + ": " + choose.getHost() + ": " + choose.getPort());
    	
        return this.restTemplate.getForObject("http://micorservice-provider-user/simple/"+id,User.class);
    }
    
    @GetMapping("/test")
    public String  test(){
    	ServiceInstance choose = loadBalancerClient.choose("micorservice-provider-user");
    	System.out.println(choose.getServiceId() + ": " + choose.getHost() + ": " + choose.getPort());
    	
    	ServiceInstance choose2 = loadBalancerClient.choose("micorservice-provider-user2");
    	System.out.println(choose2.getServiceId() + ": " + choose2.getHost() + ": " + choose2.getPort());
        return choose.getPort() + " vs " + choose2.getPort();
        
    }
}
