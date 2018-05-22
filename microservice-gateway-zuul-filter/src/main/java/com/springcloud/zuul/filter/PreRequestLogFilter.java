package com.springcloud.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;


/**
 * <dl>
 * <dd>描述: ~节点业务逻辑实现</dd>
 * <dd>创建时间：  15:02 2018/3/21</dd>
 * <dd>创建人： pactera</dd>
 * <dt>版本历史: </dt>
 * <pre>
 * Date         Author      Version     Description
 * ------------------------------------------------------------------
 * 2018/3/21      guodong       1.0        1.0 Version
 * </pre>
 * </dl>
 */
public class PreRequestLogFilter extends  ZuulFilter{

    private static final Logger LOGGER = LoggerFactory.getLogger(PreRequestLogFilter.class);

    /**
    * @author: guodong
    * @Description: 拦截位置： pre 请求被路由之前拦截  routing 将请求路由至微服务 post 路由至微服务后执行  error 发生错误时执行
    * @Date: 15:09 2018/3/21
    * @Param: []
    * @return: java.lang.String
    **/
    @Override
    public String filterType() {
        return "pre";
    }

    /**
    * @author: guodong
    * @Description: 指定过滤器的执行顺序，不同的过滤器允许返回相同的值
    * @Date: 15:11 2018/3/21
    * @Param: []
    * @return: int
    **/
    @Override
    public int filterOrder() {
        return 1;
    }

    /**
    * @author: guodong
    * @Description: 表示该过滤器是否执行
    * @Date: 15:12 2018/3/21
    * @Param: []
    * @return: boolean
    **/
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
    * @author: guodong
    * @Description: 具体执行逻辑,在此执行了打印请求方法和地址
    * @Date: 15:13 2018/3/21
    * @Param: []
    * @return: java.lang.Object
    **/
    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        PreRequestLogFilter.LOGGER.info(String.format("send %s request to %s",
                request.getMethod(),request.getRequestURI().toString()));
        return null;
    }
}
