package ch11;

// ����� ���� ���� Ŭ����
/*
 * class Ŭ������ extends Exception {
 * 		Ŭ������(String msg) {	// ������
 * 			super(msg);
 * 		{
 * }
 */
public class LoginException extends Exception {
	LoginException(String msg) {
		super(msg);
	}
}
