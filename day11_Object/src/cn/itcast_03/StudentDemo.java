package cn.itcast_03;

/*
 * public boolean equals(object obj)
 */
public class StudentDemo {
	public static void main(String[] args) {
		Student s1 = new Student("����ϼ", 27);
		Student s2 = new Student("����ϼ", 27);
		System.out.println(s1 == s2); // false ������
		Student s3 = s1;
		System.out.println(s1 == s3); //true 
		System.out.println("-----------");
		
		System.out.println(s1.equals(s2)); //false //obj = s2
		System.out.println(s1.equals(s1)); //true 
		System.out.println(s1.equals(s3)); //true
		
		Student s4 = new Student("������", 30);
		System.out.println(s1.equals(s4));
		System.out.println("-----------");
		
		Demo d = new Demo();
		System.out.println(s1.equals(d)); //cannot be cast ��Ϊ����ת�ͳ�����
	}
}

class Demo{}
