package ch05;

public class WhileEx {

	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		
		// while문으로 1부터 100까지의 합계 구하는 코드 작성
		while (i <= 100) {
			sum += i;
			i++;
		}
		
		System.out.println("합계 : "+sum);
	}
}
