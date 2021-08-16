package com.caoan.eureka.server.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Component
public class URLPathFilter extends ZuulFilter {
    /**
     * 设置过滤器的模式pre模式 在请求路由前调用 适用于身份认证场景
     * @return
     */
    @Override
    public String filterType() {
        return FilterConstants.PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        return FilterConstants.PRE_DECORATION_FILTER_ORDER + 1 ;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        //获取RequestContent
        RequestContext requestContext = RequestContext.getCurrentContext();
        //获取HttpServletRequest
        HttpServletRequest request = requestContext.getRequest();
        String requestURI = request.getRequestURI();
        System.out.println(requestURI);
        //假如url包含了test路径则返回错误
        if (requestURI.contains("/test")){
            requestContext.set("isSuccess", false);
            requestContext.setSendZuulResponse(false);
            requestContext.setResponseBody("非法请求");
            requestContext.getResponse().setContentType("application/json; charset=utf-8");
        }
        return null;
    }


}
