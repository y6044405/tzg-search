/*package com.gede.beatles.webappConf;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.alibaba.druid.pool.DruidDataSource;
import com.gede.beatles.entity.Subject;

@Configuration
@PropertySource("classpath:jdbc.properties")
@ComponentScan(basePackages = { "com.gede.beatles.service", "com.gede.beatles.dao" })
public class SpringConfig {

    @Autowired
    private Environment env;

    DruidDataSource dataSource = null;

    @Bean(name = "subject")
    public Subject getExampleBean() {
        return new Subject();
    }

    @Bean(name = "mysqlDataSource")
    public DataSource mysqlDataSource() {
        if (dataSource == null) {
            dataSource = new DruidDataSource();
            dataSource.setMaxActive(100);
            dataSource.setMaxIdle(30);
            dataSource.setMinIdle(20);
            dataSource.setInitialSize(10);
            dataSource.setPoolPreparedStatements(true);
            dataSource.setTestOnBorrow(false);
            dataSource.setTestOnReturn(false);
            dataSource.setMinEvictableIdleTimeMillis(30);
            dataSource.setMaxWaitThreadCount(1000);
            dataSource.setDriverClassName(env.getProperty("jdbc.driver"));
            dataSource.setUrl(env.getProperty("jdbc.url"));
            dataSource.setUsername(env.getProperty("jdbc.username"));
            dataSource.setPassword(env.getProperty("jdbc.password"));
        }
        return dataSource;
    }

}*/