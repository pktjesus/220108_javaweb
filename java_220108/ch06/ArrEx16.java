package ch06;

public class ArrEx16 {

	public static void main(String[] args) {
		// 배열
		int[] arrInt = {1,2,3,4,5};
		
		// 기존 for문을 이용한 출력
		for (int i=0; i<arrInt.length; i++) {
			System.out.println(arrInt[i]);
		}
		
		// 향상된 for문을 이용한 출력
		// 단점 : 시작과 끝을 사용자 임의대로 지정할 수 없다
		// 장점 : 보기가 이쁘고 사용하기 쉽다.
		for (int number : arrInt) {
			System.out.println(number);
		}
		
		// 배열
		String[] names = {"홍길동", "이순신", "김유신"};
		int[] scores = {90,80,100};
		
		int i = 0;
		for (String name : names) {
			System.out.println(name + " : " + scores[i]);
			i++;
		}
	}
}
