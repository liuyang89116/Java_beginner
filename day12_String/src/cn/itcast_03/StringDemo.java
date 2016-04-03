package cn.itcast_03;

/*
 * �жϹ��ܣ�
 * 
 * 
 */
public class StringDemo {
	public static void main(String[] args) {
		// �����ַ�������
		String s1 = "helloworld";
		String s2 = "helloworld";
		String s3 = "HelloWorld";

		// boolean equals(Object obj)
		System.out.println("equals: " + s1.equals(s2));
		System.out.println("equals: " + s1.equals(s3));
		System.out.println("-------------------");

		// boolean equalsIgnoreCase(String str)
		System.out.println("equals: " + s1.equalsIgnoreCase(s2));
		System.out.println("equals: " + s1.equalsIgnoreCase(s3));
		System.out.println("-------------------");

		// boolean contains(String str)
		System.out.println("contains: " + s1.contains("hello"));
		System.out.println("contains: " + s1.contains("hw")); // false
		System.out.println("-------------------");

		// boolean startsWith(String str)
		System.out.println("startsWith: " + s1.startsWith("h"));
		System.out.println("startsWith: " + s1.startsWith("hello"));
		System.out.println("startsWith: " + s1.startsWith("word"));
		System.out.println("-------------------");

		// boolean endsWith(String str)
		System.out.println("endsWith: " + s1.endsWith("d"));
		System.out.println("endsWith: " + s1.endsWith("world"));
		System.out.println("endsWith: " + s1.endsWith("hello"));
		System.out.println("-------------------");

		// boolean isEmpty()
		System.out.println("isEmpty: " + s1.isEmpty());

		String s4 = "";
		String s5 = null;
		System.out.println("s4 isEmpty: " + s4.isEmpty());
		//System.out.println("s5 isEmpty: " + s5.isEmpty()); // ��ָ���쳣 ���󶼲����ڣ���ô�ܵ�����

	}

}
