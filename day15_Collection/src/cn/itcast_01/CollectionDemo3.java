package cn.itcast_01;

import java.util.ArrayList;
import java.util.Collection;

/*
 * ���ϵı��������λ��ÿһ��Ԫ��
 * 
 * 		Object[] toArray(): �Ѽ���ת�����飬����ʵ�ּ��ϵı���
 */
public class CollectionDemo3 {
	public static void main(String[] args) {
		// �������϶���
		Collection c = new ArrayList();

		// ���Ԫ��
		c.add("hello");
		c.add("world");
		c.add("java");

		// ����
		// Object[] toArray():�Ѽ���ת�����飬����ʵ�ּ��ϵı���
		Object[] objs = c.toArray();

		for (int i = 0; i < objs.length; i++) {
			// System.out.println(objs[i]);
			// ��ȡ�ַ���ͬʱ������֪��Ԫ�صĳ���

			// System.out.println(objs[i]+objs[i].lengh());
			// //����objs[i]û��length��������������ת�ͳ��ַ���
			
			String s = (String) objs[i];
			System.out.println(s+"---"+s.length());

		}

	}
}
