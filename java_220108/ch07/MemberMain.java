package ch07;

public class MemberMain {

	public static void main(String[] args) {
		// 객체 선언과 초기화 동시에
		Member m = new Member();
		// 객체 선언과 초기화 별도로
		Member m2;
		m2 = new Member();
		
		if (m == m2) {
			System.out.println("m개체와 m2객체는 같다");
		} else {
			System.out.println("m개체와 m2객체는 다르다");
		}
		m.test1();
		
		m.i = 1;
		m.j = 2;
		m.test1();
	}

}
