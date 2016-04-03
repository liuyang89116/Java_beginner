package cn.itcast_07;

/*
 * 把数组中的数据按指定格式拼接成一个字符串
 * 
 * eg： 
 * 		int[] arr = {1,2,3}
 * 		输出："[1,2,3]"
 * 
 */
public class StringTest {
	public static void main(String[] args) {
		// 数组
		int[] arr = { 1, 2, 3 };

		// 定义一个字符串对象，内容为空
		String s = "";

		// 先拼接一个[
		s += "[";

		// 遍历int数组，得到每一个元素
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				s += arr[i] + "]";
			} else {
				s += arr[i]+",";
			}
		}
		
		//输出
		System.out.println(s);

	}
}
