package cn.itcast_04;

/*
 * ��߿���Ч��
 * A���Զ��ṩ���췽��
 * B���ɶԵ�get/set
 */
public class Student {
	//��Ա����
	private String name;
	private int age;
	
	//�����޲ι���
	public Student() {
		super();
	}

	//���ɴ��ι���
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
	//���ɳɶԵ�getXxx()/setXxx()
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
