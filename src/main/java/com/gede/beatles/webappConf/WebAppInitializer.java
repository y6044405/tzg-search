/*package com.gede.beatles.webappConf;

import java.util.EnumSet;

import javax.servlet.DispatcherType;
import javax.servlet.FilterRegistration;
import javax.servlet.ServletException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.WebApplicationInitializer;

import com.gede.beatles.interceptor.TestFilter;

public class WebAppInitializer implements WebApplicationInitializer {

    private static final Logger logger = LoggerFactory.getLogger(WebAppInitializer.class);

    @Override
    public void onStartup(javax.servlet.ServletContext servletContext) throws ServletException {
        logger.info("begin init web application.");
        
        //配置Spring
        AnnotationConfigWebApplicationContext springContext = new AnnotationConfigWebApplicationContext();
        springContext.register(SpringConfig.class);
        
        //添加linstener
        servletContext.addListener(new ContextLoaderListener(springContext));
        
        //添加servlet
        servletContext.setInitParameter("contextConfigLocation", "classpath*:spring/spring.xml");
        ServletRegistration.Dynamic registration = servletContext.addServlet("dispatcher", new DispatcherServlet());
        registration.setLoadOnStartup(1);
        registration.addMapping("/");
        registration.setInitParameter("contextConfigLocation", "classpath:spring/spring.xml");
        servletContext.addListener(new ContextLoaderListener());
        
        ServletRegistration.Dynamic dispatcher = servletContext.addServlet("dispatcher", new DispatcherServlet(springContext));
        dispatcher.setLoadOnStartup(1);
        dispatcher.addMapping("/");
        
        //添加filter
        CharacterEncodingFilter encodingFilter = new CharacterEncodingFilter();
        FilterRegistration.Dynamic encodingFilterRegistration = servletContext.addFilter("encodingFilter", encodingFilter);
        encodingFilterRegistration.setInitParameter("encoding", "UTF-8");
        encodingFilterRegistration.setInitParameter("forceEncoding", "true");
        encodingFilterRegistration.addMappingForUrlPatterns(EnumSet.of(DispatcherType.REQUEST, DispatcherType.ASYNC), false, "/*");
        
        logger.info("init web application success.");

        TestFilter testFilter = new TestFilter();
        FilterRegistration.Dynamic testFilterReg = servletContext.addFilter("testFilter", testFilter);
        testFilterReg.setInitParameter("testFilterName", "脑残吼");
        testFilterReg.addMappingForServletNames(EnumSet.of(DispatcherType.REQUEST, DispatcherType.ASYNC), false, "/*");
        logger.info("begin init web application.");
    }

}*/