package com.restaurant.infoservice; 

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class InfoserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InfoserviceApplication.class, args);
	}

}
