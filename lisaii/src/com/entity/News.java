package com.entity;

import java.sql.Date;

public class News {
	private int id;
	private String content;
	private Date time;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}	
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}	
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
}