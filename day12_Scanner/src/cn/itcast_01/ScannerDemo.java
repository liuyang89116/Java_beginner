package cn.itcast_01;

/*
 * Scanner: 用于键盘接受录入数据
 * 
 * 构造方法： 
 * 		Scanner(InputStream source)
 */

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		// 创建对象
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		System.out.println("x: " + x);
	}
}
