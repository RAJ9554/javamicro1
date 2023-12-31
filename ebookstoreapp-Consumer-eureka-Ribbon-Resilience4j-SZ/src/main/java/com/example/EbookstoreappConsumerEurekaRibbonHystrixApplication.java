package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import brave.sampler.Sampler;




@SpringBootApplication
public class EbookstoreappConsumerEurekaRibbonHystrixApplication {

	public static void main(String[] args) {
		SpringApplication.run(EbookstoreappConsumerEurekaRibbonHystrixApplication.class, args);
	}
    @Bean
	public Sampler getSampler() {
		return Sampler.ALWAYS_SAMPLE;
		
	}
	
}
