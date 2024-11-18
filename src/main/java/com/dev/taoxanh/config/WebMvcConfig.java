package com.dev.taoxanh.config;

import org.aspectj.apache.bcel.Constants;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer, Constants {
    @Bean
		public ViewResolver viewResolver() {
			InternalResourceViewResolver bean = new InternalResourceViewResolver();
			bean.setViewClass(JstlView.class);
			bean.setPrefix("/WEB-INF/views/");
			bean.setSuffix(".jsp");
			return bean;
		}  
        @Override
		public void addResourceHandlers(final ResourceHandlerRegistry registry) {
			
			registry.addResourceHandler("/user/**").addResourceLocations("classpath:/user/");
			registry.addResourceHandler("/admin/**").addResourceLocations("classpath:/admin/");
			
		}

    
}
