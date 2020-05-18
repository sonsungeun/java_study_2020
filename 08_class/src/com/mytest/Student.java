package com.mytest;

public class Student extends Person {
int id;

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
public void print() {
	System.out.println(" 학번 : ");
}
}
