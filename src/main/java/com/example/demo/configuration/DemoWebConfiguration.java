package com.example.demo.configuration;

import com.example.demo.interceptor.Interceptor1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by BIG-JIAN on 2017/7/13.
 */
@Component
public class DemoWebConfiguration extends WebMvcConfigurerAdapter {
    @Autowired
    Interceptor1 interceptor1;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(interceptor1);
        super.addInterceptors(registry);
    }
}
