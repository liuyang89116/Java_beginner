package cn.itcast_07;

import java.util.Scanner;

/*
 * �ַ�����ת
 * 		����¼�롰abc��
 * 		�����cba��
 * 
 * ������
 * 		���ű����ַ���
 */
public class StringTest3 {
	public static void main(String[] args) {
		// ��length���charAt����
		/*
		 * // ����¼�� Scanner sc = new Scanner(System.in);
		 * System.out.println("������һ���ַ����� ");
		 * 
		 * // ����һ���ַ��� String s = sc.nextLine(); String str="";
		 * 
		 * // ���ű����ַ�����Ȼ��ƴ������ for (int i = s.length() - 1; i >= 0; i--) {
		 * str+=s.charAt(i); }
		 * 
		 * System.out.println(str);
		 */

		// ���ַ���ת��Ϊ�ַ�����
		// ����¼��
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ַ����� ");
		String s = sc.nextLine();

		//�Ľ�Ϊ����ʵ��
		String str = myReverse(s);
		System.out.println(str);
	}
	
	/*
	 * �������ͣ�String
	 * �����б�String
	 * 
	 */
	public static String myReverse(String s){
		// ����һ�����ַ���
		String str = "";
		
		// ���ַ���ת�����ַ�����
		char[] chs = s.toCharArray();

		// ���ű����ַ������õ�ÿһ���ַ�
		for (int i = chs.length- 1; i >= 0; i--) {
			str += chs[i];
		}
		
		return str;
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
