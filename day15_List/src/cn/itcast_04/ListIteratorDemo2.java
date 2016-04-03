package cn.itcast_04;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/*
 * 问题：
 * 		我有一个集合如下，请问，我想判断里面有没有“world”这个元素，如果有，我就添加一个“javaee”元素，代码实现
 * 
 * ConcurrentModificationException:并发修改异常
 * 		改进方法：
 * 			A.迭代器迭代元素，迭代器修改元素
 * 			B.集合遍历元素，集合修改元素
 * 
 */

public class ListIteratorDemo2 {
	public static void main(String[] args) {
		// 创建List结婚对象
		List list = new ArrayList();
		// 添加元素
		list.add("hello");
		list.add("world");
		list.add("java");

		/*// 迭代器遍历 //错误的
		Iterator it = list.iterator();
		while (it.hasNext()) {
			String s = (String) it.next();
			if (s.equals("world")) {
				list.add("javaee");
			}
		}*/
		
		/*//方式1：迭代器迭代元素，迭代器修改元素
		//而Iterator迭代器却没有添加功能，所以我们使用其子接口，ListIterator
		ListIterator lit = list.listIterator();
		while(lit.hasNext()){
			String s = (String)lit.next();
			if(s.equals("world")){
				lit.add("javaee");
			}
		}*/
		
		//方式2：集合遍历元素，集合修改元素（普通for）
		for(int i=0; i<list.size(); i++){
			String s = (String) list.get(i);
			if(s.equals("world")){
				list.add("javaee");
			}
		}
		
		
		
		
		System.out.println("list: "+list);
	}
	
	

}
