package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.log.LogAccessor;

import lombok.Data;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;



@Data
@Slf4j
@SpringBootApplication
public class SprintBootAppLoggingSl4jApplication {

	public static void main(String[] args) {
		SpringApplication.run(SprintBootAppLoggingSl4jApplication.class, args);
		Logging lg = new Logging();
		lg.toString();
		log.
	}

}
