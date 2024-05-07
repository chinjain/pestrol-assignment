package com.pertsol.assignment.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pertsol.assignment.entity.Comments;

@Repository
public interface CommentsRepository extends JpaRepository<Comments, Long> {

	List<Comments> findByCommenterName(String username);

	List<Comments> findByDateOfComment(LocalDateTime date);
}
