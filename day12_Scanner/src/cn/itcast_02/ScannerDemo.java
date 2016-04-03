package cn.itcast_02;

import java.util.Scanner;

/*
 * 基本格式
 *    public boolean has NextXxx(): 判断是否是某种类型的元素
 *    public Xxx nextXxx(): 获取该元素
 *    
 *
 * 
 */
public class ScannerDemo {
	public static void main(String[] args) {
		//创建对象
		Scanner sc = new Scanner(System.in);
		
		//获取数据
		if(sc.hasNextInt()){
			int x = sc.nextInt();
			System.out.println("x: "+x);
		}else{
			System.out.println("您输入的数据有误。");
		}
	}
}
