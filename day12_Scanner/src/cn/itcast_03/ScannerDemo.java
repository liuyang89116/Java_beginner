package cn.itcast_03;

import java.util.Scanner;

/*
 * ���õ�����������
 * 		public int nextInt():
 * 		public String nextLine():
 * 
 */
public class ScannerDemo {
	public static void main(String[] args) {
		// ��������
		Scanner sc = new Scanner(System.in);

		/*
		 * // ��ȡ����int���͵�ֵ int a = sc.nextInt(); int b = sc.nextInt();
		 * System.out.println("a: " + a + ", b: " + b);
		 * System.out.println("----------");
		 */

		// // ��ȡ����String���͵�ֵ
		// String s1 = sc.nextLine();
		// String s2 = sc.nextLine();
		// System.out.println("s1: " + s1 + ", s2: " + s2);
		// System.out.println("----------");

		// // �Ȼ�ȡһ��int���ٻ�ȡһ���ַ���
		// String s1 = sc.nextLine();
		// int b = sc.nextInt();
		// System.out.println("s1: " + s1 + ", b: " + b);

		// �Ȼ�ȡһ���ַ������ٻ�ȡһ��int
		// int a = sc.nextInt();
		// String s2 = sc.nextLine();
		// System.out.println("a: " + a + ", s2: " + s2);

		int a = sc.nextInt();

		Scanner sc2 = new Scanner(System.in);
		String s = sc2.nextLine();
		System.out.println("a: " + a + ", s: " + s);

	}
}
