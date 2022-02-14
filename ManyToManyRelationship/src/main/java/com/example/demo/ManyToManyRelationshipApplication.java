package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import Entity.Post;
import Entity.Tag;

@SpringBootApplication
public class ManyToManyRelationshipApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManyToManyRelationshipApplication.class, args);
	}
	 private void run(String...strings) {
	        // TODO Auto-generated method stub
	        Post posts=new Post();
	        posts.setDescription("This is Sample Post Description");
	        posts.setTitle("Sample Post");

	        Tag tags=new Tag();
	        tags.setName("Java");
	        Tag tags1=new Tag();
	        tags1.setName("Python");

	        posts.getTags().add(tags);
	        posts.getTags().add(tags1);

	        tags.getPosts().add(posts);
	        tags1.getPosts().add(posts);

	        postsRepository.save(posts);
	    }
	 
	

}
