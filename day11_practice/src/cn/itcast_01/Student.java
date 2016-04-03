package cn.itcast_01;

public class Student {
	//姓名
	private String name;
	//年龄
	private int age;
	
	//无参构造
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	//带参构造
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	//get set方法
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
	
	public void show(){
		System.out.println("name: "+ name + ", age: "+ age);
	}
	
	
}
