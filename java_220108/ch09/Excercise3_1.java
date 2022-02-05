package ch09;

interface Action {
	void work();
}

public class Excercise3_1 {
	public static void main(String[] args) {
		// 익명 구현 객체 코드작성
		Action action = new Action() {
			@Override
			public void work() {
				System.out.println("복사를 합니다.");
			}
		};
		action.work();
	}
}

// 출력결과 예시
// -> 복사를 합니다.
