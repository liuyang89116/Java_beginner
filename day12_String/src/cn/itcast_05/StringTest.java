package cn.itcast_05;

/*
 * 
 * ��һ���ַ�������ĸת�ɴ�д������Сд��ֻ����Ӣ�Ĵ�Сд��ĸ
 * 
 */
public class StringTest {
	public static void main(String[] args) {
		// ����һ���ַ���
		String s = "helloWORLD";

		/*
		 * // �Ȼ�ȡһ���ַ� String s1 = s.substring(0, 1);
		 * 
		 * // ��ȡ���˵�һ���ַ�����ʣ�µ��ַ� String s2 = s.substring(1);
		 * 
		 * // s1ת���ɴ�д, s2ת����Сд String upperStr = s1.toUpperCase(); String
		 * lowerStr = s2.toLowerCase();
		 * 
		 * // ƴ�� String str = upperStr + lowerStr;
		 * 
		 * // ��� System.out.println(str);
		 */

		// �Ż���Ĵ���
		String result = s.substring(0, 1).toUpperCase()
				.concat(s.substring(1).toLowerCase());

		System.out.println(result);

	}
}
