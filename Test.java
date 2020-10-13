package com.hmj.computer;

import com.hmj.computer.bean.CPU;
import com.hmj.computer.bean.HardDisk;
import com.hmj.computer.bean.PC;

public class Test {

	public static void main(String[] args) {
		CPU cpu = new CPU();
		cpu.setSpeed(2200);
		HardDisk disk = new HardDisk();
		disk.setAmount(200);
		PC pc = new PC();
		pc.setCPU(cpu);
		pc.setHardDisk(disk);
		pc.show();
	}
}
