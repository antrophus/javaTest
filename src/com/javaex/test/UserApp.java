package com.javaex.test;

import java.util.ArrayList;

public class UserApp {

	public static void main(String[] args) {

		ArrayList<User> userList = new ArrayList<User>();

		Staff master = new Staff("master", "m7788", "운영자", 3500000);
		Customer jung = new Customer("jung-ws", "j1357913579", "정우성", 1000);
		Customer lee = new Customer("LeeHR", "a123!!", "이효리", 2500);
		Customer ms = new Customer("ms-park", "y2345", "박명수", 1200);

		userList.add(master);
		userList.add(jung);
		userList.add(lee);
		userList.add(ms);

		System.out.println("------------------회원+운영자 전체리스트------------------------");

		for (int i = 0; i < userList.size(); i++) {

			System.out.print((i + 1) + ". ");
			userList.get(i).showInfo();
		}
		System.out.println("");
		System.out.println("운영자의 연봉은 " + master.getSalary()*12 + " 입니다.");
		
	}
}
