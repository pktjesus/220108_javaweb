package ch05;

public class Excercise7_2 {

	public static void main(String[] args) {
		// 무한루프문 만들기 3가지 방법
		// for(;;) { 실행문1; }
		// while(true) { 실행문1; }
		// do { 실행문1; } while(true)
		
		int test1 = 0;
		while(true) {
			System.out.println("test1의 값 : " + test1);
			if (test1 == 5) {
//				while (true) {
//					break;
//				}
				break;
			}
			test1++;
		}
		// while문과 Math.random() 메소드를 이용해서 두 개의 주사위를 던졌을 때 나오는 눈을 (눈1, 눈2) 형태로
		// 출력하고 눈의 합이 5가 아니면 계속 주사위를 던지고, 눈의 합이 5이면 실행을 멈추는 코드를 작성
		// 눈의 합이 5가 되는 조합은 즉 (1,4), (4,1), (2,3), (3,2)
		int count = 0;
		while(true) {
			int num1 = (int)(Math.random() * 6) + 1;	// 1 ~ 6이 나옴
			int num2 = (int)(Math.random() * 6) + 1;	// 1 ~ 6이 나옴
			System.out.println("(" + num1 + ", " + num2 + ")");
			count++;
			if (num1 + num2 == 5) {
				break;
			}
		}
		System.out.println("총 2개의 주사위 굴린 횟수는 : " + count + "회");
		
		System.out.println("프로그램 마침");
	}

}
