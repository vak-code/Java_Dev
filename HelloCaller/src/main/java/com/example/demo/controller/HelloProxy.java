package com.example.demo.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="hello-service")
public interface HelloProxy {

	@GetMapping("/hello")
	public String getHello();
}
