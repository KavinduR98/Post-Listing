package com.ushan.PostListing;

import com.ushan.PostListing.model.Post;
import com.ushan.PostListing.repo.PostRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PostListingApplication {

	public static void main(String[] args) {
		SpringApplication.run(PostListingApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(PostRepository repository) {
		return args -> repository.save(new Post("Hello World!","My first blog post!"));
	}
}
