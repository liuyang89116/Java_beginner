package cn.itcast_02;

/*
 * public String toString(): ���ظö�����ַ�����ʾ
 * 
 * �Ѹ�������г�Ա����ֵ��ɷ��ؼ���
 */
public class StudentDemo {
	public static void main(String[] args) {
		Student s = new Student();
		System.out.println(s.hashCode());
		System.out.println(s.getClass().getName());
		System.out.println("------------");
		System.out.println(s.toString()); // cn.itcast_02.Student@6e00321
		System.out.println("---------");
		// toString()������ֵ
		// getClass().getName() + '@' + Integer.toHexString(hashCode())
		// this.getClass().getName()+'@'+Integer.toHexString(this.hashCode())

		//cn.itcast_02.Student@5ced6f0d
		System.out.println(s.getClass().getName() + '@'
				+ Integer.toHexString(s.hashCode()));
		System.out.println(s.toString());
		System.out.println("---------");
		
		//ֱ�������������
		System.out.println(s);
		
	}
}
