# Java-
Computer作业项目仓库
# 阅读程序
## 一、实验目的
 1.学会使用Java编写简单的类，理解类的属性和方法。
 2.了解java构造方法的形式
 3.学会使用Java的权限修饰符，掌握public、private、protected的用法， 并在不同的包下实验
 4.学会在方法中适当加入逻辑判断
## 二、实验过程
 1.创建CPU类，并添加int speed属性，描述了cpu的速度，并添加对应的get/set方法，创建一个无参构造函数和全参构造，在全参构造中初始化speed属性
 2.创建HardDisk类，并添加int amount属性，描述了硬盘的容量，其他流程同CPU
 3.创建PC类，并将CPU和HardDisk作为PC类的属性，描述了一台电脑的CPU和硬盘，分别为两个属性实现get/set方法，并在pc对象中提供show方法，打印计算机的信息
 4.在show方法中进行一些空值判断，避免NPE
 5.在Test.main方法中实例化CPU和HardDisk，将cpu的速度设置为2200，硬盘的容量设置为200
 6.实例化PC类，调用setCPU和setHardDisk，将CPU和硬盘对象设置进去
 7.调用pc.show(),打印计算机的信息
 -------------------附加需求----------------------
 8.CPU和HardDisk中添加model属性，String类型，描述CPU和硬盘的品牌名称
 9.为两个类的model属性添加get/set方法
 10.完善CPU和HardDisk的构造函数
## 三、核心方法
 	/**
	 * show方法，用于打印计算机的信息，包括磁盘容量和CPU的运行速度
	 */
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
## 四、实验结果
 在main方法中按照实验流程完成操作，运行结果达到预期
![RUNOOB 图标](https://p.qlogo.cn/qqmail_head/PiajxSqBRaELcQnCatfx2OLUmQn1DXyeeL660ELkYmwsd2GObULaOIpJNT7Nv8A1Ghzictg1KPUdI/0)
## 五、实验感想
 通过本次实验，我学会了Java类的创建、了解了类的属性和方法，基本了解了构造方法的形式和作用、学会了三种权限修饰符的使用和区别
 
