package cn.itcast_04;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/*
 * ���⣺
 * 		����һ���������£����ʣ������ж�������û�С�world�����Ԫ�أ�����У��Ҿ����һ����javaee��Ԫ�أ�����ʵ��
 * 
 * ConcurrentModificationException:�����޸��쳣
 * 		�Ľ�������
 * 			A.����������Ԫ�أ��������޸�Ԫ��
 * 			B.���ϱ���Ԫ�أ������޸�Ԫ��
 * 
 */

public class ListIteratorDemo2 {
	public static void main(String[] args) {
		// ����List������
		List list = new ArrayList();
		// ���Ԫ��
		list.add("hello");
		list.add("world");
		list.add("java");

		/*// ���������� //�����
		Iterator it = list.iterator();
		while (it.hasNext()) {
			String s = (String) it.next();
			if (s.equals("world")) {
				list.add("javaee");
			}
		}*/
		
		/*//��ʽ1������������Ԫ�أ��������޸�Ԫ��
		//��Iterator������ȴû����ӹ��ܣ���������ʹ�����ӽӿڣ�ListIterator
		ListIterator lit = list.listIterator();
		while(lit.hasNext()){
			String s = (String)lit.next();
			if(s.equals("world")){
				lit.add("javaee");
			}
		}*/
		
		//��ʽ2�����ϱ���Ԫ�أ������޸�Ԫ�أ���ͨfor��
		for(int i=0; i<list.size(); i++){
			String s = (String) list.get(i);
			if(s.equals("world")){
				list.add("javaee");
			}
		}
		
		
		
		
		System.out.println("list: "+list);
	}
	
	

}
