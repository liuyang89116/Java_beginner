package cn.itcast_03;

import java.util.ArrayList;
import java.util.List;

/*
 * List���й���
 * 
 */
public class ListDemo {
	public static void main(String[] args) {
		//�������϶���
		List list = new ArrayList();
		
		//���Ԫ��
		list.add("hello");
		list.add("world");
		list.add("java");
		
		
		//void add(int index, Object element):��ָ��λ�����Ԫ��
		//list.add(1,"android");
		//list.add(11,"javaee"); //Խ��
		//list.add(3,"javaee");
		
		//Object get(int index)
		//System.out.println("get(1): "+list.get(1));
		
		//Object remove(int index)
		//System.out.println("remove: "+list.remove(1));
		
		//Object set(int index, Object element)
		//System.out.println("set: "+list.set(1,"javaee"));
		
		
		
		
		
		
		
		System.out.println("list: "+list);
	}
}
