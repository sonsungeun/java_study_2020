package com.ict.edu6;

public class Student extends Person {
	private int id;

	/*
	 * public Student() { // super(); 오류가 난이유 // super("태권브이",25);1. 오류아님
	 * //2.Person클래스에 기본생성자를 만들어도 오류 아님) }
	 */
	public Student(String name, int age, int id) {
		super(name, age);
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public void print() {
		System.out.println("이름 : " + super.getName() + "나이 : " + super.getAge() + " 학번 : " + id);
	}

}
