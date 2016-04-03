package cn.itcast_05;

/*
 * String��ת������
 * 
 */
public class StringDemo {
	public static void main(String[] args) {
		// ����һ���ַ�������
		String s = "JavaSE";

		// byte[] getBytes(): ���ַ���ת��Ϊ�ֽ�����
		byte[] bys = s.getBytes();
		for (int i = 0; i < s.length(); i++) {
			System.out.println(bys[i]);
		}
		System.out.println("-----------------");

		// char[] toCharArray()
		char[] chs = s.toCharArray();

		for (int i = 0; i < s.length(); i++) {
			System.out.println(chs[i]);
		}
		System.out.println("-----------------");

		// static String valueOf(char[] chs) �ַ�����ת��Ϊ�ַ���
		String ss = String.valueOf(chs);
		System.out.println(ss);
		System.out.println("-----------------");

		// static String valueOf(int i)
		int x = 100;
		String sss = String.valueOf(x);
		System.out.println(sss); // 100, �������ַ�������
		System.out.println("-----------------");

		// String toLowerCase()
		System.out.println("lowercase: " + s.toLowerCase());
		System.out.println(s);
		System.out.println("-----------------");

		// String toUpperCase()
		System.out.println("uppercase: " + s.toUpperCase());
		System.out.println(s);
		System.out.println("-----------------");

		// String concat(String str)
		String s1 = "hello";
		String s2 = "world";
		String s3 = s1 + s2;
		String s4 = s1.concat(s2);
		System.out.println("s3: " + s3);
		System.out.println("s4: " + s4);

	}
}
