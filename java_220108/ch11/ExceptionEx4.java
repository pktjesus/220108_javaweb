package ch11;

public class ExceptionEx4 {

	public static void main(String[] args) {
		System.out.println("DB연결 시작");

		try {
			System.out.println("DB작업");
			System.out.println(3/0);
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("DB작업 중 예외발생");
		} finally {			// 예외처리 여부와 상관없이 항상 실행되도록 구현해주는 키워드
			System.out.println("DB연결 종료");
		}  
	}

}
