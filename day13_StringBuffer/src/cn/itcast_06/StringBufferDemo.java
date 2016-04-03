package cn.itcast_06;
/*
 * 截取功能
 * 		public String substring(int start)
 * 		public String substring(int start, int end)
 * 
 */
public class StringBufferDemo {
	public static void main(String[] args) {
		//创建字符串缓冲区
		StringBuffer sb = new StringBuffer();
		
		//添加元素
		sb.append("hello").append("world").append("java");
		
		//截取功能
		//public String substring(int start)
		String s = sb.substring(5);
		System.out.println("s: "+s);
		System.out.println("sb: "+sb);
		
		//public String substring(int start, int end);
		String ss = sb.substring(5, 10);
		System.out.println(ss);
	}
	
}
