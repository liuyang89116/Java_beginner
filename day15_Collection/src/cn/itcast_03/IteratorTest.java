package cn.itcast_03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


/*
 * ��ϰ�� �ü��ϴ洢5��ѧ�����󣬲���ѧ������������õ�����
 */
public class IteratorTest {
	public static void main(String[] args) {
		//�������϶���
		Collection c = new ArrayList();
		
		//����ѧ������
		Student s1 = new Student("����ϼ", 27);
		Student s2 = new Student("������", 30);
		Student s3 = new Student("�����", 33);
		Student s4 = new Student("Ronalod", 26);
		Student s5 = new Student("Messi", 28);
		
		//��ѧ����ӵ�����
		c.add(s1);
		c.add(s2);
		c.add(s3);
		c.add(s4);
		c.add(s5);
		
		//����������
		Iterator it = c.iterator();
		
		//����
		while(it.hasNext()){
			Student s = (Student) it.next();
			System.out.println(s.getName()+"---"+s.getAge());
		}
		
	}
}
