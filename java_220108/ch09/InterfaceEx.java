package ch09;

// 인터페이스 선언 구조
// [public] interface 인터페이스명 {
// [public static final] 자료형 상수명 = 값;
// [public abstract] 리턴타입 추상메소드명();
// [public] default 리턴타입 메서드명(매개변수 ...) { ... } -> 실제 구현한 메소드 
// [public] static 리턴타입 메서드명(매개변수 ...) { ... }  -> 실제 구현한 메소드

// 인터페이스의 특징
// 1. 객체생성 불가, 구현 클래스로 객체 생성 == 추상클래스와 같은 기능
// 2. 다중 구현 가능 <-> 추상 클래스와 가장 다른 특징을 지니는 기능(추상 클래스는 단일로 상속하여 구현 가능)\
// 3. 인터페이스간의 상속 가능(인터페이스끼리는 다중 상속이 가능)
// 4. 인터페이스 접근 제한자는 public(접근제한자가 없어도 public)
// 5. 인터페이스의 모든 멤버 변수는 final붙은 상수
interface InterfaceEx {
	// 상수
	public final int MIN_PRICE = 0;
	int MAX_PRICE = 100000;		// == 4,5번 특징으로 인해서 public final int MAX_PRICE = 100000; 같은 선언
	
	// 추상메소드(abstract키워드가 없어도 추상메소드가 가능)
	public double meanPrice();
	double totalPrice(); // == 4번 특징으로 인해서 public double totalPrice(); 같은 선언 
	
	// default 메소드(구현이 가능한 메소드)
	default double getSalePrice(double price) {		
		return price - (price * 0.05);
	}
	
	// static 메소드(구현이 가능한 메소드)
	static void printPrice(double price) {
		System.out.println(price);
	}
}
