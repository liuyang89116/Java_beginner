package cn.itcast_07;

/*
 * �������е����ݰ�ָ����ʽƴ�ӳ�һ���ַ���
 * 
 * eg�� 
 * 		int[] arr = {1,2,3}
 * 		�����"[1,2,3]"
 * 
 * �Ѵ����ù���ʵ��
 * 
 */
public class StringTest2 {
	public static void main(String[] args) {
		// ��������
		int[] arr = { 1, 2, 3 };

		// дһ������ʵ��
		String s= arrayToString(arr);
		System.out.println(s);

	}

	/*
	 * д����������ȷ�� ����ֵ���ͣ�String
	 * 
	 * �����б�: int[] arr
	 */

	public static String arrayToString(int[] arr) {
		String s = "";
		s += "[";
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				s += arr[i] + "]";
			} else {
				s += arr[i]+", ";
			}

		}
		
		return s;

	}
}
