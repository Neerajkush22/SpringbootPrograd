package com.Eurekaapp1.app1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
public class Demoapp1Application {

	public static void main(String[] args) {
		SpringApplication.run(Demoapp1Application.class, args);
	}

}
