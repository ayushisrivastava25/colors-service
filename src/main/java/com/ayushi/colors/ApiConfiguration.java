package com.ayushi.colors;

import com.ayushi.colors.service.ColorService;
import com.ayushi.colors.service.impl.ColorServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(
        basePackages = {
                "com.ayushi.colors.controller"
        })
public class ApiConfiguration {

    @Bean
    public ColorService colorService() {
        return new ColorServiceImpl();
    }
}
