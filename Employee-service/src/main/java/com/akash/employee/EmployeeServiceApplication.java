package com.akash.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class EmployeeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeServiceApplication.class, args);
	}

	/*when you are using application name for calling api through restTemplate then we can use @LoadBalanced*/

	@Bean
	/*@LoadBalanced*/
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}
}
