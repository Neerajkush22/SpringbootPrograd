package com.Eurekaapp2.app2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Demoapp2Application {

	public static void main(String[] args) {
		SpringApplication.run(Demoapp2Application.class, args);
	}

}
