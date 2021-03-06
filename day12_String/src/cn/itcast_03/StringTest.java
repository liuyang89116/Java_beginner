package cn.itcast_03;

import java.util.Scanner;

/*
 * 模拟登录，给三次机会，并提示还有几次
 * 
 * 分析：
 * 		A:定义用户名和密码，已存在的
 * 		B:键盘录入用户名和密码
 * 		C:比较用户名和密码
 * 、		如果相同则登录成功
 * 			如果有一个则登录失败
 * 		D：给三次机会
 */
public class StringTest {
	public static void main(String[] args) {
		// 定义用户名和密码
		String username = "admin";
		String password = "admin";

		// 给三次机会，用循环改进
		for (int i = 0; i < 3; i++) {
			// 键盘录入
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入用户名：");
			String name = sc.nextLine();
			System.out.println("请输入密码：");
			String psw = sc.nextLine();

			// 比较用户名和密码
			if (name.equals(username) && psw.equals(password)) {
				// 登录成功
				System.out.println("登录成功");
				break;
			} else {
				// 如果是第0次，应该换一种提示
				if (i == 2) {
					System.out.println("您已经没有机会了。");
				} else {
					System.out.println("登录失败, 你还有" + (2 - i) + "次机会。");
				}
			}

		}
	}

}
