package kasus2;

import java.util.*;

public class FlyingDutchMan extends SuperHero{
	private int powerLevel;
	private String name;
	private List<Power> powerList;
	
	FlyingDutchMan(int heroLevel, String heroName) {
		powerLevel = heroLevel;
		name = heroName;
		powerList = new ArrayList<Power>();
		addPower(new Flying());
		addPower(new LaserEye());
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getPowerLevel() {
		return this.powerLevel;
	}
	
	public void addPower(Power power) {
		powerList.add(power);
	}

	public void identity() {
		System.out.println("================================");
		System.out.println("It's " + this.getName() + ", the FlyingDutchMan ! It has power level of " + this.getPowerLevel());
		System.out.println(".....HEED ME....."); 
		System.out.println("FOR MY NAAAAAAAME IS " + this.getName());
	}
	
	public void showPower() {
		System.out.println("TIME TO SHOW MY POWER");
		for(Power power: powerList) {
			power.doPower();
		}
		System.out.println("================================");
	}
}