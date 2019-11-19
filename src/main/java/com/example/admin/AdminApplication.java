package com.example.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
@EnableAdminServer
public class AdminApplication {
	/**
	 * Start AdminApplication with reactive mode setup
	 */
	public static void main(final String[] args) {
		new SpringApplicationBuilder(AdminApplication.class)
				.web(WebApplicationType.REACTIVE)
				.run(args);
	}
}
