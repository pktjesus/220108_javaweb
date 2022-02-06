package ch10;

public class LocalInnerEx {		// 외부(바깥) 클래스
	int i = 10;		// 외부(바깥) 클래스의 멤버변수
	
	public void outerMethod() {
		class Inner {		// 로컬 클래스
			int x = 20;		// 로컬 클래스의 멤버변수
			int i = 30;		// 로컬 클래스의 멤버변수
			
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
