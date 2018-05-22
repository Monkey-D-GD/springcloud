package com.example.cloud.controller;

import org.springframework.stereotype.Component;

import com.example.cloud.UserFeignClient;
import com.example.cloud.entity.User;
/**
 * 
 * <dl>
 * <dd>描述: ~ fallback:  失败回调类</dd>
 * <dd>创建时间：  2018年3月19日 上午10:09:56</dd>
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
@Component
public class HystrixClientFallback implements UserFeignClient {

	@Override
	public User findById(Long id) {
		User user = new User();
		user.setId(0L);
		user.setName("熔断测试");
		return user;
	}

}
