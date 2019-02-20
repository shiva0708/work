package net.danshick.helloapieureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableAutoConfiguration
@EnableEurekaServer
@SpringBootApplication
public class HelloAPIEureka {

	public static void main(String[] args) {
		SpringApplication.run(HelloAPIEureka.class, args);
	}

}

