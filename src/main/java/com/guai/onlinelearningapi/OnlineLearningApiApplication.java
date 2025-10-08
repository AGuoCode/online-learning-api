package com.guai.onlinelearningapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class OnlineLearningApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineLearningApiApplication.class, args);
	}

}
