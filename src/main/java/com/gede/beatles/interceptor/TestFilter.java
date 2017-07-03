package com.gede.beatles.interceptor;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.springframework.context.annotation.Configuration;

@Configuration
public class TestFilter implements Filter {

    private String testFilterName;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println(filterConfig.getInitParameter("testFilterName"));
        System.out.println("TestFilter:init...");

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("TestFilter:doFilter...");
        System.out.println(testFilterName);
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        System.out.println("TestFilter:destroy...");

    }

    public String getTestFilterName() {
        return testFilterName;
    }

    public void setTestFilterName(String testFilterName) {
        this.testFilterName = testFilterName;
    }

}
