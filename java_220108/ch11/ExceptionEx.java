package ch11;

public class ExceptionEx {

	public static void main(String[] args) {
		// 예외 처리 구문(try ~ catch(catch문 개수는 제한이 없음)
		System.out.println(1);
		
		try {
			// 예외가 발생할 가능성이 있는 코드
			System.out.println(2);
			System.out.println(3/0);		// ArithmeticException
			int[] arr2 = new int[-3];		// NegativeArraySizeException
			System.out.println(4);
		} catch (ArithmeticException ae) {
			ae.printStackTrace();
			System.out.println(5);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(999);
		}
		
		System.out.println(6);
	}

}
