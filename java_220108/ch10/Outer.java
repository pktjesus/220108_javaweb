package ch10;

// 외부클래스
public class Outer {
	public int i = 0;
	
	// 인스턴스 내부 멤버 클래스
	public class Inner {
		
	}
	
	// static에 있는 메소드에서만 사용가능(static 내부 멤버 클래스)
	public static class InnerStatic {
		
	}
}
