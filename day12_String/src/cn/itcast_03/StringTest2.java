package cn.itcast_03;

import java.util.Scanner;

/*
 * ģ���¼�������λ��ᣬ����ʾ���м��Ρ������¼�ɹ����Ϳ����������С��Ϸ�ˡ�
 * 
 * ������
 * 		A:�����û��������룬�Ѵ��ڵ�
 * 		B:����¼���û���������
 * 		C:�Ƚ��û���������
 * ��		�����ͬ���¼�ɹ�
 * 			�����һ�����¼ʧ��
 * 		D�������λ���
 */
public class StringTest2 {
	public static void main(String[] args) {
		// �����û���������
		String username = "admin";
		String password = "admin";

		// �����λ��ᣬ��ѭ���Ľ�
		for (int i = 0; i < 3; i++) {
			// ����¼��
			Scanner sc = new Scanner(System.in);
			System.out.println("�������û�����");
			String name = sc.nextLine();
			System.out.println("���������룺");
			String psw = sc.nextLine();

			// �Ƚ��û���������
			if (name.equals(username) && psw.equals(password)) {
				// ��¼�ɹ�
				System.out.println("��¼�ɹ�����ʼ����Ϸ��");
				//��������Ϸ
				GuessNumberGame.start();
				
			} else {
				// ����ǵ�0�Σ�Ӧ�û�һ����ʾ
				if (i == 2) {
					System.out.println("���Ѿ�û�л����ˡ�");
				} else {
					System.out.println("��¼ʧ��, �㻹��" + (2 - i) + "�λ��ᡣ");
				}
			}

		}
	}

}
