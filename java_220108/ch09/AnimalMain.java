package ch09;

public class AnimalMain {

	public static void main(String[] args) {
		long l1 = 100000000000000L;
		int i1 = 0;
		
		i1 = (int)l1;	// 강제형변환
		System.out.println("i1 -> " + i1);	// 의도하지 않은 숫자가 출력
		////////////////////////////////////////////////////////////////
		int i2 = 23213123;
		long l2 = 0L;
		
		l2 = i2;	// 자동형변환
		System.out.println("l2 -> " + l2);	// 23213123
		////////////////////////////////////////////////////////////////
		
		Animal eagle = new Eagle();
		eagle.sleep();
		//eagle.eat();
		
		Eagle eagleObj = (Eagle)eagle;		// 강제형변환
		eagleObj.eat();
		eagleObj.fly();
	}

}
