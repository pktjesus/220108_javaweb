package ch05;

public class Excercise4 {

	public static void main(String[] args) {
		System.out.println("*");		// 문자열을 출력하고 다음 라인으로 넘어감
		System.out.print("*");		// 문자열을 출력하고 다음 라인으로 넘어가지 않음.
		
		System.out.println();System.out.println();
		
		System.out.print("*");		// 문자열을 출력하고 다음 라인으로 넘어가지 않음.
		System.out.println("*");	// 문자열을 출력하고 다음 라인으로 넘어감
		
		System.out.println();
		// 이중 for문을 이용하여 아래와 같은 실행 결과가 출력되도록 코드 작성
		// *
		// **
		// ***
		// ****
		// *****
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		System.out.println();
		// 이중 for문을 이용하여 아래와 같은 실행 결과가 출력되도록 코드 작성
		// *****
		// ****
		// ***		
		// **		
		// *		
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		System.out.println();
		// 이중 for문을 이용하여 아래와 같은 실행 결과가 출력되도록 코드 작성
		//     *
		//    ***
		//   *****		
		//  *******		
		// *********
		for (int i = 1; i <= 25; i++) {
			for (int j = 25 - i; j > 0; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= (i*2) - 1; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
