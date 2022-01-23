package ch07;

public class VarEx {
	static int number;		// 클래스 변수(멤버변수==필드)
	int number2;			// 인스턴스 변수(멤버변수==필드)
	
	public static void main(String[] args) {
		int number3; 		// 지역 변수
		
		// 클래스 변수 사용
		System.out.println("Avante 제조사 : " + Avante.company);
		// System.out.println("Avante 색깔 : " + Avante.color);		// error
		
		Avante a1 = new Avante();
		a1.color = "화이트";
		// 인스턴스 변수 출력
		System.out.println("a1 색깔 : " + a1.color);		
		
		// 클래스 변수를 인스턴스 객체로 출력
		System.out.println("a1 제조사 : " + a1.company);
		// 클래스 변수의 값 변경
		a1.company = "기아";
	
		// 클래스 변수의 값 변경 후 클래스변수와 인스턴스변수 출력
		System.out.println("Avante 제조사 : " + Avante.company);
		System.out.println("a1 제조사 : " + a1.company);
	}
}

class Avante {
	String color;		// 인스턴스 변수
	static String company = "현대";	// 클래스변수
}