package com.cjc.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
		
		http.authorizeHttpRequests()
			.antMatchers("/student").authenticated()
			.antMatchers("/employee").authenticated()
			.antMatchers("/welcome").permitAll().
			antMatchers("/greet").permitAll()
			.and()
			.formLogin()
			.and()
			.httpBasic();
		
		return http.build();
	}
}
