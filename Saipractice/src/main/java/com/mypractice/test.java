package com.mypractice;

public class test {

	public static void main(String[] args) {
		student s1 = new student(1,"sai");
		System.out.println(s1);
		
	}
}

	class student{
		private int rollno;
		private String name;
		public student(int rollno, String name) {
			super();
			this.rollno = rollno;
			this.name = name;
		}
		
	}

