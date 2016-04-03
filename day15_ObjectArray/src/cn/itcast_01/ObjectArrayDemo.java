package cn.itcast_01;


/*
 *  我有5个学生，把这5个学生的信息存储到数组中，并遍历数组，获取每个人的学生信息
 * 
 * 		学生：Student
 * 		成员变量：name，age
 * 		构造方法：无参，带参
 * 		成员方法：getXxx()/setXxx()
 * 
 * 
 */

public class ObjectArrayDemo {
	public static void main(String[] args) {
		//创建学生数组（对象数组）
		Student[] students = new Student[5];
		
		//创建5个学生对象并赋值
		Student s1 = new Student("林青霞", 27);
		Student s2 = new Student("风清扬", 30);
		Student s3 = new Student("刘意", 30);
		Student s4 = new Student("赵雅芝", 60);
		Student s5 = new Student("王力宏", 35);
		
		//把C步骤的元素，放到数组中
		students[0] = s1;
		students[1] = s2;
		students[2] = s3;
		students[3] = s4;
		students[4] = s5;
		
		//遍历
		for (int i =0; i<students.length; i++){
			//System.out.println(students[i]);
			//用toString()方法改进
			
			Student s = students[i];
			System.out.println(s.getName()+"---"+s.getAge());
			
		}
		
		
		
		
		
	}
}
