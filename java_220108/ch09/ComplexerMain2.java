package ch09;

public class ComplexerMain2 {

	public static void main(String[] args) {
		Fax fax = new Fax() {
			// 인터페이스의 모든 추상 메소드 구현
			@Override
			public void send(String tel) {
				System.out.println("여기는 익명 구현 객체의 send() : tel -> " + tel);
			}

			@Override
			public void receive(String tel) {
				System.out.println("여기는 익명 구현 객체의 receive() : tel -> " + tel);
			}
		};
		fax.send("1234");
		fax.receive("5678");
	}

}
