package cn.itcast_01;

import java.util.ArrayList;
import java.util.Collection;

/*
 * 集合的遍历：依次获得每一个元素
 * 
 * 		Object[] toArray(): 把集合转成数组，可以实现集合的遍历
 */
public class CollectionDemo3 {
	public static void main(String[] args) {
		// 创建集合对象
		Collection c = new ArrayList();

		// 添加元素
		c.add("hello");
		c.add("world");
		c.add("java");

		// 遍历
		// Object[] toArray():把集合转成数组，可以实现集合的遍历
		Object[] objs = c.toArray();

		for (int i = 0; i < objs.length; i++) {
			// System.out.println(objs[i]);
			// 获取字符串同时，还想知道元素的长度

			// System.out.println(objs[i]+objs[i].lengh());
			// //错误，objs[i]没有length方法，必须先下转型成字符串
			
			String s = (String) objs[i];
			System.out.println(s+"---"+s.length());

		}

	}
}
