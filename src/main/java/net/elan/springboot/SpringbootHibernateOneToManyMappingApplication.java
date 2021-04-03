package net.elan.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.elan.springboot.model.Comment;
import net.elan.springboot.model.Post;
import net.elan.springboot.model.repository.PostRepository;

@SpringBootApplication
public class SpringbootHibernateOneToManyMappingApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootHibernateOneToManyMappingApplication.class, args);
	}

	@Autowired
	private PostRepository postRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		Post post = new Post("One To Many mapping using JPA and Hibernate", "Demo of One To Many mapping using JPA and Hibernate");
		Comment c1 = new Comment("Learning Spring Boot JPA");
		Comment c2 = new Comment("Very useful tutorial");
		Comment c3 = new Comment("There is no secret, you have only to practice again and again.");
		
		post.getComments().add(c1);
		post.getComments().add(c2);
		post.getComments().add(c3);
		
		this.postRepository.save(post);
	}

}
