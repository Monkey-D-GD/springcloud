package com.example.cloud;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.cloud.controller.HystrixClientFallback;
import com.example.cloud.entity.User;
/**
 * 
 * <dl>
 * <dd>描述: ~feign 的 hystrix支持</dd>
 * <dd>创建时间：  2018年3月19日 上午10:08:31</dd>
 * <dd>创建人： guodong</dd>
 * <dt>版本历史: </dt>
 * 
 * <pre>
 * Date         Author      Version     Description
 * ------------------------------------------------------------------
 * 2018年3月19日     guodong       1.0        1.0 Version
 * </pre>
 * </dl>
 */
@FeignClient(name = "micorservice-provider-user",fallback = HystrixClientFallback.class)
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
	
}
