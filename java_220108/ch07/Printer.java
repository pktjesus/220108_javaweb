package ch07;

public class Printer {
	// 작성 위치(메소드 오버로딩)
	static void println(int a) {
		System.out.println(a);
	}
	static void println(boolean b) {
		System.out.println(b);
	}
	static void println(double c) {
		System.out.println(c);
	}
	static void println(String d) {
		System.out.println(d);
	}
}
