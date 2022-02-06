package ch10;

public class OuterInnerEx {
	public static void main(String[] args) {
		Outer out1 = new Outer();
		Outer.Inner inn = new Outer().new Inner();	// 일반 인스턴스 내부 클래스
		Outer.InnerStatic innStatic = new Outer.InnerStatic();	// static 내부 클래스
	}
}
