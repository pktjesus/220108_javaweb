package ch10;

public class OuterInnerEx {
	public static void main(String[] args) {
		Outer out1 = new Outer();
		Outer.Inner inn = new Outer().new Inner();	// �Ϲ� �ν��Ͻ� ���� Ŭ����
		Outer.InnerStatic innStatic = new Outer.InnerStatic();	// static ���� Ŭ����
	}
}
