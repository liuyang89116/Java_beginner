package cn.itcast_04;

/*
 * 需求： 统计一个字符串中大写字母字符，小写字母字符，数字字符出现的次数
 * 
 * 
 */
public class StringTest2 {
	public static void main(String[] args) {
		// 定义统计变量
		int capitalCount = 0;
		int lowCount = 0;
		int numCount = 0;

		// 定义字符串
		String s = "Hello123World";
		char ch;

		// 遍历字符串
		for (int i = 0; i < s.length(); i++) {
			ch = s.charAt(i);
			if (ch >= '0' && ch <= '9') {
				numCount++;
			} else if (ch >= 'a' && ch <= 'z') {
				lowCount++;
			} else if (ch >= 'A' && ch <= 'Z') {
				capitalCount++;
			}
		}

		// 输出：
		System.out.println("number: " + numCount + "\nlowCount: " + lowCount
				+ "\ncapitalCount: " + capitalCount);

	}
}
