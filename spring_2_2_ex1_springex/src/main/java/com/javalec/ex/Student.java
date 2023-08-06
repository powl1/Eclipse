package com.javalec.ex;

//빈 = 데이터 멤버에 대한 getter,setter + 디폴트 생성자 
public class Student {
	private String name;
	private String age;

	public Student() {
	}

	public Student(String name, String age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

}