package com.pertsol.assignment.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pertsol.assignment.entity.Comments;
import com.pertsol.assignment.service.CommentsService;

@RestController
@RequestMapping("/api/v2/comments")
public class CommentsController {

	@Autowired
	private CommentsService commentService;

	@GetMapping
	public List<Comments> getAllComments() {
		return commentService.getAllComments();
	}

	@GetMapping("/search")
	public List<Comments> getCommentsByUsername(@RequestParam(required = false,value = "username") String username,
			@RequestParam(required = false,value = "dateTime") LocalDateTime dateTime) {
		if (username != null) {
			return commentService.getCommentsByUsername(username);
		} else if (dateTime != null) {
			return commentService.getCommentsByDate(dateTime);
		}
		return null;
	}

}
