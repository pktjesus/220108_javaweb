package ch07;

public class ReturnEx2 {

	public static void main(String[] args) {
		// return문을 사용해 메서드를 중지시키는 기능
		Return2 obj = new Return2();
		
		obj.getTest(0);
		System.out.println();
		obj.getTest(1);
		
		System.out.println();
		System.out.println(obj.getName(0));		// 홍길동
		System.out.println(obj.getName(1));
	}

}
class Return2 {
	void getTest(int type) {
		System.out.println("getTest() 메서드 시작");
		
		if (type == 1) {
			return;			// 메소드 실행 중지
		}
		
		System.out.println("getTest() 메서드 끝");
	}
	
	String getName(int type) {
		if (type == 1) {
			return "";		// 메소드 실행 중지
		}
		
		return "홍길동";
	}
	
	String getAge(int type) {
		return "12";
		// return "홍길동";	// error -> 같은 블럭 안에 return 키워드가 2개 이상 허용 불가능 -> 1개만 허용가능
	}	
}