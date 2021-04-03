package net.elan.springboot.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.elan.springboot.model.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

}
