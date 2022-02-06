package ch09.instance;

public class InstanceOfEx {

	public static void main(String[] args) {
		// instanceof 키워드학습
		// 사용법 -> 객체 instanceof 클래스(or 인터페이스)	리턴값은 true 혹은 false	
		A a = new AAA();
		AA aa = new AAA();
		AAA aaa = new AAA();
		
		A b = new ABB();
		AB ab = new ABB();
		ABB abb = new ABB();	
		
		boolean is_a_A = a instanceof A;		// true
		boolean is_aa_A = aa instanceof A;		// true
		boolean is_aaa_A = aaa instanceof A;	// true
		boolean is_aaa2_AB = aaa instanceof AB;	// false
		if(a instanceof A) {
			System.out.println("a변수는 A에 속한다.");
		}
		if(aa instanceof A) {
			System.out.println("aa변수는 A에 속한다.");
		}
		if(aaa instanceof AB) {
			System.out.println("aaa변수는 AB에 속한다.");
		} else {
			System.out.println("aaa변수는 AB에 속하지 않는다.");
		}
		
		System.out.println("a > A : " + (a instanceof A));
		System.out.println("aa > A : " + (aa instanceof A));
		System.out.println("aaa > A : " + (aaa instanceof A));
		System.out.println("aaa > AB : " + (aaa instanceof AB));
	}
}
