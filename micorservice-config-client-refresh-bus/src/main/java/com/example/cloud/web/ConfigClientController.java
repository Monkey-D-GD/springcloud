package com.example.cloud.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <dl>
 * <dd>描述: ~启动多个实例，利用bus实现访问一次其余的自动刷新</dd>
 * <dd>创建时间：  16:10 2018/3/22</dd>
 * <dd>创建人： pactera</dd>
 * <dt>版本历史: </dt>
 * <pre>
 * Date         Author      Version     Description
 * ------------------------------------------------------------------
 * 2018/3/22      guodong       1.0        1.0 Version
 * </pre>
 * </dl>
 */
@RestController
@RefreshScope // 添加更新配置注解
public class ConfigClientController {

    // git配置文件里的key
    @Value("${profole}")
    private String profole;

    @GetMapping("/profile")
    public String hello() {
        return this.profole;
    }
}
