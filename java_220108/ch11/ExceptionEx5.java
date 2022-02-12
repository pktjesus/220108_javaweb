package ch11;

public class ExceptionEx5 {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		try {
			throw new Exception("예외 발생");		// 강제로 예외를 발생시킴
		} catch (Exception e) {
			e.printStackTrace();		// 오류 출력 추적 로그
			System.out.println(e.getMessage());
		}
		
		System.out.println("프로그램 종료");
	}
}
