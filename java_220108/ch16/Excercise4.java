package ch16;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import ch16.Excercise3.Member;

public class Excercise4 {

	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
				new Member("ȫ�浿", "������"),
				new Member("������", "�����̳�"),
				new Member("�̼���", "������")
		);
		
		Map<String, List<String>> groupingMap = list.stream()
												// �ڵ��ۼ�
				
		System.out.println("[������] ");
		groupingMap.get("������").stream().forEach(s -> System.out.print(s + " "));
		System.out.println("\n[�����̳�] ");
		groupingMap.get("�����̳�").stream().forEach(s -> System.out.print(s + " "));
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
