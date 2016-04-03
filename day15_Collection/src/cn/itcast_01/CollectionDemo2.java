package cn.itcast_01;

import java.util.ArrayList;
import java.util.Collection;


/*
 * All的方法
 * 
 * 
 */
public class CollectionDemo2 {
	public static void main(String[] args) {
		//创建集合1
		Collection c1 = new ArrayList();
		c1.add("abc1");
		c1.add("abc2");
		c1.add("abc3");
		c1.add("abc4");
		
		//创建集合2
		Collection c2 = new ArrayList();
		c2.add("abc4");
		c2.add("abc5");
		c2.add("abc6");
		c2.add("abc7");
		
		//boolean addAll(Collection c)
		//System.out.println("addAll: "+c1.addAll(c2));   //可以有重复的元素
		
		//boolean removeAll(Collection c)
		//System.out.println("remvoveAll: "+c1.removeAll(c2));
		
		//boolean containsAll(Collction c)
		//System.out.println("contains: "+c1.containsAll(c2));
		
		//boolean retainAll(Collction c)
		System.out.println("retainAll: " +c1.retainAll(c2));
		
		
		
		
		System.out.println("c1: "+c1);
		System.out.println("c2: "+c2);
		
		
	}
}
