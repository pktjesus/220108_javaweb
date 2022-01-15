package ch04;

public class Excercise6 {

	public static void main(String[] args) {
		// 다음은 백의 자리 이하를 버리는 코드를 작성
		// 변수 value의 값이 356이라면 300이 나올 수 있도록 알맞은 코드를 작성.
		int value = 356;
		System.out.println((value / 100) * 100);	// 3 * 100
		System.out.println(value - (value % 100));  // 356 - 56
		
		
	}

}
