package cn.itcast_01;

public class Student {
	//����
	private String name;
	//����
	private int age;
	
	//�޲ι���
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	//���ι���
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	//get set����
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
