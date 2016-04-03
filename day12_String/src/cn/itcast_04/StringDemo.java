package cn.itcast_04;
/*
 * 类获取功能
 * 
 * 
 */
public class StringDemo {
	public static void main(String[] args) {
		//定义一个字符串
		String s = "helloworld";
		
		//int length():截取字符串长度
		System.out.println("length: "+s.length());
		System.out.println("---------------");
		
		//char charAt(int index)
		System.out.println("charAt: "+s.charAt(4)); //o
		System.out.println("---------------");
		
		//int indexOf(int char)
		System.out.println("indexOf: "+ s.indexOf('l'));
		System.out.println("---------------");
	
		//int indexOf(String str)
		System.out.println("indexOf: "+s.indexOf("hello"));
		System.out.println("indexOf: "+s.indexOf("owo"));
		System.out.println("---------------");
		
		//int indexOf(int ch, int fromIndex)
		System.out.println("indexOf: "+s.indexOf('l', 4));
		System.out.println("indexOf: "+s.indexOf('k', 4)); //-1
		System.out.println("indexOf: "+s.indexOf('l', 40)); //-1  没有的话，返回-1
		System.out.println("---------------");
		
		//int indexOf(String str, int fromIndex)
		System.out.println("indexOf: "+s.indexOf("or",2));
		System.out.println("---------------");
		
		//String substring(int start)
		System.out.println("substring: "+s.substring(5)); //world
		System.out.println("substring: "+s.substring(0));
		System.out.println("---------------");
		
		//String substring(int start, int end)
		System.out.println("substring: "+s.substring(5,8)); //wor
		System.out.println("substring: "+s.substring(0, s.length())); //helloworld
		
	}
}
