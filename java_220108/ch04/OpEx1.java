package ch04;

public class OpEx1 {
	public static void main(String args[]) {	// 실행함수(main)
		// 4.1 대입연산(=,+=,-=,*=,/=(몫),%=(나머지))
		int a = 0;			// 오른쪽에서 왼쪽 값 대입 가능(반대는 불가능)
		a = 1;
		// 1 = a;			// 에러1
		// 1 + a = 2;		// 에러2
		a = 1 + 2;			// 정상(3)
		a = a + 1;			// 정상(4)
		
		int number1 = 10;
		number1 += 10; 		// number1 = number1 + 10;
		System.out.println("number1 : " + number1);		// number1 : 20
		int number2 = number1 % 3;		// 나머지 2 저장
		System.out.println("number2 : " + number2);		// number2 : 2
	}
}