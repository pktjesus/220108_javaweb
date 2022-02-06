package ch09.intercasting;

public class Bus implements Vehicle {

	@Override
	public void run() {
		System.out.println("네바퀴로 달린다.");
	}
	public void checkFare() {
		System.out.println("승차요금을 체크합니다.");
	}
}
