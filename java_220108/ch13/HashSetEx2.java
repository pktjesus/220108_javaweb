package ch13;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx2 {

	public static void main(String[] args) {
		// HashSet 객체 생성
		Set set = new HashSet();
		// 문자열 객체 두개 추가
		System.out.println(set.add(new String("abc")));		// true
		System.out.println(set.add(new String("abc")));		// false
		System.out.println(set.add("abc"));		// false
		
		// Member 객체 두개 추가(사용자 정의 클래스)
		// set은 equals가 true이고 같은 hashCode값 일때 중복으로 인식
		Member m1 = new Member(1, "홍길동", 40);
		Member m2 = new Member(2, "홍길동", 40);
		System.out.println("m1의 해시코드 : " + m1.hashCode());		
		System.out.println("m2의 해시코드 : " + m2.hashCode());
		System.out.println(set.add(m1));		// true
		System.out.println(set.add(m2));		// 
		
		// 출력
		System.out.println(set);	// abc, [홍길동,40], [고길동,40]
	}

}
