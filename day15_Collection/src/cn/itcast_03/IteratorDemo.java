package cn.itcast_03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;



/*
 * �����������ϵ�ר�ñ�����ʽ
 * 
 * 
 */
public class IteratorDemo {
	public static void main(String[] args) {
		//�������϶���
		Collection c = new ArrayList();
		
		//���������Ԫ��
		c.add("hello");
		c.add("world");
		c.add("java");
		
		//Iterator iterator():�����������ϵ�ר�ñ�����ʽ
		Iterator it = c.iterator(); //ʱ�䷵�صĿ϶���������������Ƕ�̬
		
//		Object obj = it.next();
//		System.out.println(obj);
		//System.out.println(it.next());
		
		//�жϲ���ȡ
		while(it.hasNext()){
			//System.out.println(it.next());
			String s = (String) it.next();
			System.out.println(s);
		}
		
		
		
	}
	
}
