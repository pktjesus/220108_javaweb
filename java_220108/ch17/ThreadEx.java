package ch17;

public class ThreadEx {

	public static void main(String[] args) {
		// 쓰레드 생성과 실행하는 방법 2가지
		// 1. Thread 클래스를 상속
		// 2. Runnable 인터페이스 구현
	
		// Thread 상속받는 방법
		ThreadExtend t1 = new ThreadExtend();
		t1.start();
		
		// Runnable 구현하는 방법
		Runnable r = new RunnableImpl();
		// Thread 생성자의 매개변수로 전달
		Thread t2 = new Thread(r);
		t2.start();
	}
}
// 1. Thread 클래스를 상속
class ThreadExtend extends Thread {
	@Override
	public void run() {
		System.out.println("Thread 상속받는 방법");
		
		for (int i = 0; i < 50; i++) {
			System.out.println("ThreadExtend : " + i);
		}
	}
}
// 2. Runnable 인터페이스 구현
class RunnableImpl implements Runnable {
	public void run() {
		System.out.println("Runnable 구현하는 방법");
		
		for (int i = 0; i < 50; i++) {
			System.out.println("RunnableImpl : " + i);
		}
	}
}
