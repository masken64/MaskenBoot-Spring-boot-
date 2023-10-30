package com.masken.SimpleAuthentication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class SimpleAuthenticationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleAuthenticationApplication.class, args);
	}

}
