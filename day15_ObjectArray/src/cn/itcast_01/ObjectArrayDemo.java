package cn.itcast_01;


/*
 *  ����5��ѧ��������5��ѧ������Ϣ�洢�������У����������飬��ȡÿ���˵�ѧ����Ϣ
 * 
 * 		ѧ����Student
 * 		��Ա������name��age
 * 		���췽�����޲Σ�����
 * 		��Ա������getXxx()/setXxx()
 * 
 * 
 */

public class ObjectArrayDemo {
	public static void main(String[] args) {
		//����ѧ�����飨�������飩
		Student[] students = new Student[5];
		
		//����5��ѧ�����󲢸�ֵ
		Student s1 = new Student("����ϼ", 27);
		Student s2 = new Student("������", 30);
		Student s3 = new Student("����", 30);
		Student s4 = new Student("����֥", 60);
		Student s5 = new Student("������", 35);
		
		//��C�����Ԫ�أ��ŵ�������
		students[0] = s1;
		students[1] = s2;
		students[2] = s3;
		students[3] = s4;
		students[4] = s5;
		
		//����
		for (int i =0; i<students.length; i++){
			//System.out.println(students[i]);
			//��toString()�����Ľ�
			
			Student s = students[i];
			System.out.println(s.getName()+"---"+s.getAge());
			
		}
		
		
		
		
		
	}
}
