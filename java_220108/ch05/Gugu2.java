package ch05;

public class Gugu2 {

	public static void main(String[] args) {
		// 아래의 실행결과가 나오도록 중첩 for문을 사용하여 코드 작성
		// [실행 결과]
		// [2단]
		// 2 * 1 = 2
		// 2 * 2 = 4
		// 2 * 3 = 6
		// .
		// .
		// [3단]
		// 3 * 1 = 3
		// 3 * 2 = 6
		// 3 * 3 = 9
		// .
		// .
		// [9단]
		// .
		// .
		for (int i = 2; i < 10; i++) {
			System.out.println("[" + i + "]단");
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " * " + j + " = " + (i * j));
			}
		}
	}

}
