package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * spring boot 启动类
 * 
 * com包下所有文件都是其扫描的对象不包括平级
 * 
 * @author adminytf
 *
 */
@SpringBootApplication
public class Run {
	public static void main(String[] args) {
		SpringApplication.run(Run.class, args);
	}
}
