package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.beans.Movie;
import com.example.demo.beans.Song;

@SpringBootApplication
public class MovieBeanScopeApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext beanContrext = SpringApplication.run(MovieBeanScopeApplication.class, args);
		
		Movie m1 = beanContrext.getBean(Movie.class);
		Movie m2 = beanContrext.getBean(Movie.class);
		
		Song s1 = m1.getSong();
		Song s2 = m2.getSong();

		
		m1.setMovieName("Sholey");
		s1.setLyrics("Mehbooba o mehbooba");
		s1.setMusic("LaxmiKant");
		System.out.println();
		
		System.out.println("M1 -> Song = " + s1);
		System.out.println("M2 -> Song = " + s2);
		System.out.println();
		System.out.println("M1 -> Song.lyrics = " + s1.getLyrics());
		System.out.println("M1 -> Song.music = " + s1.getMusic());
		System.out.println("M2 -> Song.lyrics = " + s2.getLyrics());
		System.out.println("M2 -> Song.music = " + s2.getMusic());
		System.out.println();
		System.out.println("M1 = " + m1);
		System.out.println("M2 = " + m2);
		System.out.println();
	
		System.out.println("M1 -> Song = " + s1);
		System.out.println("M2 -> Song = " + s2);
		System.out.println();
		System.out.println("M1 name = " + m1.getMovieName());
		System.out.println("M2 name = " + m2.getMovieName());
		System.out.println();

		
		
	}

}
