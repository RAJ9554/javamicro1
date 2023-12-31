package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;




@EnableCircuitBreaker
@EnableHystrixDashboard
@EnableFeignClients
@SpringBootApplication
public class EbookstoreappConsumerEurekaFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(EbookstoreappConsumerEurekaFeignApplication.class, args);
	}

}
