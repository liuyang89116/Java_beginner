package cn.itcast_01;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
	public static void main(String[] args) {
		//���Բ���All�ķ���
		
		
		//�������϶���
		Collection c = new ArrayList();
		
		//boolean add(object obj):���һ��Ԫ��
		//System.out.println("add: "+c.add("hello"));
		c.add("hello");
		c.add("world");
		c.add("java");
		
		//void clear();
		//c.clear();
		
		//boolean remove(Object o): �Ƴ�һ��Ԫ��
		//System.out.println("remove: "+c.remove("hello"));
		//System.out.println("remove: "+c.remove("javaee"));
		
		//boolean contains(Object o)
		//System.out.println("contain: "+c.contains("hello"));
		
		//boolean isEmpty()
		//System.out.println("isEmpty: "+c.isEmpty());
		
		//int size():
		System.out.println("size: "+c.size());
		
		System.out.println("c: "+c);
		
	}
}
