package ch05;

public class Excercise3_2 {

	public static void main(String[] args) {
		// 중첩 for문을 이용해서 방정식 4x + 5y = 60의 모든 해를 구해서 (x,y)형태로 출력해 보세요.
		// 단, x와 y는 10이하의 자연수입니다.
		for (int x = 1; x <= 10; x++) {
			for (int y = 1; y <= 10; y++) {
				// 코드 작성
				if(((4 * x) + (5 * y)) == 60) {
					System.out.println("(" + x + "," + y + ")");
				}
			}
		}
	}

}
