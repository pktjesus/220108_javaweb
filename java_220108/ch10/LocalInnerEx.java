package ch10;

public class LocalInnerEx {		// �ܺ�(�ٱ�) Ŭ����
	int i = 10;		// �ܺ�(�ٱ�) Ŭ������ �������
	
	public void outerMethod() {
		class Inner {		// ���� Ŭ����
			int x = 20;		// ���� Ŭ������ �������
			int i = 30;		// ���� Ŭ������ �������
			
			void innerMethod() {
				System.out.println(x); // 20
				System.out.println(i); // 30
				System.out.println(this.i); // 30
				System.out.println(LocalInnerEx.this.i); // 10 
			}
		}
		
		Inner inn = new Inner();
		inn.innerMethod();
	}
	
	public void testMethod() {
//		Inner inn = new Inner(); // error
//		inn.innerMethod();
	}
	
	public static void main(String[] args) {
		LocalInnerEx lic = new LocalInnerEx();
		lic.outerMethod();
	}
}
