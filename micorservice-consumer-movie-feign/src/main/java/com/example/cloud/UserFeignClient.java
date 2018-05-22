package com.example.cloud;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.cloud.entity.User;

@FeignClient(name = "micorservice-provider-user")
public interface UserFeignClient {
	/**
	 * 注意：1. 使用 Feign,@PathVariable需要声明参数
	 * 	   2. 注意版本,之前的版本不支持 @GetMapping,需要使用requestMapping,并申明请求类型
	 * @param id
	 * @return
	 */
	//@GetMapping("/simple/{id}")
	 @RequestMapping(method = RequestMethod.GET, value = "/simple/{id}")
	public User findById(@PathVariable("id") Long id); 
	
	@PostMapping("user")
	public User postUser(@RequestBody User user);
	// 该请求不会成功 ---如果接受的是对象，则不能使用get方法，需使用post方法,如果使用get 
		//方法需要@RequestParam Long id, @RequestParam String name 这样接收
	@GetMapping("getUser")
	public User getUser(User user);
	
}
