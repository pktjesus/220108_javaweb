package ch09;

// 인터페이스 구현
// public class 구현클래스명 implements 인터페이스명1,인터페이스명2... {
// // 인터페이스의 모든 메서드 반드시 구현
// }
public class Complexer implements Printer, Scanner, Fax {

	@Override		// @Override 키워드는 옵션사항
	public void print() {
		System.out.println("출력 실행");
	}

	@Override
	public void scan() {
		System.out.println("스캔 실행");
	}
	
	@Override
	public void send(String tel) {
		System.out.println(FAX_NUMBER + "에서 " + tel + "로 FAX 전송");
	}

	@Override
	public void receive(String tel) {
		System.out.println(tel + "에서 " + FAX_NUMBER + "로 FAX 수신");
	}
}
