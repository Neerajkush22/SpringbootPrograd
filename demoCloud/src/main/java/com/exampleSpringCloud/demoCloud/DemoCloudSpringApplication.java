package com.exampleSpringCloud.demoCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class DemoCloudSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoCloudSpringApplication.class, args);
	}

}
