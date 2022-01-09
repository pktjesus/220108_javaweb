package ch03;

// 대괄호('[]')
// 중괄호('{}')
// 소괄호('()')

public class Java220109 {

	static int no;		// Java220109클래스 내에서 사용가능한 변수
	
	public static void main(String args[]) {	// 실행함수(main)
		// 3.3 상수와 리터럴
		final double PI = 3.14; // final로 상수 선언
		// PI = 2.14;
		System.out.println("PI : " + PI);
		
		// 3.4 제어문자
		System.out.println("줄바꿈\n줄바꿈\t탭\\\"\'");
		System.out.println("그녀는 말했다. \"나는 네가 좋아\"");

		// 3.5 변수의 범위(scope)
		String name = null;	// main메소드 블럭 내에서 사용 가능한 변수
		System.out.println("no : " + no + ", name : " + name);
		
		if(true) {
			name = "홍길동";
			
			String email = "hong@test.com";
		}
		// email = "yuone@test.com";		        // 에러 -> if문 안의 변수를 바깥에서 사용이 불가능 
		System.out.println("name : " + name);
		// System.out.println("email : " + email); // 에러 -> if문 안의 변수를 바깥에서 사용이 불가능
		
		// 3.6 형변환(casting)
		// 정수형끼리의 형변환(자동형변환)
		int number1 = 10;
		long number2 = number1;			// 자동형변환 가능 int < long
		System.out.println("number2 : " + number2);
		long number3 = 1231312312312312312L;
		// int number4 = number3;		// 자동형변환이 불가 int < long

		// 정수형과 실수형과의 형변환(강제형변환)
		double numeric1 = 5.5123;	
		int numeric2 = (int)numeric1;	// 소수점 이하자리는 다 버림
		System.out.println("numeric2 : " + numeric2);	// 5
		double numeric3 = 5;
		int numeric4 = (int)numeric3;	// 값의 손실이 발생하지 않음
		System.out.println("numeric4 : " + numeric4);	// 5
		
		int numeric5 = 235;
		double numeric6 = numeric5;		// 자동형변환
		System.out.println("numeric6 : " + numeric6);	// 235.0
		
		if(numeric5 == numeric6) {
			System.out.println("numeric5와 numeric6이 같다");
		} else {
			System.out.println("numeric5와 numeric6이 다르다");
		}
	}
	
	
}
