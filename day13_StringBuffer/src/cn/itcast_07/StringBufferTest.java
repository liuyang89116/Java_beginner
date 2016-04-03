package cn.itcast_07;

/*
 * String和StringBuffer 相互转换 
 * 
 */

public class StringBufferTest {
	public static void main(String[] args) {
		
		String s = "hello";
		//StringBuffer sb = "hello";
		//StringBuffer sb = s;
		
		
		//String转为StringBuffer
		//方式1：通过构造方法
		StringBuffer sb = new StringBuffer(s);
		
		//方式2：通过append
		StringBuffer sb2 = new StringBuffer();
		sb2.append(s);
		System.out.println("sb: "+sb);
		System.out.println("sb2: "+sb2);
		System.out.println("----------------");
		
		//StringBuffer转为String
		StringBuffer buffer = new StringBuffer("java");
		//String(StringBuffer buffer)
		//方式1：通过构造方法
		String str = new String(buffer);
		//方式2：通过toString()
		String str2 = buffer.toString();
		
		System.out.println("str: "+str);
		System.out.println("str2: "+str2);
		
		
	}
}
