package com.pertsol.assignment.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pertsol.assignment.entity.Comments;
import com.pertsol.assignment.repository.CommentsRepository;

@Service
public class CommentsService {

	@Autowired
	private CommentsRepository commentsRepository;

	public List<Comments> getAllComments() {

		return commentsRepository.findAll();
	}

	public List<Comments> getCommentsByUsername(String username) {
		return commentsRepository.findByCommenterName(username);
	}

	public List<Comments> getCommentsByDate(LocalDateTime dateTime) {
		return commentsRepository.findByDateOfComment(dateTime);
	}

}
