package cn.itcast_03;
/*
 * 
 * ɾ������
 * 
 */

public class StringBufferDemo {
	public static void main(String[] args) {
		//��������
		StringBuffer sb = new StringBuffer();
		
		//���
		sb.append("hello").append("world").append("java");
		System.out.println(sb);
		System.out.println("-----------");
		
		/*//ɾ��e����ַ�
		//public StringBuffer deleteCharAt(int index)
		sb.deleteCharAt(1);
		System.out.println(sb);
		
		//ɾ����һ��l��
		sb.deleteCharAt(1);
		System.out.println(sb);*/
		
		/*//����:ɾ��world����ַ�
		//public StringBuffer delete(int start, int end)
		sb.delete(5, 10);
		System.out.println(sb);
		System.out.println("-----------");*/
		
		//ɾ������
		sb.delete(0, sb.length());
		System.out.println(sb);
		
	}
}
