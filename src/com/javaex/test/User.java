package com.javaex.test;

public abstract class User {
	
	//필드
	protected String id;
	protected String pw;
	protected String name;
	
	//생성자
	public User() {
	}

	public User(String id, String pw, String name) {
		this.id = id;
		this.pw = pw;
		this.name = name;
	}

	//메소드 - gs
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//메소드 일반
	@Override
	public String toString() {
		return "User [id=" + id + ", pw=" + pw + ", name=" + name + "]";
	}
	
	//추상 메소드
	public abstract void showInfo();

	
	
	
	
	
	

}
