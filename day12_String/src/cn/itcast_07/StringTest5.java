package cn.itcast_07;

/*
 * ͳ�ƴ���С�����ֵĴ���
 * 
 * ������
 * 		�ַ�������woaijavawozhenaijavawozhendeaijavawozhendehenaijavaxinbuxinwoaijavagun��
 * 
 * �����
 * 		java������5��
 * 
 * ������
 * 	  	A ����ͳ�Ʊ�������ʼֵ0
 * 		B ���ڴ��в���һ�Σ�indexOf������
 * 			������-1��˵��������
 * 			��������-1��ͳ�Ʊ���++
 * 		C �ղŵ���������С��������Ϊ��ʼ��ȡ���ϴδ�
 */

public class StringTest5 {
	public static void main(String[] args) {
		// �����ַ���
		String str = "woaijavawozhenaijavawozhendeaijavawozhendehenaijavaxinbuxinwoaijavagun";
		String pattern = "java";

		/*// ����ͳ�Ʊ���
		int sum = 0;

		if (str.indexOf(pattern) == -1) {
			System.out.println("������������java");
		}

		while (true) {
			if (str.indexOf(pattern) == -1) {
				break;
			} else {
				sum++;
				str = str.substring(str.indexOf(pattern) + pattern.length());
			}
		}

		System.out.println(sum);*/
		
		int count = getCount(str, pattern);
		System.out.println(count);
		
	}
	
	
	public static int getCount(String str, String pattern){
		//����ͳ�Ʊ���
		int count = 0;
		
		/*//�Ȳ�һ��
		int index = str.indexOf(pattern);
		
		while(index !=-1 ){
			count++;
			//int startIndex = index + pattern.length();
			str = str.substring(index+pattern.length());
			
			index = str.indexOf(pattern);
		}*/
		
		int index;
		while((index=str.indexOf(pattern)) != -1){
			count++;
			str = str.substring(index+pattern.length());
			
		}
		
		return count;
	}
}
