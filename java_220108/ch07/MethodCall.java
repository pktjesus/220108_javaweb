package ch07;

public class MethodCall {

	public static void main(String[] args) {
		Method.printName();		// 클래스로 직접 실행
		// m1.printName(); 	// 사용은 가능하지만 비추천
		
		System.out.println();
		Method m1 = new Method();		
		m1.printEmail();		// 객체로 생성해서 실행
	}
}

class Method {
	static void printName() {
		System.out.println("printName() 실행");
	}
	
	void printEmail() {
		System.out.println("printEmail() 실행");
		printId(); // 다른 메서드 실행
	}
	
	void printId() {
		System.out.println("printId() 실행");
	}
}
