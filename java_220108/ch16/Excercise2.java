package ch16;

import java.util.Arrays;
import java.util.List;

public class Excercise2 {

	// ���� : List�� ����Ǿ� �ִ� Member�� ��� ���̸� ���
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
				new Member("ȫ�浿", 30),
				new Member("������", 40),
				new Member("�̼���", 50)
		);
				
		double ave = list.stream()
					 // �ڵ��ۼ�
					 

		System.out.println("��� ���� : " + avg);
	}
	
	static class Member {
		private String name;
		private int age;
		
		public Member(String name, int age) {
			this.name = name;
			this.age = age;
		}
		
		public String getName() { return name; }
		public int getAge() { return age; }
	}

}
