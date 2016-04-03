package cn.itcast_03;
/*
 * 
 * 删除功能
 * 
 */

public class StringBufferDemo {
	public static void main(String[] args) {
		//创建对象
		StringBuffer sb = new StringBuffer();
		
		//添加
		sb.append("hello").append("world").append("java");
		System.out.println(sb);
		System.out.println("-----------");
		
		/*//删除e这个字符
		//public StringBuffer deleteCharAt(int index)
		sb.deleteCharAt(1);
		System.out.println(sb);
		
		//删除第一“l”
		sb.deleteCharAt(1);
		System.out.println(sb);*/
		
		/*//需求:删除world这个字符
		//public StringBuffer delete(int start, int end)
		sb.delete(5, 10);
		System.out.println(sb);
		System.out.println("-----------");*/
		
		//删除所有
		sb.delete(0, sb.length());
		System.out.println(sb);
		
	}
}
