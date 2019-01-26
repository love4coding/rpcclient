package com.study.rpcclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(locations = {"classpath*:config/spring/*.xml"})
@ComponentScan(basePackages = {"com.study.rpcclient.*"})
public class RpcclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(RpcclientApplication.class, args);
	}
}
