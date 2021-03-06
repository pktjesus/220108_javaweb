package ch16;

import java.util.Arrays;
import java.util.List;

public class Excercise2 {
	// 문제 : List에 저장되어 있는 Member의 평균 나이를 출력
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
				new Member("홍길동", 30),
				new Member("유관순", 40),
				new Member("이순신", 50)
		);
				
		//double avg = list.stream().mapToInt(a -> a.getAge()).average().getAsDouble();	// 함수적 인터페이스 방식
		double avg = list.stream().mapToInt(Member::getAge).average().getAsDouble();	// 메소드 참조 방식
		System.out.println("평균 나이 : " + avg);
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
