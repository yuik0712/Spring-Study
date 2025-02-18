package com.example.Spring_MVC.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import com.example.Spring_MVC.View.VeneerViewResolver;

/**
 * 애플리케이션 설정 클래스
 */
@Configuration
public class AppConfig {

    @Bean
    public ViewResolver viewResolver() {
        VeneerViewResolver resolver = new VeneerViewResolver();
        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".html");
        return resolver;
    }
}
