package ch12;

public class SystemEx {
	public static void main(String[] args) {
		System.out.println(System.getProperty("java.version"));	// 자바 버전
		System.out.println(System.getProperty("java.vm.vendor"));	// 자바 vm 벤더사
		System.out.println(System.getProperty("java.home"));	// JDK경로
		System.out.println(System.getProperty("os.name"));	// OS 이름
	}

}
