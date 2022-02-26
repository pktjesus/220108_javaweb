package ch16;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayToStream {

	public static void main(String[] args) {
		// 문자열 배열객체생성
		String[] arr = new String[] { "a", "b", "c", "d" };	// 선언과 동시에 초기화
		
		Stream<String> stream1 = Arrays.stream(arr);		// 배열전체를 Stream객체로 변환
		stream1.forEach(s -> System.out.print(s + " "));	// a b c d
		System.out.println();
		
		Stream<String> stream2 = Arrays.stream(arr, 1, 3);	// 인덱스를 지정해서 변환(1에서 3전까지)
		stream2.forEach(s -> System.out.print(s + " "));	// b c
	}

}
