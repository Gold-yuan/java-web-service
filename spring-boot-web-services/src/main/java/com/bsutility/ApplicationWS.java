package com.bsutility;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.PropertySource;

/**
 * @author adminytf
 *
 */
@SpringBootApplication
@PropertySource(value = { "classpath:ws.properties"})
public class ApplicationWS extends SpringBootServletInitializer {
	public ApplicationWS() {
		System.out.println(222);
	}
	public static void main(String[] args) {
		SpringApplication.run(ApplicationWS.class, args);
	}
}
