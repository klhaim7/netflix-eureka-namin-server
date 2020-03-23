package com.bitnology.eureka.netflixeurekanaminserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class NetflixEurekaNaminServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(NetflixEurekaNaminServerApplication.class, args);
	}

}
