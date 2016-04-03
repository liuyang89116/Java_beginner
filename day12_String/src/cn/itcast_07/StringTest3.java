package cn.itcast_07;

import java.util.Scanner;

/*
 * 字符串反转
 * 		键盘录入“abc”
 * 		输出“cba”
 * 
 * 分析：
 * 		倒着遍历字符串
 */
public class StringTest3 {
	public static void main(String[] args) {
		// 用length结合charAt方法
		/*
		 * // 键盘录入 Scanner sc = new Scanner(System.in);
		 * System.out.println("请输入一个字符串： ");
		 * 
		 * // 定义一个字符串 String s = sc.nextLine(); String str="";
		 * 
		 * // 倒着遍历字符串，然后拼接起来 for (int i = s.length() - 1; i >= 0; i--) {
		 * str+=s.charAt(i); }
		 * 
		 * System.out.println(str);
		 */

		// 把字符串转换为字符数组
		// 键盘录入
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个字符串： ");
		String s = sc.nextLine();

		//改进为功能实现
		String str = myReverse(s);
		System.out.println(str);
	}
	
	/*
	 * 返回类型：String
	 * 参数列表：String
	 * 
	 */
	public static String myReverse(String s){
		// 定义一个新字符串
		String str = "";
		
		// 把字符串转换成字符数组
		char[] chs = s.toCharArray();

		// 倒着遍历字符串，得到每一个字符
		for (int i = chs.length- 1; i >= 0; i--) {
			str += chs[i];
		}
		
		return str;
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
