package ch06;

import java.util.Arrays;

public class ArrEx15 {

	public static void main(String[] args) {
		// Arrays 사용하여 배열 복사
		// 원본 배열
		int[] arrInt = {1,2,3};
		
		// 복사할 배열
		int[] arrInt2 = Arrays.copyOf(arrInt, 5);

		// 배열 값 출력
		for (int i=0; i<arrInt2.length; i++) {
			System.out.println(arrInt2[i]);
		}
		
		int[] arr = {1,2,3};		
		//int arr[3];		// 배열 사용 문법 에러
		//int[] arr = new int[3];
		//int arr[3] = new int[3]; // 배열 사용 문법 에러
	}

}
