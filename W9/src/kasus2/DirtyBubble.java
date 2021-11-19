package kasus2;

import java.util.*;

public class DirtyBubble extends SuperHero{
	private int powerLevel;
	private String name;
	private List<Power> powerList;
	
	DirtyBubble(int heroLevel, String heroName) {
		powerLevel = heroLevel;
		name = heroName;
		powerList = new ArrayList<Power>();
		addPower(new Strength());
		addPower(new Flying());
	}
	
	public int getPowerLevel() {
		return powerLevel;
	}

	public String getName() {
		return name;
	}

	public void addPower(Power power) {
		powerList.add(power);
	}
	
	public void identity() {
		System.out.println("================================");
		System.out.println("It's " + getName() + ", the DirtyBubble! It has power level of " + getPowerLevel());
		System.out.println(".....HEED ME....."); 
		System.out.println("FOR MY NAAAAAAAME IS " + getName());
	}
	
	public void showPower() {
		System.out.println("TIME TO SHOW MY POWER");
		for(Power power: powerList) {
			power.doPower();
		}
		System.out.println("================================");
	}
}
