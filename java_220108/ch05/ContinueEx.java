package ch05;

public class ContinueEx {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				continue;			// 반복문의 증감식으로 이동
			} else if (i == 7) {
				break;				// 반복문을 빠져나감
			}
			System.out.println(i);
		}
	}

}
