package ch16;

import java.util.Arrays;
import java.util.List;

// 문제 : List에 저장되어 있는 String 요소에서 대소문자와 상관없이 "java"라는 단어가 포함된 문자열만 필터링해서 출력
// Hint : String의 toLowerCase와 contains 메소드를 사용
public class Excercise1 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList(
				"This is a java book",
				"Lambda Expressions",
				"Java8 supports lambda expressions"
		);

		// 실행결과 : This is a java book
		//          Java8 supports lambda expressions
		list.stream()
		// 코드작성
		.filter(a -> a.toLowerCase().contains("java"))
		//.filter(a -> a.contains("java") && a.toLowerCase().equals("java"))
		.forEach(a -> System.out.println(a));
	}

}
