package cn.itcast_02;

import java.util.ArrayList;
import java.util.Collection;

/*
 * 练习：用集合存储5个学生对象，并把学生对象遍历
 */
public class StudentDemo {
	public static void main(String[] args) {
		//创建集合对象
		Collection c = new ArrayList();
		
		//创建学生对象
		Student s1 = new Student("林青霞", 27);
		Student s2 = new Student("风清扬", 30);
		Student s3 = new Student("令狐冲", 33);
		Student s4 = new Student("Ronalod", 26);
		Student s5 = new Student("Messi", 28);
		
		//把学生添加到集合
		c.add(s1);
		c.add(s2);
		c.add(s3);
		c.add(s4);
		c.add(s5);
		
		//把集合转成数组
		Object[] objs = c.toArray();
		
		//遍历
		for(int i=0; i< objs.length;i++){
			//System.out.println(objs[i]);
			Student s = (Student) objs[i];
			System.out.println(s.getName()+"---"+s.getAge());
			
		}
		
		
	}
}
