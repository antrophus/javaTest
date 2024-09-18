package com.javaex.test;

public class Staff extends User{

	//필드
	private int salary;

	//생성자
	public Staff() {
		super();
	}

	public Staff(int salary) {
		this.salary = salary;
	}
	
	//부모 클래스의 생성자 호출 코드
	public Staff(String id, String pw, String name, int salary) {
        super(id, pw, name); // Calls the parent constructor
        this.salary = salary;
    }
	
	//메소드 - gs
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	//메소드 일반
	@Override
	public String toString() {
		return "Staff [salary=" + salary + ", id=" + id + ", pw=" + pw + ", name=" + name + "]";
	}
	
	@Override
	public void showInfo() {
        System.out.print("아이디: " + getId() + "\t");
        System.out.print("비번: " + getPw() + "\t");
        System.out.print("이름: " + getName() + "\t");
        System.out.println("월급: " + getSalary() + "\t");
    }
}
