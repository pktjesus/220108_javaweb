package ch16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class StreamMap {

	// 웹에서 바로 실행하고 확인이 가능한 사이트들 모음
	// https://blog.gaerae.com/2015/06/website-run-execute-code-online.html
	public static void main(String[] args) {
		List<String> list = Arrays.asList("동해물과", "백두산이", 
				"마르고 닳도록");

		System.out.println("함수적 인터페이스 방식");
		list.stream().mapToInt(s -> s.length()).forEach(len -> System.out.println(len));// 4 4 7
		System.out.println();
		
		System.out.println("메서드 참조 방식");
		list.stream().mapToInt(String::length).forEach(len -> System.out.println(len));	// 4 4 7
		
		/////////////////////////////////////////////////////////////////////////////////////
		int intArr[] = {10,20,30,40,50,60};
		
		// double타입의 요소를 갖는 DoubleStream으로 형변환
		Arrays.stream(intArr).asDoubleStream().forEach(d -> System.out.println(d));
		System.out.println();
		
		// int타입의 요소를 갖는 Stream<Integer>으로 형변환
		Arrays.stream(intArr).boxed().forEach(i -> System.out.println(i.getClass()));
		
		
	}

}
