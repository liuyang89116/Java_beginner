package cn.itcast_03;
/*
 * list�������б���
 */
import java.util.ArrayList;
import java.util.List;

public class ListDemo2 {
	public static void main(String[] args) {
		// ��������Ԫ��
		List list = new ArrayList();

		// ���Ԫ��
		list.add("hello");
		list.add("world");
		list.add("java");

		// Object get(int index)
		// System.out.println(list.get(0));
		// System.out.println(list.get(1));
		// System.out.println(list.get(2));

		// ��ѭ���Ľ�
		for (int i = 0; i < list.size(); i++) {
			String s = (String) list.get(i);
			System.out.println(s);
		}

	}
}
