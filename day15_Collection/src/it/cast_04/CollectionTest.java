package it.cast_04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 *  �洢�ַ���������
 * 	
 * 	������
 * 		A �������϶���
 * 		B �����ַ�������
 * 		C ���ַ���������ӵ�������
 * 		D ��������
 * 
 */
public class CollectionTest {
	public static void main(String[] args) {
		//�������϶���
		Collection c = new ArrayList();
		
		//�����ַ�������
		c.add("����ϼ");
		c.add("������");
		c.add("����");
		c.add("Messi");
		c.add("Ronaldo");
		
		//��������
		Iterator it = c.iterator();
		while(it.hasNext()){
			String s = (String) it.next();
			System.out.println(s);
		}
		
	}
}
