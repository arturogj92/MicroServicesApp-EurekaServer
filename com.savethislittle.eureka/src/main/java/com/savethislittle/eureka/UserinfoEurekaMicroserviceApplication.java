package com.savethislittle.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class UserinfoEurekaMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserinfoEurekaMicroserviceApplication.class, args);
	}
}
