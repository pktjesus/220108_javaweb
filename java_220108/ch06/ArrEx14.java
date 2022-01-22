package ch06;

public class ArrEx14 {

	public static void main(String[] args) {
		// System.arraycopy 사용하여 배열 복사
		// 원본 배열
		int[] arrInt = {1,2,3};
		
		// 복사할 배열
		int[] arrInt2 = new int[5];

		// 0번째 파라미터 : 복사 원본 배열
		// 1번째 파라미터 : 복사 원본 배열의 시작 인덱스 값
		// 2번째 파라미터 : 복사할 대상 배열
		// 3번째 파라미터 : 복사할 대상 배열의 시작할 인덱스 값
		// 4번째 파라미터 : 복사 원본 배열에서 시작 인덱스 값으로부터 실제 복사할 인덱스 길이
		System.arraycopy(arrInt, 0, arrInt2, 2, arrInt.length);
		
		// 배열 값 출력
		for (int i=0; i<arrInt2.length; i++) {
			System.out.println(arrInt2[i]);
		}
	}

}
