package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.example.demo.model.Blog;

@Service
public class BlogService {
	
	@Value("${getMsg}")
	String getMsg;
	
	@Value("${postMsg}")
	String postMsg;
	
	@Autowired
	Environment env;
	
	
	public Blog getBlogService()
	{
		return new Blog(123,"This is my first blog");
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
