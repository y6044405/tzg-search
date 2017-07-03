package com.gede.beatles.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class GeneralInterceptor extends HandlerInterceptorAdapter {

    private static final Logger      LOGGER               = org.slf4j.LoggerFactory.getLogger(GeneralInterceptor.class);
    /** 执行开始时间 */
    private static ThreadLocal<Long> EXECUTION_START_TIME = new ThreadLocal<>();
    /** 执行结束时间 */
    private static ThreadLocal<Long> EXECUTION_END_TIME   = new ThreadLocal<>();

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        EXECUTION_START_TIME.set(System.currentTimeMillis());
        if (!(handler instanceof HandlerMethod)) {
            return true;
        }
        HandlerMethod hm = (HandlerMethod) handler;
        String uri = request.getRequestURI().replace(request.getContextPath(), "");
        LOGGER.info("EXEC:{}.{},{} URI:{}", hm.getBeanType().getName(), hm.getMethod().getName(), request.getMethod(), uri);
        return true;
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        EXECUTION_END_TIME.set(System.currentTimeMillis());
        String uri = request.getRequestURI().replace(request.getContextPath(), "");
        LOGGER.info("process in {} : {} mills", uri, EXECUTION_END_TIME.get() - EXECUTION_START_TIME.get());
    }

}
