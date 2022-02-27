package ch17;

public class ThreadEx {

	public static void main(String[] args) {
		// ������ ������ �����ϴ� ��� 2����
		// 1. Thread Ŭ������ ���
		// 2. Runnable �������̽� ����
	
		// Thread ��ӹ޴� ���
		ThreadExtend t1 = new ThreadExtend();
		t1.start();
		
		// Runnable �����ϴ� ���
		Runnable r = new RunnableImpl();
		// Thread �������� �Ű������� ����
		Thread t2 = new Thread(r);
		t2.start();
	}
}
// 1. Thread Ŭ������ ���
class ThreadExtend extends Thread {
	@Override
	public void run() {
		System.out.println("Thread ��ӹ޴� ���");
		
		for (int i = 0; i < 50; i++) {
			System.out.println("ThreadExtend : " + i);
		}
	}
}
// 2. Runnable �������̽� ����
class RunnableImpl implements Runnable {
	public void run() {
		System.out.println("Runnable �����ϴ� ���");
		
		for (int i = 0; i < 50; i++) {
			System.out.println("RunnableImpl : " + i);
		}
	}
}
