package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

/**
 * @author adminytf
 *
 */

@SpringBootApplication
@PropertySource(value = { "classpath:springboot.properties"})
public class Run {
	public Run() {
		System.out.println(111);
	}
	public static void main(String[] args) {
		SpringApplication.run(Run.class, args);
	}
}
