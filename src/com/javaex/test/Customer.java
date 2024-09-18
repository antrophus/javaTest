package com.javaex.test;

public class Customer extends User {
	
	//필드
	private int point;
	
	//생성자
	public Customer() {
		super();
	}
	
	public Customer(int point) {
		this.point = point;
	}
	
	//부모 클래스의 생성자 호출 코드
	public Customer(String id, String pw, String name, int point) {
        super(id, pw, name);
        this.point = point;
    }

	//메소드 - gs
	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	//메소드 일반
	@Override
	public String toString() {
		return "Customer [point=" + point + ", id=" + id + ", pw=" + pw + ", name=" + name + "]";
	}
	
	@Override
	public void showInfo() {
        System.out.print("아이디: " + getId() + "\t" );
        System.out.print("비번: " + getPw() + "\t");
        System.out.print("이름: " + getName() + "\t");
        System.out.println("포인트: " + getPoint() + "\t");
    }
}
