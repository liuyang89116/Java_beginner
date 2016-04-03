package cn.itcast_03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;



/*
 * 迭代器，集合的专用遍历方式
 * 
 * 
 */
public class IteratorDemo {
	public static void main(String[] args) {
		//创建集合对象
		Collection c = new ArrayList();
		
		//创建并添加元素
		c.add("hello");
		c.add("world");
		c.add("java");
		
		//Iterator iterator():迭代器，集合的专用遍历方式
		Iterator it = c.iterator(); //时间返回的肯定是子类对象，这里是多态
		
//		Object obj = it.next();
//		System.out.println(obj);
		//System.out.println(it.next());
		
		//判断并获取
		while(it.hasNext()){
			//System.out.println(it.next());
			String s = (String) it.next();
			System.out.println(s);
		}
		
		
		
	}
	
}
