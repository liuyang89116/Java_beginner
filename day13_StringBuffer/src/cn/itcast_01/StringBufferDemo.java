package cn.itcast_01;

/*
 * �̰߳�ȫ�����̣߳�
 * 
 * ��ȫ--ͬ��--���ݰ�ȫ
 * ����ȫ--��ͬ��--Ч�ʸ�
 * 
 */
public class StringBufferDemo {
	public static void main(String[] args) {
		// public StringBuffer(): �޲ι��췽��
		StringBuffer sb = new StringBuffer();
		System.out.println("sb:" + sb);
		System.out.println("sb(capacity): " + sb.capacity()); // 16 ��ʼ����16
		System.out.println("sb(length): " + sb.length());
		System.out.println("--------------");

		// public StringBUffer(int capacity): ָ������ ���ַ�����������
		StringBuffer sb2 = new StringBuffer(50);
		System.out.println("sb2:" + sb2);
		System.out.println("sb2(capacity): " + sb2.capacity());
		System.out.println("sb2(length): " + sb2.length());
		System.out.println("--------------");

		// public StringBuffer(String str): ָ���ַ������ݵ��ַ�������������
		StringBuffer sb3 = new StringBuffer("hello");
		System.out.println("sb3:" + sb3);
		System.out.println("sb3(capacity): " + sb3.capacity()); // 21 = 16 + 5
		System.out.println("sb3(length): " + sb3.length());
		System.out.println("--------------");
	}
}