package ch11;

// 사용자 정의 예외 클래스
/*
 * class 클래스명 extends Exception {
 * 		클래스명(String msg) {	// 생성자
 * 			super(msg);
 * 		{
 * }
 */
public class LoginException extends Exception {
	LoginException(String msg) {
		super(msg);
	}
}
