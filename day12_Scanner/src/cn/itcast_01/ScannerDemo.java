package cn.itcast_01;

/*
 * Scanner: ���ڼ��̽���¼������
 * 
 * ���췽���� 
 * 		Scanner(InputStream source)
 */

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		// ��������
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		System.out.println("x: " + x);
	}
}
