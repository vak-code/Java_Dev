package com.example.demo.model;


public class Blog {

	private int blogId;
	private String blog;
	
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
