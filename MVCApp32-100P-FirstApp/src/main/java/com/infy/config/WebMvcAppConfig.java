package com.infy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.infy")
public class WebMvcAppConfig {

	@Bean
	public InternalResourceViewResolver createIrvr() {
		return new InternalResourceViewResolver("/WEB-INF/pages/", ".jsp");
	}
}
