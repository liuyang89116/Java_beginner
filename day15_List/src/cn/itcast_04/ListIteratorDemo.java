package cn.itcast_04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/*
 * 列表迭代器
 */
public class ListIteratorDemo {
	public static void main(String[] args) {
		//创建List集合对象
		List list = new ArrayList();
		list.add("hello");
		list.add("world");
		list.add("java");
		
		//ListIterator listIterator()
		ListIterator lit = list.listIterator(); //子类对象
		while(lit.hasNext()){
			String s = (String) lit.next();
			System.out.println(s);
		}
		System.out.println("-----------");
		
		while(lit.hasPrevious()){
			String s = (String) lit.previous();
			System.out.println(s);
		}
		
		System.out.println("-----------");
		
		//迭代器
		Iterator it = list.iterator();
		while(it.hasNext()){
			String s = (String) it.next();
			System.out.println(s);
		}
		
		
	}
}
