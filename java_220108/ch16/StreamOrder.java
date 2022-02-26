package ch16;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("홍길동", "김유신", "이순신", "유관순");
		
		System.out.println("기본 정렬");
		//list.stream().sorted().forEach(s -> System.out.println(s));	// 함수적 인터페이스 기본 방식
		list.stream().sorted().forEach(System.out::println);		// 메소드 참조 방식
		System.out.println();
		
		System.out.println("역순 정렬");
		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}

}
