package ch05;

public class DoWhileEx {

	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		
		// do~while문은 if와 while문의 콜라브레이션으로 작성 가능
		do {
			sum += i;
			i++;
		} while (i <= 100);
		
		System.out.println("합계 : "+sum);
	}
}
