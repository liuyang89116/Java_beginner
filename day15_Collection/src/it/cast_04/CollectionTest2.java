package it.cast_04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * ���󣺴洢�Զ�����󲢱���Student(name, age)
 * 
 */
public class CollectionTest2 {
	public static void main(String[] args) {
		//�������϶���
		Collection c = new ArrayList();
		
		//����ѧ������
		Student s1 = new Student("����ϼ", 27);
		Student s2 = new Student("������", 30);
		Student s3 = new Student("����", 29);
		Student s4 = new Student("Messi", 26);
		Student s5 = new Student("Ronoldo", 23);
		
		//��ѧ��������뵽������
		c.add(s1);
		c.add(s2);
		c.add(s3);
		c.add(s4);
		c.add(s5);
		
		//����
		Iterator it = c.iterator();
		
		while(it.hasNext()){
			Student s = (Student) it.next();
			System.out.println(s.getName()+"---"+s.getAge());
		}
		
		
	}
}
