package com.hmj.computer.bean;

import java.util.Optional;

public class PC {
	private CPU cpu;
	private HardDisk hd;
	
	public PC() {
		//�޲ι���
	}
	
	public PC(CPU cpu,HardDisk hd)
	{
		this.cpu = cpu;
		this.hd = hd;
	} //ȫ�ι���
	
	public void setCPU(CPU cpu ) {
		this.cpu = cpu;
	}
	public void setHardDisk (HardDisk hd) {
		this.hd = hd;
	}
	public void show () {
		int cpuSpeed = 0,hdAmount = 0;  //��ʼ���������
		if (this.cpu != null) {                     //�пգ������ָ��
			cpuSpeed = this.cpu.getSpeed();
		}
		if (this.hd != null) {                     //�пգ������ָ��
			hdAmount = this.hd.getAmount();
		}
		System.out.println("cpu�ٶ�="+cpuSpeed+","+"Ӳ������:"+hdAmount);
	}
}
