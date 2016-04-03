package cn.itcast_03;

/*
 * public boolean equals(object obj)
 */
public class StudentDemo {
	public static void main(String[] args) {
		Student s1 = new Student("林青霞", 27);
		Student s2 = new Student("林青霞", 27);
		System.out.println(s1 == s2); // false 俩对象
		Student s3 = s1;
		System.out.println(s1 == s3); //true 
		System.out.println("-----------");
		
		System.out.println(s1.equals(s2)); //false //obj = s2
		System.out.println(s1.equals(s1)); //true 
		System.out.println(s1.equals(s3)); //true
		
		Student s4 = new Student("风清扬", 30);
		System.out.println(s1.equals(s4));
		System.out.println("-----------");
		
		Demo d = new Demo();
		System.out.println(s1.equals(d)); //cannot be cast 因为向下转型出问题
	}
}

class Demo{}
