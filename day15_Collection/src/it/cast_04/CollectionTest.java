package it.cast_04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 *  存储字符串并遍历
 * 	
 * 	分析：
 * 		A 创建集合对象
 * 		B 创建字符串对象
 * 		C 把字符串对象添加到集合中
 * 		D 遍历集合
 * 
 */
public class CollectionTest {
	public static void main(String[] args) {
		//创建集合对象
		Collection c = new ArrayList();
		
		//创建字符串对象
		c.add("林青霞");
		c.add("风清扬");
		c.add("刘意");
		c.add("Messi");
		c.add("Ronaldo");
		
		//遍历集合
		Iterator it = c.iterator();
		while(it.hasNext()){
			String s = (String) it.next();
			System.out.println(s);
		}
		
	}
}
