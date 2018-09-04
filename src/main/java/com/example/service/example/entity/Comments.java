package com.example.service.example.entity;

import java.util.Date;

public class Comments {
	private Long id;
	private Long hotEvents;
	private Date commentDate;
	private String content;
	private String come;

	public String getCome() {
		return come;
	}

	public void setCome(String come) {
		this.come = come;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getHotEvents() {
		return hotEvents;
	}
	public void setHotEvents(Long hotEvents) {
		this.hotEvents = hotEvents;
	}
	public Date getCommentDate() {
		return commentDate;
	}
	public void setCommentDate(Date commentDate) {
		this.commentDate = commentDate;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
}

