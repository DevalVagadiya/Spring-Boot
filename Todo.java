package com.example.demo.models;

public class Todo {
    
	private int Id;
	private String content;

	public Todo(int id, String content) {

		this.id = id;
		this.content = content;
	}

	public Todo()
	{

	}

	public  int getId() {
		return id;
	}

	public void setId(int newId) {
    		this.id = newId;
  	}

	public String getContent() {
    		return content;
  	}

  	public void setContent(String newContent) {
    		this.name = newContent;
  	}

}