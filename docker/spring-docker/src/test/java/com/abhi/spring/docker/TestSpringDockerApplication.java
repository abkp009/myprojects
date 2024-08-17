package com.abhi.spring.docker;

import org.springframework.boot.SpringApplication;

public class TestSpringDockerApplication {

	public static void main(String[] args) {
		SpringApplication.from(SpringDockerApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
