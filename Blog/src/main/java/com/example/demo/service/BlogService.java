package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.example.demo.model.Blog;
import com.example.demo.repository.BlogRepository;

@Service
public class BlogService {
	
	@Value("${getMsg}")
	String getMsg;
	
	@Value("${postMsg}")
	String postMsg;
	
	@Autowired
	Environment env;
	
	@Autowired
	BlogRepository blogRepository;
	
//	public BlogService()
//	{
//		blogRepository.save(new Blog(1,"Java is simple programming language"));
//	}
	
//	@PostConstruct
//	public void loadMore()
//	{
//		blogRepository.saveAll(List.of(new Blog(1,"Java is simple programming language"),
//				new Blog(2,"Java is OOP programming language"),
//				new Blog(3,"Java is Platform Independent programming language")));
//	}
	
	public List getBlogService()
	{
		return List.of(blogRepository.findAll());
	}
	
	public String postBlogService()
	{
		return postMsg;
	}
	
	public String putBlogService()
	{
		return env.getProperty("putMsg");
	}
	
	public String delBlogService()
	{
		return env.getProperty("delMsg");
	}
	
}
