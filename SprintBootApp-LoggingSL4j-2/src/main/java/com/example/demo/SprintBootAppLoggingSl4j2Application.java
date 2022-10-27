package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
@SpringBootApplication
public class SprintBootAppLoggingSl4j2Application {

	public static void main(String[] args) {
		SpringApplication.run(SprintBootAppLoggingSl4j2Application.class, args);
		log.debug("message");



	}

}
