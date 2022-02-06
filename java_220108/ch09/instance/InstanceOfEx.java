package ch09.instance;

public class InstanceOfEx {

	public static void main(String[] args) {
		// instanceof Ű�����н�
		// ���� -> ��ü instanceof Ŭ����(or �������̽�)	���ϰ��� true Ȥ�� false	
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
			System.out.println("a������ A�� ���Ѵ�.");
		}
		if(aa instanceof A) {
			System.out.println("aa������ A�� ���Ѵ�.");
		}
		if(aaa instanceof AB) {
			System.out.println("aaa������ AB�� ���Ѵ�.");
		} else {
			System.out.println("aaa������ AB�� ������ �ʴ´�.");
		}
		
		System.out.println("a > A : " + (a instanceof A));
		System.out.println("aa > A : " + (aa instanceof A));
		System.out.println("aaa > A : " + (aaa instanceof A));
		System.out.println("aaa > AB : " + (aaa instanceof AB));
	}
}
