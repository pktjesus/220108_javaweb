package ch05;

public class RandomEx {

	public static void main(String[] args) {
		// Random으로 숫자 출력
		// Math.random() -> 0.0 ~ 1.0 사이의 값을 랜덤으로 출력
		System.out.println("랜덤 값1 : " + Math.random());
		System.out.println("랜덤 값2 : " + Math.random());
		System.out.println("랜덤 값3 : " + Math.random());
		System.out.println("랜덤 값4 : " + Math.random());
		
		// 소수점이 있는 실수가 아닌 정수로 출력되도록 코드 작성
		// 10 ~ 20 사이의 정수 값이 출력되도록 코드 작성
		int rnd1 = (int)(Math.random() * 10) + 10;		// 10 ~ 20
		System.out.println("랜덤 값5 : " + rnd1);
		// 12 ~ 18 사이의 정수 값이 출력되도록 코드 작성
		int rnd2 = (int)(Math.random() * 6) + 12;		// 12 ~ 18
		System.out.println("랜덤 값6 : " + rnd2);
		
	}

}
