package cn.itcast_03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


/*
 *  问题1： 用for循环改进
 * 	问题2：不要多次使用it.next()方法
 * 
 */
public class IteratorTest2 {
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
		
		//创建迭代器
		Iterator it = c.iterator();
		
		//遍历
		while(it.hasNext()){
			Student s = (Student) it.next();
			System.out.println(s.getName()+"---"+s.getAge());
		}
//		System.out.println("-------------------------");
		
		
//		//for循环改写， 效率高
//		for(Iterator it = c.iterator(); it.hasNext();){
//			Student s = (Student) it.next();
//			System.out.println(s.getName()+"---"+s.getAge());
//		}
		
		
	}
}
