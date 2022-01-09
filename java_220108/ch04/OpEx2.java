package ch04;

public class OpEx2 {

	public static void main(String[] args) {
		int a = 5 + 5;
		System.out.println("5 + 5 = "+a);	// 10출력
		int b = a - 5;
		System.out.println("10 - 5 = "+b);	// 5출력
		int c = b * 2;
		System.out.println("5 * 2 = "+c);	// 10출력
		int d = c / 5;
		System.out.println("10 / 5 = "+d);	// 2출력

		// 나머지 연산
		int e = 10 % 3;	// 10 나누기 3의 결과값은 몫이 3, 나머지 1
		System.out.println("10 % 3 = "+e);
		
		int a1 = 10;
		int b1 = 4;
		System.out.println("10 / 4 = " + (a1 / b1));	   	 // 2.5가 아닌 2 -> 정수형끼리의 연산결과는 정수형
		System.out.println("10 / 4 = " + ((double)a1 / b1)); // 2.5 -> 강제형변환
		
		double c1 = 10.0;
		double d1 = 4.0;
		System.out.println("10.0 / 4.0 = " + (c1 / d1)); // 2.5
		
		double e1 = 10.0;		// 10을 입력해도 같은 결과 -> 실수형과 정수형끼리의 연산은 실수형
		int f1 = 4;
		System.out.println("10.0 / 4 = " + (e1 / f1)); // 2.5
		
		// https://toma0912.tistory.com/66 -> 연산우선순위 표 참고
		// (1 + (2 - (3 * 10))) / 5		// 소괄호 기호를 사용하여 연산순위를 결정하자
	}

}
