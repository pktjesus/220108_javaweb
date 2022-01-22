package ch06;

public class Exercise4 {

	public static void main(String[] args) {
		// 하나의 배열엔 1부터 10까지 10개의 정수가 저장되어 있다. 각각의 값을 다른 배열의 해당 인덱스 값에
		// 제곱값을 대입하는 코드 작성
		// 예1) num1 = {1,2,3};
		//      num2 = {1,4,9};		
		int[] num1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] num2 = new int[10]; // {0,0,0,0,0,0,0,0,0,0}

		// 코드 작성
		for (int i=0; i<num1.length; i++) {
			num2[i] = num1[i] * num1[i];
		}
		
		// num2 출력
		for (int i=0; i<num2.length; i++) {
			System.out.println(num2[i]);
		}
		System.out.println();
		////////////////////////////////////////////////////////////////
		// 주어진 배열의 항목에서 최대값을 구하는 코드 작성(for문 사용)
		int max = 0;						// 메소드영역(스택)의 메모리에 저장
		int[] array = {1, 5, 3, 8, 2};		// 힙영역의 메모리에 저장
		
		// 코드 작성
		for (int i=0; i<array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		
		System.out.println("max : " + max);		// max : 8
	}
}