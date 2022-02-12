package ch11;

public class ExceptionEx3 {

	public static void main(String[] args) {
		int i = 1;
		int j = 2;
		int[] arr = {1,2,3};
		
		try {
			// 예외가 발생할 가능성이 있는 코드
			System.out.println(arr[2]);
			System.out.println(j / i);
			Integer.parseInt("a");
			
			// catch문의 배치 순서는 자식 exception에서부터 시작하여 부모 exception으로 배치
		} catch (ArithmeticException e) {				// 자식
			e.printStackTrace();
			System.out.println("0으로 나눌 수 없음");
		} catch (ArrayIndexOutOfBoundsException e) {	// 자식
			e.printStackTrace();
			System.out.println("인덱스 범위 초과");
		} catch (NumberFormatException e) {	// 자식
			e.printStackTrace();
			System.out.println("숫자가 아님");
		} catch (Exception e) {				// 부모
			e.printStackTrace();
			System.out.println("에러 발생");			
		}
	}
}
