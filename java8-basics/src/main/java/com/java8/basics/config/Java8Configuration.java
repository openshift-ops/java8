package com.java8.basics.config;

import java.util.function.Consumer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Java8Configuration {
	
	
	
	@Bean
	public Consumer<String> stringConsumer()
	{
		return (s) -> System.out.println(s);
	}

}
