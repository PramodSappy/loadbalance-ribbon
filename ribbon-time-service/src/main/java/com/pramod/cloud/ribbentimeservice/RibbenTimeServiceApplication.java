package com.pramod.cloud.ribbentimeservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@SpringBootApplication
@RestController
public class RibbenTimeServiceApplication {
	@Value("${server.port}")
	private int port;

	public static void main(String[] args) {
		SpringApplication.run(RibbenTimeServiceApplication.class, args);
	}

	@GetMapping
	public String getTime(){
		return  "The current time is " + new Date().getTime() +
				"(answered by service running on " + port + ")";
	}
}
