package com.hmj.computer.bean;

public class CPU {
	private int speed;
	private String model;
	public CPU() {
		
	}
	public CPU(int speed,String model) {
		this.speed=speed;
		this.model=model;	
	}
	public void setSpeed(int m) {
		this.speed = m;
	}
	public int getSpeed () {
		return speed;
	}
	public void setModel(String n) {
		this.model = n;
	}
	public String getModel() {
		return model;
	}
}
