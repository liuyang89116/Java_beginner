package cn.itcast_04;

/*
 * ���� ͳ��һ���ַ����д�д��ĸ�ַ���Сд��ĸ�ַ��������ַ����ֵĴ���
 * 
 * 
 */
public class StringTest2 {
	public static void main(String[] args) {
		// ����ͳ�Ʊ���
		int capitalCount = 0;
		int lowCount = 0;
		int numCount = 0;

		// �����ַ���
		String s = "Hello123World";
		char ch;

		// �����ַ���
		for (int i = 0; i < s.length(); i++) {
			ch = s.charAt(i);
			if (ch >= '0' && ch <= '9') {
				numCount++;
			} else if (ch >= 'a' && ch <= 'z') {
				lowCount++;
			} else if (ch >= 'A' && ch <= 'Z') {
				capitalCount++;
			}
		}

		// �����
		System.out.println("number: " + numCount + "\nlowCount: " + lowCount
				+ "\ncapitalCount: " + capitalCount);

	}
}
