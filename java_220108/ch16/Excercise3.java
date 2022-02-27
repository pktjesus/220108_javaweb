package ch16;

import java.util.Arrays;
import java.util.List;

import ch16.Excercise2.Member;

public class Excercise3 {
	// 문제 : List에 저장되어 있는 Member 중에서 직업이 "개발자"인 사람만 별도의 List에 수집하도록 코드 작성
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
				new Member("홍길동", "개발자"),
				new Member("유관순", "디자이너"),
				new Member("이순신", "개발자")
		);
				
		List<Member> developers = list.stream()
									// 코드작성
				
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
