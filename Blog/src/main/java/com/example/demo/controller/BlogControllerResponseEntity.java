package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Blog;
import com.example.demo.service.BlogService;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
@RestController
@RequestMapping("resp")
public class BlogControllerResponseEntity {

	@Autowired
	BlogService blogService;
	
	@GetMapping("blog")
	public ResponseEntity<Blog> getBlog(@RequestParam(value="key",defaultValue = "All") String keyString)
	{
		log.info("CUSTOM INFO Blog Requested with keyword " + keyString);
		return(new ResponseEntity<Blog>(blogService.getBlogService(),HttpStatus.OK));
	}
	
	@GetMapping("blog/error")
	public void getBlogError()
	{
		int [] intArray = {1, 2, 3};
		log.info("CUSTOM INFO Blog Error called ");
		int i = intArray[4];
	}
	
	@PostMapping("blog")
	public ResponseEntity<String> postBlog()
	{
		log.debug("CUSTOM DEBUG Post Blog called");
		return (new ResponseEntity<String>(blogService.postBlogService(),HttpStatus.CREATED));
	}
	
	@PutMapping("blog")
	public ResponseEntity<String> putBlog()
	{
		log.warn("CUSTOM WARN Put Blog called");
		return (new ResponseEntity<String>(blogService.putBlogService(),HttpStatus.ACCEPTED));
	}
	
	@DeleteMapping("blog")
	public ResponseEntity<String> deleteBlog()
	{
		log.error("CUSTOM ERROR Delete Blog Called");
		return (new ResponseEntity<String>(blogService.delBlogService(),HttpStatus.ACCEPTED));
	}
}
