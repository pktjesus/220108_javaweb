package ch07;

public class MethodStructure {
	// 메소드 구조
	// 접근제한자 리턴타입 메서드명(매개변수...) {
	//    실행문1;
	//    실행문2;
	//    실행문3;
	//    .
	//    .
	//    return 값;		// 리턴타입이 void 일때는 생략가능
	// }
	public static void test1(int param1, int param2) {
		System.out.println("param1 : " + param1);
		System.out.println("param2 : " + param2);
		System.out.println("test1 메소드 종료");
	} 
	
	static int test2(int param1) {
		System.out.println("param1 : " + param1);
		System.out.println("test2 메소드 종료");
		
		return param1;
	}
	
	public static void main(String args[]) {
		test1(1, 2);
		int test2ReturnValue = test2(3);
		
		System.out.println("test2ReturnValue : " + test2ReturnValue);
	}
}
