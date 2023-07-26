package com.mhtechin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;

@SpringBootApplication
public class RmccDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RmccDemoApplication.class, args);
	}

}
