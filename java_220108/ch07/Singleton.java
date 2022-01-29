package ch07;

public class Singleton {
	private static Singleton instance = new Singleton();
	
	// 생성자에 private으로 설정해서 자기 내부에서만 생성자를 호출할 수 있도록 설정 
	private Singleton() {
		System.out.println("객체 생성");
	}
	
	// public static 메소드
	public static Singleton getInstance() {
		System.out.println("객체 리턴");
		return instance;
	}
}
