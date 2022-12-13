package com.springSecurity.configuration;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import java.beans.PropertyVetoException;
import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages = "com.springSecurity")
@EnableWebMvc
public class Config {

 @Bean
    public ViewResolver viewResolver() {
       InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
      internalResourceViewResolver.setPrefix("/WEB-INF/view/");
        internalResourceViewResolver.setSuffix(".jsp");
       return internalResourceViewResolver;
    }

    @Bean
    public DataSource dataSource() {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        try {
            dataSource.setDriverClass("oracle.jdbc.OracleDriver");
            dataSource.setJdbcUrl("jdbc:oracle:thin:@localhost:1521:orcl");
            dataSource.setUser("admin");
            dataSource.setPassword("123");
        } catch (PropertyVetoException e) {
            e.printStackTrace();
        }
        return dataSource;
    }
}
