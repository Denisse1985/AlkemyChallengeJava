package com.challenge.alkemy.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
	
	@Override
	public void addViewControllers(ViewControllerRegistry registration) {
		registration.addViewController("/login");
		registration.addViewController("/errors/403").setViewName("/errors/403");
	}

}
