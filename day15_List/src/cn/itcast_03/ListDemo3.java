package cn.itcast_03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * 存储自定义对象并遍历
 * 
 */
public class ListDemo3 {
	public static void main(String[] args) {
		// 创建集合对象
		List list = new ArrayList();

		// 创建集合对象
		Student s1 = new Student("林黛玉", 18);
		Student s2 = new Student("刘姥姥", 88);
		Student s3 = new Student("王熙凤", 38);

		// 把学生添加到集合中
		list.add(s1);
		list.add(s2);
		list.add(s3);

		// 遍历
		// 迭代器遍历
		/*
		 * Iterator it = list.iterator(); while(it.hasNext()){ Student s =
		 * (Student) it.next();
		 * System.out.println(s.getName()+"---"+s.getAge()); }
		 */

		// 特有遍历
		for (int i = 0; i < list.size(); i++) {
			Student s = (Student) list.get(i);
			System.out.println(s.getName() + "---" + s.getAge());
		}

	}
}
