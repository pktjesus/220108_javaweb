package ch05;

public class Excercise7 {

	public static void main(String[] args) {
		// 주사위의 눈이 6이 나올때까지 계속 반복해서 굴리고, 눈이 6이 나오면 지금까지 주사위를 굴린 횟수까지 출력 코드 작성
		// while문 반복, 주사위는 Math.random()으로 작성
		// [실행 결과]
		// (3)
		// (6)
		// 총 주사위 굴린 횟수는 : 2회
		int count = 0;
		for(;;) {
			int dice = (int)(Math.random() * 6) + 1;	// 1 ~ 6이 나옴
			System.out.println("(" + dice + ")");
			count++;
			
			if (dice == 6) {
				break;
			}
		}
		System.out.println("총 주사위 굴린 횟수는 : " + count + "회");
	}

}
