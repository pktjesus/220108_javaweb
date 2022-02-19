package ch15;

public class LambdaFunctionEx {

	public static void main(String[] args) {
		// 함수적 인터페이스 람다
		//InterfaceEx ie = (int x, int y) -> x + y;		// sum을 실제 구현(한 줄 구현으로 중괄호를 생략함)
		InterfaceEx ie = (int x, int y) -> {	// 한 줄이더도 중괄호를 사용하게 되면 return을 사용해야 함	
			return x + y;
		};
		
		System.out.println(ie.sum(1, 2));
	}

}

interface InterfaceEx {
	public int sum(int x, int y);		// 인터페이스 함수로 선언만 가능
}
