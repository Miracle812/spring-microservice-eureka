package com.server.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.server.consumer.repository.AccountRepository;
import com.server.consumer.repository.RemoteAccountRepository;

@SpringBootApplication
public class ConsumerApplication {

	public static final String ACCOUNTS_SERVICE_URL = "http://ACCOUNTS-SERVICE";

	public static void main(String[] args) {
		SpringApplication.run(ConsumerApplication.class, args);
	}

	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

	@Bean
	public AccountRepository accountRepository(){
		return new RemoteAccountRepository(ACCOUNTS_SERVICE_URL);
	}
}
