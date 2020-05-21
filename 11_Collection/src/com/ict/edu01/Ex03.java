 package com.ict.edu01;

public class Ex03 {
private String name;
private int age;
private double weight;

public Ex03() {
}

public Ex03(String name, int age, double weight) {
	this.name = name;
	this.age = age;
	this.weight = weight;
}

/**
 * @return the name
 */
public String getName() {
	return name;
}

/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}

/**
 * @return the age
 */
public int getAge() {
	return age;
}

/**
 * @param age the age to set
 */
public void setAge(int age) {
	this.age = age;
}

/**
 * @return the weight
 */
public double getWeight() {
	return weight;
}

/**
 * @param weight the weight to set
 */
public void setWeight(double weight) {
	this.weight = weight;
}

}
