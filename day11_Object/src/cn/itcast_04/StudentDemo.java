package cn.itcast_04;

/*
 * protected void finalize()
 * protected Object clone()
 * 	
 */

public class StudentDemo {
	public static void main(String[] args) throws CloneNotSupportedException {
		// ����ѧ������
		Student s = new Student();
		s.setName("Ronaldo");
		s.setAge(26);
		// ��¡ѧ������
		Object obj = s.clone();
		Student s2 = (Student) obj;
		System.out.println("-----------");
		System.out.println(s.getName() + "---" + s.getAge());
		System.out.println(s2.getName() + "---" + s2.getAge());
		System.out.println("-----------");

		// ��ǰ������
		Student s3 = s;
		System.out.println(s3.getName() + "---" + s3.getAge());
		System.out.println("-----------");
		
		//����
		s3.setName("Messi");
		s3.setAge(23);
		System.out.println(s.getName() + "---" + s.getAge());
		System.out.println(s2.getName() + "---" + s2.getAge());
		System.out.println(s3.getName() + "---" + s3.getAge());
		

	}
}
