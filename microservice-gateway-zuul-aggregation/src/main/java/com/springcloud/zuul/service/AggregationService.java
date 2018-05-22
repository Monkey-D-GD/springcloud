package com.springcloud.zuul.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.springcloud.zuul.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import rx.Observable;
import rx.Observer;

/**
 * <dl>
 * <dd>描述: ~使用zuul实现服务的聚合，但是由于rxjava 一时研究不透彻，所以没有继续</dd>
 * <dd>创建时间：  18:12 2018/3/21</dd>
 * <dd>创建人： pactera</dd>
 * <dt>版本历史: </dt>
 * <pre>
 * Date         Author      Version     Description
 * ------------------------------------------------------------------
 * 2018/3/21      guodong       1.0        1.0 Version
 * </pre>
 * </dl>
 */
@Service
public class AggregationService {

    @Autowired
    private RestTemplate restTemplate;

   /* @HystrixCommand(fallbackMethod = "fallback")
    public Observable<User> getUserById(Long id){

        return Observable;
    }*/
}
