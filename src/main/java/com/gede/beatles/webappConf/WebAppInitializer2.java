package com.gede.beatles.webappConf;

import java.util.EnumSet;

import javax.servlet.DispatcherType;
import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.gede.beatles.interceptor.TestFilter;

public class WebAppInitializer2 extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    protected String[] getServletMappings() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        // 系统启动时注册filter
        FilterRegistration testFilter = servletContext.addFilter("testFilter", TestFilter.class);
        // 设置init param, param可以从properties文件中读取或其他方式获取，提供一个想法
        testFilter.setInitParameter("testFilterName", "地狱咆哮");
        testFilter.addMappingForUrlPatterns(EnumSet.allOf(DispatcherType.class), true, "/*");
        super.onStartup(servletContext);
    }

}
