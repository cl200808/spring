package com.example.service.example.entity;


import java.util.Date;

public class HotEvents {
	private int id;
	private String keyWord;
	private String hotContent;
	private int searchSum;
	private Date createDate;
	
	/*======================*/
	private int hotEventsId;
	private Date commentDate;
	private String content;
	
	public int getHotEventsId() {
		return hotEventsId;
	}
	public void setHotEventsId(int hotEventsId) {
		this.hotEventsId = hotEventsId;
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getKeyWord() {
		return keyWord;
	}
	public void setKeyWord(String keyWord) {
		this.keyWord = keyWord;
	}
	public String getHotContent() {
		return hotContent;
	}
	public void setHotContent(String hotContent) {
		this.hotContent = hotContent;
	}
	public int getSearchSum() {
		return searchSum;
	}
	public void setSearchSum(int searchSum) {
		this.searchSum = searchSum;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
}
