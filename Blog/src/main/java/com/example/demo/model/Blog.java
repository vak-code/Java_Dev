package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Blog {

	@Id
	private int blogId;
	
	@Column
	private String blog;
	
	public Blog()
	{
		super();
	}
	public Blog(int id, String blog)
	{
		this.blogId = id;
		this.blog = blog;
	}

	public int getBlogId() {
		return blogId;
	}

	public void setBlogId(int blogId) {
		this.blogId = blogId;
	}

	public String getBlog() {
		return blog;
	}

	public void setBlog(String blog) {
		this.blog = blog;
	}
	
	
}
