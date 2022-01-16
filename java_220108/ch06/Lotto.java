package ch06;

public class Lotto {

	public static void main(String[] args) {
		// 로또 번호 생성 프로그램
		// 1. 로또 번호를 담아둘 길이가 6개인 정수 타입의 배열 변수 생성
		// 2. 1~45까지의 번호 랜덤 생성
		// 3. 만약에 랜덤으로 발생번호가 배열에 있다면 다시 생성하고, 없다면 배열에 값을 세팅
		// 4. 똑같은 번호가 없는 6개의 번호를 다 생성할 때까지 반복한다.
		// 5. 똑같은 번호가 없는 6개의 번호를 출력한다.
		
		int[] lotto = new int[6];		// 로또번호 초기값은 0
		int idx = 0;
		while(true) {		// 2~4까지 step
			int number = (int)(Math.random() * 45) + 1;	// 1 ~ 45번호 랜덤 발생
			
			boolean insert = true;
			for (int i = 0; i < idx; i++) {
				if (lotto[i] == number) {
					insert = false;
					break;
				}
			}
			
			if (insert) {
				lotto[idx] = number;
				idx++;
			}
			
			if (idx == 6) {
				break;
			}
		}
		// 로또번호 출력
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
	}

}
