package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Blog;
import com.example.demo.service.BlogService;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
@RestController
public class BlogController {

	@Autowired
	BlogService blogServ;
	
	@GetMapping("blog")
	public Blog getBlog()
	{
		log.info("CUSTOM INFO get called");
		return blogServ.getBlogService();
	}
	
	@PostMapping("blog")
	public String postBlog()
	{
		log.debug("CUSTOM DEBUG post called");
		return blogServ.postBlogService();
	}
	
	@PutMapping("blog")
	public String putBlog()
	{
		log.warn("CUSTOM WARN put called");
		return blogServ.putBlogService();
	}
	
	@DeleteMapping("blog")
	public String deleteBlog()
	{
		log.error("CUSTOM ERR delete called");
		return blogServ.delBlogService();
	}
	
}
