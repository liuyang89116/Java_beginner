package cn.itcast_03;

import java.util.Scanner;

/*
 * 这是猜数字小游戏的代码
 */
public class GuessNumberGame {
	// 不能创建成员变量
	private GuessNumberGame() {

	}

	public static void start() {
		// 产生一个随机数
		int number = (int) (Math.random() * 100) + 1;

		while (true) {
			// 键盘录入数据
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入键盘要录入的数据（1-100）：");
			int guessNumber = sc.nextInt();

			// 判断
			if (guessNumber > number) {
				System.out.println("你猜的数据" + guessNumber + "大了");
			} else if (guessNumber < number) {
				System.out.println("你猜的数据" + guessNumber + "小了");
			} else {
				System.out.println("恭喜你猜对了");
				break;
			}
		}

	}

}
