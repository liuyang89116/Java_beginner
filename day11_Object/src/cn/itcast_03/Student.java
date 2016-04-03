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
		// 改进，根据成员变量的比较结果进行更改
		// this -- s1
		// obj -- s2

		// 为了提高效率
		if (this == obj) {
			return true;
		}

		// 为了程序的健壮性
		// 先判断一下，obj是否是学生的一个对象，如果是，再做向下转型，如果不是返回false
		// 这时我们要判断的是对象是否是某个类的对象？
		// 记住一个格式： 对象名 instractof 类名
		if (!(obj instanceof Student)) {
			return false;
		}

		// 我们要是使用学生类的特有成员变量，所以要向下转型
		Student s = (Student) obj; // 向下转型 s -- obj -- s2
		
		 * if(this.name.equals(s.name) && this.age == s.age) { return true;
		 * }else{ return false; }
		 

		// System.out.println("同一个对象，还需要向下转型吗？");

		return this.name.equals(s.name) && this.age == s.age;
	}*/
	
	
	
}
