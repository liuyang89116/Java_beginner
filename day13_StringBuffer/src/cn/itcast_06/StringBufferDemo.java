package cn.itcast_06;
/*
 * ��ȡ����
 * 		public String substring(int start)
 * 		public String substring(int start, int end)
 * 
 */
public class StringBufferDemo {
	public static void main(String[] args) {
		//�����ַ���������
		StringBuffer sb = new StringBuffer();
		
		//���Ԫ��
		sb.append("hello").append("world").append("java");
		
		//��ȡ����
		//public String substring(int start)
		String s = sb.substring(5);
		System.out.println("s: "+s);
		System.out.println("sb: "+sb);
		
		//public String substring(int start, int end);
		String ss = sb.substring(5, 10);
		System.out.println(ss);
	}
	
}
