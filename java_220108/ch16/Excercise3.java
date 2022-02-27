package ch16;

import java.util.Arrays;
import java.util.List;

import ch16.Excercise2.Member;

public class Excercise3 {
	// ���� : List�� ����Ǿ� �ִ� Member �߿��� ������ "������"�� ����� ������ List�� �����ϵ��� �ڵ� �ۼ�
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
				new Member("ȫ�浿", "������"),
				new Member("������", "�����̳�"),
				new Member("�̼���", "������")
		);
				
		List<Member> developers = list.stream()
									// �ڵ��ۼ�
				
		developers.stream().forEach(m -> System.out.println(m.getName()));				
	}
	
	static class Member {
		private String name;
		private String job;
		
		public Member(String name, String job) {
			this.name = name;
			this.job = job;
		}
		
		public String getName() { return name; }
		public String getJob() { return job; }
	}

}
