package ch12;

// 두 개의 문자열 변수의 합계를 구하기 위해 숫자로 변환하여 
// 덧셈연산 값을 출력하는 코드를 작성
public class Excercise3 {

	public static void main(String[] args) {
		String num1 = "100";
		String num2 = "200";

		// 코드 작성
		int n1 = Integer.parseInt(num1);
		int n2 = Integer.parseInt(num2);
		System.out.println("합계:" + (n1 + n2));
		System.out.println("합계:" + (Integer.parseInt(num1) + Integer.parseInt(num2)));
		
	}

}
