package cn.itcast_01;

/*
 * 线程安全（多线程）
 * 
 * 安全--同步--数据安全
 * 不安全--不同步--效率高
 * 
 */
public class StringBufferDemo {
	public static void main(String[] args) {
		// public StringBuffer(): 无参构造方法
		StringBuffer sb = new StringBuffer();
		System.out.println("sb:" + sb);
		System.out.println("sb(capacity): " + sb.capacity()); // 16 初始分配16
		System.out.println("sb(length): " + sb.length());
		System.out.println("--------------");

		// public StringBUffer(int capacity): 指定容量 的字符缓冲区对象
		StringBuffer sb2 = new StringBuffer(50);
		System.out.println("sb2:" + sb2);
		System.out.println("sb2(capacity): " + sb2.capacity());
		System.out.println("sb2(length): " + sb2.length());
		System.out.println("--------------");

		// public StringBuffer(String str): 指定字符串内容的字符串缓冲区对象
		StringBuffer sb3 = new StringBuffer("hello");
		System.out.println("sb3:" + sb3);
		System.out.println("sb3(capacity): " + sb3.capacity()); // 21 = 16 + 5
		System.out.println("sb3(length): " + sb3.length());
		System.out.println("--------------");
	}
}
