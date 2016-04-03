package cn.itcast_02;

/*
 * public String toString(): 返回该对象的字符串表示
 * 
 * 把该类的所有成员变量值组成返回即可
 */
public class StudentDemo {
	public static void main(String[] args) {
		Student s = new Student();
		System.out.println(s.hashCode());
		System.out.println(s.getClass().getName());
		System.out.println("------------");
		System.out.println(s.toString()); // cn.itcast_02.Student@6e00321
		System.out.println("---------");
		// toString()方法的值
		// getClass().getName() + '@' + Integer.toHexString(hashCode())
		// this.getClass().getName()+'@'+Integer.toHexString(this.hashCode())

		//cn.itcast_02.Student@5ced6f0d
		System.out.println(s.getClass().getName() + '@'
				+ Integer.toHexString(s.hashCode()));
		System.out.println(s.toString());
		System.out.println("---------");
		
		//直接输出对象名称
		System.out.println(s);
		
	}
}
