package ch16;

import java.util.stream.Stream;

public class StreamByBuilder {

	public static void main(String[] args) {
		// stream에 자체 데이터 삽입하기 -> builder메소드로 Builder객체 생성
		// 메소드 체이닝 기능 사용
		Stream stream = Stream.builder()
						   .add("무궁화")
						   .add("삼천리")
						   .add("화려강산")
						   .add("대한사람")
						   .build();		
		stream.forEach(s -> System.out.println(s));		// 세로로 출력
		//stream.forEach(s -> System.out.print(s + " "));	// 가로로 출력
	}
}
