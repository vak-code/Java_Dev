package com.example.demo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	
	@GetMapping("get")
	public String getMethod()
	{
		return "Get Called";
	}
	
	@PostMapping("post")
	public String postMethod()
	{
		return "Post Called";
	}
	
	@PutMapping("put")
	public String putMethod()
	{
		return "Put Called";
	}
	
	@PatchMapping("patch")
	public String patchMethod()
	{
		return "Patch called";
	}
	
	@DeleteMapping("delete")
	public String deleteMethod()
	{
		return "Delete called";
	}
}
