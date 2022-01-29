package ch07;

public class FinalEx {
	public static void main(String[] args) {
		Final f = new Final();
		//f.number = 200;	// 에러 -> final 키워드를 사용한 멤버필드 변수이기 때문에
	}

}

class Final {
	final int number;
	
	Final() {
		number = 100;
	}
}