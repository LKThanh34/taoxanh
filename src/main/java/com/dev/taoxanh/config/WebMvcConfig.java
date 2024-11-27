package com.dev.taoxanh.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import com.dev.taoxanh.repository.Constants;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer, Constants {
	@Bean
	public ViewResolver viewResolver() {
		final InternalResourceViewResolver bean = new InternalResourceViewResolver();
		bean.setViewClass(JstlView.class);
		bean.setPrefix("/WEB-INF/views/");
		bean.setSuffix(".jsp");
		return bean;
	}

	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		registry.viewResolver(viewResolver());
	}

	@Override
	public void addResourceHandlers(final ResourceHandlerRegistry registry) {

		registry.addResourceHandler("/client/**").addResourceLocations("/resources/client/");
		registry.addResourceHandler("/admin/**").addResourceLocations("/resources/admin/");
		registry.addResourceHandler("/images/**").addResourceLocations("/resources/images/");

		registry.addResourceHandler("/StorageFolder/**").addResourceLocations("file" + STORAGE_FOLDER);
	}

}
