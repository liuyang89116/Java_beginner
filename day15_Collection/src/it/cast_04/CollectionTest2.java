package it.cast_04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * 需求：存储自定义对象并遍历Student(name, age)
 * 
 */
public class CollectionTest2 {
	public static void main(String[] args) {
		//创建集合对象
		Collection c = new ArrayList();
		
		//创建学生对象
		Student s1 = new Student("林青霞", 27);
		Student s2 = new Student("风清扬", 30);
		Student s3 = new Student("刘意", 29);
		Student s4 = new Student("Messi", 26);
		Student s5 = new Student("Ronoldo", 23);
		
		//把学生对象加入到集合中
		c.add(s1);
		c.add(s2);
		c.add(s3);
		c.add(s4);
		c.add(s5);
		
		//遍历
		Iterator it = c.iterator();
		
		while(it.hasNext()){
			Student s = (Student) it.next();
			System.out.println(s.getName()+"---"+s.getAge());
		}
		
		
	}
}
