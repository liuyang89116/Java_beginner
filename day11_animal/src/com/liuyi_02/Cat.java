package com.liuyi_02;
/**
 * 这是具体的猫类
 * @author 小可爱
 * @version v1.0
 *
 */
public class Cat extends Animal {

	@Override
	public void eat() {
		System.out.println("猫吃鱼");

	}

	@Override
	public void sleep() {
		System.out.println("猫趴着睡觉");
	}

}
