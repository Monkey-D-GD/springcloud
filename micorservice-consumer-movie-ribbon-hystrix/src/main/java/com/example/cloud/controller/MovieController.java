package com.example.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.cloud.entity.User;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;




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
    
    @HystrixCommand(fallbackMethod = "findByIdFallBack")
    @GetMapping("/movie/{id}")
    public User findById(@PathVariable Long id){
    	//将URl 改成VIP 
        return this.restTemplate.getForObject("http://micorservice-provider-user/simple/"+id,User.class);
    }
    
    /**
     *  熔断回调
     * @param id
     * @return User 
     * guodong
     */
    public User findByIdFallBack(Long id){
    	User user = new User();
    	user.setId(1L);
    	user.setName("默认用户");
    	return user;
    }
    
}
