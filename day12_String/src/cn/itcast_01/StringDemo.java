package cn.itcast_01;

/*
 * 字符串
 * 
 */
public class StringDemo {
	public static void main(String[] args) {
		// 方式1：public String()
		String s1 = new String();
		System.out.println("s1: " + s1);
		System.out.println("length: " + s1.length());
		System.out.println("-----------------");

		// 方式2：public String(byte[] bytes)
		byte[] bys = { 97, 98, 99, 100, 101 };
		String s2 = new String(bys);
		System.out.println("s2: " + s2); // abcde
		System.out.println("length: " + s2.length());
		System.out.println("-----------------");

		// 方式3：public String(byte[] bytes, int index, int length)
		String s3 = new String(bys, 1, 3); // bcd
		System.out.println("s3: " + s3);
		System.out.println("length: " + s3.length());
		System.out.println("-----------------");

		// 方式4：public String(char[] value)
		char[] chs = { 'a', 'b', 'c', 'd', 'e', '爱', '我' };
		String s4 = new String(chs);
		System.out.println("s4: " + s4);
		System.out.println("length: " + s4.length());
		System.out.println("-----------------");

		// 方式5：pubilc String(char[] value, int index, int count)
		String s5 = new String(chs, 5, 2);
		System.out.println("s5: " + s5);
		System.out.println("length: " + s5.length());
		System.out.println("-----------------");

		// 方式6：public String(String original)
		String s6 = new String("abcde");
		System.out.println("s6: " + s6);
		System.out.println("length: " + s6.length());
		System.out.println("-----------------");
		
		// 方式7：字符串字面值“abc”也可以看成是一个字符串对象
		String s7 = "abcde";
		System.out.println("s7: " + s7);
		System.out.println("length: " + s7.length());
	}
}
