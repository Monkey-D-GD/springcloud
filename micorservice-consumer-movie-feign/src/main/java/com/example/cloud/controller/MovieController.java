package com.example.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.cloud.UserFeignClient;
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
    private UserFeignClient userFeignClient;
    
    @GetMapping("/movie/{id}")
    public User findById(@PathVariable Long id){
        return this.userFeignClient.findById(id);
    }
    
    @GetMapping("testPost")
    public User testPost(User user){
    	return this.userFeignClient.postUser(user);
    }
    // 该请求不会成功
    @GetMapping("testGet")
    public User testGet(User user){
    	return this.userFeignClient.getUser(user);
    }
    
}
