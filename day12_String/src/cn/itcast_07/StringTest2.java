package cn.itcast_07;

/*
 * 把数组中的数据按指定格式拼接成一个字符串
 * 
 * eg： 
 * 		int[] arr = {1,2,3}
 * 		输出："[1,2,3]"
 * 
 * 把代码用功能实现
 * 
 */
public class StringTest2 {
	public static void main(String[] args) {
		// 定义数组
		int[] arr = { 1, 2, 3 };

		// 写一个功能实现
		String s= arrayToString(arr);
		System.out.println(s);

	}

	/*
	 * 写方法两个明确： 返回值类型：String
	 * 
	 * 参数列表: int[] arr
	 */

	public static String arrayToString(int[] arr) {
		String s = "";
		s += "[";
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				s += arr[i] + "]";
			} else {
				s += arr[i]+", ";
			}

		}
		
		return s;

	}
}
