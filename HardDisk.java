package com.hmj.computer.bean;

public class HardDisk {
	private int amount;
	private String model;
	/**
	 * 无参构造
	 */
	public HardDisk() {
	}
	/**
	 *全参构造 
	 **/
	public HardDisk(int amount,String model) {
		this.amount = amount;
		this.model = model;
	} 
	
	public void setAmount (int m) {
		this.amount = m;
	}
	public int getAmount () {
		return amount ;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
}
