package net.elan.springboot.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.elan.springboot.model.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {

}
