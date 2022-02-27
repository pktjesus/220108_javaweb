package ch17;

public class ThreadEx2 {

	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("t1 쓰레드 시작");
				for (int i = 0; i < 50; i++) {
					System.out.println("t1 : " + i);
				}
			}
		});
		t1.start();
		
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("t2 쓰레드 시작");
				for (int i = 0; i < 50; i++) {
					System.out.println("t2 : " + i);
				}
			}
		});
		t2.start();

		Thread t3 = new Thread(() -> {
			System.out.println("t3 쓰레드 시작");
			for (int i = 0; i < 50; i++) {
				System.out.println("t3 : " + i);
			}
		});
		t3.start();
		
		Thread t4 = new Thread(() -> {
			System.out.println("t4 쓰레드 시작");
			for (int i = 0; i < 50; i++) {
				System.out.println("t4 : " + i);
			}
		});
		t4.start();
		
		
	}

}
