package com.hamburg.main;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages="com.hamburg.main")
public class AppConfig {

	public static void main(String[] args) {
		

	}

}
