package cn.itcast_04;

/*
 * 提高开发效率
 * A：自动提供构造方法
 * B：成对的get/set
 */
public class Student {
	//成员变量
	private String name;
	private int age;
	
	//生成无参构造
	public Student() {
		super();
	}

	//生成带参构造
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
	//生成成对的getXxx()/setXxx()
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
}
