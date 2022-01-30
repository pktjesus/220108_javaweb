package ch08.poly;

public class Parent {
	String name;
	
	public static void main(String[] args) {
		int a = 10;
		double b = a;	// 자동형변환(10 -> 10.0)
		
		double c = 10.5;
		//int d = c;		// 에러(double이 int보다 더 크기 때문에 공간이 작은 int에 double값 대입이 불가능)
		
		int d = (int)c;		// 강제형변환을 통해 강제로 공간을 줄여 대입이 가능
	}
	
	void walk() {
		System.out.println("부모가 걷는다.");
	}
	void run() {
		System.out.println("부모가 달린다.");
	}
}
