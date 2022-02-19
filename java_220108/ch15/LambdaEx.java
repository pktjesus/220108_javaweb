package ch15;

public class LambdaEx {

	public static void main(String[] args) {
		LambdaInterface li = () -> {
			String str = "메서드 출력";
			System.out.println(str);
		};
		
		li.print();	
	}
}

interface LambdaInterface {
	void print();
	//void print2(); // 오류발생 -> 람다식은 인터페이스에 메서드가 2개 이상일 경우는 사용할 수 없음
}