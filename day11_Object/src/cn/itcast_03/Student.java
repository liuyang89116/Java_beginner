package cn.itcast_03;

public class Student {
	private String name;
	private int age;

	public Student() {
		super();
	}

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

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

	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	/*@Override
	public boolean equals(Object obj) {
		// return true;
		// �Ľ������ݳ�Ա�����ıȽϽ�����и���
		// this -- s1
		// obj -- s2

		// Ϊ�����Ч��
		if (this == obj) {
			return true;
		}

		// Ϊ�˳���Ľ�׳��
		// ���ж�һ�£�obj�Ƿ���ѧ����һ����������ǣ���������ת�ͣ�������Ƿ���false
		// ��ʱ����Ҫ�жϵ��Ƕ����Ƿ���ĳ����Ķ���
		// ��סһ����ʽ�� ������ instractof ����
		if (!(obj instanceof Student)) {
			return false;
		}

		// ����Ҫ��ʹ��ѧ��������г�Ա����������Ҫ����ת��
		Student s = (Student) obj; // ����ת�� s -- obj -- s2
		
		 * if(this.name.equals(s.name) && this.age == s.age) { return true;
		 * }else{ return false; }
		 

		// System.out.println("ͬһ�����󣬻���Ҫ����ת����");

		return this.name.equals(s.name) && this.age == s.age;
	}*/
	
	
	
}
