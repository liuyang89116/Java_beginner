package cn.itcast_04;

/*
 * StringBuffer的替换功能
 * 
 */

public class StringBufferDemo {
	public static void main(String[] args) {
		//创建字符串缓冲区
		StringBuffer sb = new StringBuffer();
		
		//添加数据
		sb.append("hello");
		sb.append("world");
		sb.append("java");
		
		System.out.println(sb);
		//public StirngBuffer replace(int start, int end, String str)
		//需求：把world替换为节日快乐
		sb.replace(5, 10, "节日快乐");
		System.out.println(sb);
	}
}
