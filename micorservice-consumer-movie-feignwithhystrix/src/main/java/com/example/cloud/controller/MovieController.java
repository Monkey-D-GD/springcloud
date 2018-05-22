package com.example.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.cloud.UserFeignClient;
import com.example.cloud.entity.User;

/**
 * <dl>
 * <dd>描述: ~测试 hystrix 对 feign的支持</dd>
 * <dd>创建时间：  2018年3月19日 上午10:11:51</dd>
 * <dd>创建人： guodong</dd>
 * <dt>版本历史: </dt>
 * <pre>
 * Date         Author      Version     Description
 * ------------------------------------------------------------------
 * 2018年3月19日     guodong       1.0        1.0 Version
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
    
}
