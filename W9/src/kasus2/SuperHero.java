package kasus2;

import java.util.List;

abstract class SuperHero{
	private int powerLevel;
	private String name;
	private List<Power> powerList;

	public String getName() {
		return name;
	}
	
	public int getPowerLevel() {
		return powerLevel;
	}

	public abstract void addPower(Power power);
	public abstract void identity();
	public abstract void showPower();
}
