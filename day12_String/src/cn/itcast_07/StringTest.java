package cn.itcast_07;

/*
 * �������е����ݰ�ָ����ʽƴ�ӳ�һ���ַ���
 * 
 * eg�� 
 * 		int[] arr = {1,2,3}
 * 		�����"[1,2,3]"
 * 
 */
public class StringTest {
	public static void main(String[] args) {
		// ����
		int[] arr = { 1, 2, 3 };

		// ����һ���ַ�����������Ϊ��
		String s = "";

		// ��ƴ��һ��[
		s += "[";

		// ����int���飬�õ�ÿһ��Ԫ��
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				s += arr[i] + "]";
			} else {
				s += arr[i]+",";
			}
		}
		
		//���
		System.out.println(s);

	}
}
