package com.ict.edu7;

public class Terran extends Unit {
	String name;
	int energy;
	boolean fly;

	@Override
	public void decEnergy() {
		energy = energy - 5;
	}

	public Terran(String name, int energy, boolean fly) {
		this.name = name;
		this.energy = energy;
		this.fly = fly;
	}

}
