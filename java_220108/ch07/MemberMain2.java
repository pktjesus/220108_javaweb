package ch07;

public class MemberMain2 {

	public static void main(String[] args) {
		// 자기 자신의 클래스 객체를 생성 가능
		MemberMain2 m = new MemberMain2();
		MemberMain2 m2 = new MemberMain2();
		
		if (m == m2) {
			System.out.println("m개체와 m2객체는 같다");
		} else {
			System.out.println("m개체와 m2객체는 다르다");
		}
	}
}
