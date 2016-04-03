package cn.itcast_04;

/*
 * 遍历获取字符串中的每一个字符
 * 
 */
public class StringTest {
	public static void main(String[] args) {
		// 定义字符串
		String s = "helloworld";

		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}

	}
}
