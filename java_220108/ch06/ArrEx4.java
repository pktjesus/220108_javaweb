package ch06;

public class ArrEx4 {

	public static void main(String[] args) {
		String[] arrStr = new String[5];
		System.out.println(arrStr[0]);		// arrStr[0] = null (O), arrStr[0] = "null" (X)
		
		String[] arrStr1 = {"이순신", "홍길동", "김유신"};
		System.out.println("arrStr1 배열의 길이는 " + arrStr1.length);  // 3
		
		for (int i = 0; i < arrStr1.length; i++) {		// 변수배열의 값 출력
			System.out.println(arrStr1[i]);
		}
		
		int[] number = new int[100];		// 0으로 초기화
		// 배열변수에 값을 대입
		for (int i = 0; i < number.length; i++) {
			number[i] = i + 1;
		}
		for (int i = 0; i < number.length; i++) {		// 변수배열의 값 출력
			System.out.println("number[" + i + "] : " + number[i]);
		}
	}

}
