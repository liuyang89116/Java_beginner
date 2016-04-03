package cn.itcast_01;

public class StudentDemo {
	public static void main(String[] args) {
		// 创建对象
		Student s1 = new Student();
		s1.setName("Ronaldo");
		s1.setAge(26);
		System.out.println(s1.getName() + "---" + s1.getAge());
		s1.show();

		// 创建对象
		Student s2 = new Student("Messi", 28);
		System.out.println(s2.getName() + "---" + s2.getAge());
		s2.show();
	}
}
