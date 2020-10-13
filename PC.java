package com.hmj.computer.bean;

import java.util.Optional;

public class PC {
	private CPU cpu;
	private HardDisk hd;
	
	public PC() {
		//无参构造
	}
	
	public PC(CPU cpu,HardDisk hd)
	{
		this.cpu = cpu;
		this.hd = hd;
	} //全参构造
	
	public void setCPU(CPU cpu ) {
		this.cpu = cpu;
	}
	public void setHardDisk (HardDisk hd) {
		this.hd = hd;
	}
	public void show () {
		int cpuSpeed = 0,hdAmount = 0;  //初始化结果变量
		if (this.cpu != null) {                     //判空，避免空指针
			cpuSpeed = this.cpu.getSpeed();
		}
		if (this.hd != null) {                     //判空，避免空指针
			hdAmount = this.hd.getAmount();
		}
		System.out.println("cpu速度="+cpuSpeed+","+"硬盘容量:"+hdAmount);
	}
}
