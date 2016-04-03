package cn.itcast_05;

/*
 * 
 * 把一个字符串首字母转成大写，其余小写，只考虑英文大小写字母
 * 
 */
public class StringTest {
	public static void main(String[] args) {
		// 定义一个字符串
		String s = "helloWORLD";

		/*
		 * // 先获取一个字符 String s1 = s.substring(0, 1);
		 * 
		 * // 获取除了第一个字符以外剩下的字符 String s2 = s.substring(1);
		 * 
		 * // s1转换成大写, s2转换成小写 String upperStr = s1.toUpperCase(); String
		 * lowerStr = s2.toLowerCase();
		 * 
		 * // 拼接 String str = upperStr + lowerStr;
		 * 
		 * // 输出 System.out.println(str);
		 */

		// 优化后的代码
		String result = s.substring(0, 1).toUpperCase()
				.concat(s.substring(1).toLowerCase());

		System.out.println(result);

	}
}
