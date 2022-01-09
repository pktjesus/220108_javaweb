package ch04;

public class OpEx3 {
	public static void main(String[] args) {
		// 4.3 증감연산
		int a = 0;
		int b = 0;
		
		++a;	// 1(전위연산) -> a = a + 1;
		b++;	// 1(후위연산) -> b = b + 1;
		
		System.out.println("a : " + a);		// 1
		System.out.println("b : " + b);		// 1
		
		int a1 = 10;
		int b1 = ++a1;		// 11(전위연산) -> a1 = a1 + 1; int b1 = a1;
		System.out.println("전위연산 결과 b1 : " + b1);	// 11
		System.out.println("전위연산 결과 a1 : " + a1);	// 11
		
		int x1 = 10;
		int y1 = x1++;		// 10(후위연산) -> int y1 = x1;  x1 = x1 + 1;
		System.out.println("후위연산 결과 y1 : " + y1);	// 10
		System.out.println("x1 : " + x1);			// 11
		
		// 4.4 비교연산
		System.out.println(1 == 1); 	// true
		System.out.println(1 != 1); 	// false
		System.out.println(1 > 1); 		// false
		System.out.println(1 < 1); 		// false
		System.out.println(1 >= 1); 	// true
		System.out.println(1 <= 1); 	// true
		
		// 4.5 논리연산(AND, OR, NOT, XOR)
		// AND : 모두가 참 일 경우에만 참(&&)
		// OR : 참이 1개라도 있을 경우 참(||)
		// NOT : 반대의 값(!)
		// XOR : 두 개의 항중 하나의 항만 참일 경우 참(^)
		int a10 = 10;
		int b10 = 5;
		
		// AND 연산
		System.out.println(a10 > b10 && a10 == 10);	// true
		System.out.println(a10 > b10 && a10 == b10);	// false
		
		// OR 연산
		System.out.println(a10 > b10 || a10 == b10);	// true
		System.out.println(a10 < b10 || a10 == b10);	// false
		
		// XOR 연산
		System.out.println(a10 > b10 ^ a10 == 10);	// false
		System.out.println(a10 > b10 ^ a10 == b10);		// true
		
		// NOT 연산
		System.out.println(!(a10 > b10));	// false
		System.out.println(!(a10 < b10));	// true
		
		test();								// 메소드 실행
		
		// &연산
		System.out.println("&연산 " + (a10 == b10 & test()));// 항1 & 항2 -> 항1의 연산과 항2의 연산을 무조건 실행(test1()메소드가 실행)
		
		// &&연산
		System.out.println("&&연산 " + (a10 == b10 && test()));// 항1 && 항2 -> 항1의 연산이 false이면 항2의 연산을 실행하지 않음((test1()메소드가 실행X)
		
		int op1 = 10;
		int op2 = 0;
		
		// int divideValue = op1 / op2;		// class파일 compile(javac)가 되지만 실행시 오류(0 나누기 오류)
	}
	
	public static boolean test() {			// 메소드 선언
		System.out.println("test()메소드 실행이 됨");
		return true;
	}
}
