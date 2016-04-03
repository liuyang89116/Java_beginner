package cn.itcast_05;
/*
 * StringBuffer的反转功能
 * 
 * public StringBuffer reverse();
 */
public class StringBufferDemo {
	public static void main(String[] args) {
		//创建字符串缓冲区对象
		StringBuffer sb = new StringBuffer();
		
		//添加数据
		sb.append("Messi");
		
		System.out.println(sb);
		
		//reverse
		System.out.println(sb.reverse());
	}
}
