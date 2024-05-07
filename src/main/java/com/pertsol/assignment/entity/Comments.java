package com.pertsol.assignment.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Comments {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String commenterName;

	private String text;

	@Column(name = "dateofcomment")
	private LocalDateTime dateOfComment;

	public Comments(Long id, String by, String text, LocalDateTime dateofcomment) {
		super();
		this.id = id;
		this.commenterName = by;
		this.text = text;
		this.dateOfComment = dateofcomment;
	}

	public Comments() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBy() {
		return commenterName;
	}

	public void setBy(String by) {
		this.commenterName = by;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public LocalDateTime getLocalDateTime() {
		return dateOfComment;
	}

	public void setLocalDateTime(LocalDateTime dateofcomment) {
		this.dateOfComment = dateofcomment;
	}

}
